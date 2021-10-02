package Homework;

class Student {
    int ticket_number;
    String name;
    String lastName;
    int yearOfStady;
    int markMathmatic;
    int markEconomy;
    int markLanguage;
}

class StudentTest {
   static void showAvarageMark(Student a){
        double mark = (a.markLanguage+a.markMathmatic+a.markEconomy)/3.0;
        System.out.println(a.name+" "+a.lastName+" - average mark: "+mark);
    }

    public static void main(String[] args) {

        Student Andy = new Student();
        Andy.ticket_number = 1;
        Andy.name = "Andy";
        Andy.lastName = "Star";
        Andy.yearOfStady = 2;
        Andy.markMathmatic = 4;
        Andy.markEconomy = 5;
        Andy.markLanguage = 2;

        showAvarageMark(Andy);

        double averageMarkAndy = (Andy.markMathmatic+ Andy.markEconomy + Andy.markLanguage)/3.0;
        System.out.println(Andy.name+" "+Andy.lastName+" - average mark: "+averageMarkAndy);

        Student Garry = new Student();
        Garry.ticket_number = 2;
        Garry.name = "Garry";
        Garry.lastName = "Power";
        Garry.yearOfStady = 4;
        Garry.markMathmatic = 3;
        Garry.markEconomy = 2;
        Garry.markLanguage = 2;
        double averageMarkGarry = (Garry.markMathmatic+ Garry.markEconomy + Garry.markLanguage)/3;
        System.out.println(Garry.name+" "+Garry.lastName+" - average mark: "+averageMarkGarry);

        Student Peter = new Student();
        Peter.ticket_number = 3;
        Peter.name = "Peter";
        Peter.lastName = "One";
        Peter.yearOfStady = 3;
        Peter.markMathmatic = 5;
        Peter.markEconomy = 4;
        Peter.markLanguage = 5;
        double averageMarkPeter = (Peter.markMathmatic+ Peter.markEconomy + Peter.markLanguage)/3;
        System.out.println(Peter.name+" "+Peter.lastName+" - average mark: "+averageMarkPeter);
    }
}


