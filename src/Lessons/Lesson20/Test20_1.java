package Lessons.Lesson20;

import java.util.ArrayList;

public class Test20_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list1 = new ArrayList<>();//sozdanije ArrayList tolko dlja dannix type String
        list1.add("poka");
        ArrayList<StringBuilder> list2 = new ArrayList<>(20);
        list2.add(new StringBuilder("ok"));
        ArrayList<String> list3 = new ArrayList<>(list1);
        System.out.println(list1==list3);
    }

}


class Car{}
class Student{}
