package lang;

public class MathExam {
    // Math클래스의 생성자는 private 상태이므로 따로 객체를 생성할 수 없다.
    // 메서드가 대부분 static이므로 바로 사용하면 된다.

    public static void main(String[] args) {
        int value1 = Math.max(5, 30);
        System.out.println(value1);

        int value2 = Math.min(5, 30);
        System.out.println(value2);

        System.out.println(Math.abs(-11));

        System.out.println(Math.random() * 10 + 1);

        System.out.println(Math.sqrt(25));

    }
}
