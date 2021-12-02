package Homework.Lesson18;

public class Test {
    public static void sort(int[] array){
        for (int j=0;j<array.length;j++) {
            for (int i = j; i < array.length; i++) {
                if (array[i] < array[j]) {
                    int buffer = array[j];
                    array[j] = array[i];
                    array[i]=buffer;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8,6,9,3,6,1,11};
        sort(array);
        for (int n=0;n<array.length;n++){
            System.out.print(array[n]+" ");
        }
    }
}
