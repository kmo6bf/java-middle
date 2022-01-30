package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 여기서 제네릭이 사용된다.
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("kang!");
        boolean flag2 = set1.add("yang!!");
        // set은 중복을 허용하지 않으므로 false를 리턴한다.
        boolean flag3 = set1.add("kang!");

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(set1.size());

        // set으로 부터 이터레이터를 구함
        // set의 값을 꺼내봄
        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) {
            sb.append(iter.next()).append('\n');
        }
        System.out.println(sb);
    }
}
