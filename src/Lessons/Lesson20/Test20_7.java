package Lessons.Lesson20;

import java.util.Arrays;

public class Test20_7 {
    public static void main(String[] args) {

        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {1, 2, 3, 5};

        char [] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char [] array4 = {'p', 'r', 'i', 'v', 'i', 'v','k','a'};

        System.out.println(Arrays.compare(array1,array2));//Sravnenie massivov
        System.out.println(Arrays.compare(array3,array4));


    }
}
