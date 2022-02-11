package Homework.Lesson28;


public class Tiger {
    public void eat(String s3){
        if(!s3.equals("myaso")){
            throw new NeMyacoException("tigr ne est "+s3);
        } else {
            System.out.println("tigr est myaso");
        }
    }
    public void drink(String s2) throws NeVodaException{
        if(!s2.equals("voda")){
            throw new NeVodaException("tigr ne pyet "+s2);
        } else {
            System.out.println("tigr pyet vodu");
        }
    }
}