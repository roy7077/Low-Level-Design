
package Topings;
import Pizza.BasePizza;

public class Jalapeno extends TopingDecorator{

    BasePizza obj;
    public Jalapeno(BasePizza ob){
        obj=ob;
    }

    @Override
    public void getDescription() {
        System.out.println("This is Jalapeno Toping");
    }

    @Override
    public int getCost() {
        return obj.getCost()+60;
    }
}
