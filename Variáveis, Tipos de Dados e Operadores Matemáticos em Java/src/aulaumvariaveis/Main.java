package aulaumvariaveis;

public class Main {

    public static void main(String[] args) { // Metodo Main

        int i; // Variável definida como inteira
        // int i; Duas variáveis iguais geram erro
        int I;
        // int 1a; Variáveis iniciada com número gera erro
        int _1a;
        int $1a;

        i = 5;
        I = 10;
        _1a = 20;
        $1a = 30;

        final int j = 10; // sempre terá o seu valor 10
        // j = 15; // Aqui gera um erro, pois "final" é constante, ou seja, não tem seu valor alterado
        int asrn24678md;
        // int asrn246 78md;
        int asrn246_78md;

        asrn24678md = 23;
        asrn246_78md = 24;

        int quantidadeProduto = 50;
        // int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        int QUANTIDADE_OPCOES = 25; // Não é um bom nome, pois é bom reservar a caixa alta para final(constantes)
        // int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($1a);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn246_78md);
        
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }

}
