package States.StateImplements;

import java.util.ArrayList;
import java.util.List;

import CoinTypes.CoinTypes;
import Items.Item;
import States.StateInterface;
import VendingMachine.VendingMachine;

public class HasMoneyState implements StateInterface{
    VendingMachine vm;
    public HasMoneyState(VendingMachine vm){
        this.vm=vm;
        System.out.println("Machine is in HasMoneyState");
    }
    public void clickOnInsertCoinButton() throws Exception{
        this.vm.setVendingMachineState(new InsertMoneyState(this.vm));
    }
    public void insertCoin(CoinTypes cn) throws Exception{
        throw new Error("You Cannot Insert Coin, Your are in Has Money State");
    }
    public void clickOnStartProductSelectionButton() throws Exception{
        this.vm.setVendingMachineState(new SelectionState(this.vm));
    }
    public void chooseProduct(int codeNumber) throws Exception{
        throw new Error("You Cannot Insert Coin, Your are in Has Money State");
    }
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Error("You Cannot Insert Coin, Your are in Has Money State");
    }
    public List<CoinTypes> refundFullMoney() throws Exception{
        ArrayList<CoinTypes> array=this.vm.returnArrayOfCoins();
        for (CoinTypes coinTypes : array) {
            this.vm.removeFromHashmap(
                coinTypes
            );
        }
        this.vm.emptyArrayOfMoney();
        return array;
    }
    public Item dispenseProduct() throws Exception{
        throw new Error("You cannot dispense product, Machine is in Has Money state");
    }
    public void updateInventory(int code) throws Exception{
        return ;
    }
    public void getStateName(){
        System.out.println("Machine is in Has Money State");
    }
}
