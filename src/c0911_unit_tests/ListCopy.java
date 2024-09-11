package c0911_unit_tests;

import java.util.ArrayList;
import java.util.List;

public class ListCopy {
    public static void main(String[] args) {
        List<String> list = List.of("AA", "BB", "CC");
        System.out.println(list);

        List<String> listCopy = new ArrayList<>(list);
        listCopy.add("DD");
        listCopy.add("EE");
        System.out.println(listCopy);
    }
}