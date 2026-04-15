package entrainement;

public class ServeurCloud extends Serveur {

    private String fournisseur;

    public ServeurCloud(String nom, String adresseIP, String fournisseur) {
        super(nom, adresseIP);
        this.fournisseur = fournisseur;
    }

    @Override
    public void demarrer(){
        System.out.println("Lancement du serveur Cloud " + getNom() + " chez " + fournisseur + " | IP : " + getAdresseIP());    }
}
