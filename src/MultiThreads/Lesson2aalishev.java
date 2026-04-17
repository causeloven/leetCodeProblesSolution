package MultiThreads;


import java.util.Scanner;

/*
проблема кагерентности кэша,
когерентсность - когда кэш не совпадает
теоретически сможет случиться такое что в одном потоке буду
разные переменный раннинг и поток не остановится
да современным системам такое вряд ли грозит но риск все равно есть

volotile - не кэширует переменную в память ядра а читает ее из общей памяти


 */
public class Lesson2aalishev {
    public static void main() {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        myThread.shutDown();


    }
}

class MyThread extends Thread{
    private volatile boolean running = true;

    public void run(){
        while(running){
            System.out.println("privaet");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public void shutDown(){
        this.running = !running;
        System.out.println("Program is shutdowned");
    }
}