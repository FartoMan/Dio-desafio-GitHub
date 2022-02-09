package br.com.dio.exercícios.arrays;

/*Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.*/

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; // Array com 6 posições
        int quantidadeConsoantes = 0;

        int cont = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next(); // scan.next() > Lê String

            if ( !(letra.equalsIgnoreCase("a") | // ! é a negação
                    letra.equalsIgnoreCase("e") | // equalsIgnoreCase é tanto faz se é "a" ou "A"
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[cont] = letra; // Aqui ele só está armazendo os caracteres diferentees das vogais
                quantidadeConsoantes++;
            }

            cont++;

        } while(cont < consoantes.length); // Repetir até o tamanho da Array

        // Método "for each", ou seja, para cada. (
        for ( String consoante : consoantes ) { // "consoante" criado para navegar dentro da array "conosoantes"
            if (consoante != null) { // null é o valor 0 de uma String, ou vazio, já que não foi preenchido
                System.out.print(consoante + " "); // A string "consoante" é um navegador dentro da Array
            }
            System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
            System.out.println(consoantes.length);
        }


        /*String[] c = new String[6]; // {'a', 'b', 'c', 'd', 'e', 'f'};
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

        System.out.println("\nForam lidas " + quantCons + " consoantes.");*/

        /*==========================================================*/

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
