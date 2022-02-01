package one.dio.gftbootcamp;

public class Main {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; // Ultrapassou o tamanho máximo que uma short suporta

        // int i1 = -10000000000; // Muito abaixo do valor negativo que uma int suporta
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        // float f1 = 4.5; // Sem indicar com o f, o java lê double
        float f2 = 10.68f; // Usualmente, F maiúsculo

        double d1 = 85.69; // float e double são variaveis reais, fracionadas
        double d2 = 99.04d;

        char c1 = 'W'; // char é somente um caracter
        // char c2 = 'Tw'; // aqui dá erro, pois há dois caracteres
        char c3 = '\u0057'; // w

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se    se et t KJALSKJDF 235¨%$";

        String dt1 = "16/12/1993";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(s1);

        System.out.println(i2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c3);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println(dt1);

        System.out.println(bo1);
        System.out.println(bo2);

    }

}
