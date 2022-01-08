package Homework.Lesson23.Test1;
import Homework.Lesson23.Test1.*;

public class Y extends X{
    Y(){};
    @Override
    public void abc() {
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
