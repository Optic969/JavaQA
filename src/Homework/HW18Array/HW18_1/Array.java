package Homework.HW18Array.HW18_1;

import java.util.*;


public class Array {

    static public void sortirovka(int [] arr){
        Arrays.sort(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int [] array1 = {2,4,7,1,3,9,8};
        sortirovka(array1);

    }
}
