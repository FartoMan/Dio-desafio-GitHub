package one.dio.gftbootcamp;

import java.io.IOException;
import java.util.Scanner;

public class Ex2_NumerosPares {

    public static void main(String[] args) throws IOException {

        // O que eu fiz
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = sc.nextInt();

        for(int i = 1;i <= numero; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }

        // O que foi entregue
        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) if(i%2==0) System.out.println(i);
        */
    }

}
