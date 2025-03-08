package States.StateImplements;
import java.util.ArrayList;
import java.util.List;

import CoinTypes.CoinTypes;
import Items.Item;
import States.StateInterface;
import VendingMachine.VendingMachine;

public class InsertMoneyState implements StateInterface {
    VendingMachine vm;  
    public InsertMoneyState(VendingMachine vm){
        this.vm=vm;
        System.out.println("Vending Machine is in Insert MoneyState");
    }

    public void clickOnInsertCoinButton() throws Exception{
        System.out.println("You can insert coins");
    }
    public void insertCoin(CoinTypes cn) throws Exception{
        System.out.println(cn.getValue());
        this.vm.addCoins(cn);
        this.vm.addIntoHashMap(cn);
    }
    public void clickOnStartProductSelectionButton() throws Exception{
        this.vm.setVendingMachineState(new HasMoneyState(this.vm));
    }
    public void chooseProduct(int codeNumber) throws Exception{
        throw new Error("You Cannot choose product Machine is InsertCoinState");
    }
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Error("You Cannot get change");
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
        throw new Error("You cannot dispense product, Machine is in insert Coin state");
    }
    public void updateInventory(int code) throws Exception{
        return ;
    }
    public void getStateName(){
        System.out.println("Machine is in Insert Money State");
    }
}
