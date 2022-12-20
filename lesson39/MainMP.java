package lesson39;
import java.util.Random;
import java.util.TreeMap;

public class MainMP {
    public static void main(String[] args) {
        /*MyThread1 t1 = new MyThread1(); // создание потока
        t1.setDaemon(true);
        //преоритет
        t1.setPriority(Thread.MIN_PRIORITY);
        //запуск потока из основного потока
        t1.start();
        int score =1000;
        while (score >0){
            System.out.print('@');
            score--;
        }         */
        int v2 = (new Random()).nextInt(10);
        MyThread2 t2 = new MyThread2(v2);
        //t2.setDaemon(true);
        int v3 = (new Random()).nextInt(10);
        MyThread2 t3 = new MyThread2(v3);
        //t3.setDaemon(true);
        //MyThread3 r4 = new MyThread3(v3);
        //Thread t4 = new Thread(r4);
        t2.start();
        t3.start();
       // t4.start();
            t2.join(10000);
        }
        catch (InterruptedException ex){}
        while (true){
            System.out.print('@');
        }


    }

}
class MyThread1 extends Thread{
    @Override
    public void run(){
        while (true){
        System.out.print('A');}
    }
}
class  MyThread2 extends Thread{
    private int value;

    public MyThread2(int value) {
        this.value = value;
    }
    @Override
    public void run(){
        while (value>=0){
            System.out.println("*** The thread " + Thread.currentThread().getName() +
                    " started with " + value);
            while ( this.value >=0){
                System.out.println("From " + Thread.currentThread().getName() +
                        " value=" + value);
                value-=1;
                try {
                    Thread.sleep(300);}
                catch (InterruptedException ex){

                }
            }
        }
        System.out.println("*** The thread  " + Thread.currentThread().getName()
                + " has finished");
    }

}
class  MyThread3 implements Runnable{
    private int value;

    public MyThread3(int value) {
        this.value = value;
    }
    @Override
    public void run(){
        while (value>=0){
            System.out.println("*** The thread " + Thread.currentThread().getName() +
                    " started with " + value);
            while ( this.value >=0){
                System.out.println("From " + Thread.currentThread().getName() +
                        " value=" + value);
                value-=1;
                try {
                    Thread.sleep(300);}
                catch (InterruptedException ex){

                }
            }
        }
        System.out.println("*** The thread  " + Thread.currentThread().getName()
                + " has finished");
    }

}