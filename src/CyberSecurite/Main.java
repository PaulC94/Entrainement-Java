package CyberSecurite;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employe> listeEmploye = new ArrayList<>();
        Employe employe1 = new Employe("Alice");
        Employe employer2 = new Employe("Bob");
        Admin admin1 = new Admin("Paul", "1234");

        listeEmploye.add(employe1);
        listeEmploye.add(employer2);
        listeEmploye.add(admin1);

        Terminal monTerminal = new Terminal();

        for(Employe e : listeEmploye){
            monTerminal.authentifier(e);
            System.out.println("");
        }

    }
}
