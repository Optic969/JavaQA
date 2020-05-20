package Lessons.Lesson18;

public class Test18_1 {
    public static void main(String[] args) {
        int [] array1;// iznachalno ssilaensia na null
        String [] array2;//declaraction
        double [][] array3;
        int [][] array4;
        double [] array5;
        double [] array7;


        array1 = new int[8];
        array2 = new String[3];//allocation
        array3 = new double[4][2];
        array4 = new int[3][];
        array5 = new double[2];
        array7 = new double[2];

        System.out.println(array2.length);

        array2[0] = "privet";
        array2[1] = "poka";//initialization
        array2[2] = "ok";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        array5[0] = 2.5;
        array5[1] = 3.5;
        array7=array5;
        array3[1] = array5;

        System.out.println(array3[1][0]);



    }
}
