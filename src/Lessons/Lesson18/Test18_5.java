package Lessons.Lesson18;

public class Test18_5 {
    public static void main(String[] args) {
        int array1[] = {1,9,3,-8,0,5,4,1};
        int array2[] = {1,9,3,-8,0,5,4,1};
        int array3[] = array2;
        array1[1]=0;
        array2[5-3]=3;


        System.out.println(array1.equals(array2));

    }
}
