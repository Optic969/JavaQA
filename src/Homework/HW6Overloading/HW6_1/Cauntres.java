package Homework.HW6Overloading.HW6_1;

public class Cauntres {

    int sumCautress(int a,int b,int c,int d, int e){
        int sumOfFive=a+b+c+d+e;
        System.out.println("Summa chisel ravna: " + sumOfFive);
        return sumOfFive;

    }
    int sumCautress(int a,int b, int c, int d){
        int sumOfFour=a+b+c+d;
        System.out.println("Summa chisel ravna: " + sumOfFour);
        return sumOfFour;

    }
    int sumCautress(int a,int b, int c){
        int sumOfThree=a+b+c;
        System.out.println("Summa chisel ravna: " + sumOfThree);
        return sumOfThree;

    }

    int sumCautress(int a,int b){
        int sumOfTwo=a+b;
        System.out.println("Summa chisel ravna: " + sumOfTwo);
        return sumOfTwo;

    }
    int sumCautress(int a){
        int sumOfOne=a;
        System.out.println("Summa chisel ravna: " + sumOfOne);
        return sumOfOne;

    }

    int sumCautress(){
        int sumOfZero=0;
        System.out.println("Summa chisel ravna: " + sumOfZero);
        return sumOfZero;

    }


}

class CauntresTest {
    public static void main(String[] args) {
        Cauntres ct = new Cauntres();
        ct.sumCautress(2,4);
    }
}