package MultiThreads;

public class Lesson1Alishev {
    public static void main(String[] args) throws InterruptedException {
        //потоки создаются только из главного потока

        System.out.println("wwww");

        MyThread1 myThread = new MyThread1();

        //метод создаст новый поток возьмет код из ран и запустит
        myThread.start();
        //после запуска где то создается новый поток и выполняется где то
        //а метод мейн продолжает свою работу
        //потоки борються за процессорное время
        //поэтому если разные потоки то и вывод будет каждый раз разный
        //вероятность что кто то заберет больше ресурсов разная

        Thread.sleep(200);
        System.out.println("wake up");
        Thread.sleep(20000);
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <= 1000){
            System.out.print(i + " ");
            if(i % 50 == 0 && i != 0){
                System.out.println();
             }i++;
        }
    }
}
