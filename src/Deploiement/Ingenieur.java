package Deploiement;

public class Ingenieur {

    private String nom;

    public Ingenieur(String nom) {
        this.nom = nom;
    }

    public void deployer(Conteneur c){
       if (c.getPort() >= 1024){
           System.out.println(this.nom + " valide et lance le conteneur : " + c.getImage());
           c.demarrer();
           c.afficherInfos();
       } else {
           System.out.println("ERREUR CRITIQUE : " + this.nom + " refuse de déployer " + c.getImage() + " sur le port " + c.getPort() + " (Port réservé)");
       }
       }


}


