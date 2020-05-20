package Lessons.Lesson16;

public class Test16_1 {

    public static void main(String[] args) {
        String s1 = new String("privetat");

        int a = s1.length();//long s1
        System.out.println(a);

        char c1 = s1.charAt(3);//output a simbol using them idex number
        System.out.println(c1);

        int i1 = s1.indexOf("t");//output a index using them letter
        System.out.println(i1);

        int i2 = s1.indexOf("vet");//output a index using them letter
        System.out.println(i2);

        int i3 = s1.indexOf("Z");//output a index then a letter not found
        System.out.println(i3);

        int i4 = s1.indexOf("t",2 );//output a index using them letter and index of another letter
        System.out.println(i4);

        boolean b1 = s1.startsWith("abc");//true or false about a start of String
        System.out.println(b1);

        boolean b2 = s1.startsWith("ive",2);//true or false about a start of String, for start use a index
        System.out.println(b2);

        boolean b3 = s1.endsWith("rivetat");//true or false about a end of String, use only String, but not a char
        System.out.println(b3);

    }

}
