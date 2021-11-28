package Homework.Lesson17;

public class Test {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        if (sb1.equals(sb2)) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1;
        System.out.println(ravenstvo(sb1,sb2));

    }
}
