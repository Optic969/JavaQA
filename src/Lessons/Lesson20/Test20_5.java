package Lessons.Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test20_5 {
    public static void main(String[] args) {

            ArrayList<StringBuilder> list = new ArrayList<>();
            StringBuilder sb1 = new StringBuilder("A");
            StringBuilder sb2 = new StringBuilder("B");
            StringBuilder sb3 = new StringBuilder("C");
            StringBuilder sb4 = new StringBuilder("D");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);
        /*ArrayList<StringBuilder> list3 = list;//klonirovanie objectov
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();
        System.out.println(list2.get(0)==list3.get(0));*/
        /*Object [] array1 = list.toArray();
        for (Object o:list){
            System.out.println(o);
        }*/
        StringBuilder[] array = {sb2,sb3,sb3,sb4};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
        array[0]=new StringBuilder("!!!!");
        System.out.println(list8);

    }
}

