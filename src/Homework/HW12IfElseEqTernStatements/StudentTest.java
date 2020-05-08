package Homework.HW12IfElseEqTernStatements;
import Lessons.Lesson11.Student;

public class StudentTest {

    public static void sravnenieStudentov( Student s1,Student s2) {
        if (s1.name==s2.name && s1.course==s2.course && s1.grade==s2.grade ) {
            System.out.println("Sootvetstvet");
        }
        else {
            System.out.println("Nesootvetstvuet");
        }

    }
    public static void sravnenieStudentov2(Student s1,Student s2){
        if(s1.name==s2.name){
            if (s1.course==s2.course){
                if (s1.grade==s2.grade){
                    System.out.println("Stydents ravni");}
                else {
                    System.out.println("Imena i curs sootvetstvyet a ocenka net");
                }
            }
            else{
                    System.out.println("Imena sootvetstvyet a cursi net");
                }
        }else
            {System.out.println("Imena otlichaytsja");
                }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Petr",1,1);
        Student st2 = new Student("Petr",1,1);
        //sravnenieStudentov(st1,st2);
        sravnenieStudentov2(st1,st2);

    }
}

