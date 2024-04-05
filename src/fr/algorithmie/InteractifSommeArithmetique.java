package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		int numberUser;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre :");
		numberUser = scanner.nextInt();
		
		for (int i = 1; i <= numberUser; i++) {
			sum += i;
		}
		System.out.print("La somme de tout les entiers de 1 à " + numberUser + " est " + sum);
	}
}
