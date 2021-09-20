package Lesson4;

class Cat{       //создаем класс
    int tail;           //переменные класса
    int paw;
}

public class Lesson4 {

    public static void main(String[] args) {

        Cat Jack = new Cat();
        Cat Meou = new Cat();
        Cat Igor = Jack;

        Jack.tail = 1;
        Jack.paw = 4;

        Meou.tail = 1;
        Meou.paw = 3;

        Igor.tail = 2;
        Igor.paw = 2;
        System.out.println("Jack tail = " + Jack.tail+ "  Jack paws = " + Jack.paw);
        System.out.println("Igor tail = " + Igor.tail+ "  Igor paws = " + Igor.paw);


    }
}

