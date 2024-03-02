package ex1;

public class Note{
    private String NomCours;
    private double note;
    public Note(String nomCours, double note) {
        NomCours = nomCours;
        this.note = note;
    }
    public String getNomCours() {
        return NomCours;
    }
    public void setNomCours(String nomCours) {
        NomCours = nomCours;
    }
    public double getNote() {
        return note;
    }
    public void setNote(double note) {
        this.note = note;
    }
}