package vn.edu.likelion.day17;

import java.util.*;

public class test implements Runnable {
    static Set<String> listNonDuplicate = new LinkedHashSet<>();
    public test() {}

    @Override
    public void run() {
        List<String> listDuplicate = new ArrayList<String>();
        listDuplicate.add("JAVA");
        listDuplicate.add("PHP");
        listDuplicate.add("JAVA");


        // Khởi tạo 1 LinkedHashSet để loại bỏ phần tử trùng\
        listDuplicate.removeIf(s -> !listNonDuplicate.add(s));
        System.out.println(listNonDuplicate);
    }
}
