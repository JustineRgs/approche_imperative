package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte b = 10;
        short s = 24;
        int i = 12;
        long l = 80L;
        float f = 10.1f;
        double d = 10.2;
        char c = 'J';
        boolean bool = false;
        String string = "Pouet";
        
        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("char : " + c);
        System.out.println("double : " + d);
        System.out.println("bool : " + bool);
        System.out.println("string : " + string);

        String randomString = "Voici le résultat d’un calcul :\n1+5=6";
        System.out.println(randomString);
    }
}
