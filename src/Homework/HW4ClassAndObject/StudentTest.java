package Homework.HW4ClassAndObject;

public class StudentTest {
    public static void main(String[] args) {

        Student studen1 = new Student(100,"Ivanov","Ivanov",1995,6,8,9);
        Student studen2 = new Student(200,"Ivanov","Petrov",1996,6,8,4);
        Student studen3 = new Student(300,"Ivanov","Sidarov",1997,6,8,2);

       // studen1.StudentTiket=2;
       // studen1.Name="Sasha";
       // studen1.SecondName="Ivanov";
       // studen1.Year=1990;
        //studen1.AVGMathematic=5;
       // studen1.AVGEconomic=4;
       // studen1.AVGEnglish=6;

       // studen2.StudentTiket=2;
       // studen2.Name="Sasha";
       // studen2.SecondName="Ivanov";
       // studen2.Year=1990;
        //studen2.AVGMathematic=5;
        //studen2.AVGEconomic=4;
       // studen2.AVGEnglish=6;

        //studen3.StudentTiket=2;
       // studen3.Name="Sasha";
       // studen3.SecondName="Ivanov";
       // studen3.Year=1990;
       // studen3.AVGMathematic=5;
       // studen3.AVGEconomic=4;
       // studen3.AVGEnglish=6;

        System.out.println("Средняя оценка по всем предметам для студента "+ studen1.SecondName + " равна = "+(studen1.AVGEnglish+studen1.AVGEconomic+studen1.AVGMathematic)/3);
        System.out.println("Средняя оценка по всем предметам для студента "+ studen2.SecondName + " равна = "+(studen2.AVGEnglish+studen2.AVGEconomic+studen2.AVGMathematic)/3);
        System.out.println("Средняя оценка по всем предметам для студента "+ studen3.SecondName + " равна = "+(studen3.AVGEnglish+studen3.AVGEconomic+studen3.AVGMathematic)/3);
    }


}
    class Student {
    int StudentTiket;
    String Name;
    String SecondName;
    int Year;
    double AVGMathematic;
    double AVGEconomic;
    double AVGEnglish;

    public Student(int StudentTiket,String Name,String SecondName, int Year,double AVGMathematic,double AVGEconomic,double AVGEnglish){
        this.StudentTiket=StudentTiket;
        this.Name=Name;
        this.SecondName=SecondName;
        this.Year=Year;
        this.AVGMathematic=AVGMathematic;
        this.AVGEconomic=AVGEconomic;
        this.AVGEnglish=AVGEnglish;
    }


    }