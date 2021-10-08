package Homework;

public class Lesson5Employee {
    public Lesson5Employee(int idIn, String surnameIn, int ageIn, int salaryIn, int departmentIn) {
        id = idIn;
        surname = surnameIn;
        age = ageIn;
        salary = salaryIn;
        department = departmentIn;
    }

    Lesson5Employee(int idIn, String surnameIn, int ageIn, int salaryIn) {
        this(idIn, surnameIn, ageIn, salaryIn, 0);
    }

    private Lesson5Employee(int idIn, String surnameIn, int ageIn) {
        this(idIn, surnameIn, ageIn, 0, 0);
    }

    void salaryX2() {
        salary *= 2;
    }

    int id;
    public String surname;
    int age;
    private int salary;
    int department;

    public void showId() {
        System.out.println("id = " + id);
    }

    public void showSurname() {
        System.out.println("surname = " + surname);
    }

    public void showSalary() {
        System.out.println("salary = " + salary);
    }
}
