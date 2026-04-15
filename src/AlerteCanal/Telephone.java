package AlerteCanal;

public class Telephone implements Canal {

    @Override
    public void envoyer(String message){
        System.out.println("[TELEPHONE] : Vous avez recu un message de télephone " + message);
    }


}
