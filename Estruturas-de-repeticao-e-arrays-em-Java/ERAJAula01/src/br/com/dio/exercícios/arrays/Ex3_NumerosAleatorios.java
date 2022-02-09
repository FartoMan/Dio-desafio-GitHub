package br.com.dio.exercícios.arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20]; // Variável de inteiros[deArrays] - nomeVariável

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); // Variável "número" recebe um valor random de 0 a 100
            numerosAleatorios[i] = numero; // Array na possição i (de 0 a 20) é registrada com a variável "numero"
        }

        System.out.print("Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) { // "numero" é o navegador da Array
            System.out.print(numero + " ");

        }

        System.out.print("\nAntecessores Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores Números Aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero+1) + " ");
        }


    }

}
