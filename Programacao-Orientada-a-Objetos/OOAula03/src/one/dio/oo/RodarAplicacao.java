package one.dio.oo;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro(); // Construtor default

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.74));

        Carro carro2 = new Carro("Azul", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.74));

        Carro carro3 = new Carro("Verde", "Fiat Doblò Adventure", 60);
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getCor());
        System.out.println(carro3.getCapacidadeTanque());
        System.out.println(carro3.totalValorTanque(6.74));

    }

}
