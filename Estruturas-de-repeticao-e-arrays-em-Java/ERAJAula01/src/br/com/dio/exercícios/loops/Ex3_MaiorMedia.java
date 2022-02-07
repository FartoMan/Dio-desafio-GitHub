package br.com.dio.exercícios.loops;

/*Faça um programa que leia 5 números
informe o maior número e a média desses números.*/

import java.util.Scanner;

public class Ex3_MaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        double soma = 0d; // a partir da soma, tiramos a média (media = soma/5)
        int maior = 0;

        int cont = 1; // cont começa como 1 para fazer a exibição de "1º
        do{ // Aqui ele iniciará de qualquer forma e irá verificar somente no final se repete essas funções ou não
            System.out.println("Nº " + cont + ": ");
            numero = scan.nextInt();

            if (maior < numero) maior = numero; // Se (maior for menor que o último número informado), maior vira o número

            soma = soma + numero;

            cont = cont + 1; // cont finaliza como 6, então sai do laço DO-WHILE
        } while (cont <= 5); // enquanto a variável não fazer isso ser FALSE, repetirá o DO

        System.out.println("O maior número informado foi: " + maior);
        System.out.println("A média desses valores é: " + (soma/(cont-1))); // soma/(6-1)

    }

}
