package one.dio.gftbootcamp.Ex02;

public class ExecutarPrograma {

    public static void main(String[] args) {

        // Vetor com o nome 'funcionarios' da classe mãe e tem quatro objetos, as Classes filhas e a própria Classe Mãe
        Funcionario[] funcionarios = new Funcionario[] {new Gerente(), new Faxineiro(), new Vendedor(), new Funcionario()};

        for(Funcionario funcionario: funcionarios) {
            funcionario.metodo1();
            funcionario.metodo2();
            System.out.println("");
        }

    }


}
