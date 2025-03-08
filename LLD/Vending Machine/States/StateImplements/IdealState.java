package States.StateImplements;

import java.util.List;

import CoinTypes.CoinTypes;
import Items.Item;
import States.StateInterface;
import VendingMachine.VendingMachine;

public class IdealState implements StateInterface{
    VendingMachine vm;
    public IdealState(VendingMachine vm){
        this.vm=vm;
        System.out.println("Vending Machine is in Ideal State");
    }

    public void clickOnInsertCoinButton() throws Exception{
        this.vm.setVendingMachineState(new InsertMoneyState(this.vm));
    }
    public void insertCoin(CoinTypes cn) throws Exception{
        throw new Error("Machine is in Ideal state You cannot insert coin");
    }
    public void clickOnStartProductSelectionButton() throws Exception{
        throw new Error("Machine is in Ideal state You cannot select products");
    }
    public void chooseProduct(int codeNumber) throws Exception{
        throw new Error("Machine is in Ideal state You cannot select products");
    }
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Error("Machine is in Ideal state You cannot get change");
    }
    public List<CoinTypes> refundFullMoney() throws Exception{
        throw new Error("Machine is in Ideal state You cannot get refund");
    }
    public Item dispenseProduct() throws Exception{
        throw new Error("Machine is in Ideal state You cannot get product");
    }
    public void updateInventory(int code) throws Exception{
        return ;
    }
    public void getStateName(){
        System.out.println("Machine is in Ideal State");
    }
}
