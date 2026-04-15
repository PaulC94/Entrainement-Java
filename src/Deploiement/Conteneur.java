package Deploiement;

public class Conteneur {

    private String image;
    private int port;
    private boolean estEnExecution;

    public String getImage() {
        return image;
    }

    public int getPort() {
        return port;
    }

    public Conteneur(String image, int port) {
        this.image = image;
        this.port = port;
    }

    public void demarrer(){
    estEnExecution = true;
    }

    public void arreter(){
    estEnExecution = false;
    }

    public void afficherInfos(){
        if (estEnExecution){
            System.out.println(" l'Image : " + this.image + " sur le port " + this.port + " est allumé" );
        }else {
            System.out.println("Status : Arreté");
        }
    }



}
