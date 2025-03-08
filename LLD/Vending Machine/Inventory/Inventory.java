package Inventory;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Shelf> inventory=new ArrayList<Shelf>();

    public Inventory(ArrayList<Shelf> inventory){
        this.inventory=inventory;
    }

    // getters
    public ArrayList<Shelf> getInventory() {
        return this.inventory;
    }

    public boolean isAvailable(int shelfCode){
        for (Shelf shelf : inventory) {
            if(shelf.getCode()==shelfCode){
                return shelf.getIsSoldOut();
            }
        }
        
        return false;
    }

    // setters
    public void addInBulk(ArrayList<Shelf> inventory) {
        for (Shelf shelf : inventory) {
            this.inventory.add(shelf);
        }
    }

    public void addOne(Shelf shelf){
        this.inventory.add(shelf);
    }

    public void makeItSold(int shelfCode){
        for (Shelf shelf : inventory) {
            if(shelf.getCode()==shelfCode){
                shelf.setSoldOut(true);
                return ;
            }
        }
    }

    public void showProducts(){
        for (Shelf shelf : inventory) {
            shelf.showProducts();
        }
    }

    public Shelf getProductByCode(int code){
        for (Shelf shelf : inventory) {
            if(shelf.getCode()==code)
            return shelf;
        }
        return null;
    }
}
