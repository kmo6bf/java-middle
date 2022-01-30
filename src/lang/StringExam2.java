package lang;

// String 클래스의 문제점에 대해서 알아보자!

public class StringExam2 {
    public static void main(String[] args) {
        // String클래스는 불변클래스이다.
        String str1 = "Hello Chickenboy!";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        // String클래스의 문제점
        String str3 = str1 + str2;
        System.out.println(str3);

        // 문자열과 문자열을 더하면 내부적으로 새로운 객체를 생성한 후 더한 결과값을 저장한다.
        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        // 다시말해 문자열을 plus로 붙이게 되면 항상 SB가 생성된다.
        // 이걸 반복문에서 사용한다면...
        // 반복문이 실행될때 마다 객체를 새로 생성한다. 즉, 100번 객체가 새로 생성된다.
        // new연산자를 남발하면 속도가 느려진다.
        String str5 = "";
        for (int i = 0; i < 100; i++) {
            str5 = str5 + "*";
        }
        System.out.println(str5);

        // 이렇게 작성하면 효율적이다. 반복문에서는 StringBuffer를 사용해주자!
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
    }
}
