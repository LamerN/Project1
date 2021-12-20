package Homework.Lesson19;

public class Homework {
    public static String[] abc(String[]...arraysString){
        int n=0;
        for(String[] array2:arraysString){
            for(String a:array2){
                n++;
            }
        }
        int k=0;
        String outputArray[] = new String[n];
        for(String[] array2:arraysString){
            for(String a:array2){
                outputArray[k]=a;
                k++;
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {
        String[] out = abc(new String[]{"qwe","asdf","fdfdfd"}, new String[]{"1","22"} );
        for(String b:out){
            System.out.print(b+" ");
        }
        System.out.println();
        for(int i=0;i<args.length;i++){
            for(int j=0;j< out.length;j++){
                if (out[j]!=null&&out[j].equals(args[i])){
                    out[j]=null;
                }
            }
        }
        for(String b:out){
            System.out.print(b+" ");
        }

    }
}

