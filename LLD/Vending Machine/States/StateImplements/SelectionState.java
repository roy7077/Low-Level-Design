package States.StateImplements;

import java.util.ArrayList;
import java.util.List;

import CoinTypes.CoinTypes;
import Inventory.Shelf;
import Items.Item;
import States.StateInterface;
import VendingMachine.VendingMachine;

public class SelectionState implements StateInterface{
    VendingMachine vm;
    public SelectionState(VendingMachine vm){
        this.vm=vm;
        System.out.println("Machine is in SelectionState");
    }
    public void clickOnInsertCoinButton() throws Exception{
        this.vm.setVendingMachineState(new InsertMoneyState(vm));
    }
    public void insertCoin(CoinTypes cn) throws Exception{
        throw new Error("You Cannot Insert Coin, Your are in SelectionState");
    }
    public void clickOnStartProductSelectionButton() throws Exception{
        System.out.println("Machine is already in product selection");
    }
    public void chooseProduct(int codeNumber) throws Exception{
        int sum=this.vm.sumOfMoney();
        Shelf sh=vm.productCost(codeNumber);

        if(sh==null){
            System.out.println("No av");
            return ;
        }

        if(sh.getItem().getPrice()<=sum && !sh.getIsSoldOut())
        this.vm.setVendingMachineState(new DispenseState(vm, codeNumber,sum-sh.getItem().getPrice()));
        else
        throw new Error("Ammount is insufficient");
    }

    public int getChange(int returnChangeMoney) throws Exception{
        throw new Error("Machine is in Select product state");
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
        throw new Error("Machine is in selection state");
    }
    public void updateInventory(int code) throws Exception{
        return ;
    }
    public void getStateName(){
        System.out.println("Machine is in Selection State");
    }
}
