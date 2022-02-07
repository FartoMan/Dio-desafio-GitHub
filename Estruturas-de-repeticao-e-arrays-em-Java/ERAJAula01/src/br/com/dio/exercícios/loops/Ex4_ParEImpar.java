package br.com.dio.exercícios.loops;

/*Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares
e a quantidade de números impares.*/


import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        int numero;
        int ni = 0; // Quantidade números ímpares
        int np = 0; // Quantidade números pares

        System.out.println("Quantos números quer informar?");
        n = scan.nextInt();

        int cont = 1;
        do{
            System.out.println("Nº " + cont + ": ");
            numero = scan.nextInt();

            if (numero % 2 == 0) np++;
            else ni++;

            cont++;
        }while (cont <= n);

        System.out.println("Quantidade impares: " + ni);
        System.out.println("Quantidade pares: " + np);
    }

}
