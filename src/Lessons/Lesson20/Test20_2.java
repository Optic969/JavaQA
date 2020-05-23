package Lessons.Lesson20;

import java.util.ArrayList;

public class Test20_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"Hello");
        for (String s:list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(2));
        System.out.println();
        list.set(1,"!!!");
        for (String s:list){
            System.out.print(s + " ");
        }


    }
}
