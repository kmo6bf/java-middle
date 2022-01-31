package thread;

public class MusicBox {
    // 모니터링 락
    // 메서드가 동기적으로 실행된다.
    public synchronized void playMusicA() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Exiting Music!!");

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Cafe Music!!");

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 쓰레드들이 동시에 실행해도 문제될게 없다.
    public void playMusicC() {
        for (int i = 0; i < 10; i++) {
            // 이부분만 모니터링 락
            // 메소드 전체가 아닌 정말 필요한 부분만 동기화 가능하다.
            synchronized (this) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("MusicC 동기화중...");
                }
            }

            System.out.println("Piano Music!!");

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
