package com.dio;


import com.dio.facede.Facade;
import com.dio.gof.SingletonEager;
import com.dio.gof.SingletonLazy;
import com.dio.gof.SingletonLazyHolder;
import com.dio.strategy.ComportamentoAgressivo;
import com.dio.strategy.ComportamentoDefensivo;
import com.dio.strategy.ComportamentoNormal;
import com.dio.strategy.Robo;

public class test {

    public static void main(String[] args) {
        // Testes de design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Charley", "32210000");

    }

}
