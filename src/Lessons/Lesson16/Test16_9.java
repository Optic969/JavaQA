package Lessons.Lesson16;

public class Test16_9 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println();
        String s3="privet";
        String s4="privet";
        System.out.println(s3==s4);
        System.out.println(s1!=s4);

        String s5 = "Kak dela?";
        String s6 = "kak dela?";
        System.out.println(s5.equalsIgnoreCase(s6));



    }
}
