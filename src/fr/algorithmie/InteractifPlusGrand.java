package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int numberUser;
		int bigNumber = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez 10 nombres :");
		for (int i = 0; i < 10; i++) {
			System.out.print("Nombre " + (i + 1) + " : ");
			numberUser = scanner.nextInt();

			if (numberUser > bigNumber) {
				bigNumber = numberUser;
			}
		}

		System.out.println("Le plus grand nombre est : " + bigNumber);
		scanner.close();
	}

}
