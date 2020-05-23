package Lessons.Lesson20;

import java.util.*;

public class Test20_6 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        String s5 = "E";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s4);
        list1.add(s2);
        list1.add(s3);
        list1.add(s1);
        Collections.sort(list1);
        System.out.println(list1);

        Iterator <String> it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
