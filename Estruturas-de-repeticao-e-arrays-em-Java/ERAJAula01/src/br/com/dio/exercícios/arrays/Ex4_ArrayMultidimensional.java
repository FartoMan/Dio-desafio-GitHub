package br.com.dio.exercícios.arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4]; // Matriz 4x4

        for(int i = 0; i < M.length; i++) { // Esse é para cada linha
            for(int j = 0; j < M[i].length; j++) { // Dentro de cada linha, o j vai percorrer as colunas
                M[i][j] = random.nextInt(10); //
            }
        }

        System.out.println("Matriz: ");
        for ( int[] linha : M ) { // Linha
            for( int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        // Questionário
        int num = 5, count = 1;

        while(count <= 3) {

            ++count; // 2, 3 e 4

            num += count; // 5, 7 e 10 (num = num + count)

        }

        System.out.println(num);



    }

}
