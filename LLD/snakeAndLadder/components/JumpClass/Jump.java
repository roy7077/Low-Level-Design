package components.JumpClass;

public class Jump {
    int startPoint;
    int endPoint;

    public Jump(int startPoint,int endPoint){
        this.startPoint=startPoint;
        this.endPoint=endPoint;
    }

    // getters
    public int getEndPoint() {
        return endPoint;
    }

    public int getStartPoint() {
        return startPoint;
    }

    // setters
    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
    }
}
