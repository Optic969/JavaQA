package Homework.HW15DoWhileLoop;

public class Time {
    public static void showTime() {

        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            //System.out.println("Nachalo outer loopa");
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int secunda = 0;
                INNER:
                while (secunda < 60) {
                    if (secunda + hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + " : " + minute + " : " + secunda);
                    ++secunda;
                }

            }
            while (minute < 59);
            hour++;

        }
    }


    public static void main(String[] args) {

        showTime();
    }
}