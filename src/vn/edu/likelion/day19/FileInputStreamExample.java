package vn.edu.likelion.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        // đường dẫn và tên file cần đọc
        // ko có đường dẫn thì nó sẽ tự tìm trong folder bên ngoài project
        // nếu file này ko tồn tại thì sẽ bị FileNotFoundException
        String sourceFile = "Class3.txt";

        // tạo 1 cái đối tượng FileInputStream
        FileInputStream fis = null;
        try {
            // tạo 1 cái instance của FileInputStream với tên file là Class3.txt
            fis = new FileInputStream(sourceFile);

            byte[] content = new byte[1024];
            int byteRead;
            // ghi nội dung trong file ra màn hình console
            while ((byteRead = fis.read(content)) != -1) {
                System.out.println(new String(content, 0, byteRead));
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException io1) {
            io1.printStackTrace();
        } finally {
            try {
                // cái này rất quan trọng
                fis.close();
            } catch (IOException io2) {
                io2.printStackTrace();
            }
        }
    }
}
