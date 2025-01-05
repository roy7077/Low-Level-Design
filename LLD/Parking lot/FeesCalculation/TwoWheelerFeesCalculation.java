package FeesCalculation;

import Tickets.Tickets;
import java.time.Duration;
import java.time.LocalDateTime;

public class TwoWheelerFeesCalculation implements FeesCalculation {
    private int price;
    private Tickets ticket;

    public TwoWheelerFeesCalculation(Tickets ticket) {
        this.ticket = ticket;
        this.price = 100; // Example hourly rate
    }

    @Override
    public int feesCalculation() {
        if (ticket.getEntryTime() == null) {
            throw new IllegalStateException("Entry time must be set.");
        }

        long hours = Duration.between(ticket.getEntryTime(), LocalDateTime.now()).toHours();
        return (int) (hours * price);
    }
}
