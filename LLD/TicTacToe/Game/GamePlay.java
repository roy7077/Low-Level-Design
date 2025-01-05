package Game;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import Player.Player;
import PlayingPiece.PlayingPieceO;
import PlayingPiece.PlayingPieceX;

public class GamePlay {
    Deque<Player> deque;
    GameBoard board;
    public GamePlay(){
        deque=new ArrayDeque<Player>();
        board=new GameBoard(3);
    }

    // Initialize
    public void initialize(){
        Player p1=new Player("Sagar",new PlayingPieceO());
        Player p2=new Player("Sonu",new PlayingPieceX());

        deque.add(p1);
        deque.add(p2);
    }

    // start game
    public void startGame(){
        boolean winner=true;
        while(winner){

            Player p=deque.getFirst();
            deque.removeFirst();

            Scanner scanner = new Scanner(System.in);
            System.out.println(p.getName()+" it's your turn select cordinate : ");
            int x=scanner.nextInt();
            int y=scanner.nextInt();

            // if selected codinated are out of matrix
            if(x>=board.size || y>=board.size){
                System.out.println("Selected Codinates are out of matrix ");
                deque.addFirst(p);
                continue;
            }

            boolean isDone=board.addToBoard(x, y, p.getType());
            if(!isDone)
            {
                System.err.println("Selected Cordinates are occupied, Select another ");
                deque.addFirst(p);
                continue;
            }

            board.printBoard();
            deque.addLast(p);
            boolean checkOfWinner=board.isWinner(p.getType());
            //System.out.println("Sagar");
            if(checkOfWinner)
            {
                System.err.println("Winner is "+p.getName());
                winner=false;
            }

            boolean checkForDraw=board.isDraw();
            if(checkForDraw){
                System.err.println("Game is Draw ! END");
                winner=false;
            }
            //System.out.println("hello");
        }
    }
}
