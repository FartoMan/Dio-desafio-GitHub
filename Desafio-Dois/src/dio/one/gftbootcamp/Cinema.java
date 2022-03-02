package dio.one.gftbootcamp;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica
        double P = (double) ((B-A)/A) * 100;
        System.out.printf("%.2f", (((B-A)/A) * 100));
        System.out.println("%");
    }

}
