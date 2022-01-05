package Homework.Lesson22;

public class Student {
    private StringBuilder name;
    public StringBuilder getName(){
        StringBuilder nameCopy = new StringBuilder(name);
        return nameCopy;
    }
    public void setName(StringBuilder nameNew){
        if (nameNew.length()>=3){
        name = nameNew;}
        else System.out.println("name length must be >= 3");
    }
    private int course=0;
    public int getCourse(){
        int courseCopy = course;
        return courseCopy;
    }
    public void setCourse(int courseNewValue){
        if (courseNewValue>=1&&courseNewValue<=4){
        course=courseNewValue;}
        else System.out.println("wrong course value");
    }
    private int grade=0;
    public int getGrade(){
        int gradeCopy = grade;
        return gradeCopy;
    }
    public void setGrade(int gradeNewValue){
        if (gradeNewValue>=1&&gradeNewValue<=10){
        grade=gradeNewValue;}
        else System.out.println("wrong grade value");
    }
    public void showInfo(){
        System.out.println("name = "+getName());
        System.out.println("course = "+getCourse());
        System.out.println("grade = "+getGrade());
    }


}

class StudentTest{
    public static void main(String[] args) {
        Student First = new Student();
        First.setName(new StringBuilder("Andy"));
        First.setCourse(5);
        First.setGrade(7);
        Student Nik = new Student();
        Nik.setName(new StringBuilder("Nik"));
        Nik.setGrade(4);
        Nik.setCourse(2);
        First.showInfo();
        Nik.showInfo();
    }
}