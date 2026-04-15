package SmartShopping;

public class Article {

    public Article(String nom, double prixHT, boolean estDeLuxe) {
        this.nom = nom;
        this.prixHT = prixHT;
        this.estDeLuxe = estDeLuxe;
    }

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public boolean isEstDeLuxe() {
        return estDeLuxe;
    }

    public void setEstDeLuxe(boolean estDeLuxe) {
        this.estDeLuxe = estDeLuxe;
    }

    private double prixHT;
    private boolean estDeLuxe;


}
