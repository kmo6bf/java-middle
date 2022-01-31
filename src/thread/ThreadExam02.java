package thread;

public class ThreadExam02 {
    public static void main(String[] args) {
        MyThread02 t1 = new MyThread02("*");
        MyThread02 t2 = new MyThread02("-");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println("Main Thread 종료!");
    }
}
