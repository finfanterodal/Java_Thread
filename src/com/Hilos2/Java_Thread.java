package com.Hilos2;

public class Java_Thread  extends Thread{
    public Java_Thread ( String s) {
        super (s);
    }
    public final void run () {
        boolean sigue = true ;
        for ( int i =0; i <100 && sigue ; i ++) {
            try {
                System . out . println ( getName ()+ ": "+i);
                sleep (20);
            } catch ( InterruptedException e) {
                System . out . println ( getName ()+ " interrumpida " );
                sigue = false ;
            }
        }
    }
    public static final void main ( final String [] args ){
        Thread p = new Java_Thread (" HILO " );
        p. start ();
    }
}
