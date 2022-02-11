package Lesson27;
import Homework.Lesson28.*;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.eat("myaso");
        try {
            t1.drink("voda");
            try{
                t1.drink("pivo");
            }
            catch (NeVodaException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Eto inner finaly blok");
            }
        }
        catch (RuntimeException e){
                System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("konec");
        }
    }
}
