package NetworkSecurity;

public class Paquet {

    private String ipSource;
    private int tailleMo;

    public String getIpSource() {
        return ipSource;
    }

    public int getTailleMo() {
        return tailleMo;
    }

    public Paquet(String ipSource, int tailleMo) {
        this.ipSource = ipSource;
        this.tailleMo = tailleMo;
    }


}
