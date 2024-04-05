package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] villes = {"Montpellier", "Paris", "Marseille", "Toulouse", "Béziers"};

        System.out.println("Les 5 éléments du tableau :");
        for (String ville : villes) {
            System.out.println(ville);
        }
        System.out.println();
        
        System.out.println("La longueur du tableau : " + villes.length);
        System.out.println();
        
        villes[3] = "Reims";
        System.out.println("Les 5 éléments du tableau après modification de l'index 3 :");
        for (String ville : villes) {
            System.out.println(ville);
        }
       
	}
	
}
