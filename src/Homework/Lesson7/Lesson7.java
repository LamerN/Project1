package Homework.Lesson7;

import Homework.Lesson5.Lesson5Employee;

public class Lesson7 {
    public static void main(String[] args) {
        Lesson5Employee Chuck = new Lesson5Employee(1,"Luck", 22,400,5);
        System.out.println("Chuck id = "+Chuck.id);
        System.out.println("Chuck surname = "+Chuck.surname);
        System.out.println("Chuck age = "+Chuck.age);
        //System.out.println("Chuck salary = "+Chuck.salary);
        System.out.println("Chuck department = "+Chuck.department);

        Chuck.showId();
        Chuck.showSurname();
        Chuck.showSalary();


    }
}
