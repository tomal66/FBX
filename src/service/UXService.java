package service;

import model.Player;

public class UXService {
    // Handle the login process
    public void handleLogin(String username, String password) {
        System.out.println(username+" is logged in.");
    }

    // Handle the logout process
    public void handleLogout(Player player) {}

    // Handle the sign-up process
    public void handleSignUp(String username, String password) {}
}