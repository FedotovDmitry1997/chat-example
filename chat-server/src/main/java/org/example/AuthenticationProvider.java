package org.example;

public interface AuthenticationProvider {
    User getUserByLoginAndPassword(String login, String password);

    User register(String login, String password, String username, UserRole userRole);
}