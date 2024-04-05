package fr.algorithmie;

public class AffichageSuite {
	
	public static void main(String[] args) {
		System.out.println("Nombres de 1 à 10 inclus :");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		System.out.println();
		
		System.out.println("Nombres pairs de 0 à 10 inclus :");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
                System.out.print(i + " ");
            }
		}
		System.out.println();
		
		System.out.println("Nombres impairs de 0 à 9 inclus :");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
                System.out.print(i + " ");
            }
		}
		System.out.println();
		
		System.out.println("Nombres de 1 à 10 inclus avec un while :");
		int i = 1; 
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
        
    	
		System.out.println("Nombres pairs de 0 à 10 inclus avec un while :");
		int a = 0; 
        while (a <= 10) {
        	if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
        System.out.println();
        
		System.out.println("Nombres impairs de 0 à 9 inclus avec un while :");
		int b = 0; 
        while (b <= 9) {
        	if (b % 2 != 0) {
                System.out.print(b + " ");
            }
            b++;
        }
	}
	
}
