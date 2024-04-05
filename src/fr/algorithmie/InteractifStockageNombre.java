package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[1];
		int elements = 0;
		int choice;

		do {
			System.out.println("MENU");
			System.out.println("********************");
			System.out.println("1 | Ajouter un nombre");
			System.out.println("2 | Afficher les nombres déjà ajoutés");
			System.out.println();
			System.out.println("Entrez le numéro correspondant à votre choix");
			choice = scanner.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				if (elements == array.length) {
					int newArray = array.length * 2;
					int[] arrayElements = new int[newArray];
					System.arraycopy(array, 0, arrayElements, 0, array.length);
					array = arrayElements;
				}
				System.out.print("Entrez un nombre à ajouter : ");
				int number = scanner.nextInt();
				System.out.println();

				array[elements] = number;
				elements++;

				System.out.println("Votre nombre à était rajouté au tableau.");
				System.out.println();
				break;
			case 2:
				if (elements == 0) {
					System.out.println("Vous n'avez pas encore de nombre dans votre tableau!");
					System.out.println();
				} else {
					System.out.println("Nombres existants :");
					for (int i = 0; i < elements; i++) {
						System.out.println(array[i]);
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Le numéro demandé n'existe pas !");
			}

		} while (choice != 0);
		scanner.close();
	}

}
