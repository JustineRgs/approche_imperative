package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		 System.out.println("Premier élément du tableau : " + array[0]);
		 System.out.println();
		 
		 System.out.println("La longueur du tableau : " + array.length);
		 System.out.println();
		 
		 System.out.println("Dernier élément du tableau : " + array[array.length - 1]);
		 System.out.println();
		 
		 array[4] = 6;
	     System.out.println("Nouvelle valeur de l'élément d'index 4 : " + array[4]);
	}

}
