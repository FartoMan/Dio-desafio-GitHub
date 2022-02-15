package one.dio.gftbootcamp.Ex04;

import java.util.Scanner;

import static java.lang.System.*;

class Calculadora implements OperacoesMatematicas {

    Scanner sc = new Scanner(System.in);

    @Override
    public void soma(double operando1, double operando2) {
        out.println("Soma: " + operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        out.println("Subtração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        out.println("Multiplicação: " + operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {
        out.println("Divisão: " + operando1 / operando2);
    }
}
