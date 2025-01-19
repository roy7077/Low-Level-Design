package components;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int min;
    int max;

    public Dice(int min,int max){
        this.min=min;
        this.max=max;
    }

    // getters
    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    // setters
    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    // get random number , throwing a dice
    public int diceThrow(){
        return ThreadLocalRandom.current().nextInt(this.min,this.max);
    }
}
