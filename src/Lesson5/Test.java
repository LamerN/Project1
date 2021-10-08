package Lesson5;

class Employee{
    int age;
    double salary;

    Employee(int age1){
        age = age1;
    }
    Employee(double salary1){
        salary=salary1;
    }
}

public class Test {
    public static void main(String[] args) {
        Employee Andy = new Employee(5.);
        System.out.println("age = "+Andy.age);
        System.out.println("salary = "+Andy.salary);
    }

}
