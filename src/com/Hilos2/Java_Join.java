package com.Hilos2;

public class Java_Join extends Thread{

    public Java_Join ( String s) {
        super (s);
    }

    public void run() {
        for (int i = 0; i < 10;i++) {
            System.out.println(i+" "+getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread h1 = new Java_Join ( "A " );
        Thread h2 = new Java_Join ( "B " );
        Thread h3 = new Java_Join ( "C " );
        h1. start ();
        h2. start ();
        h3. start ();
        h1. join ();
        h2. join ();
        h3.join(); //Redundante
    }
}
