package thread;

public class joinExam {
    public static void main(String[] args) {
        MyThread05 thread = new MyThread05();
        thread.start();

        System.out.println("Start!");

        // 05가 끝날때까지 기다린다.
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End!");
    }
}
