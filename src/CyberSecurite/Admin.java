package CyberSecurite;

public class Admin extends Employe {

    private String cleSecrete;

    public Admin(String nom, String cleSecrete){
        super(nom);
        this.cleSecrete = cleSecrete;
    }

    @Override
    public void ouvrirSession(){
        System.out.println(getNom() + " : ACCES TOTAL OUVERT (clé : " + this.cleSecrete + ")");
    }

}
