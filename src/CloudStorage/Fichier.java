package CloudStorage;

public class Fichier {

    private int tailleGO;
    private String nom;

    public String getNom() {
        return nom;
    }

    public int getTailleGO() {
        return tailleGO;
    }


    public Fichier(String nom, int tailleGO) {
        this.nom = nom;
        this.tailleGO = tailleGO;
    }




}
