package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };

		System.out.print("Tableau de départ : ");
		printArray(array);

		System.out.println();

		reverseArray(array);

		System.out.print("Tableau après rotation : ");
		printArray(array);
	}

	public static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			int index = array[start];
			array[start] = array[end];
			array[end] = index;
			start++;
			end--;
		}
	}

	public static void printArray(int[] array) {
		for (int index : array) {
			System.out.print(index + " ");
		}
		System.out.println();
	}
}
