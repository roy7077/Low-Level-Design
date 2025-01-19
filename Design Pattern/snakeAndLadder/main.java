import components.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class main {

    public static void main(String[] args) {
        // Create players
        Deque<Player> players = new ArrayDeque<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        players.add(new Player("Player 3"));

        // Create dice
        Deque<Dice> dices = new ArrayDeque<>();
        dices.add(new Dice(1, 7)); // Standard dice (1 to 6)

        // Define game configuration
        int boardSize = 10; // 10x10 board
        int snakeCount = 5;
        int ladderCount = 5;

        // Initialize game
        Game game=new Game(players, dices, boardSize, snakeCount, ladderCount);;

        // Start the game
        game.playGame();
    }
}