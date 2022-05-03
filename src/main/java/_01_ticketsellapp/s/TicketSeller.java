package _01_ticketsellapp.s;

import _01_ticketsellapp.b.Audience;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellToTicketTo(audience);
    }
}
