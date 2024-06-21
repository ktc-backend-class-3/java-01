package vn.edu.likelion.application;

import vn.edu.likelion.model.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void getPerson(Person person) {

        System.out.println("toi ten la: " + person.getName());
        System.out.println("toi nam nay " + person.getAge() + " tuoi");
    }

    public static void main(String[] args) throws FileNotFoundException {

        String str = "";
        str = str + "Hello";
        str += " World";

        Person per = new Person();
        per.setName("Tuan");
        per.setAge(20);

        // getPerson(per);

    /*
        String strg = "test";
        try {
            int i = Integer.parseInt(strg);
        } catch (NullPointerException nullP) {
            System.err.println("Lỗi null string");
        } catch (NumberFormatException format) {
            System.err.println("lỗi format string to int");
        } catch (Exception ex) {
            // todo
        }
*/
        
        readFile();

        String chuoi = "abc";
        convertStringToInt(chuoi);

        System.out.println("App vẫn chạy đến đây");
    }

    /**
     * @param chuoi
     * @return
     * @throws NumberFormatException
     */
    static int convertStringToInt(String chuoi) throws NumberFormatException {
        int i = 0;
        try {
            i = Integer.parseInt(chuoi);
        } catch (NumberFormatException e) {

        }
        return i;
    }

    static void readFile() throws FileNotFoundException {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("abc."));
            System.out.println("");
            throw new FileNotFoundException();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
