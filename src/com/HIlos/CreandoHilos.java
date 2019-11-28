package com.HIlos;

public class CreandoHilos extends Thread {
    int iteraciones;
    public CreandoHilos(String nombre, int num){
        super(nombre);
        iteraciones=num;
    }

    public void run() {
        for (int i = 0; i < iteraciones; i++) {
            System.out.println(i+getName());
            System.out.println(getName()+"Terminado");
        }
    }

    public static void main(String[] args) {
        new CreandoHilos("A",10).start();
        new CreandoHilos("B",10).start();
        System.out.println("Thread main terminó");
    }
}
