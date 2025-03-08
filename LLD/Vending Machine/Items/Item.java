package Items;
// Enum for Store Items

public class Item {
    private ItemTypes type;
    private int price;

    // constructors
    public Item(ItemTypes type,int price){
        this.price=price;
        this.type=type;
    }

    // getters
    public int getPrice() {
        return price;
    }
    public ItemTypes getType() {
        return type;
    }
    // setters
    public void setPrice(int price) {
        this.price = price;
    }
    public void setType(ItemTypes type) {
        this.type = type;
    }
}