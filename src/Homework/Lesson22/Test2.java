package Homework.Lesson22;

class Animal{
    Animal(){
        System.out.println("I am animal");
    }
    int eyes = 0;
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{
    Pet(){
        System.out.println("I am pet");
        eyes = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;
    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet{
    Dog(String newName){
        name = newName;
        System.out.println("I am dog and my name is: "+name);
    }
    void plays(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{
    Cat(String newName){
       name = newName;
        System.out.println("I am cat and my name is: "+name);
    }
    void sleep(){
        System.out.println("Cat sleeps");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        System.out.println("dog "+dog.name+" have "+dog.paw+" paws");
        Cat cat = new Cat("Tom");
        cat.sleep();
    }
}
