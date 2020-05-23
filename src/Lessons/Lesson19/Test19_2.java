package Lessons.Lesson19;

public class Test19_2 {
    /*static void summa(int a, int b){
        System.out.println(a+b);
    }
    static void summa(int a, int b,int c){
        System.out.println(a+b+c);
    }
    static void summa(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }*/
    //or
    static void summa(int ... a){//varargs mojno peredat beskonechno mnogo parametrov
        int summa = 0;
        for (int i=0;i<a.length;i++){
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(0,5,78,9);
        summa(new int[]{1,3,4});
    }

}
