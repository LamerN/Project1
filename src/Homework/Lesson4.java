package Homework;

class Student{
    int ticket_number;
    String name;
    String lastName;
    int yearOfStady;
    int markMathmatic;
    int markEconomy;
    int markLanguage;

class StudentTest {

    public static void main(String[] args) {
        Student Andy = new Student();
        Andy.ticket_number = 1;
        Andy.name = "Andy";
        Andy.lastName = "Star";
        Andy.yearOfStady = 2;
        Andy.markMathmatic = 4;
        Andy.markEconomy = 5;
        Andy.markLanguage = 2;

        int averageMarkAndy = (Andy.markMathmatic+ Andy.markEconomy + Andy.markLanguage)/3;
        System.out.println(Andy.name+" "+Andy.lastName+" - average mark = "+averageMarkAndy);

    }
}
        }

public class Lesson4 {
}
