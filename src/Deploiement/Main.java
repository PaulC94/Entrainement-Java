package Deploiement;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ingenieur Paul = new Ingenieur("Paul");
        Conteneur conteneur1 = new Conteneur("Mysql",5432);
        Conteneur conteneur2 = new Conteneur("postgreSQL",3306);
        Conteneur conteneur3 = new Conteneur("http",80);
        Paul.deployer(conteneur1);
        ArrayList<Conteneur> maFlotte = new ArrayList<>();

        maFlotte.add(conteneur1);
        maFlotte.add(conteneur2);
        maFlotte.add(conteneur3);

        for (Conteneur c : maFlotte){
           Paul.deployer(c);
        }


    }
}
