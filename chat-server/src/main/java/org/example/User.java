package org.example;

public class User {
    private String login;
    private String password;
    private String username;
    private UserRole userRole;

    public UserRole getUserRole() {
        return userRole;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public User(String login, String password, String username, UserRole userRole) {
        this.login = login;
        this.password = password;
        this.username = username;
        this.userRole = userRole;
    }
}
