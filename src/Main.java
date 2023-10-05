
import model.*;
import service.ScoreService;
import service.UXService;
import service.CloudService;
import service.GameService;
import service.CheatCodeService;
import gameType.ActionGame;
import controller.GameController;

public class Main {
    public static void main(String[] args) {
        // Create a new player
        Player player = new Player("player1", "tomal66");

        // Instantiate services
        ScoreService scoreService = new ScoreService();
        UXService uxService = new UXService();
        CloudService cloudService = new CloudService();
        GameService gameService = new GameService();
        CheatCodeService cheatCodeService = new CheatCodeService();

        // Instantiate the GameController with the services
        GameController gameController = new GameController(scoreService, uxService, cloudService, gameService, cheatCodeService);

        // Player signs up and logs in using the controller
        gameController.handleSignUp(player.getUsername(), "password123");
        gameController.handleLogin(player.getUsername(), "password123");

        // Create an instance of an action game and associate it with GameInfo
        Game actionGameInstance = new ActionGame("Valorant");
        GameInfo gameInfo = new GameInfo("game001", actionGameInstance);

        // Start the game using the controller
        gameController.startGame(gameInfo);

        // Calculate player's score using the controller
        gameController.calculateScore(player);

        // Update player's status in the cloud using the controller
        gameController.updateCloudStatus(player, "Online");

        // Player uses a cheat code using the controller
        gameController.activateCheatCode(player, "Aimbot");

        // End the game using the controller
        gameController.endGame(gameInfo);

        // Player logs out using the controller
        gameController.handleLogout(player);

        System.out.println("Demo completed!");
    }
}
