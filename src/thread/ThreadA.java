package thread;

public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();

        b.start();

        synchronized (b) {
            try {
                System.out.println("b가 완료될따 까지 대기");
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total is : " + b.total);
    }
}