package service;

import model.Player;

public class CloudService {
    public void updatePlayerStatus(Player player, String status) {
        System.out.println(player.getUsername()+" is now "+status);
    }
}