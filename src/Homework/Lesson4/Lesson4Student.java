package Homework.Lesson4;

class Student {
    int id;
    String name;
    String surname;
    int course;
    int markMathmatic;
    int markEconomy;
    int markLanguage;

    Student(int id1, String name1, String surname1, int course1, int markMathmatic1, int markEconomy1, int markLanguage1){
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        markMathmatic = markMathmatic1;
        markEconomy = markEconomy1;
        markLanguage = markLanguage1;
    }
    Student(int id1, String name1, String surname1, int course1){
        this(id1, name1, surname1, course1, 0, 0, 0);
    }
    Student(){
    }
}

class StudentTest {
    void showAvarageMark(Student a){
        double mark = (a.markLanguage+a.markMathmatic+a.markEconomy)/3.0;
        System.out.println(a.name+" "+a.surname+" - average mark: "+mark);
    }

    public static void main(String[] args) {

        Student Andy = new Student();
        Andy.id = 1;
        Andy.name = "Andy";
        Andy.surname = "Star";
        Andy.course = 2;
        Andy.markMathmatic = 4;
        Andy.markEconomy = 5;
        Andy.markLanguage = 2;

        Student Garry = new Student();
        Garry.id = 2;
        Garry.name = "Garry";
        Garry.surname = "Power";
        Garry.course = 4;
        Garry.markMathmatic = 3;
        Garry.markEconomy = 2;
        Garry.markLanguage = 2;

        Student Peter = new Student();
        Peter.id = 3;
        Peter.name = "Peter";
        Peter.surname = "One";
        Peter.course = 3;
        Peter.markMathmatic = 5;
        Peter.markEconomy = 4;
        Peter.markLanguage = 5;

        Student Chuck = new Student(4, "Cuck", "Luck", 3, 4, 4, 5);
        Student Bob = new Student(5, "Bob", "Sinclar", 5);
        Student Arnold = new Student();

        StudentTest st = new StudentTest();
        st.showAvarageMark(Andy);
        st.showAvarageMark(Garry);
        st.showAvarageMark(Peter);

        st.showAvarageMark(Chuck);
        st.showAvarageMark(Bob);
        st.showAvarageMark(Arnold);
    }
}


