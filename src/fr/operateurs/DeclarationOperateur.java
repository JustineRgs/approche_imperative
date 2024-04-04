package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean testEt = a>0 && b<10;
		System.out.println("testEt : " + testEt);
		
		boolean testOu = a>0 || b<10;
		System.out.println("testOu : " + testOu);
		
		a=a+1;
		a++;
		a+=1;
		System.out.println("a : " + a);
		
		String c = a > 0 ? "a est plus grand que 0" : "a est inférieur à 0";
		System.out.println("c : " + c);
	}

}
