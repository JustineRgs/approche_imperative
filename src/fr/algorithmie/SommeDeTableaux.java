package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int[] firstArray = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] secondArray = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };

		int[] sum = new int[firstArray.length];

		for (int i = 0; i < firstArray.length; i++) {
			sum[i] = firstArray[i] + secondArray[i];
		}
		System.out.println(Arrays.toString(sum));
	}

}
