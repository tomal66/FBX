package service;

import model.Player;
import model.Team;

public class ScoreService {
    public void calculateSinglePlayerScore(Player player) {
        System.out.println("Setting score for "+player.getUsername());
    }

    public void calculateTeamScore(Team team) {
        System.out.println("Calculating team score");
    }
}