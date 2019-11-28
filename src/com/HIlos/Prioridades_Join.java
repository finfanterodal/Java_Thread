package com.HIlos;
/*
* El método no estático join() permite al hilo "formarse en la cola de espera" de otro hilo.
* Si tienes un hilo B que no puede comenzar a ejecutarse hasta que se complete el proceso del hilo A,
* entonces querrás que B se forme en la cola de espera de A.
* Esto significa que B nunca podrá ejecutarse si A no completa su proceso. En código se utiliza así:
* */
public class Prioridades_Join extends Thread {

    public Prioridades_Join(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Prioridades_Join h1=new  Prioridades_Join("A");
        Prioridades_Join h2=new Prioridades_Join("B");
        Prioridades_Join h3=new  Prioridades_Join("C");
        Prioridades_Join h4=new Prioridades_Join("D");
        h1.start();
        h1.join();
        h2.start();
        h2.join();
        h3.start();
        h4.start();

        System.out.println("Thread Main Terminó");
    }
}

