package Monitoring;

public class RessourceCloud {
    private String nom;
    private String status;

    public RessourceCloud(String nom, String status) {
        this.nom = nom;
        this.status = status;
    }

    public String getNom() { return nom; }
    public String getStatus() { return status; }

    public void verifierEtat() {
        System.out.println("Vérification de " + nom + " | Statut : " + status);
    }
}