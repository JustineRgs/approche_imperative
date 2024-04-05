package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		int numberUser;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre :");
		numberUser = scanner.nextInt();
		System.out.print("Les 10 nombres suivants sont : ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(numberUser + i + " ");
		}
		scanner.close();
	}

}
