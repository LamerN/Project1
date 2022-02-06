package Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File c = new File("E:/JavaTestFile.txt");
        FileInputStream fis = new FileInputStream(c);
        System.out.println(c);
    }
}
