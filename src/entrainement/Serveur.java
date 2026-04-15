package entrainement;

public class Serveur {

    private String nom;
    private String adresseIP;

    public Serveur(String nom, String adresseIP) {
        this.nom = nom;
        this.adresseIP = adresseIP;
    }
    public String getNom() {
        return nom;
    }

    public String getAdresseIP() {
        return adresseIP;
    }

    public void setAdresseIP(String adresseIP) {
        this.adresseIP = adresseIP;
    }

    void demarrer(){
        System.out.println("le serveur " + nom + "démarre sur l'IP " + adresseIP);
    }
}
