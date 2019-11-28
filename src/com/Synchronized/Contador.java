package com.Synchronized;

public class Contador {
    private int contador = 0;

    //Devuelve el valor actual del contador
    public int getContador() {
        return this.contador;
    }

    //Establece el valor actual del contador
    public void setContador(int val) {
        this.contador = val;
    }

    public synchronized int sumarContador(int val) {
        this.contador += val;
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.contador;
    }
}