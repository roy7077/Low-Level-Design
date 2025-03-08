package States.StateImplements;

import java.util.ArrayList;
import java.util.List;
import CoinTypes.CoinTypes;
import Inventory.Shelf;
import Items.Item;
import States.StateInterface;
import VendingMachine.VendingMachine;
import balance.Exchange;

public class DispenseState implements StateInterface{
    private Exchange exchange;
    private int balance=0;
    private int codeNumber=-1;
    VendingMachine vm;
    public DispenseState(VendingMachine vm,int codeNumber,int balance)  throws Exception {
        this.vm=vm;
        this.codeNumber=codeNumber;
        this.balance=balance;
        this.exchange = new Exchange(this.vm, 
                        new Exchange(this.vm, 
                        new Exchange(this.vm,
                        new Exchange(this.vm, 
                        new Exchange(this.vm, null, 1), 5), 10), 25), 50);
    }
    public void clickOnInsertCoinButton() throws Exception{
        throw new Error("Machine is in despense satate");
    }
    public void insertCoin(CoinTypes cn) throws Exception{
        throw new Error("Machine is in despense satate");
    }
    public void clickOnStartProductSelectionButton() throws Exception{
        throw new Error("Machine is in despense satate");
    }
    public void chooseProduct(int codeNumber) throws Exception{
        throw new Error("Machine is in despense satate");
    }
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Error("Machine is in despense satate");
    }
    public List<CoinTypes> refundFullMoney() throws Exception{
        throw new Error("Machine is in despense satate");
    }
    public Item dispenseProduct() throws Exception{
        Shelf sh=this.vm.productCost(this.codeNumber);
        sh.setSoldOut(true);
        this.vm.setVendingMachineState(new IdealState(vm));
        this.vm.emptyArrayOfMoney();

        return sh.getItem();
    }
    public void updateInventory(int code) throws Exception{
        throw new Error("Machine is in despense satate");
    }

    public void getStateName(){
        System.out.println("Machine is in Dispense State");
    }

    public ArrayList<CoinTypes> getBalance() throws Exception{
        this.exchange.run(balance);
        return this.vm.returnArrayOfCoins();
    }
}
