package Monitoring;

public class BaseDeDonnees extends RessourceCloud {
    private double chargeCpu;

    public BaseDeDonnees(String nom, String status, double chargeCpu) {
        super(nom, status);
        this.chargeCpu = chargeCpu;
    }

    @Override
    public void verifierEtat() {
        System.out.println("Alerte DB " + getNom() + " | Charge CPU : " + chargeCpu + "%");
    }
}