package br.com.dio.exercícios.arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] v = {-3, 2, 33, -12, 15, 42};

        System.out.println("Vetor usando while: ");

        int cont = v.length-1;
        while(cont >= 0){
            System.out.print(v[cont] + " ");
            cont--;
        }

        System.out.println("\nVetor usando for: ");

        for(int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }

    }

}
