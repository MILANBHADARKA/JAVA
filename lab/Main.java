import java.util.*;
import java.util.Scanner;

class Threaddemo1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread1 is running");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class Threaddemo2 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread2 is running");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Thread t = new Thread();
        Threaddemo1 t1 = new Threaddemo1();
        Threaddemo2 t2 = new Threaddemo2();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        
        t1.start();
        try {
            t1.join(); // Wait for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
