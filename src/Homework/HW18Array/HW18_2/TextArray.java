package Homework.HW18Array.HW18_2;

import java.util.*;

public class TextArray {

    public static void showArray(String[][] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++){
                if (j !=arr[i].length -1){
                    System.out.print(arr[i][j] + ", ");
                } else {
                    System.out.print(arr[i][j]);
                }

            }
            if (i != arr.length -1){
                System.out.print("}, ");
            }else {
                System.out.print("}");
            }
        }
        System.out.println(" }");



    }


    public static void main(String[] args) {

        String [][] array1;
        array1 = new String[3][12];
        array1[0][0]="privet";
        array1[0][1]="drug";
        array1[1][10]="Jora";
        array1[2][11]="dorogoi";
        String array [][] = {{"apple", "orange"}, {"hello","bye","ok"}, {"car"}};
        showArray(array);
        //System.out.println(Arrays.deepToString(array1));
        //TextArrayTest.showArray(array1);


    }

}
/*class TextArrayTest {

    public static void showArray(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {  //идём по строкам
            for (int j = 0; j < arr.length; j++) {//идём по столбцам
                System.out.println(arr[i][j] + " "); //вывод элемента
            }
            System.out.println();
        }
    }
}*/