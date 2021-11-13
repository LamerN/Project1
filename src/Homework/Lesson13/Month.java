package Homework.Lesson13;

public class Month {
    int num;
    Month(int num){
        this.num=num;
    }
    void showNum (int num){
        switch (num){
            case 1:  //31     3 5 7 8 10 12     30  4 6 9 11    28   2
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("kol-vo dnei 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("kol-vo dnei 30");
                break;
            case 2:
                System.out.println("kol-vo dnei 28");
            default:
                System.out.println("mesyaca s takim nomerom ne sushestvuet");
        }
    }

    public static void main(String[] args) {
        Month April = new Month(4);
        April.showNum(April.num);
    }
}
