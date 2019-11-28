package com.HIlos;
/*
* El método sleep() es un método estático de la clase Thread. Generalmente lo usamos
* en el código para pausar un poco la ejecución de un proceso en particular forzándolo
* a dormir durante un tiempo determinado. Para forzar un hilo a dormir podemos usar un código parecido a lo siguiente:
* SIEMPRE AFECTA AL HILO EN EJECUCIÓN*
* */
public class Estados_Sleep extends Thread {
    public Estados_Sleep(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName());
        }

    }

    public static void main(String[] args) {
        new Estados_Sleep("Hilo Dutmiente").start();
        System.out.println("Thread Main Terminó");
    }
}
