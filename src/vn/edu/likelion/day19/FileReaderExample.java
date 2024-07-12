package vn.edu.likelion.day19;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // lấy đường dẫn và tên file để đọc
        String sourceFile = "Class4.txt";

        // khởi tạo đối tượng FileReader
        FileReader file = null;
        try {
            file = new FileReader(sourceFile);

            int character;

            while ((character = file.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
