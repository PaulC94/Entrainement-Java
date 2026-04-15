package AlerteCanal;

public class Main {

    public static void main(String[] args) {

        Diffuseur monDiffuseur = new Diffuseur();
        monDiffuseur.ajouterCanal(new Email());
        monDiffuseur.ajouterCanal(new Telephone());
        monDiffuseur.alerteGeneral("Alerte intrusion !");

    }
}
