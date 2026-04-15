package SecurityAudit;

import entrainement.Serveur;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ServeurS serveur1 = new ServeurS("Serveur 1", "Debian", 7  );
        ServeurS serveur2 = new ServeurS("Serveur 2", "ubuntu",4);
        ServeurS serveur3 = new ServeurS("Serveur 3", "Windows serveur", 2 );

        ArrayList<ServeurS> parcInformatique = new ArrayList<>();
        parcInformatique.add(serveur1);
        parcInformatique.add(serveur2);
        parcInformatique.add(serveur3);

        Scanner scanner = new Scanner("V2.0");

        for(ServeurS s: parcInformatique){
            scanner.analyser(s);
        }



    }



}
