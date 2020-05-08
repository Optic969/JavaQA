package Homework.HW14forOuterInner;

public class Time {

    public static void showTime() {
       OUTER:
       for (int hour = 0; hour <6; ++hour) {
           System.out.println("Nachalo outer loopa");
           MIDDLE:
           for (int minute = 0;minute < 60; minute++) {
               if (hour > 1 && minute % 10 == 0)  {
                   break OUTER;
               }
               INNER:
               for (int secunda=0;secunda<60; secunda++){
                   if (secunda+hour>minute){
                       continue MIDDLE;
                   }
                   System.out.println(hour + " : " + minute +" : " + secunda );
               }
           }
       }
    }

    public static void main(String[] args) {

        showTime();
    }
}


