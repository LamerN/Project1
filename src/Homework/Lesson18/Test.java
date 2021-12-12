package Homework.Lesson18;

public class Test {
    public static int[] sort(int[] array){
        int[] arraySorted = array.clone();
        for (int j=0;j<arraySorted.length;j++) {
            for (int i = j; i < arraySorted.length; i++) {
                if (arraySorted[i] < arraySorted[j]) {
                    int buffer = arraySorted[j];
                    arraySorted[j] = arraySorted[i];
                    arraySorted[i]=buffer;
                }
            }
        }
        return arraySorted;
    }

    public static void main(String[] args) {
        int[] array = {8,6,9,3,6,1,11};
        int[] arrayAfterSort = sort(array);
        for (int n=0;n<array.length;n++){
            System.out.print(array[n]+" ");
        }
        System.out.println();
        for (int n=0;n<arrayAfterSort.length;n++){
            System.out.print(arrayAfterSort[n]+" ");
        }
    }
}
