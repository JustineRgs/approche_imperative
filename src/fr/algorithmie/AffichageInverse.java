package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		System.out.println("Affichage des éléments du tableau :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("Affichage inversés des éléments du tableau :");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int[] arrayCopy = new int[array.length];
		System.arraycopy(array, 0, arrayCopy, 0, array.length);

		System.out.println("Affichage des éléments du tableau arrayCopy :");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + " ");
		}
	}

}
