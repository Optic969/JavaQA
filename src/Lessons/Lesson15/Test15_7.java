package Lessons.Lesson15;

public class Test15_7 {
    public static void main(String[] args) {
        int money = 0;

        do {   //minimim one times enter in to loop body
            System.out.println("Give a money");
            System.out.println("You lost");
            money-=10;
        }
        while (money>40);
    }
}
