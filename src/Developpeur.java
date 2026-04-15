public class Developpeur {

    private String nom;
    private String langageFavori;

    public Developpeur(String nom, String langage) {
        this.nom = nom;
        this.langageFavori = langage;
    }

    public String getNom() {
        return nom;
    }

    public String getLangageFavori() {
        return langageFavori;
    }

    public void setLangageFavori(String langageFavori) {
        this.langageFavori = langageFavori;
    }

    public void coder() {
        System.out.println("Je m'appelle " + this.nom + " et je code en " + this.langageFavori);
    }

    public static void main(String[] args) {
        Developpeur dev1 = new Developpeur("Paul", "Java");
        dev1.setLangageFavori("java et spring boot");
        System.out.println("le developpeur s'appelle : " + dev1.getNom());

        dev1.coder();
    }


    }
