package lang;

public class StringBufferExam {
    // String과 달리 자기자신이 변하는 클래스

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world!");

        String str= sb.toString();
        System.out.println(str);

        // StringBuffer의 대부분의 메서드는 자기자신을 반환한다.
        // 메소드 체이닝 :
        // 자기자신을 리턴하여 계속해서 자신의 메서드를 호출하는 방식
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello chickenboy!");
        System.out.println(sb2.equals(sb3));

        // 자기자신을 호출하므로 계속해서 메서드를 연결할 수 있다!
        String str2 = new StringBuffer().append("chicken!!").append(" ").append("boy!!").toString();
        System.out.println(str2);
    }
}
