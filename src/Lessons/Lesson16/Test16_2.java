package Lessons.Lesson16;

public class Test16_2 {

    public static void main(String[] args) {
        String s1 = new String(" privetat");

        String s2 = s1.substring(3);//adding a part of String too new String variables with using index
        System.out.println(s2);
        System.out.println(s1);

        String s3 = s1.substring(2,5);//adding a part of String too new String variables with using two index
        System.out.println(s3);

        String s4 = s1.trim();// need for decline a space on a start and finish of string
        System.out.println(s4);

        String s5 = s1.replace("r","z");//replace old char on new char
        System.out.println(s5);

        String s6 = s1.replace("pri","uli");//replace old String on new String(never String on char)
        System.out.println(s6);

        String s7 = "privet";
        String s8 = "drug";
        System.out.println(s7.concat(s8));






    }



}
