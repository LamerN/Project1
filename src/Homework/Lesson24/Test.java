package Homework.Lesson24;

public class Test {
    public static void main(String[] args) {
        Mechenosec mech = new Mechenosec("Mech");
        System.out.println(mech.name);
        mech.eat();
        mech.swim();
        mech.sleep();
        Speakable ping = new Pingvin("Ping");
        ping.speak();
        Animal lion = new Lev("Lion");
        System.out.println(lion.name);
        lion.sleep();
        lion.eat();
        Mammal lion2 = new Lev("Lion2");
        System.out.println(lion2.name);
        lion2.run();
        lion2.sleep();
        lion2.eat();
        lion2.speak();
    }

}

abstract class Animal{
    Animal(String name){
        this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name=name;
    }
    @Override
    void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi!");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();
    @Override
    public void speak(){
        System.out.println(name+" sings");
    }
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name=name;
    }
    @Override
    void swim(){
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    @Override
    void eat(){
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}

class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name=name;
    }
    @Override
    void eat(){
        System.out.println("Pingvin lyubit est ribu!");
    }
    @Override
    void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
    @Override
    void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }
    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi!");
    }
}

class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name=name;
    }
    @Override
    void eat() {
        System.out.println("Lev, kak lyuboi xishnik, lyubit myaso!");
    }
    @Override
    void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    @Override
    void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }
}

interface Speakable{
    default void speak(){
        System.out.println("Someboby speaks");
    }
}
