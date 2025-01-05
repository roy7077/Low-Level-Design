import Pizza.BasePizza;
import Pizza.ChickenFiesta;
import Pizza.FarmHouse;
import Topings.Barbeque;
import Topings.Panner;

public class Store {
    public static void main(String[] args) {

        // ChickenFiesta + Panner
        BasePizza pizza = new Panner(new ChickenFiesta());
        int c=pizza.getCost();
        System.out.println("Cost of ChickenFiesta with Panner is "+c);

        // FarmHouse + Barbeque + Panner
        BasePizza pizza2 = new Panner(new Barbeque(new FarmHouse()));
        int c2=pizza2.getCost();
        System.out.println("Cost Of FarmHouse pizza with Barbeque, Panner is "+c2);
    }
}


// ChickenFiesta+Panner