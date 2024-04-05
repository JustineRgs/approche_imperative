package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int[array.length];
		
	    for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

	    System.out.println("Affichage des éléments du tableau array:");
	    for (int i = 0; i < array.length; i++) {
	    	System.out.print(array[i] + " ");
        }
		System.out.println();
	    
	    System.out.println("Affichage des éléments du tableau arrayCopy:");
	    for (int i = 0; i < arrayCopy.length; i++) {
	    	System.out.print(arrayCopy[i] + " ");
        }
		System.out.println();
	}

}
