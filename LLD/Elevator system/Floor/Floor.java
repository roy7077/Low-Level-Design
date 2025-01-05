package Floor;
import Buttons.ExternalButtons;

public class Floor {
    public int floorNumber;
    ExternalButtons btns;
    public Floor(int floorNumber){
        this.floorNumber=floorNumber;
        this.btns=new ExternalButtons();
    }

    // setter
    public void setBtns(ExternalButtons btns) {
        this.btns = btns;
    }
}
