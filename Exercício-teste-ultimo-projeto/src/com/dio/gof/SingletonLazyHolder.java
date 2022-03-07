package com.dio.gof;

/**
 * singleton lazyholder
 *
 * @author Charley
 */
public class SingletonLazyHolder {

    private static class InstanceHolder { // apenas encapsula
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
