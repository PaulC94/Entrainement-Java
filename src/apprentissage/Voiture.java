package apprentissage;

public class Voiture {

    public static void main(String[] args){
        Voiture maVoiture = new Voiture("BMW Serie 3", false);
        maVoiture.demarrer();
        maVoiture.afficherEtat();

    }

    private String marque;
    private Boolean moteurAllume;

    public Voiture(String marque, Boolean moteurAllume) {
        this.marque = marque;
        this.moteurAllume = moteurAllume;
    }

    public void demarrer(){
    this.moteurAllume = true;
    }

    public void afficherEtat(){
        if(moteurAllume){
            System.out.println("La " + this.marque + ("vrombit !"));
        }else {
            System.out.println("Le moteur est a l'arret ! ");
        }
    }
}
