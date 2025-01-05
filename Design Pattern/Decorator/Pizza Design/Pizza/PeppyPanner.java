package Pizza;

public class PeppyPanner extends BasePizza{
    public PeppyPanner(){
        this.name="PeppyPanner";
        this.Description="This is PeppyPanner Pizza";
    }

    @Override
    public void getDescription() {
       System.out.println(Description);
    }

    @Override
    public int getCost() {
        return 120;
    }
}

