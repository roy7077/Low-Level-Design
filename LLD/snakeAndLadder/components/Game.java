package components;

import java.util.Deque;
import java.util.ArrayDeque;

public class Game {
    Board board;
    int diceCnt;

    Deque<Player> players = new ArrayDeque<>();
    Deque<Dice> dices = new ArrayDeque<>();

    public Game(Deque<Player> players, Deque<Dice> dices, int boardSize, int snakeCnt, int ladderCnt) {
        this.players = players;
        this.dices = dices;
        this.diceCnt = dices.size();
        this.board = new Board(boardSize, snakeCnt, ladderCnt);
    }

    // Play game
    public void playGame() {
        Player winner = null;

        while (winner == null) {
            Player playerTurn = players.peekFirst(); // Get the current player
            players.removeFirst(); // Remove from the front of the queue
            players.addLast(playerTurn); // Add to the end of the queue for the next turn

            int cnt = 0;
            int moveSum = 0;

            // Roll all dice
            while (cnt < diceCnt) {
                Dice dice = dices.peekFirst();
                dices.removeFirst();
                dices.addLast(dice);

                moveSum += dice.diceThrow();
                cnt++;
            }

            int forwardMove = playerTurn.getPosition() + moveSum;

            // Check if the player has won
            if (forwardMove >= this.board.boardSize() * this.board.boardSize()) {
                winner = playerTurn;
                break;
            }

            // Calculate the row and column of the player's new position
            int playerRow = forwardMove / this.board.boardSize();
            int playerCol;

            if (forwardMove % this.board.boardSize() == 0) {
                playerCol = this.board.boardSize() - 1;
            } else {
                playerCol = forwardMove % this.board.boardSize() - 1;
            }

            // Boundary check
            if (playerRow < 0 || playerRow >= this.board.boardSize() || playerCol < 0 || playerCol >= this.board.boardSize()) {
                continue; // Skip invalid moves
            }

            // Check for snake or ladder
            Cell cell = this.board.getCell(playerRow, playerCol);
            if (cell.getJump() != null) {
                int endPoint = cell.getJump().getEndPoint();
                playerTurn.setPosition(endPoint);
            } else {
                playerTurn.setPosition(forwardMove);
            }

            System.out.println(playerTurn.getName() + " moved to position " + playerTurn.getPosition());

            // Check if the player has won after processing the jump
            if (playerTurn.getPosition() >= this.board.boardSize() * this.board.boardSize()) {
                winner = playerTurn;
                break;
            }
        }

        System.out.println("Winner is: " + winner.getName());
    }
}
