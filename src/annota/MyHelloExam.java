package annota;

import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) {
        MyHello mh = new MyHello();

        try {
            Method method = mh.getClass().getDeclaredMethod("hello");

            if (method.isAnnotationPresent(Count100.class)) {
                for (int i = 0; i < 100; i++) {
                    mh.hello();
                }
            } else {
                mh.hello();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
