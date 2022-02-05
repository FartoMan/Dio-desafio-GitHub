package one.dio.gftbootcamp;

public class Main {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.5d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 3997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("Inteiros");
        System.out.println("i1 == i2 " + (i1 == i2)); // i1 é igual a i2?
        System.out.println("i1 != i2 " + (i1 != i2)); // i1 é diferente de i2?
        System.out.println("i1 > i2 " + (i1 > i2)); // i1 é maior que i2?
        System.out.println("i1 <= i2 " + (i1 <= i2)); // i1 é menor OU igual a i2?
        System.out.println("Float"); // Operações devem estar dentro de ()
        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 < f2 " + (f1 < f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("Char");
        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));
        System.out.println("String");
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));
//        System.out.println("s1 > s2 " + (s1 > s2)); // Os operadores de grande não se aplicam a Strings
//        System.out.println("s1 <= s2 " + (s1 <= s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s2 != s3 " + (s2 != s3));
        System.out.println();
        System.out.println("b1 == b2 " + (b1 == b2));
//        System.out.println("b1 < b2 " + (b1 < b2)); // Operadores de grandeza não são aplicados a boolean
        System.out.println("");
        System.out.println("l1 == l2 " + (l1 == l2)); // Como são entre tipos numéricos, não há erro
        System.out.println("l1 != y1 " + (l1 != y1));
        System.out.println("h1 >= y1 " + (h1 >= y1));


    }

}
