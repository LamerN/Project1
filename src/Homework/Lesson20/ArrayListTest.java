package Homework.Lesson20;
import java.util.ArrayList;

class Student{
    int age=0;
    String name = null;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        list.add(new Student(18,"Andy"));
        list.add(new Student(22,"Chuck"));
        System.out.println(list.toString());
    }
}
