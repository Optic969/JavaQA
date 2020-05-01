package Homework.HW8NonAccessModifier.HW81;

public class Operation {
//static int a;
//static int b;
//static int c;

    public static int multiplicationNumbers(int a, int b,int c) {

    int mult =a*b*c ;
       // System.out.println(mult);
        return mult;
    }
    public static void divisionNumbers(int a1, int b1){
        //double div = a1/b2;
        System.out.println("Celaja chast: " +a1/b1 + " Ostatok: " + a1 % b1);
    }
}

  class OperationTest {
     public static void main(String[] args) {
         System.out.println(Operation.multiplicationNumbers(2,3,5));
         System.out.println(Operation.multiplicationNumbers(4,3,2));
         Operation.divisionNumbers(50,9);
         Operation.divisionNumbers(33,5);
     }

}
