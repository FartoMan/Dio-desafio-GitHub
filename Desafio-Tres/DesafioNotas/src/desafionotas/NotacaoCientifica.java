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
        
        Double X = leitor.nextDouble();
        System.out.printf("%+.4E", X);
        
    }

}
