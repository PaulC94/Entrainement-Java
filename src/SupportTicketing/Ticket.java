package SupportTicketing;

public class Ticket {

    public Ticket(String id, int priorite) {
        this.id = id;
        this.priorite = priorite;
    }

    private String id;

    public String getId() {
        return id;
    }

    public int getPriorite() {
        return priorite;
    }

    private int priorite;


}
