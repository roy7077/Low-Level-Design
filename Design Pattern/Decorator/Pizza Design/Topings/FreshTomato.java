
package Topings;
import Pizza.BasePizza;

public class FreshTomato extends TopingDecorator{

    BasePizza obj;
    public FreshTomato(BasePizza ob){
        obj=ob;
    }

    @Override
    public void getDescription() {
        System.out.println("This is FreshTomato Toping");
    }

    @Override
    public int getCost() {
        return obj.getCost()+50;
    }
}
