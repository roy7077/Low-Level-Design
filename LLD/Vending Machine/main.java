import java.util.ArrayList;

import CoinTypes.CoinTypes;
import Inventory.Inventory;
import Inventory.Shelf;
import Items.Item;
import Items.ItemTypes;
import VendingMachine.VendingMachine;

public class main {
    public static void main(String[] args) {
        try {
            Inventory inventory=makeInventory();
            VendingMachine vendingMachine=new VendingMachine(inventory);
            
            vendingMachine.getStateName();
            // move vending machine from ideal state to insert coin state
            vendingMachine.vendingMachineState.clickOnInsertCoinButton();   
            
            vendingMachine.getStateName();
            // inserting money 
            vendingMachine.vendingMachineState.insertCoin(CoinTypes.DIME);
            vendingMachine.vendingMachineState.insertCoin(CoinTypes.DIME);

            // select product
            vendingMachine.vendingMachineState.clickOnStartProductSelectionButton();
            vendingMachine.vendingMachineState.clickOnStartProductSelectionButton();
            vendingMachine.getStateName();
            vendingMachine.vendingMachineState.chooseProduct(1);  
           // vendingMachine.vendingMachineState.dispenseProduct();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static Inventory makeInventory() {
        ArrayList<Shelf> shelves = new ArrayList<>();

        // Creating 10 different products
        shelves.add(new Shelf(1, new Item(ItemTypes.BISCUIT, 10)));
        shelves.add(new Shelf(2, new Item(ItemTypes.SOFTDRINK, 20)));
        shelves.add(new Shelf(3, new Item(ItemTypes.CANDY, 5)));
        shelves.add(new Shelf(4, new Item(ItemTypes.CHIPS, 15)));
        shelves.add(new Shelf(5, new Item(ItemTypes.JUICE, 25)));
        shelves.add(new Shelf(6, new Item(ItemTypes.BISCUIT, 12)));
        shelves.add(new Shelf(7, new Item(ItemTypes.SOFTDRINK, 22)));
        shelves.add(new Shelf(8, new Item(ItemTypes.CANDY, 7)));
        shelves.add(new Shelf(9, new Item(ItemTypes.CHIPS, 18)));
        shelves.add(new Shelf(10, new Item(ItemTypes.JUICE, 30)));

        return new Inventory(shelves);
    }
}
