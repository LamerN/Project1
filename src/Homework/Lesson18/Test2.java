package Homework.Lesson18;

public class Test2 {
    public static void showArray(String array[][]) {
        System.out.print("{");
        for(int i=0;i<array.length;i++){
            for (int j=0;j< array[i].length;j++){
                if (j==0) {
                    System.out.print("{");
                }
                System.out.print(array[i][j]);
                if (j==(array[i].length-1)){
                    System.out.print("}");
                }
                if ((j<(array[i].length-1))||((j==(array[i].length-1))&&(i!=(array.length-1)))){
                    System.out.print(", ");
                }


            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        String array1[][] = {{"white", "blue", "yellow"},{"black","brown"},{"red","green","light_blue"}};
        showArray(array1);
    }
}
