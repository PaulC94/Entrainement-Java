package SecurityAudit;

public class Scanner {
    public Scanner(String version) {
        this.version = version;
    }

    private String version;

    public void analyser(ServeurS s){
        if(s.getScoreRisque() >= 7){
            System.out.println("Scanner " + this.version + " DANGER : LE SERVEUR " + s.getNom() + " sous " + s.getOs() + " EST CRITIQUE !!!");
        } else {
            System.out.println("Scanner " + this.version + s.getNom() + " est safe !!!");
        }

    }
}
