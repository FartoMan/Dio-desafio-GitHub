/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafionotas;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Charley
 */
public class NotacaoCientifica {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Formatter formatter = new Formatter();
        formatter.format("%E", 134.004);
        System.out.println(formatter);

        int cont = 0;
        do {
            Double X = leitor.nextDouble();
            System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
            if (X <= 0) {
                System.out.printf("%6.4E", X);
            } else {
                System.out.printf("+%6.4E", X);
            }
            cont++;
        } while (cont < 6);
    }

}
