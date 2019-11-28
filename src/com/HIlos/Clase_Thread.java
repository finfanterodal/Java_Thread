package com.HIlos;

public class Clase_Thread extends Thread {
    @Override
    public void run() {
        System.out.printf("Hilo creado");
    }


    public static void main(String[] args) {
        Clase_Thread hilo = new Clase_Thread();
        hilo.start();
        System.out.println("Hilo principal");
        System.out.println("Proceso acabando");
    }

}
