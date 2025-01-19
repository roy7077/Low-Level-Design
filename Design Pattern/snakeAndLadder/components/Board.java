package components;
import java.util.concurrent.ThreadLocalRandom;
import components.JumpClass.Ladder;
import components.JumpClass.Snake;

public class Board {

    int ladderCnt = 0; // Number of ladders to be placed
    int snakeCnt = 0;  // Number of snakes to be placed
    int boardSize;     // Size of the board
    Cell[][] board;    // 2D board representation

    public Board(int boardSize,int snakeCnt,int ladderCnt) {
        this.snakeCnt=snakeCnt;
        this.ladderCnt=ladderCnt;
        this.boardSize = boardSize;
        this.board = new Cell[boardSize][boardSize];
        initializeBoard();
    }

    // Initialize the board
    void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = new Cell(i, j);
            }
        }
    }

    // Make ladders
    void makeLadder() {
        int ladders = 0;
        while (ladders < this.ladderCnt) {
            int start = ThreadLocalRandom.current().nextInt(1, this.boardSize * this.boardSize - 1);
            int end = ThreadLocalRandom.current().nextInt(1, this.boardSize * this.boardSize - 1);

            if (start >= end) continue; // Ladders should go upwards

            int startRow = start / this.boardSize;
            int startCol = start % this.boardSize;
        
            // Check if there's already a jump at the start cell
            if (board[startRow][startCol].jump != null) continue;

            Ladder newLadder = new Ladder(start, end);
            board[startRow][startCol].jump = newLadder;
            ladders++;
        }
    }

    // Make snakes
    void makeSnake() {
        int snakes = 0;
        while (snakes < this.snakeCnt) {
            int start = ThreadLocalRandom.current().nextInt(1, this.boardSize * this.boardSize - 1);
            int end = ThreadLocalRandom.current().nextInt(1, this.boardSize * this.boardSize - 1);

            if (start <= end) continue; // Snakes should go downwards

            int startRow = start / this.boardSize;
            int startCol = start % this.boardSize;
            
            // Check if there's already a jump at the start cell
            if (board[startRow][startCol].jump != null) continue;

            Snake newSnake = new Snake(start, end);
            board[startRow][startCol].jump = newSnake;
            snakes++;
        }
    }

    // get board size
    int boardSize(){
        return this.boardSize;
    }

    Cell getCell(int i,int j){
        return this.board[i][j];
    }
}