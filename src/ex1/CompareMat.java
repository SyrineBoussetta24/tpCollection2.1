package ex1;

import java.util.Comparator;

public class CompareMat implements Comparator<Etudiant>{
	public int compare(Etudiant e1 ,Etudiant e2) {
		return e1.getMatricule().compareTo(e2.getMatricule());
	}
}
