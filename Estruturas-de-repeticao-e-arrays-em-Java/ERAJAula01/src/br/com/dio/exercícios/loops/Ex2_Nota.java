package br.com.dio.exercícios.loops;

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.*/

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota; // Variável "nota"

        System.out.println("Nota: ");
        nota = scan.nextInt(); // solicita que digite, o valor digitado preencherá a variável "nota"

        while(nota < 0 | nota > 10) { // Enquanto "nota" for maior que 10 ou menor que 0, será TRUE
            System.out.println("Valores aceitos somentre de 0 a 10. Digite novamente.\nNota: ");
            nota = scan.nextInt(); // Quando a variável assumir um valor entre 0 e 10, while será FALSE e não repetirá
        }

        /*while((nota < 0) || (nota > 10)) { // Contagem
            if(nota > 10) nota--;
            if(nota < 0) nota++;
            System.out.println(nota);
        }*/

        System.out.println("Anotado. Nota " + nota + ".");
    }

}
