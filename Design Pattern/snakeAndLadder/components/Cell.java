package components;
import components.JumpClass.Jump;

public class Cell {
    int x;
    int y;
    Jump jump;
    
    public Cell(int x,int y){
        this.x=x;
        this.y=y;
        this.jump=null;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Jump getJump() {
        return jump;
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }
}
