package CloudStorage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Fichier fichier1 = new Fichier("Fichier1", 10);
        Fichier fichier2 = new Fichier("Fichier2", 40);
        Fichier fichier3 = new Fichier("Fichier3", 200);

        ArrayList<Fichier> fileQueue = new ArrayList<>();
        fileQueue.add(fichier1);
        fileQueue.add(fichier2);
        fileQueue.add(fichier3);

        Bucket principalBucket = new Bucket("1st bucket", 100, 30);

        for(Fichier f : fileQueue ){
            principalBucket.ajouterFichier(f);


        }





    }
}
