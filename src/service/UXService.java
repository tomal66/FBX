package service;

import model.Player;

public class UXService {
    public void handleLogin(String username, String password) {
        System.out.println("Logging in");
    }

    public void handleLogout(Player player) {
        System.out.println("Logging out");
    }

    public void handleSignUp(String username, String password) {
        System.out.println("Signing up");
    }
}