package CoinTypes;

public enum CoinTypes {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25),
    HALF_DOLLAR(50),
    DOLLAR(100);

    private final int value; 

    // Constructor
    CoinTypes(int value) {  
        this.value = value;
    }

    // Getter method to retrieve value
    public int getValue() {
        return value;
    }

    // Method to return CoinTypes by value
    public static CoinTypes returnType(int value) {
        for (CoinTypes coin : CoinTypes.values()) {
            if (coin.getValue() == value) {
                return coin;
            }
        }
        throw new IllegalArgumentException("Invalid coin value: " + value);
    }
}
