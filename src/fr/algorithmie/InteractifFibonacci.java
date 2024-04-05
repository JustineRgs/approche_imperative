package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Saisissez un nombre pour le rang N : ");

		int n1 = 0;
		int n2 = 1;
		int n = scanner.nextInt();
		int fibonacci = 0;

		if (n == 0) {
			fibonacci = 0;
		} else if (n == 1) {
			fibonacci = 1;
		} else {
			n1 = 0;
			n2 = 1;
			for (int i = 2; i <= n; i++) {
				fibonacci = n1 + n2;
				n1 = n2;
				n2 = fibonacci;
			}
		}

		System.out.print("Le nombre de fibonacci pour N est : " + fibonacci);
		scanner.close();
	}
}
