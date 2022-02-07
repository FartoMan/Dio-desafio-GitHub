package br.com.dio.exercícios.arrays;

/*Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.*/

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] c = new String[6]; // {'a', 'b', 'c', 'd', 'e', 'f'};
        int quantCons = 0;

        int cont = 0;
        do{
            System.out.println("Letra: ");
            c[cont] = scan.next();
            cont++;
            if( !(c[cont] == "a" | c[cont] == "e" | c[cont] == "i" | c[cont] == "o" | c[cont] == "u")) {
                quantCons++;
            }
        } while (cont<c.length);

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        System.out.println("\nForam lidas " + quantCons + " consoantes.");

        /*String[] caracteres = String[6];
        int quantidadeConsoantes = 0;

        int cont = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))) {
                caracteres[cont] = letra;
                quantidadeConsoantes++;
            }
            cont++;
        } while(cont < caracteres.length);

        for(int i = 0; i<=caracteres.length; i++) {
            System.out.println(caracteres[i] + " ");
        }*/

    }

}
