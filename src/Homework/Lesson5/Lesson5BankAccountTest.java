package Homework.Lesson5;

class BankAccount{

    int id = 10;
    String name = "Petr";
    double balance = 10.1;

    double popolnenieScheta(double dengi) {
        return balance+=dengi;
    }

    double snyatieSoScheta(double dengi) {
        return balance-=dengi;
    }
}

class Lesson5BankAccountTest {
    public static void main(String[] args) {
        BankAccount Igor = new BankAccount();
        Igor.name = "Igor";
        System.out.println("balans polzovatelya "+Igor.name+" = "+Igor.balance);
        Igor.popolnenieScheta(20);
        System.out.println("balans polzovatelya "+Igor.name+" = "+Igor.balance);
        Igor.snyatieSoScheta(11.5);
        System.out.println("balans polzovatelya "+Igor.name+" = "+Igor.balance);
    }
}
