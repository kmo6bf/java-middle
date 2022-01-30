package util;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("chicken body!!!");
        list.add("chicken boy!!!");
        list.add("fried man!!");
        list.add("chicken boy!!!");

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println();

        for (String s : list) {
            System.out.println(s);
        }

        list.set(0, "ee");
        System.out.println(list.get(0));

    }
}
