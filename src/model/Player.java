package model;

public class Player {
    private String playerID;
    private String username;
    private int score;

    public Player(String playerID, String username) {
        this.playerID = playerID;
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    // Getters, setters, and other methods
}