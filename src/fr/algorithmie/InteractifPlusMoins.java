package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;
		int userProposition;
		int tryNumber = 0;

		System.out.println("J'ai choisis un nombre entre 1 et 100, essayez de deviner!");

		do {
			System.out.println("Entrez une proposition");
			userProposition = scanner.nextInt();
			tryNumber++;

			if (userProposition < randomNumber) {
				System.out.println("Ce nombre est plus petit que le mien!");
			} else if (userProposition > randomNumber) {
				System.out.println("Ce nombre est plus grand que le mien!");
			};
		} while (userProposition != randomNumber);

		System.out.println("Bravo vous avez trouvé en " + tryNumber + " propositions!");
		scanner.close();

	}

}
