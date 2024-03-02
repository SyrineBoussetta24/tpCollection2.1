package ex1;

import java.util.ArrayList;

public class Stats {
	public void  afficherStatsEtudiants (ArrayList <Etudiant> L) {
		for (Etudiant e:L) {
			System.out.println(e.getNom());
			System.out.println(e.getValue());
			System.out.println(e.getMinNote());
			System.out.println(e.getMaxNote());
		}
	}
	public float  getMoyenneGroupe(ArrayList <Etudiant> L) {
		float moy=0;
		for(Etudiant e:L) {
			moy+=e.getValue();
		}
		return moy/L.size();
	}
	public float  getMaximumGroupe(ArrayList <Etudiant> L) {
		float max=L.get(0).getValue();
		for(Etudiant e:L) {
			if (e.getValue() > max ){
                max=e.getValue();
            }
		}
		return max;
	}
	public float  getMinimumGroupe(ArrayList <Etudiant> L) {
		float min=L.get(0).getValue();
		for(Etudiant e:L) {
			if (e.getValue() < min ){
                min=e.getValue();
            }
		}
		return min;
	}
}
