package ex2;

import java.util.ArrayList;
import java.util.Collection;

public class TacheComplexe implements Tache {
    private String nom;
    private Collection<Tache> sous_tâche;

    public TacheComplexe(String nom) {
        this.nom = nom;
        this.sous_tâche = new ArrayList<>();
    }

    public void ajouter(Tache tache) {
    	sous_tâche.add(tache);
    }

    public void supprimer(Tache tache) {
    	sous_tâche.remove(tache);
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getCout() {
        int cTot = 0;
        for (Tache tache : sous_tâche) {
        	cTot += tache.getCout();
        }
        return cTot;
    }
}