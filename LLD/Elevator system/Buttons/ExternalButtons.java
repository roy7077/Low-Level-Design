package Buttons;

import Direction.Direction;
import Floor.Floor;

public class ExternalButtons{
    Direction dis;
    public ExternalButtons(){
        this.dis=Direction.IDLE;
    }

    // set direction
    public void setDis(Direction dis) {
        this.dis = dis;
    }

    public void keyPress(Direction dis,Floor floor){

        setDis(dis);
        // logic to add this to dispatcher
        // pending ?
        setDis(Direction.IDLE);
    }
}
