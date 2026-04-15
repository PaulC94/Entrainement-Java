package SmartShopping;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double sommeTotal = 0;

        Article article1 = new Article("Bracelet chanel", 372, true);
        Article article2 = new Article("Bracelet lv", 748, true);
        Article article3 = new Article("Bracelet primark", 7, false);
        Article article4 = new Article("Bracelet temu", 2, false);

        ArrayList<Article> listeArticle = new ArrayList<>();
        listeArticle.add(article1);
        listeArticle.add(article2);
        listeArticle.add(article3);
        listeArticle.add(article4);

        Caisse maCaisse = new Caisse();

        for(Article art : listeArticle ){
            double prixTTC = maCaisse.calculerPrixTTC(art);
            sommeTotal+= prixTTC;
            System.out.println(art.getNom() + " TTC : " + prixTTC + " €");
        }
        System.out.println("---------------------------");
        System.out.println("SOMME TOTALE DU PANIER : " + sommeTotal + " €");
    }
}
