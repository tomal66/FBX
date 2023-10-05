package controller;

import model.GameInfo;
import model.Player;
import service.ScoreService;
import service.UXService;
import service.CloudService;
import service.GameService;
import service.CheatCodeService;

public class GameController {
    private final ScoreService scoreService;
    private final UXService uxService;
    private final CloudService cloudService;
    private final GameService gameService;
    private final CheatCodeService cheatCodeService;

    public GameController(ScoreService scoreService, UXService uxService, CloudService cloudService, GameService gameService, CheatCodeService cheatCodeService) {
        this.scoreService = scoreService;
        this.uxService = uxService;
        this.cloudService = cloudService;
        this.gameService = gameService;
        this.cheatCodeService = cheatCodeService;
    }

    public void calculateScore(Player player) {
        scoreService.calculateSinglePlayerScore(player);
    }

    public void handleSignUp(String username, String password) {
        uxService.handleSignUp(username, password);
    }

    public void handleLogin(String username, String password) {
        uxService.handleLogin(username, password);
    }

    public void startGame(GameInfo gameInfo) {
        gameService.startGame(gameInfo);
    }

    public void updateCloudStatus(Player player, String status) {
        cloudService.updatePlayerStatus(player, status);
    }

    public void activateCheatCode(Player player, String cheatCode) {
        cheatCodeService.activateCheatCode(player, cheatCode);
    }

    public void endGame(GameInfo gameInfo) {
        gameService.endGame(gameInfo);
    }

    public void handleLogout(Player player) {
        uxService.handleLogout(player);
    }
}