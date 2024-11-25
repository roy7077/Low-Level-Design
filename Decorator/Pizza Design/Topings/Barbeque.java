
package Topings;
import Pizza.BasePizza;

public class Barbeque extends TopingDecorator{
    BasePizza obj;
    public Barbeque(BasePizza ob){
        obj=ob;
    }

    @Override
    public void getDescription() {
        System.out.println("This is Barbeque Toping");
    }

    @Override
    public int getCost() {
        return obj.getCost()+60;
    }
}