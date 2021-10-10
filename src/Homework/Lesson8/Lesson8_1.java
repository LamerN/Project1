package Homework.Lesson8;

public class Lesson8_1 {
    static double multiplication(double a, double b, double c){
        return a*b*c;
    }
    static void division (int a1, int b1){
        System.out.println("Частное от деления "+a1+" на "+b1+" = "+(a1/b1));
        System.out.println("Остаток от деления "+a1+" на "+b1+" = "+(a1%b1));
    }
}

class Lesson8_1Test{
    public static void main(String[] args) {
        System.out.println(Lesson8_1.multiplication(2,3,4));
        System.out.println(Lesson8_1.multiplication(5,5,5));
        Lesson8_1.division(5,3);
        Lesson8_1.division(10,3);
    }
}