package ex2;

public class TacheElementaire implements Tache {
    private String nom;
    private int cout;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public TacheElementaire(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getCout() {
        return cout;
    }
}