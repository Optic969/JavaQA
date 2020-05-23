package Lessons.Lesson20;
import java.util.ArrayList;

public class Test20_3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new  StringBuilder("hello");
        StringBuilder sb2 = new  StringBuilder("ok");
        StringBuilder sb3 = new  StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i =0;i<list.size();i++){
            list.get(i).append("!!!");
        }
        for (StringBuilder sb:list){
            System.out.println(sb+" ");
        }
        System.out.println();
        list.remove(2);
        for (StringBuilder sb:list){
            System.out.println(sb+" ");
        }
        System.out.println();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add(new String("Petrov"));
        list1.add(new String("Petrov"));
        list2.add(new String("Ivan"));
        list2.add(new String("Jora"));

        list1.addAll(1,list2);//dobavlenie objektov lista k drugomu
        for (String s:list1){
            System.out.println(s+" ");
        }
        System.out.println();
        list.clear();//ochistka lista
        for (StringBuilder sb:list){
            System.out.println(sb+" ");
        }




    }

}
