package br.com.dio.calculadora;

import java.util.Scanner; // Pacote scanner

public class Calculadora {

	// Aqui no método main, vamos pedir os números e retornar a resposta
	public static void main(String[] args) { // Método main
		Scanner scan = new Scanner(System.in); // Fluxo de entrada de dados através do teclado
				
		int a, b; // Variáveis ('a' e 'b' do tipo inteiro a serem preenchidas pelo usuário
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt(); // Recebe o valor de a
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt(); // Recebe o valor de b
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b); // Nota da variável, ao invés de int, usei double para corrigir o problema do valor decimal
		
		System.out.println("soma " + soma);		
		System.out.println("sub " + subtracao);		
		System.out.println("divisao " + divisao);		
		System.out.println("mult " + multiplicacao);		
		
	}

	// Logo abaixo, são outros Métodos (public: cria metodos)

	public static int soma(int a, int b) { 
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) { // Aqui também teve de ser alterado para o tipo double, porém eu não resolver ainda
		return a / b;
	}

	
	

}
