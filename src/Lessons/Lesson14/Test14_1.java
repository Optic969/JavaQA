package Lessons.Lesson14;

public class Test14_1 {

    public static void main(String[] args) {
        /*
        * int i = 1;
        * for (; i<=10; i++)  variant zapisi
        * for (int i=1; i<=10 && i>-3; i++) cikl for prinemaet bulevi znachenija
        * for (int i=1; i<=10 && i>-3; i++ j=j+20,k+k+10 perechislenie v for
        * */

        for (int i=1; i<=10; i++,abc(6)){//esli net i<=10(yslovia) to otvet vsegda true
            System.out.println(i);
        }

    }
    static void abc(int n){
        System.out.println(n);
    }

}
