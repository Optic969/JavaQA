package Lesson8;

public class Test81 {
    public final int a=1;

   // Test81(){
    //    a=10;
   // }
  //  Test81(boolean b){
   //     a=15;
  //  }

    public void abc(final short s){
       final byte b;
       b=10;
      // s++
       System.out.println(s+b);
    }

    //Для локальных переменных при приминении
    // моддификатора final можно передовать после объявления
    //Для переменных экземпляра (instance variables) или сразу или в конструкторе
    public static void main(String[] args) {
        Test81 t = new Test81();
        //t.a=t.a*2;
        //t.a=10;
        System.out.println(t.a);
    }
}


