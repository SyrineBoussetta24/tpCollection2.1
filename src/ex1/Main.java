package ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList <Etudiant> ve = new ArrayList <>();
		Stats s = new Stats();
		
        ve.add(new Etudiant("123","syrine"));
        ve.get(0).addNote(new Note("math",12));
        ve.get(0).addNote(new Note("geo",14));
        ve.add(new Etudiant("123","amal"));
        ve.get(1).addNote(new Note("math",16));
        ve.get(1).addNote(new Note("geo",13));

        ve.add(new Etudiant("123","salim"));
        ve.get(2).addNote(new Note("histoire",11));
        ve.get(2).addNote(new Note("geo",7));

        s.afficherStatsEtudiants(ve);
        System.out.println("max classe"+ s.getMaximumGroupe(ve));
        System.out.println("min classe"+ s.getMinimumGroupe(ve));
        Collections.sort(ve);
        s.afficherStatsEtudiants(ve);
        CompareMat cm = new CompareMat ();
        Collections.sort(ve, cm);
        s.afficherStatsEtudiants(ve);
        CompareNom cN = new CompareNom();
        Collections.sort(ve, cN);
        s.afficherStatsEtudiants(ve);
    }
}
