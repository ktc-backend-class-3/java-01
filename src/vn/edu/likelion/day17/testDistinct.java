package vn.edu.likelion.day17;

import java.util.*;
import java.util.stream.Stream;

public class testDistinct {
    public static void main(String[] args) {
// Khởi tạo 1 danh sách ArrayList có 1 phần tử trùng lặp giá trị Java
        List<String> listDuplicate = new ArrayList<String>();
        listDuplicate.add("JAVA");
        listDuplicate.add("PHP");
        listDuplicate.add("JAVA");

        // Khởi tạo 1 LinkedHashSet để loại bỏ phần tử trùng
        Set<String> listNonDuplicate = new LinkedHashSet<>();
        listDuplicate.removeIf(s -> !listNonDuplicate.add(s));

        //System.out.println("ArrayList sau khi xoá phần tử trùng: " + listNonDuplicate);

        test t = new test();
        Thread thread = new Thread(t);
        Thread thread2 = new Thread(t);

        thread.start();
        thread2.start();

        String[] arr = { "JAVA", "REACTJS", "JSP", "VUEJS" };
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        Collections.addAll(list, arr);

    }

}
