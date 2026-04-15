package AlerteCanal;

public class Sms implements Canal{

    @Override
    public void envoyer(String message){
        System.out.println("[SMS] vous avez reçu un message : " + message);
    }
}
