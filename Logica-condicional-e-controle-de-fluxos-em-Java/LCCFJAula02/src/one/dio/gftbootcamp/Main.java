package one.dio.gftbootcamp;

public class Main {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // && Só é TRUE quando ambos são TRUE
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println("b2 && b4 " + (b2 && b4));
        // || Se um for verdadeiro, será TRUE
        System.out.println("b1 || b2 " + (b1 || b2));
        System.out.println("b1 || b3 " + (b1 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));
        // ^ Só é verdadeiro quando são diferentes
        System.out.println("b1 ^ b2 " + (b1 ^ b2));
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b2 ^ b4 " + (b2 ^ b4));
        // ! Inverte o valor
        System.out.println("!b1 " + !b1);
        System.out.println("!b2 " + !b2);
        System.out.println("!b3 " + !b3);
        System.out.println("!b4 " + !b4);


        System.out.println();

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2 ) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        // Exemplo de boa prática
        double salarioMensal = 11893.58d;
        double mediaSalarial = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
        // Aqui, para saber se tem direito ao auxílio, teria de usar toda essa expressão
        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        // Aqui, já é uma redução considerável se tem direito ao auxílio ou não
        System.out.println((salarioBaixo) && (muitosDependentes));
        // Apartir daqui, foi feita a variável recebeAuxilio(V/F), que assume todas as expressões anteriores
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

    }

}
