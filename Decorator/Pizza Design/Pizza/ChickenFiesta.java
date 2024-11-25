package Pizza;
public class ChickenFiesta extends BasePizza {
    
    public ChickenFiesta() {
        this.name = "ChickenFiesta";
        this.Description = "Hello, this is ChickenFiesta Pizza";
    }

    @Override
    public void getDescription() {
        System.out.println(Description);
    }

    @Override
    public int getCost() {
        return 100;
    }
}

