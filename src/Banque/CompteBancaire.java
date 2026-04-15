package Banque;

public class CompteBancaire {


    public static void main(String[] args){
        CompteBancaire monCompte = new CompteBancaire(422);
        double montantADeposer = 100;
        monCompte.deposer(montantADeposer);
        monCompte.afficherSolde();
    }

    private double solde;

    public CompteBancaire(double montant) {
        this.solde = solde + montant;
    }

    public void deposer(double montant){
        solde = solde + montant;
    }

    public void afficherSolde(){
        System.out.println("Votre solde est actuellement de :" + this.solde);
    }

}
