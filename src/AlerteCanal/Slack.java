package AlerteCanal;


public class Slack implements Canal {

    @Override
    public void envoyer(String message){
        System.out.println("[SLACK] nouveau message reçu : " + message);
    }


}
