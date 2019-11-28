package com.Ejerciocios_PSP;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PSP_Ejercicio3 extends Thread {
    public PSP_Ejercicio3(String str) {
        super(str);
    }
    static int contador = 2;

    public void run() {
        String nombre = "HIILO" + contador;
        PSP_Ejercicio3 linea2 = new PSP_Ejercicio3(nombre);
        if (contador <= 5) {
            linea2.start();
            contador++;
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i +" " + getName());
        }
        try {
            linea2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(PSP_Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
        int tiempo = (int) (Math.random() * 600 + 100);
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(PSP_Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("TERMINATED " + getName());
    }

    public static void main(String[] args) throws InterruptedException {
        PSP_Ejercicio3 linea1 = new PSP_Ejercicio3("HILO1");
        linea1.start();
        linea1.join();
        System.out.println("TERMINATED main");

    }
}
