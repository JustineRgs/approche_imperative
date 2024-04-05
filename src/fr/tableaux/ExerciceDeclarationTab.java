package fr.tableaux;

public class ExerciceDeclarationTab {
	public static void main(String[] args) {
	      int[] array = {8, -7, 12, 1, -2, 14, 17, 9};

	        System.out.println("Index 0 : " + array[0]);

	        System.out.println("Longueur du tableau : " + array.length);

	        int dernierIndex = array.length - 1;
	        System.out.println("Dernière position : " + array[dernierIndex]);

	        int index = 10;
	        System.out.println("Index 10 : " + array[index]);
	        // Index est en dehors de la limite du tableau (8 index)
	}
}
