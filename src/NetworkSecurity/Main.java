package NetworkSecurity;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Paquet paquet1 = new Paquet("192.168.64.1", 600);
        Paquet paquet2 = new Paquet("192.168.64.2", 420);
        Paquet paquet3 = new Paquet("192.168.64.3", 279);
        ArrayList<Paquet> traffic = new ArrayList<>();

        traffic.add(paquet1);
        traffic.add(paquet2);
        traffic.add(paquet3);

        Parefeu monParefeu = new Parefeu("paris");

        for(Paquet p : traffic){
            monParefeu.filtrer(p);
        }



    }
}
