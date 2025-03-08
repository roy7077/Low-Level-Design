package balance;
import java.util.HashMap;
import CoinTypes.CoinTypes;
import VendingMachine.VendingMachine;

public class Exchange{
    int value=0;
    VendingMachine vm;
    Exchange next;
    public Exchange(VendingMachine vm,Exchange next,int value){
        this.vm=vm;
        this.next=next;
        this.value=value;
    }

    public void run(int balance) throws Exception {
        HashMap<Integer, Integer> mp = this.vm.returnMap();
        
        int div = balance / this.value;
        
        while (div > 0 && mp.getOrDefault(this.value, 0) > 0) {
            this.vm.addCoins(coinTypes());  
            div--;
            balance -= this.value;
            
            // Decrement the count of available coins
            mp.put(this.value, mp.getOrDefault(this.value, 0) - 1);
        }
        
        // If balance is zero, return
        if (balance == 0) {
            return;
        }
    
        // Proceed to next step
        next(balance);
    }
    
    public void next(int balance) throws Exception{
        if(this.next==null){
            return ;
        }

        this.next.run(balance);
    }

    public CoinTypes coinTypes() throws Exception {
        switch (this.value) {
            case 1:
                return CoinTypes.PENNY;
            case 5:
                return CoinTypes.NICKEL;
            case 10:
                return CoinTypes.DIME;
            case 25:
                return CoinTypes.QUARTER;
            case 50:
                return CoinTypes.HALF_DOLLAR;
            case 100:
                return CoinTypes.DOLLAR;
            default:
                throw new Exception("Invalid coin value: " + this.value);
        }
    }
    
}
