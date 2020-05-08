package Lessons.Lesson13;

public class Test13_1 {


}


class Student{
    int grade;

    Student(int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        /*if (st1.grade==2){
            System.out.println("Student dvoeshnik");
        }
        else if(st1.grade==3){
            System.out.println("Student troeshnik");
        }
        else if(st1.grade==4){
            System.out.println("Student horoshist");
        }
        else if(st1.grade==5){
            System.out.println("Student otlichnik");
        }
        else {
            System.out.println("Ocenka nevernaja");
        }*/

        //cod vishe no s ispolzovaniem flow statement "switch"
        switch (st1.grade){
            case 2: System.out.println("Student dvoeshnik");
            break;//zakanchivaet vipolnenie case, esli ubrat to vipolnit vse posledushie case do break ili do default
            case 3: System.out.println("Student troeshnik");
            break;
            case 4: System.out.println("Student horoshist");
            break;
            case 5:  System.out.println("Student otlichnik");
            break;
            default: System.out.println("Ocenka nevernaja");

        }
    }

}