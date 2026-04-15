package SupportTicketing;

public class Technicien {

    public Technicien(String nom, int niveau, int nbTicketResolus) {
        this.nom = nom;
        this.niveau = niveau;
        this.nbTicketResolus = 0;
    }

    private String nom;

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getNbTicketResolus() {
        return nbTicketResolus;
    }

    private int niveau;
    private int nbTicketResolus;

    public void resoudre(Ticket t){
        if(this.niveau > t.getPriorite()){
            System.out.println("Ticket " + t.getId() + " résolu par " + getNom());
            this.nbTicketResolus++;
        }else{
            System.out.println("Le ticket : " + t.getId() + " trop complexe pour le technicien : " + getNom() + " (Niveau Insuffisant)");
        }
    }
}
