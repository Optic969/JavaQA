package Lesson5;

public class Test5 {
    int sum(int a, int b, int c) {

        int result = a + b + c;
        String s = "Hello";
        return result;
    }

    int sredneeArifm(int a1, int b1, int c1) {
    int result2 = sum(a1, b1, c1)/3;
    return result2;

    }
}

    class Test51 {
       public static void main(String[] args) {
           Test5 t = new Test5();
           int summaTrexChisel=t.sum(1,2,3 );
           System.out.println(summaTrexChisel);
           System.out.println(t.sum(5,4,9));
           System.out.println(t.sredneeArifm(20,40,60));
       }
   }


