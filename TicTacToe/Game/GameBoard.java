package Game;

import PlayingPiece.PlayingPiece;

public class GameBoard {
    public int size;
    public PlayingPiece [][]board;

    GameBoard(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }

    // add to board
    public boolean addToBoard(int x,int y,PlayingPiece pc){

        if(this.board[x][y]==null)
        {
            board[x][y]=pc;
            return true;
        }

        return false;
    }

    // print board
    public void printBoard(){
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                if (board[i][j] != null)
                System.out.print(board[i][j].type.name() + "   ");
                else
                System.out.print("    ");

                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    // check for winner
    public boolean isWinner(PlayingPiece pc){
        
        // check for rows
        for(int i=0;i<size;i++)
        {
            boolean flag=true;
            for(int j=0;j<size;j++)
            {
                if(board[i][j]!=pc)
                {
                    flag=false;
                    break;
                }
            }

            if(flag)
            return true;
        }

        // check for coloumn
        for(int j=0;j<size;j++)
        {
            boolean flag=true;
            for(int i=0;i<size;i++)
            {
                if(board[i][j]!=pc)
                {
                    flag=false;
                    break;
                }
            }

            if(flag)
            return true;
        }

        // check for diagonals
        int i=0;
        int j=0;
        boolean flag1=false;
        boolean flag2=false;
        while(i<size && j<size)
        {
            // left to right diagonal
            if(board[i][j]!=pc)
            flag1=false;

            // right to left diagonal
            if(board[i][size-j-1]!=pc)
            flag2=false;

            i++;
            j++;
        }

        if(flag1 || flag2)
        return true;

        return false;
    }

    // check for draw
    public boolean isDraw(){
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]==null)
                return false;
            }
        }
        return true;
    }
}
