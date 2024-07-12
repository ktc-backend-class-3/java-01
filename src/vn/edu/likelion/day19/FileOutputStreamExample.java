package vn.edu.likelion.day19;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // đường dẫn đến file đích
        String fileName = "Class3.txt";

        // nội dung ghi vào file Class3.txt
        String content = "Hello\nclass 3 !!!!!";

        // khởi tạo đối tượng từ class FileOutputStream
        FileOutputStream fos = null;
        try {
            // tạo ra 1 instance với tên file là Class3.txt
            // file này ko có đường dẫn nên sẽ đc tạo trong project
            fos = new FileOutputStream(fileName);
            // ghi nội dung content vào file
            fos.write(content.getBytes());
            System.out.println("Đã tạo ghi file thành công.");
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                // phải close cái FileOutputStream
                // cái này là rất quan trọng
                fos.close();
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
