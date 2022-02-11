package one.dio.gftbootcamp;

import java.util.Scanner;

public class Ex1_Media {


    public static void main(String[] args) {

        // O que eu fiz

        Scanner sc = new Scanner(System.in);

        double A, B, media;
        double pesoA = 3.5d;
        double pesoB = 7.5d;

        System.out.println("Nota: use , para separar as decimais.");
        do {
            A = sc.nextDouble(); // Preenche a variável A
            if(A < 0 || A > 10) System.out.println("Valores de 0 a 10 apenas.");
        } while (A < 0 || A > 10);
        System.out.println("Nota com peso: " + (A*pesoA));

        do {
            B = sc.nextDouble(); // Preenche a variável B
            if(B < 0 || B > 10) System.out.println("Valores de 0 a 10 apenas.");
        } while (B < 0 || B > 10);
        System.out.println("Nota com peso: " + (B*pesoB));

        media = ((A*pesoA)+(B*pesoB))/(pesoA+pesoB);
        System.out.printf("MÉDIA = %.5f", media);
        // System.out.printf("\n%.5f", media);
        // System.out.printf("\nmedia%.5f", media);

    }


    // O que foi entregue

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();


        //TODO: Complete os espaços em branco com as respectivas variáveis para o cálculo da média.
        media = ((A * 3.5) + (B * 7.5)) / 11;

        //TODO: Complete com a variável que representa o resultado da média.
        System.out.printf("MÉDIA = %.5f", media);
        System.out.println();
    }*/

}
