package model;

import java.util.List;

public class GameInfo {
    private String gameID;
    private Game game;  // Reference to the specific game instance
    private List<Player> players;
    private List<Team> teams;

    public GameInfo(String gameID, Game game) {
        this.gameID = gameID;
        this.game = game;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
// Getters, setters, and other methods
}
