package Homework;

public class Lesson3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2/d1+d2%i1-l; // 2 + 1.3 - 20 = -16.7
        System.out.println(result);

        int a = 5;
        int resultA = a-- - --a + ++a + a++ + a; // 5-3+4+4+5 = 15
        System.out.println(resultA);
        int b = 8;
        int resultB= ++b - b++ + ++b - --b; // 9-9+11-10 = 1
        System.out.println(resultB);

    }
}
