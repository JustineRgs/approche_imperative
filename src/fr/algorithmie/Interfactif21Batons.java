package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		int sticks = 21;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jeu des 21 batons !");
        System.out.println("Vous pouvez choisir 1 à 3 batons, l'ordinateur choisira ensuite à son tour! Celui qui prend le dernier à perdu!");
        System.out.println();
        
        while (sticks > 0) {
            System.out.print("Combien de baton(s) souhaitez-vous retirer ? ");
            
            int choiceUser = scanner.nextInt();
            if (choiceUser < 1 || choiceUser > 3 || choiceUser > sticks) {
                System.out.println("Choisissez entre 1 et 3 batons.");
                continue;
            }
            sticks -= choiceUser;
            if (sticks <= 0) {
                System.out.println("PERDU! Vous avez pris le dernier baton!");
                break;
            }
            System.out.println("Il reste " + sticks + " batons.");

            int choiceComputer = (int) (Math.random() * 3) + 1;
            choiceComputer = Math.min(choiceComputer, sticks);
            System.out.println("L'ordinateur retire " + choiceComputer + " baton(s).");
            sticks -= choiceComputer;
            if (sticks <= 0) {
                System.out.println("GAGNE! L'ordinateur a pris le dernier baton!");
                break;
            }
            System.out.println("Il reste " + sticks + " batons.");
        }
        scanner.close();
    }
}