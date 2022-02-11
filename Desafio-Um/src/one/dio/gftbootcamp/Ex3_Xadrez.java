package one.dio.gftbootcamp;

import java.util.Scanner;

public class Ex3_Xadrez {

    public static void main(String[] args) {

        // O que eu fiz

        Scanner sc = new Scanner(System.in);

        int parar = 1; // Para testar sem ter que reiniciar o programa
        do {

            int x1 = sc.nextInt(); // Lê a coordenada x1
            int y1 = sc.nextInt(); // Lê a coordenada x2
            int x2 = sc.nextInt(); // Lê a coordenada y1
            int y2 = sc.nextInt(); // Lê a coordenada y2
            // Para resumir a condicional da diagonal
            int xz1 = x1 - x2; // Movimento nas linhas x
            int xz2 = x2 - x1; // Faz o cálculo inverso para ver se dá dar positivo o valor
            int yz1 = y1 - y2; // Movimento nas colunas
            int yz2 = y2 - y1;
            // Analisando um cálculo de coordenadas utilizado para encontrar a diagonal
            System.out.println("Cálculo da diagonal: ");
            System.out.print((x2 - x1) + " ");
            System.out.print((y2 - y1) + " ");
            System.out.print(((x2 - x1) ^ 2) + " + ");
            System.out.print(((y2 - y1) ^ 2) + " = ");
            System.out.println(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2)); // Esse é o cálculo completo

            System.out.println("if da diagonal: ");
            System.out.println(xz1 + " " + yz1); // x1 - x2 e y1 - y2
            System.out.println(xz2 + " " + yz2); // x2 - x1 e y2 - y1
            System.out.println(xz1 + " " + yz2); // x1 - x2 e y2 - y1
            System.out.println(xz2 + " " + yz1); // x2 - x1 e y1 - y2

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) System.out.println("Não houve movimento");


            if ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2))
                System.out.println("Linha reta (x ou y), 1 movimento"); // Linha reta

            else if ((xz1 == yz1) || (xz2 == yz2) || (xz1 == yz2) || (xz2 == yz1)) // Diagonal
                System.out.println("Diagonal, 1 movimento");

            /*else if (x1 != x2 && y1 != y2)
                System.out.println("2 movimentos");*/

            else System.out.println("2"); // Das possibilidades anteriores, a que resta é x1!=x2 && y1!=y2

            System.out.println("Parar? 0 = SIM");
            parar = sc.nextInt();

        } while (parar != 0);

        // O que foi entregue

        /*
        Scanner sc = new Scanner(System.in);

		int x1,y1,x2,y2;
		//se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
		//se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
	    	if((x1 == x2 && y1 == y2))
	    		System.out.println("0");
	        else if((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2))
	        	System.out.println("1");
	    	else if(x1-x2 == y1-y2 || x1-x2 == y2-y1 || x2-x1 == y1-y2 || x2-x1 == y2-y1)
	    		System.out.println("1");
	        else
	        	System.out.println("2");
	    }
		sc.close();
         */


    }

}
