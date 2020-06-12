package Lessons.Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test20_8 {
    public static void main(String[] args) {
        ArrayList <String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
        System.out.println("all = " + all);
        ArrayList <String> all1 = new ArrayList<>();
        all1.add("one");
        all1.add("two");
        all1.add("three");

         /*all.removeAll(all1);//Udalenie dannih odnogo massiva iz drugogo
        *all.retainAll(all1);//Sohranenie dannih iz odnogo massiva v drugoi(v nem ego dannie udalautsia)
        *boolean result = all.containsAll (all1);//bulevo opredelenie odinakovih massivov
        */
        System.out.println("all = " + all);
        List<String> sublist = all.subList(1, 4);//Vozvrashaet List
        System.out.println("sublist = " + sublist);

        Object[] array = all.toArray();//Preobrazovanie v massiv
        String[] array2 = all.toArray(new String[5]);

        List<String> list = List.of("odin", "dva", "tri");//Bistroe sozdanie i napolnenie List. Nelzija modificirovat



    }
}
