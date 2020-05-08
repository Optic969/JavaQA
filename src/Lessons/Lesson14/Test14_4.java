package Lessons.Lesson14;

public class Test14_4 {
    public static void main(String[] args) {
        for (int i=1;i<=10; i++ ){
            if (i==7){
                break;//Loop statement prerivanije
            }
            System.out.print(i);
        }
        System.out.println();
        for (int a=1;a<=10; a++ ){
            if (a==7){
                continue;//Loop statement prodoljenie vipolneniha bez ispolzovanija koda cikla nije
            }
            System.out.print(a);
        }
        System.out.println();
        for (int b=1;b<=10; b++ ){
            if (b==7){
                continue;//Loop statement prerivanije
            }
            if (b%9==0){
                break;
            }
            System.out.print(b);
        }
    }
}
