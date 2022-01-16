package Homework.Lesson25;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("a1");
        Animal a2 = new Lev("a2");
        Animal a3 = new Pingvin("a3");
        Fish f1 = new Mechenosec("f1");
        Bird b1 = new Pingvin("b1");
        Mammal m1 = new Lev("m1");
        Mechenosec me1 = new Mechenosec("me1");
        Pingvin p1 = new Pingvin("p1");
        Lev l1 = new Lev("l1");
        Speakable s1 = new Pingvin("s1");
        Speakable s2 = new Lev("s2");

        Speakable[] speak = new Speakable[]{s1, s2};
        Animal[] anim = new Animal[]{a1, a2, a3, f1, b1, m1, me1, p1, l1};
        for(Speakable s:speak){
            if(s instanceof Mechenosec){
                System.out.println(((Mechenosec) s).name);
                ((Mechenosec)s).eat();
                ((Mechenosec) s).sleep();
                ((Mechenosec) s).swim();
                s.speak();
            }
            if(s instanceof Pingvin){
                System.out.println(((Pingvin) s).name);
                ((Pingvin) s).eat();
                ((Pingvin) s).sleep();
                ((Pingvin) s).fly();
                s.speak();
            }
            if (s instanceof Lev){
                System.out.println(((Lev) s).name);
                ((Lev) s).eat();
                ((Lev) s).sleep();
                ((Lev) s).run();
                s.speak();
            }
        }
        for (Animal a:anim){
            if(a instanceof Mechenosec){
                System.out.println(((Mechenosec) a).name);
                ((Mechenosec)a).eat();
                ((Mechenosec)a).sleep();
                ((Mechenosec)a).swim();
            }
            if(a instanceof Pingvin){
                System.out.println(((Pingvin) a).name);
                ((Pingvin) a).eat();
                ((Pingvin) a).sleep();
                ((Pingvin) a).fly();
                ((Pingvin) a).speak();
            }
            if (a instanceof Lev){
                System.out.println(((Lev) a).name);
                ((Lev) a).eat();
                ((Lev) a).sleep();
                ((Lev) a).run();
                ((Lev)a).speak();
            }
        }
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
