package com.Examen;

import com.Synchronized.Contador;

public class RepasoExamen3 extends Thread {
    static int conMayus = 0;
    static int conMinus = 0;
    static int num = 0;
    static Integer total = 0;
    final static String cadena = "eESFA es u32n exa4324FAF2men de pspAF 23";
    Contador cont;

    public RepasoExamen3(String nombre, Contador p_cont) {
        super(nombre);
        this.cont = p_cont;
    }


    @Override
    public void run() {
        System.out.println(getName());
        String[] cadena2 = cadena.split("");
        for (int i = 0; i < cadena2.length; i++) {
            char valChar = cadena2[i].charAt(0);
            int asciiValue = valChar;

            if ("HiloMayus".equals(getName()) && (asciiValue >= 65 && asciiValue <= 90)) {
                System.out.println(getName() + " " + cadena2[i]);
                conMayus++;
                total++;
                cont.sumarContador(1);
            }
            if ("HiloMinus".equals(getName()) && (asciiValue >= 97 && asciiValue <= 122)) {
                System.out.println(getName() + " " + cadena2[i]);
                total++;
                cont.sumarContador(1);
            }
            if ("HiloNumeros".equals(getName()) && (asciiValue >= 48 && asciiValue <= 57)) {
                System.out.println(getName() + " " + cadena2[i]);
                total++;
                cont.sumarContador(1);
            }

        }

        if ("HiloNumeros".equals(getName())) {
            System.out.println("TOTAL: " + total);
            System.out.println("TOTAL SYNCHRONIZED: " + cont.getContador());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Contador cont1 = new Contador();
        RepasoExamen3 h1 = new RepasoExamen3("HiloMayus", cont1);
        RepasoExamen3 h2 = new RepasoExamen3("HiloMinus", cont1);
        RepasoExamen3 h3 = new RepasoExamen3("HiloNumeros", cont1);
        h1.start();
        h1.join();
        h2.start();
        h2.join();
        h3.start();
        System.out.println("Thread main terminated.");
    }
}
