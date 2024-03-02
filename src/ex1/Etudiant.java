package ex1;
import java.util.ArrayList;
import java.util.Collections;

public class Etudiant implements IStatisticable,Comparable<Etudiant>{
    private String matricule;
    private String nom;
    private ArrayList<Note> L ;
    public Etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        L = new ArrayList<>();
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public ArrayList<Note> getL() {
        return L;
    }
    public void setL(ArrayList<Note> l) {
        L = l;
    }
    @Override
    public String toString() {
        return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", L=" + L + "]";
    }
    public void addNote(Note n){
        this.L.add(n);
    }
    public float getValue(){
        float moy=0;
        for(int i=0;i<L.size();i++){
            moy+=moy+L.get(i).getNote();
        }
        return moy/L.size() ;
    }
    public double getMinNote(){
        double min=L.get(0).getNote();
        for(int i=0;i<L.size();i++){
            if (L.get(i).getNote() < min ){
                min=L.get(i).getNote();
            }
        }
        return min ;
    }
    public double getMaxNote(){
    	double max=L.get(0).getNote();
        for(int i=0;i<L.size();i++){
            if (L.get(i).getNote() > max ){
                max=L.get(i).getNote();
            }
        }
        return max ;
    }
    public int compareTo(Etudiant e) {
    	if (this.getValue()>e.getValue()) {
    		return 1;
    	}
    	if (this.getValue()<e.getValue()) {
    		return -1;
    	}
    	return 0;
    }
    
    
}
