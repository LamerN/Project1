package Homework.Lesson15;


public class Leeson15 {
    public static void time() {
        int hour = 0;
        outer:
        while (hour < 6) {
            int minute = 0;
            middle:
            do {
                if ((hour > 1) && (minute % 10 == 0)) {
                    break outer;
                }
                int second = 0;
                inner:
                while (second < 60) {
                    if (second * hour > minute) {
                        minute++;
                        continue middle;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            } while (minute < 60);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }


}

