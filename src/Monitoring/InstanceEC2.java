package Monitoring;

public class InstanceEC2 extends RessourceCloud {
    private String typeInstance;

    public InstanceEC2(String nom, String status, String typeInstance) {
        super(nom, status);
        this.typeInstance = typeInstance;
    }

    @Override
    public void verifierEtat() {
        System.out.println("Instance EC2 [" + typeInstance + "] " + getNom() + " | Statut : " + getStatus());
    }
}