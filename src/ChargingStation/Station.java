package ChargingStation;

public class Station {

    public int getEnergieDispo() {
        return energieDispo;
    }

    public void setEnergieDispo(int energieDispo) {
        this.energieDispo = energieDispo;
    }

    public int getBorneOccupe() {
        return borneOccupe;
    }

    public void setBorneOccupe(int borneOccupe) {
        this.borneOccupe = 0;
    }

    private int energieDispo;
    private int borneOccupe;

    public Station(int energieDispo, int borneOccupe) {
        this.energieDispo = energieDispo;
        this.borneOccupe = borneOccupe;
    }

    public void recharger(Vehicule v){
        if(v.getNiveauBatterie() < 30 && this.energieDispo >= 50 ){
            v.setEnCharge(true);
            setEnergieDispo(this.energieDispo - 50);
            this.borneOccupe++;
            System.out.println("Recharge lancée pour " + v.getMarque() + ". énergie restante : " + this.energieDispo + " units");
        } else if(this.energieDispo < 50 ){
            System.out.println("Il ne reste plus assez de batterie a cette borne !");
        }
    }
}
