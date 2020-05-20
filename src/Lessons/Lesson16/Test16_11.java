package Lessons.Lesson16;

//isBlank
//isEmpty
// strip, stripLeading, stripTrailing

public class Test16_11 {
    public static void main(String[] args) {
        String s1 =  "privet";
        System.out.println(s1.isBlank());
        String s2 =  "       ";
        System.out.println(s2.isBlank());
        String s3 = "   ";
        System.out.println(s3.isEmpty());
        String s4 = "     privet     ";
        System.out.println(s4.stripTrailing());
        String s5 = "poka";
        String s6 = s5.strip();
    }
}
