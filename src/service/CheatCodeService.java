package service;

import model.Player;

public class CheatCodeService {
    public void activateCheatCode(Player player, String cheatCode) {
        System.out.println("Cheat applied: "+cheatCode);
    }
}
