package vn.edu.likelion.trabai;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TraBai {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner s = new Scanner(System.in);

        DanhSachHV ds = new DanhSachHV();
        ArrayList<String> list = ds.layDanhSachHV();
        while (!list.isEmpty()) {
            String str = list.get(ran.nextInt(list.size()));
            System.out.println(str);
            list.remove(str);
            System.out.println("Tiếp tục ");
            s.nextInt();
        }
        // có bao nhiêu syntax method references?
        
    }
}
