package service;

import model.Player;

public class CloudService {
    // Update the player's status in the cloud
    public void updatePlayerStatus(Player player, String status) {
        System.out.println("Player is now "+status);
    }
}
