package one.dio.gtfbootcamp;

public class Main {

    public static void main(String[] args) {

        // Calculador
        System.out.println("Exercício calculador");
        Calculadora.soma(3, 6); // Classe.método(parâmetros)
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(3000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(500,5);

    }

}
