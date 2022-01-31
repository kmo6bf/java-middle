package lambda;

import thread.ThreadB;

public class RambdaExam {
    public static void main(String[] args) {
        // Java 에서는 원래 메서드만 파라미터로 넘길수 없기 때문에 일일이 객체를 생성해야했다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hello");
                }
            }
        }).start();

        // 위 문제를 해결하기 위해 람다식이 등장한다. (두둥 탁!)
        // 람다식은 다른말로 익명 메서드라고 한다.
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi!!");
            }
        }).start();
    }
}
