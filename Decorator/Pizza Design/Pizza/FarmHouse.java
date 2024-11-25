package Pizza;

public class FarmHouse extends BasePizza{
    public FarmHouse(){
        this.name="FarmHouse";
        this.Description="This is FarmHouse Pizza";
    }

    @Override
    public void getDescription() {
       System.out.println(Description);
    }

    @Override
    public int getCost() {
        return 130;
    }
}