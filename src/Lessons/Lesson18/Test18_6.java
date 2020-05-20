package Lessons.Lesson18;

public class Test18_6 {

    public static void maxMin(double [] array){
        double max=array[0];
        double min=array[0];

        for (int i=1;i<array.length;i++){

            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }

        }
        System.out.println("Minimal element of array: "+ min);
        System.out.println("Maximal element of array: "+ max);
    }

    public static void main(String[] args) {
        double [] array1 = {2.7,43,17,0.1};
        maxMin(array1);
    }

}
