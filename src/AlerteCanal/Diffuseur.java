package AlerteCanal;

import java.util.ArrayList;

public class Diffuseur {

    private ArrayList<Canal> listeCanaux = new ArrayList<>();

    public void ajouterCanal(Canal c){
        this.listeCanaux.add(c);
    }

    public void alerteGeneral(String msg){
        for (Canal c : listeCanaux){
            c.envoyer(msg);
        }



    }


}
