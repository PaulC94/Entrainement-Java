package apprentissage;

public class Calculateur {

    public static void main(String[] args){
        double prix = 16;
        double total = calculerTTC(prix);
        System.out.println("le prix ttc est de : " + total);

    }

    public static double calculerTTC(double prix){
        return (prix / 5) + prix;
    }





}
