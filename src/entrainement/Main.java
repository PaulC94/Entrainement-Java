package entrainement;

public class Main {

    public static void main(String[] args){
        Serveur srvlocal = new Serveur("local-DB", "192.168.1.10");

        ServeurCloud srvCloud = new ServeurCloud("web-App-Prod", "54.12.8.0", "AWS");

        srvCloud.setAdresseIP("54.12.8.10");

        srvlocal.demarrer();
        srvCloud.demarrer();
    }
}
