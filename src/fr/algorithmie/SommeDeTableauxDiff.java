package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] firstArray = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] secondArray = { -1, 12, 17, 14, 5, -9, 0, 18 };

		int maxLength = Math.max(firstArray.length, secondArray.length);
		int[] sum = new int[maxLength];

		for (int i = 0; i < maxLength; i++) {
			int firstValue = i < firstArray.length ? firstArray[i] : 0;
			int secondValue = i < secondArray.length ? secondArray[i] : 0;
			sum[i] = firstValue + secondValue;
		}

		System.out.println(Arrays.toString(sum));
	}

}
