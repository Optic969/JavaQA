package Homework.HW20ArrayList;

import java.util.*;

public class Array {
    public static void abc(String s1,String s2,String s3,String s4,String s5){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        //Collections.sort(list1);
        list1= new ArrayList<String>(new LinkedHashSet<String>(list1));
        System.out.println(list1);
    }

    public static void main(String[] args) {
         String s1 = "a";
         String s2 = "a";
         String s3 = "b";
         String s4 = "c";
         String s5 = "c";
         abc(s1,s2,s3,s4,s5);
    }

}
