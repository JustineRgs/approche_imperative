package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = { 2, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6 };
		boolean bool = false;

		bool = (array.length >= 1 && array[0] == 6) || array[array.length - 1] == 6;

		System.out.println("Le tableau contient au moins un élement et commence ou fini par 6 : " + bool);
	}

}
