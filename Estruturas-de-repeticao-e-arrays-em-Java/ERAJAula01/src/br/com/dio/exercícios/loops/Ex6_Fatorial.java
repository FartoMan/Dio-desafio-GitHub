package br.com.dio.exercícios.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int fatorial; // valor a ser solicitado

        System.out.println("Fatorial de: ");
        fatorial = scan.nextInt(); // valor atribuídoi a variável "fatorial"

        int mult = 1;

        System.out.println(fatorial + "! = ");

        for(int i = fatorial; i >= 1; i--) { // O 'i' recebe o valor da variável fatorial e diminuírá até ser igual a 1
            mult = mult * i; // 1 x 7 = 7 x 6 = 36 x 5 =
        }

        System.out.println(mult);

    }
}
