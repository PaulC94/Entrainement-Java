package SmartShopping;

public class Caisse {

    public double calculerPrixTTC(Article a){
        if(a.isEstDeLuxe() == true ){
            return a.getPrixHT() * 1.20;
        } else {
            return a.getPrixHT() * 1.05;
        }
    }


}
