package Homework.Lesson17;

public class Test {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        if (sb1.length()==sb2.length()) {
            for (int i = 0; i<sb1.length(); i++){
                if (sb1.charAt(i)==sb2.charAt(i)){
                    continue;
                }
                else return false;
            }
        return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("1238");
        System.out.println(ravenstvo(sb1,sb2));

    }
}
