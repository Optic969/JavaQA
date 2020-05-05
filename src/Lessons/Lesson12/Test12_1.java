package Lessons.Lesson12;

public class Test12_1 {

    void maximum(int i1,int i2,int i3){
        if (i1>i2 && i1>i3) {
            int a=5;// локальные перременные можно определять внутри if заявления. Живет только внутри объявленных скобок
            System.out.println("Maximum: " + i1);
        }
            else if(i2>i1 && i2>i3) {
            System.out.println("Maximum: " + i2);
        }
            else {
            System.out.println("Maximum: " + i3);
        }

    }



    public static void main(String[] args) {
        Test12_1 tt1 = new Test12_1();
        int i1=10;
        int i2=9;
        int i3=8;
        int a = 30;
        int b = 21;
        boolean c=true;
        int max = (a>b)?a:b;//Ternary operator для сравнения

        tt1.maximum(3,5,6);

        if (a==1){
            System.out.println("hey");
        }

        if (a < 20)   //Если при if больше одного действия необходимы фигурные скобки
            System.out.println("a menshe 20");
        else {   //Если при else больше одного действия необходимы фигурные скобки
            System.out.println("a bolshe 20");
            System.out.println("Privet vsem");
        }


        if (b == 30) {
            System.out.println("b = 30");
        }
        else if (b < 20 && c==false ) {
            System.out.println("b<20");
        }
        else if (b < 30) {
            System.out.println("b<30");
        }
        else {

            System.out.println("b bolshe 30");
        }
    }
}
