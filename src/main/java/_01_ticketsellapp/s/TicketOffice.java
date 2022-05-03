package _01_ticketsellapp.s;

import _01_ticketsellapp.b.Audience;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellToTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void minusAmount(long amount) {
        this.amount -= amount;
    }

    private void plusAmount(long amount) {
        this.amount += amount;
    }
}
