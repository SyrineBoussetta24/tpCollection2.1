package ex2;

public class Test {

	public static void main(String[] args) {
		TacheElementaire TE1 = new TacheElementaire("Tache 1 :", 12);
        TacheElementaire TE2 = new TacheElementaire("Tache 2 :", 20);

        TacheComplexe TC = new TacheComplexe("Tc");
        TC.ajouter(TE1);
        TC.ajouter(TE2);

        System.out.println("Coût total de la tâche complexe: " + TC.getCout());
    }
}