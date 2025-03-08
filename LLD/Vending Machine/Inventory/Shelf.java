package Inventory;
import Items.Item;

public class Shelf {
    private int code;
    private boolean isSoldOut;
    private Item item;

    // constructor
    public Shelf(int code,Item item){
        this.code=code;
        this.isSoldOut=false;
        this.item=item;
    }

    // getters
    public int getCode() {
        return code;
    }
    public Item getItem() {
        return item;
    }
    
    public boolean getIsSoldOut(){
        return this.isSoldOut;
    }

    // setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public void setSoldOut(boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    public void showProducts(){
        System.out.println("Item is "+this.item.getType()+" Shelf Code is "+this.code);
    }
}