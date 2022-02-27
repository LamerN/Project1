package Homework.Lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;
    Employee (String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println("name: " + e.name);
        System.out.println("department: " + e.department);
        System.out.println("salary: " + e.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> ale, Predicate<Employee> t) {
        for (Employee a : ale) {
            if (t.test(a)) {
                printEmployee(a);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Lex", "It", 300));
        al.add(new Employee("Dmitry", "It", 100));
        al.add(new Employee("Grigory", "Hr", 80));
        al.add(new Employee("Egor", "Hr", 400));
        al.add(new Employee("Hr", "Hr", 400));
        TestEmployee TE = new TestEmployee();
        TE.filtraciyaRabotnikov(al, (Employee emp) -> {return (emp.department.equals("It")&&(emp.salary>200));});
        System.out.println("-----------------------------------------------------------");
        TE.filtraciyaRabotnikov(al, (Employee emp) -> {return (emp.name.indexOf('E')==0&&emp.salary!=450);});
        System.out.println("-----------------------------------------------------------");
        TE.filtraciyaRabotnikov(al, (Employee emp) -> {return (emp.name.equals(emp.department));});
        System.out.println("-----------------------------------------------------------");

    }

}
