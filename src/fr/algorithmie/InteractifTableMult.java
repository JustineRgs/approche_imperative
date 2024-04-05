package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		int numberUser;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Entrez un numéro entre 1 et 10 :");
			numberUser = scanner.nextInt();
		} while (numberUser < 1 || numberUser > 10);

		for (int i = 0; i <= 10; i++) {
			System.out.println(numberUser + "x" + i + "=" + numberUser * i);
		}
		scanner.close();
	}

}
