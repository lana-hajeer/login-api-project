package com.example.demo;

public class User {
    private String username;
    private String pass;
    private int userId;

    // Default Constructor
    public User() {}

    // Parameterized Constructor
    public User(int userId, String username, String pass) {
        this.userId = userId;
        this.username = username;
        this.pass = pass;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }
    
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
}