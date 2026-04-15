package SupportTicketing;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

    static void main(String[] args) {


        ArrayList<Ticket> listeTicket = new ArrayList<>();

        Ticket ticket1 = new Ticket("1", 1);
        Ticket ticket2 = new Ticket("2", 2);
        Ticket ticket3 = new Ticket("3", 3);
        Ticket ticket4 = new Ticket("4", 4);

        listeTicket.add(ticket1);
        listeTicket.add(ticket2);
        listeTicket.add(ticket3);
        listeTicket.add(ticket4);

        Technicien Paul = new Technicien("Paul",3,0);

        for(Ticket t : listeTicket){
            Paul.resoudre(t);
        }
    }
}
