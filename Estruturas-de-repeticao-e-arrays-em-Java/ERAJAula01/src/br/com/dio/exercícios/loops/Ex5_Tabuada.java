package br.com.dio.exercícios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tab;

        System.out.println("A tabuada de qual número?");
        tab = scan.nextInt();

        for(int i = 1; i <= 10; i++) { // i = 1, enquanto i ser menor/igual 10, i + 1, executará até que
            System.out.println(tab + " X " + i + " = " + (tab*i));
        }

    }

}
