package CyberSecurite;

public class Employe {

    public Employe(String nom) {
        this.nom = nom;
    }

    private String nom;

    public String getNom() {
        return nom;
    }

    public void ouvrirSession(){
        System.out.println(this.nom + " : Session standard ouverte");
    }
}
