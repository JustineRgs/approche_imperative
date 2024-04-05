package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		int numberUser;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Entrez un numéro entre 1 et 10 :");
			numberUser = scanner.nextInt();
		} while (numberUser < 1 || numberUser > 10);
		System.out.println("Votre numéro est : " + numberUser);
		scanner.close();
	}
}
