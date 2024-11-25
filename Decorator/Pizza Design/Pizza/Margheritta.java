package Pizza;

public class Margheritta extends BasePizza{

    public Margheritta(){
        this.name="Margheritta";
        this.Description="This is Margheritta Pizza";
    }

    @Override
    public void getDescription() {
       System.out.println(Description);
    }

    @Override
    public int getCost() {
        return 110;
    }
}

