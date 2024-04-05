package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		int[] firstArray = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] secondArray = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		int commonElement = 0;

		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					commonElement += 1;
				}
			}
		}
		System.out.println("Nombre de valeurs communes : " + commonElement);
	}

}
