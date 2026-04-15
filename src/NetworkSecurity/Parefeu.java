package NetworkSecurity;

public class Parefeu {

    private String nomLocalisation;

    public Parefeu(String nomLocalisation) {
        this.nomLocalisation = nomLocalisation;
    }

    public void filtrer(Paquet p){
        if (p.getTailleMo() < 500){
            System.out.println("PAQUET ACCEPTE DE " + p.getIpSource() + " sur " + this.nomLocalisation);
        }else {
            System.out.println("ALERTE : PAQUET TROP VOLUMINEUX (" + p.getTailleMo() + " Mo). IP " + p.getIpSource() + " BLOQUEE !!" );
        }
    }

}
