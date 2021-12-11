package Homework.Lesson18;

public class Test2 {
    public static void showArray(int array[][]) {
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
        int array1[][] = {{4,1,4,3},{5,6,4},{7,3,2,4,3,5}};
        showArray(array1);
    }
}
