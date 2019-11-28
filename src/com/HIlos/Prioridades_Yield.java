package com.HIlos;

/*
*
El método yield() tiene la función de hacer que un hilo que se está ejecutando de regreso al estado en
* ejecución(runnable) para permitir que otros hilos de la misma prioridad puedan ejecutarse.
* Sin embargo, el funcionamiento de este método (al igual que de los hilos en general) no está garantizado,
*  puede que después de que se establezca un hilo por medio del método yield() a su estado en ejecución(runnable),
*  éste vuelva a ser elegido para ejecutarse. El método yield()
* nunca causará que un hilo pase a estado de espera/bloqueado/dormido, simplemente pasa de ejecutándose(running) a en ejecución(runnable).
* */
public class Prioridades_Yield extends Thread {
    public Prioridades_Yield(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
            yield();
        }
    }

    public static void main(String[] args) {
        new Prioridades_Yield("A").start();
        new Prioridades_Yield("B").start();
        new Prioridades_Yield("C").start();
        new Prioridades_Yield("D").start();
        System.out.println("Thread Main Terminó");
    }
}


