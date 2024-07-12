package vn.edu.likelion.day19;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        // đường dẫn và tên file
        String fileName = "Class4.txt";
        String content = "Hê lô\ncả lớp";

        // khởi tạo đối tượng FileWriter
        FileWriter file = null;
        try {
            // tạo ra 1 instance của FileWriter với tên file là fileName
            file = new FileWriter(fileName);
            // ghi nội dung content vào file
            file.write(content);
            System.out.println("Đã tạo và ghi file thành công");
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException io2) {
                io2.printStackTrace();
            }
        }
    }
}
