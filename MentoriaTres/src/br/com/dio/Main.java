package br.com.dio;

public class Main {

    public static void main(String[] args) {

        Endereco enderecoVendedor = new Endereco();
        enderecoVendedor.setRua("Aquela Rua");
        System.out.println(enderecoVendedor.getRua());

        Endereco enderecoCaixa = new Endereco();
        enderecoCaixa.setRua("Outra rua");
        System.out.println(enderecoCaixa.getRua());

    }
}
