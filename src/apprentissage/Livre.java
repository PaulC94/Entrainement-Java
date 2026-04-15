package apprentissage;

public class Livre {

    public static void main(String[] args){

        Livre monLivre = new Livre("Belle au bois dormant", 342);
        monLivre.afficherInfos();
    }

    private String titre;
    private int nombrePages;

    public Livre(String titre, int nombrePages) {
        this.titre = titre;
        this.nombrePages = nombrePages;
    }


    public void afficherInfos(){
        System.out.println("Le livre " + this.titre + "contient" + this.nombrePages + "pages.");
    }
}


