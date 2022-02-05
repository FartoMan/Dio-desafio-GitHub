package one.dio.gftbootcamp;

public class Main {

    public static void main(String[] args) {
    /*Neste método main, é feita a execução de outros metodos declarados a seguir.
    * A execução sempre segue a ordem de fluxo, ou seja, vai descendo, de forma crescente, linha por linha.
    * Assim é feita a leitura de todo código.*/
        // METODOS
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlecha() {

        int mes = 7;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Que mês é esse?"); // Direto no seu coração!!
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private static void ifSemFlecha() {

        int mes = 3;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        }
        /*else {
            System.out.println("Dezembro");
        }*/
        else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }

    }

    private static void ifFerias() {

        String mes = "junho";
        if (mes == "junho" || mes == "agosto" || mes == "março") {
            System.out.println("FÉRIAS, meu filho! FÉRIAS!");
        }

    }

    private static void ifMenor() { // Um 'diminuidor' de variáveis, criando variáveis intermediárias

        double salarioMensal = 11358.97d;
        double mediaSalarial = 10000d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Este funcionário atende ao requisitos do auxílio.");
        }
        // resumindo um pouco a condicional anterior
        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("O salário é baixo e tem muitos dependentes. Tem direito ao auxílo.");
        }

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        if (recebeAuxilio) {
            System.out.println("Tem direito ao auxílio.");
        } else {
            System.out.println("Não tem direito ao auxílio.");
        }
        // Todas as variáveis foram necessárias para se chegar ao resumo do que foi solicitado
    }

    private static void switchSemana() { // Obejtivo: entregar o número do dia da semana

        String dia = "Domingo";
        switch (dia) { // switch usa { }
            case "Segunda": // Se o conteúdo da variável 'dia' for 'Segunda'
                System.out.println("2");
                break; // O 'break' interrompe a execução ao executar esse caso, ou seja, ele para de procurar, finaliza o switch
            case "Terça":
                System.out.println("3");
                break;
            case "Quarta":// Se o conteúdo da variável 'dia' for 'Quarta'
                System.out.println("4");
                break;
            case "Quinta":
                System.out.println("5");
                break;
            case "Sexte":
                System.out.println("6");
                break;
            case "Sábado":// Se o conteúdo da variável 'dia' for 'Sábado'
                System.out.println("7"); // O switch me entregará o número 7
                break; // e irá interromper a execução do switch
            case "Domingo":
                System.out.println("1");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 1;

        switch (numero) { // Se eu pedir o 3, ele vai direto no 3, não me mostra o que tem antes
            case 1: // Aqui não tem break, veja o que tem aqui e no 2 também
                System.out.println("É nóis! Primeirão! Vê o 2 e o 3 também");
            case 2: // Opa! Aqui também não tem break, sigamos...
                System.out.println("Cé viu o que tinha no 1?");
            case 3:
                System.out.println("Não sou o 1 nem o 2, sou apenas o 3"); // Se pediu 1, 2 ou 3, vou te entregar o que há aqui também
                break; // Achei o break! Parei.
            case 4: // Case 4 não se mistura
                System.out.println("Sou 4. Não me misturo com aquela gentalha");
                break;
            case 5:
                System.out.println("Só te mostro o que tem no 5.");
                break;
            default:
                System.out.println("Nada a ver!");
                break;
        }

    }

    private static void switchFerias() {

        String mes = "Julho";

        switch (mes) {
            case "Junho":
            case "julho":
            case "Dezembro":
                System.out.println("Estamos de férias, pois estamos em " + mes + "!");
                break;
            default:
                System.out.println("Pô... tenho que acordar cedo amanhã e pá...");
        }

    }

}
