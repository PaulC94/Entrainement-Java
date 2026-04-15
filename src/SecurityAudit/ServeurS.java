package SecurityAudit;

public class ServeurS {
    private String nom;
    private String os;
    private int scoreRisque;

    public String getNom() {
        return nom;
    }

    public String getOs() {
        return os;
    }

    public int getScoreRisque() {
        return scoreRisque;
    }

    public ServeurS(String nom, String os, int scoreRisque) {
        this.nom = nom;
        this.os = os;
        this.scoreRisque = scoreRisque;
    }


}
