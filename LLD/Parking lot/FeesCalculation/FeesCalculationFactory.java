package FeesCalculation;

import Tickets.Tickets;

public class FeesCalculationFactory {
    private Tickets ticket;

    public FeesCalculationFactory(Tickets ticket) {
        this.ticket = ticket;
    }

    public int getFees() {
        switch (ticket.getType()) {
            case "Two Wheeler":
                FeesCalculation twoWheelerCalculation = new TwoWheelerFeesCalculation(ticket);
                return twoWheelerCalculation.feesCalculation();
                
            case "Four Wheeler":
                FeesCalculation fourWheelerCalculation = new FourWheelerFeesCalculation(ticket);
                return fourWheelerCalculation.feesCalculation();
                
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + ticket.getType());
        }
    }
}
