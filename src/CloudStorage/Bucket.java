package CloudStorage;

public class Bucket {

    public Bucket(String nom, int capaciteMax, int espaceOccupe) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.espaceOccupe = espaceOccupe;
    }

    private String nom;

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getEspaceOccupe() {
        return espaceOccupe;
    }

    private int capaciteMax;
    private int espaceOccupe;

    public void ajouterFichier(Fichier f){
        if(getCapaciteMax()> getEspaceOccupe() + f.getTailleGO()){
            System.out.println("fichier : " + f.getNom() + " stocke avec succes dans " + getNom());
        } else {
            System.out.println("ERREUR : Espace insuffisant pour " + f.getNom() +  " dans " + getNom() + " ! " );
        }
    }

}
