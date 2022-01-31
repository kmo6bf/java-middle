package thread;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("데몬 쓰레드가 실행중입니다.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DaemonThread());

        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드 종료!");
    }
}
