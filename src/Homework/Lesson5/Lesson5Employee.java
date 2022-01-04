package Homework.Lesson5;

public class Lesson5Employee {
    public Lesson5Employee(int idIn, String surnameIn, int ageIn, int salaryIn, int departmentIn) {
        id = idIn;
        surname = surnameIn;
        age = ageIn;
        salary = salaryIn;
        department = departmentIn;
    }

    public Lesson5Employee(int idIn, String surnameIn, int ageIn, int salaryIn) {
        this(idIn, surnameIn, ageIn, salaryIn, 0);
    }

    private Lesson5Employee(int idIn, String surnameIn, int ageIn) {
        this(idIn, surnameIn, ageIn, 0, 0);
    }

    void salaryX2() {
        salary *= 2;
    }

    public int id;
    public String surname;
    public int age;
    private int salary;
    public int department;

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
