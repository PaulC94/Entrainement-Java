package AlerteCanal;

public class Email implements Canal{

    @Override
    public void envoyer(String message){
        System.out.println("[EMAIL] vous avez reçu un message : " + message);
    }
}
