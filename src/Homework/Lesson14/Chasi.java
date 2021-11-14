package Homework.Lesson14;

public class Chasi {
    public static void time() {
        outer: for (int hour = 0; hour < 6; hour++) {
            outer2: for (int minute = 0; minute<60;minute++){
                if ((hour>1)&&(minute%10==0)){
                    break outer;
                }
                for (int second = 0; second<60; second++){
                    if (second*hour>minute){
                        continue outer2;
                    }
                    System.out.println(hour+":"+minute+":"+second);
                }
            }
        }
    }

    public static void main(String[] args) {
        Chasi.time();
    }
}
