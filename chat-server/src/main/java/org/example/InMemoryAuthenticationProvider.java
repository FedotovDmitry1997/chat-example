package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemoryAuthenticationProvider implements AuthenticationProvider {
    private final List<User> users;

    public InMemoryAuthenticationProvider() {
        this.users = new ArrayList<>();
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        for (User user : users) {
            if (Objects.equals(user.getPassword(), password) && Objects.equals(user.getLogin(), login)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public synchronized User register(String login, String password, String username, UserRole userRole) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username) && Objects.equals(user.getLogin(), login)) {
                return null;
            }
        }
        User newUser = new User(login, password, username, userRole);
        users.add(newUser);
        return newUser;
    }
}
