package Payment;

public class Payment {
    int rent;
    public Payment(int hourlyCost,int hrs){
        rent=(hourlyCost*hrs);
    }

    // getter
    public int getRent() {
        return rent;
    }
}
