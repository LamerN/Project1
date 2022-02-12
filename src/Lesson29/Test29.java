package Lesson29;
import java.time.*;

public class Test29 {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        LocalDate ld1 = LocalDate.ofEpochDay(210l);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2020,01,01);
        System.out.println(ld2);

    }
}
