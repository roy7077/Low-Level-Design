package components;

import java.util.HashMap;
import components.Enums.SeatCategory;

public class SeatPriceClass {
    private HashMap<SeatCategory, Integer> seatPrices = new HashMap<>();

    // Constructor
    public SeatPriceClass() {
        // Default seat prices (Optional)
        seatPrices.put(SeatCategory.SILVER, 100);
        seatPrices.put(SeatCategory.GOLD, 200);
        seatPrices.put(SeatCategory.PLATINUM, 500);
    }

    // Add a new seat category and its price
    public void addSeatCategory(SeatCategory category, int price) {
        if (!seatPrices.containsKey(category)) {
            seatPrices.put(category, price);
            System.out.println(category + " added with price: " + price);
        } else {
            System.out.println(category + " already exists. Use setSeatPrice() to update.");
        }
    }

    // Set price for an existing category
    public void setSeatPrice(SeatCategory category, int price) {
        seatPrices.put(category, price);
    }

    // Get seat price for a category
    public int getSeatPrice(SeatCategory category) {
        return seatPrices.getOrDefault(category, 0);
    }

    // Get all seat prices
    public HashMap<SeatCategory, Integer> getAllSeatPrices() {
        return seatPrices;
    }
}
