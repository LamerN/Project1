package Homework.Lesson20;
import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {
    public static ArrayList<String> abc (String ... n){
        ArrayList<String> out = new ArrayList<>();
        for (String s:n){
            if (!out.contains(s)){
                out.add(s);
            }
        }
        Collections.sort(out);
        for (String s:out){
            System.out.print(s+" ");
        }
        return out;
    }

    public static void main(String[] args) {
        abc("privet", "eto", "ya", "snova", "privet");
    }
}

