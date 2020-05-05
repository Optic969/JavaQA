package Homework.HW9VariablesAccessMod.HW92;

public class Test1 {
    int a=1;
    static int b=2;

    void abc(int a){
        System.out.println(a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}
