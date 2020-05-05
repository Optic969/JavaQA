package Lessons.Lesson3;

public class Test34 {
    public static void main(String[] args) {

        int a=10;
        int b=50;
        int c=99;
        int d=100;

        boolean e = a>b & ++c==d;//&& если первое false
        // дальше не проверяет & проверяет все условия
        // || | работает с числами ^ срабатывает(true) если в условии только
        //одна аперанда true



        System.out.println(e);
        System.out.println(c);


    }
}
