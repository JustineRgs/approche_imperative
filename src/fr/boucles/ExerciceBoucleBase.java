package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
	   System.out.println("Nombres de 1 à 10 :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Nom et prénom 20 fois :");
        String lastname = "RAGUES";
        String firstname = "Justine";
        for (int i = 0; i < 20; i++) {
            System.out.println(lastname + " " + firstname);
        }
        System.out.println();
        
        System.out.println("Nombres pairs de 2 à 100 :");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Nombres impairs de 1 à 99 :");
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
	        
	}

}
