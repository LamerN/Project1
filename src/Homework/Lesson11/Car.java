package Homework.Lesson11;

public class Car {
    String color;
    String engine;
    int doorsCount;

    Car(String color, String engine, int doorsCount) {
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorsCount;
    }
}

class CarTest {
    static void changeDoors(Car car1, int count){
        car1.doorsCount = count;
    }
    static void swapColor(Car car1, Car car2){
        String buffer;
        buffer = car1.color;
        car1.color=car2.color;
        car2.color=buffer;
    }
    public static void main(String[] args) {
        Car audi = new Car("red", "v6", 3);
        Car bmw = new Car("blue", "v4", 6);
        System.out.println("кол-во дверей до смены = "+audi.doorsCount);
        changeDoors(audi, 5);
        System.out.println("кол-во дверей после смены = "+audi.doorsCount);
        System.out.println();
        System.out.println("цвет первой машины: "+audi.color);
        System.out.println("цвет второй машины: "+bmw.color);
        swapColor(audi, bmw);
        System.out.println("цвет первой машины: "+audi.color);
        System.out.println("цвет второй машины: "+bmw.color);
    }
}
