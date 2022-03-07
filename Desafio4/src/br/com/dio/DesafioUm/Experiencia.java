package br.com.dio.DesafioUm;

import java.util.Scanner;
public class Experiencia {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        char c;
        double[] cob = {0.0,0.0,0.0};
        char[] spc = {'C','R','S'};
        String[] txt = {"coelhos","ratos","sapos"};
        double smt = 0.0, input;

        for(int i = 0, lmt = read.nextInt(); i < lmt ; i++){
            input = read.nextInt();
            c = read.next().charAt(0);
            for (int j = 0; j < spc.length; j++) { if (c == spc[j]) { cob[j] += input; } }
            smt += input;
        }
        System.out.printf("Total: %.0f cobaias\n", smt);
        for (int i = 0; i < cob.length; i++) { System.out.printf("Total de %s: %.0f\n", txt[i], cob[i]); }
        for (int i = 0; i < cob.length; i++) { System.out.printf("Percentual de %s: %.2f %%\n", txt[i], (cob[i] / smt) *100 ); }
    }
}
