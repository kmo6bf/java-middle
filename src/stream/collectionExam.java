package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class collectionExam {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream = list.stream();

        // forEach() 메소드를 이용한 스트림 요소의 순차 접근

        // 스트림별로 forEach()는 한번만 사용 가능
//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);
    }
}
