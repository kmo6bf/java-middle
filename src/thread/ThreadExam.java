package thread;

public class ThreadExam {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01("*");
        MyThread01 t2 = new MyThread01("-");

        t1.start();
        t2.start();

        // Main스레드 종료
        System.out.println("main end!!!");
    }
}
