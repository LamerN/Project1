package Homework.Lesson16;

public class MailTask {
    public static void email(String s1){
        char n;
        int start = 0;
        int end = 0;
        for(int i=0; i<=s1.length()-1; i++){
            n=s1.charAt(i);
            if(n=='@'){
                start=i+1;
                continue;
            }
            if(n=='.'){
                end=i;
                System.out.println(s1.substring(start, end));
            }
        }
    }

    public static void main(String[] args) {
        email("ya@yandex.ru; ggg@gmail.com; s13@rambler.ru;");
    }
}
