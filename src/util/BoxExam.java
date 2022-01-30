package util;

public class BoxExam {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello");
//        String str = (String) box.getObj();
//        System.out.println(str);
//
//        // 꺼낼떄마다 매번 자식 타입으로 형변환을 해야해서 귀찮다.
//        box.setObj(1);
//        int value = (int) box.getObj();

        // 제네릭을 사용하면 매번 자식 타입으로 형변환 할 필요 없다!!!
        Box<Object> box = new Box<>();
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> strBox = new Box<>();
        strBox.setObj("chicken boy");
        System.out.println(strBox.getObj());

        // 이렇게 하면 Integer만 생성하고 가져올 수 있다.
        Box<Integer> box3 = new Box<>();
        box3.setObj(1727);
        int v2 = box3.getObj();
        System.out.println(v2);

    }
}