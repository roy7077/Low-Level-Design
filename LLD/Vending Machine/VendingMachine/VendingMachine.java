package VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import CoinTypes.CoinTypes;
import Inventory.Inventory;
import Inventory.Shelf;
import States.StateInterface;
import States.StateImplements.IdealState;
import balance.Exchange;

public class VendingMachine {
    Exchange exchange;
    ArrayList<CoinTypes> arrayOfCoins=new ArrayList<CoinTypes>();
    HashMap<Integer, Integer> map = new HashMap<>();
    Inventory inventory;
    public StateInterface vendingMachineState; 

    public VendingMachine(Inventory inventory ){
        this.inventory=inventory;
        this.vendingMachineState=new IdealState(this);
    }

    // setters
    public void setVendingMachineState(StateInterface vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public void addCoins(CoinTypes cn){
        this.arrayOfCoins.add(cn);
    }

    public List<CoinTypes> refundMoney(){
        ArrayList<CoinTypes> ans=this.arrayOfCoins;
        this.arrayOfCoins=new ArrayList<CoinTypes>();
        return ans;
    }

    public void showProducts(){
        this.inventory.showProducts();
    }

    public int sumOfMoney(){
        int sum=0;
        for (CoinTypes coinTypes : arrayOfCoins) {
            sum+=coinTypes.getValue();
        }
        return sum;
    }

    public Shelf productCost(int codeNumber){
        return inventory.getProductByCode(codeNumber);
    }

    public void getStateName() throws Exception{
        vendingMachineState.getStateName();
    }

    // getters and setters for stored coins
    public void addIntoHashMap(CoinTypes cn){
        map.put(cn.getValue(), map.getOrDefault(cn.getValue(), 0) + 1);
    };

    public HashMap<Integer, Integer> returnMap(){
        return this.map;
    };

    public void removeFromHashmap(CoinTypes cn){
        if(map.get(cn.getValue())==0)
        return ;

        map.put(cn.getValue(), map.getOrDefault(cn.getValue(), 0) - 1);
    };

    public int returnCountFromHash(int value){
        return map.getOrDefault(value, 0);
    }

    public void emptyArrayOfMoney(){
        this.arrayOfCoins=new ArrayList<CoinTypes>();
    }

    public  ArrayList<CoinTypes> returnArrayOfCoins(){
        return this.arrayOfCoins;
    }
}
