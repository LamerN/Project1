package Homework.Lesson8;

public class Lesson8_2 {
    static final double pi = 3.14;
    double square(double r){
        return pi*r*r;
    }
    static double length(double r){
        return 2*pi*r;
    }
    void showInfo(double r){
        System.out.println("Радиус окружности = "+r);
        System.out.println("Площадь окружости = "+square(r));
        System.out.println("Длина окружности = "+length(r));
    }
}

class Lesson8_2Test{
    public static void main(String[] args) {
        Lesson8_2 Test = new Lesson8_2();
        Test.showInfo(5);
    }
}