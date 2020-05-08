package Homework.HW13Switch;

public class Month {
    int monthCount;


    public static void dayQuantity(int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Kolichestvo dney 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Kolichestvo dney 30");
                break;
            case 2:
                System.out.println("Kolichestvo dney 28");
                break;
            default:
                System.out.println("Number of month is wrong");
        }
    }

    public static void main(String[] args) {

        dayQuantity(1);
    }

}
