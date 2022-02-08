package Homework.Lesson28;


class NeMyacoException extends RuntimeException{
    NeMyacoException(String s1){
        super(s1);
    }
}
class NeVodaException extends Exception{
    NeVodaException(String s2){
        super(s2);
    }
}

public class Tiger {
    void eat(String s3){
        if(!s3.equals("myaso")){
            throw new NeMyacoException("tigr ne est "+s3);
        } else {
            System.out.println("tigr est myaso");
        }
    }
}