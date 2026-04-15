package Monitoring;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<RessourceCloud> dashboard = new ArrayList<>();

        dashboard.add(new InstanceEC2("Serveur-Web", "Running", "t2.micro"));
        dashboard.add(new BaseDeDonnees("Postgres-Prod", "Running", 85.5));
        dashboard.add(new RessourceCloud("S3-Storage", "Active"));

        System.out.println("--- DÉBUT DU MONITORING ---");

        for (RessourceCloud r : dashboard) {
            r.verifierEtat();
        }
    }
}