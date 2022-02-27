package Homework.Lesson29;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Lesson29 {
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("Y, MMMM-dd !! HH:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/YY");

    void smena(LocalDateTime start, LocalDateTime end, Period p1, Duration d1){
        while (start.isBefore(end)){
            System.out.print("Работаем с: "+start.format(dtf1));
            start = start.plus(p1);
            System.out.println(" До: "+start.format(dtf1));
            System.out.print("Отдыхаем с: "+start.format(dtf2));
            start = start.plus(d1);
            System.out.println(" До: "+start.format(dtf2));
        }
    }

    public static void main(String[] args) {
        Lesson29 lesson29 = new Lesson29();
        LocalDateTime ldt1 = LocalDateTime.of(2021, 01, 30, 22, 12);
        LocalDateTime ldt2 = LocalDateTime.now();
        Period p1 = Period.of(0, 3, 0);
        Duration d1 = Duration.ofHours(16);
        lesson29.smena(ldt1, ldt2, p1, d1);

    }
}
