package br.com.dio;

public class OperadorCaixa extends FuncionarioCLT{

    @Override
    public String toString() {
        return "OperadorCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
