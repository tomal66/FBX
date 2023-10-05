
import model.Player;
import model.Team;
import model.GameInfo;
import model.CloudAccount;
import model.CheatCode;
import service.ScoreService;
import service.UXService;
import service.CloudService;
import service.GameService;
import service.CheatCodeService;
import gameType.ActionGame;
import controller.GameController;

public class Main {
    public static void main(String[] args) {
        // Instances of model classes
        Player player1 = new Player();
        Team team1 = new Team();
        GameInfo gameInfo1 = new GameInfo();
        CloudAccount cloudAccount1 = new CloudAccount();
        CheatCode cheatCode1 = new CheatCode();

        // Instances of service classes
        ScoreService scoreService = new ScoreService();
        UXService uxService = new UXService();
        CloudService cloudService = new CloudService();
        GameService gameService = new GameService();
        CheatCodeService cheatCodeService = new CheatCodeService();

        // Instance of GameController
        GameController gameController = new GameController();

        // Simulate operations
        System.out.println("Simulating Login...");
        uxService.handleLogin("username", "password");

        System.out.println("Simulating Cloud Status Update...");
        cloudService.updatePlayerStatus(player1, "Online");

        System.out.println("Simulating Score Calculation...");
        scoreService.calculateSinglePlayerScore(player1);

        System.out.println("Simulating Game Start...");
        gameService.startGame(gameInfo1);

        System.out.println("Simulating Cheat Code Activation...");
        cheatCodeService.activateCheatCode(player1, "GOD_MODE");

        System.out.println("Simulating Game Play...");
        ActionGame actionGame = new ActionGame();
        actionGame.play();

        System.out.println("Simulating Game End...");
        gameService.endGame(gameInfo1);

        System.out.println("Demo completed!");
    }
}
