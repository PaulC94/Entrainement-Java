package ChargingStation;

public class Vehicule {

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public int getNiveauBatterie() {
        return niveauBatterie;
    }

    public boolean isEnCharge() {
        return enCharge;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setNiveauBatterie(int niveauBatterie) {
        this.niveauBatterie = niveauBatterie;
    }

    public void setEnCharge(boolean enCharge) {
        this.enCharge = enCharge;
    }

    private String nom;

    public Vehicule(String nom, String marque, int niveauBatterie, boolean enCharge) {
        this.nom = nom;
        this.marque = marque;
        this.niveauBatterie = niveauBatterie;
        this.enCharge = enCharge;
    }

    private String marque;
    private int niveauBatterie;
    private boolean enCharge;




}
