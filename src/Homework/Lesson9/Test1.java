package Homework.Lesson9;

public class Test1 {
    int a = 1;
    static int c = 2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.abc(3);
    }

}
