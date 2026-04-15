package ChargingStation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Vehicule tesla = new Vehicule("Model s", "Tesla", 27, false);
        Vehicule merco = new Vehicule("C63s", "Mercedes", 72, false);
        Vehicule bmw = new Vehicule("x3", "BMW", 37, false);
        Vehicule audi = new Vehicule("Q3", "Audi", 17, false);


        ArrayList<Vehicule> listeVehicule = new ArrayList<>();
        listeVehicule.add(tesla);
        listeVehicule.add(merco);
        listeVehicule.add(bmw);
        listeVehicule.add(audi);

        Station Total = new Station(120, 3);

        for(Vehicule v : listeVehicule){
            Total.recharger(v);
        }
    }
}
