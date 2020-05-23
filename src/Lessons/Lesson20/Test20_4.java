package Lessons.Lesson20;

import java.util.ArrayList;

public class Test20_4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new  StringBuilder("hello");
        StringBuilder sb2 = new  StringBuilder("ok");
        StringBuilder sb3 = new  StringBuilder("privet");
        StringBuilder sb4 = new  StringBuilder("poka");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);

        for (StringBuilder sb:list){
            System.out.println(sb+" ");
        }
        System.out.println(list.lastIndexOf("ok"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(sb1));
        System.out.println(list.toString());
    }
}
