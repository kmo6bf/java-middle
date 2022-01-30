package lang;

public class WrapperExam {
    public static void main(String[] args) {
        // 기본형 타입
        int i = 5;
        // 기본형 타입을 객체 타입 (참조형 타입)으로 변환해준다.
        // 에디터 상으로 사용 지양을 권고한다.
//        Integer i2 = new Integer(5);

        // 자동으로 Integer로 형변환 해준다.
        // 이는 JAVA5 이후 부터 적용되었다.
        // 이걸 auto-boxing이라고 한다.
        Integer i3 = 5;

        // 객체 타입을 기본형으로 변환
        int i4 = i3.intValue();

        // 이렇게 하면 자동으로 기본형으로 변환
        // auto-unboxing이라고 한다.
        int i5 = i3;
    }
}
