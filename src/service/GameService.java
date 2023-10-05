package service;

import model.GameInfo;

public class GameService {
    public void startGame(GameInfo gameInfo) {
        System.out.println("Started running "+gameInfo.getGame().getName());
    }

    public void endGame(GameInfo gameInfo) {
        System.out.println("Stopped running "+gameInfo.getGame().getName());
    }
}
