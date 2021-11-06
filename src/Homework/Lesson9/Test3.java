package Homework.Lesson9;

public class Test3 {
    int a = 1;
    static int b =2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.abc(4);
    }
}
