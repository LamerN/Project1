package Homework.Lesson12;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}
class StudentTest{
    void compare(Student st1, Student st2){
        if (st1.name.equals(st2.name)&&(st1.course==st2.course)&&(st1.grade==st2.grade))
            System.out.println("Студенты равны");
        else System.out.println("Студенты не равны");
    }
    void compareParametres(Student st1, Student st2){
        if (st1.name.equals(st2.name)){
            if (st1.course==st2.course){
                if (st1.grade==st2.grade) {
                    System.out.println("Vse parametri studentov ravni");
                } else {System.out.println("Ocenki studentov ne ravni");}
            } else {System.out.println("Kursi studentov ne ravni");}
        } else {System.out.println("Imena studentov ne ravni");}

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
        StudentTest test = new StudentTest();
        test.compare(st1, st2);
        System.out.println("-----------------------------------------");
        test.compareParametres(st1, st2);
    }

}
