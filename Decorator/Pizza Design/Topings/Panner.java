
package Topings;
import Pizza.BasePizza;

public class Panner extends TopingDecorator{

    BasePizza obj;
    public Panner(BasePizza ob){
        obj=ob;
    }

    @Override
    public void getDescription() {
        System.out.println("This is Panner Toping");
    }

    @Override
    public int getCost() {
        return obj.getCost()+70;
    }
}
