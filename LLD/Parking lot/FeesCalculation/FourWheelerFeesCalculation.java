package FeesCalculation;

import Tickets.Tickets;
import java.time.Duration;
import java.time.LocalDateTime;

public class FourWheelerFeesCalculation implements FeesCalculation {
    private int price;
    private Tickets ticket;

    public FourWheelerFeesCalculation(Tickets ticket) {
        this.ticket = ticket;
        this.price = 200; // Example hourly rate for four-wheelers
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
