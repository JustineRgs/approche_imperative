package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = { 2, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 4 };
		boolean bool = false;

		bool = (array.length >= 1 && (array[0] == array[array.length - 1]));

		System.out.println("Le tableau est de longueur supérieure ou égale à 1 et le premier et le dernier élément du tableau ont la même valeur : " + bool);
	}

}
