package Homework;

class Employee {
    Employee(int idIn, String surnameIn, int ageIn, int salaryIn, int departmentIn){
        id = idIn;
        surname = surnameIn;
        age = ageIn;
        salary = salaryIn;
        department = departmentIn;
    }
    int salaryX2(){
        return salary*=2;
    }
    int id;
    String surname;
    int age;
    int salary;
    int department;
}

public class Lesson5EmployeeTest {
    public static void main(String[] args) {
        Employee Andy = new Employee(1,"Star", 18, 1800, 5);
        System.out.println("зарплата "+ Andy.surname+" = "+Andy.salary);
        Andy.salaryX2();
        System.out.println("зарплата "+ Andy.surname+" = "+Andy.salary);

        Employee Grisha = new Employee(2, "Bochka", 25, 2200, 11);
        System.out.println("зарплата "+ Grisha.surname+" = "+Grisha.salary);
        Grisha.salaryX2();
        System.out.println("зарплата "+ Grisha.surname+" = "+Grisha.salary);
    }

}
