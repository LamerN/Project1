package Homework;

class Overloading{

    int Summa(int n1, int n2, int n3, int n4){
        int summaChisel=n1+n2+n3+n4;
        System.out.println("Summa = "+summaChisel);
        return summaChisel;
    }
    int Summa(int n1, int n2, int n3){
        int summaChisel=n1+n2+n3;
        System.out.println("Summa = "+summaChisel);
        return summaChisel;
    }
    int Summa(int n1, int n2){
        int summaChisel=n1+n2;
        System.out.println("Summa = "+summaChisel);
        return summaChisel;
    }
    int Summa(int n1){
        int summaChisel=n1;
        System.out.println("Summa = "+summaChisel);
        return summaChisel;
    }
    int Summa(){
        System.out.println("Summa = 0");
        return 0;
    }

}

public class Lesson6OverloadingTest {
    public static void main(String[] args) {
        Overloading Test = new Overloading();
        Test.Summa();
        Test.Summa(3);
        Test.Summa(3,3);
        Test.Summa(3,3,3);
        Test.Summa(3,3,3,3);


    }
}
