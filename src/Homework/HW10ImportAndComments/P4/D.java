package Homework.HW10ImportAndComments.P4;
import Homework.HW10ImportAndComments.P1.A;
import Homework.HW10ImportAndComments.P1.P2.B;
import Homework.HW10ImportAndComments.P1.P2.P3.C;
import Homework.HW10ImportAndComments.P4.P5.E;
import static Homework.HW10ImportAndComments.P1.P2.B.b;
import static Homework.HW10ImportAndComments.P1.P2.B.a;
public class D {
    int age=a;
    int haight=b;
    String name= B.c;

    D(int age, int haight, String name){

    }
    static void f(){
        int age=b;
    }


    public static void main(String[] args) {
        D d1 = new D(2,3,"2");
        System.out.println(d1.age);
        d1.f();
        System.out.println(d1.age+" and "+ d1.haight);
    }
}


