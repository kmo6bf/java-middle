package thread;

public class MusicBoxExam01 {
    public static void main(String[] args) {
        MusicBox box = new MusicBox();

        MusicPlayer yang = new MusicPlayer(1, box);
        MusicPlayer kim = new MusicPlayer(2, box);
        MusicPlayer hong = new MusicPlayer(3, box);

        Thread thread1 = new Thread(yang);
        Thread thread2 = new Thread(kim);
        Thread thread3 = new Thread(hong);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
