package Lessons.Lesson17;
class Car{}
public class Test17_1 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();//capacity 16
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);//vmestimost objekta
        StringBuilder sb4 = new StringBuilder(sb3);


        System.out.println(sb2.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf(" "));
        String s = sb2.substring(5);
        System.out.println(s);
        String s1 = sb2.substring(5,8);
        System.out.println(s1);

        System.out.println(sb2.subSequence(5,8));

        /*sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(new Car());
        System.out.println(sb2);*/

        System.out.println(sb2.insert(4,55));
        System.out.println(sb2.insert(sb2.length(),"Hello"));

        StringBuilder sb5 = new StringBuilder("Hello world");
 //       sb5.delete(3,6);
 //       System.out.println(sb5);
        sb5.deleteCharAt(6);
        sb5.reverse();
        System.out.println(sb5);
        StringBuilder sb6 = new StringBuilder("Vsem privet");
        sb6.replace(0,5,"Pete");
        System.out.println(sb6);
        System.out.println(sb6.capacity());


    }


}
