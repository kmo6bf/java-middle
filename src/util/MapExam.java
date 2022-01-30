package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("chicken", "boy");
        map.put("source", "chic");
        map.put("destination", "ken");
        // 하나의 key만 존재 가능하다.
        map.put("source", "fried");

        System.out.println(map.size());
        System.out.println(map.get("source"));
        System.out.println();
        System.out.println();

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println();
        System.out.println();

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();

        while (iter.hasNext()) {
            System.out.println(map.get(iter.next()));
        }
    }
}
