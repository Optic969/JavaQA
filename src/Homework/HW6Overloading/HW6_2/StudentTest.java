package Homework.HW6Overloading.HW6_2;

public class StudentTest {
    public static void main(String[] args) {

        Student studen1 = new Student(100,"Ivan","Ivanov","Fizika",6,8,9);
        Student studen2 = new Student(200,"Fedor","Petrov","Mathemathic",6,8,4);
        Student studen3 = new Student(300,"Sasha","Sidarov","Geografy",6,8,2);
        Student student4 = new Student(350,"Oleg","Zulin","Philosophy");
        Student student5 = new Student();


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

        //System.out.println("Средняя оценка по всем предметам для студента "+ studen1.SecondName + " равна = "+(studen1.AVGEnglish+studen1.AVGEconomic+studen1.AVGMathematic)/3);
        //System.out.println("Средняя оценка по всем предметам для студента "+ studen2.SecondName + " равна = "+(studen2.AVGEnglish+studen2.AVGEconomic+studen2.AVGMathematic)/3);
        //System.out.println("Средняя оценка по всем предметам для студента "+ studen3.SecondName + " равна = "+(studen3.AVGEnglish+studen3.AVGEconomic+studen3.AVGMathematic)/3);
        //System.out.println("Средняя оценка по всем предметам для студента "+ studen1.SecondName + " равна = "+studen1.podschetAVGMark());
        //System.out.println("Средняя оценка по всем предметам для студента "+ studen2.SecondName + " равна = "+studen2.podschetAVGMark());
        //System.out.println("Средняя оценка по всем предметам для студента "+ studen3.SecondName + " равна = "+studen3.podschetAVGMark());
        studen1.podschetAVGMark();
        studen1.info();
        student4.info();
        student5.info();

    }


}

class Student {
int StudentTiket;
String Name;
String SecondName;
String Course;
double AVGMathematic;
double AVGEconomic;
double AVGEnglish;


Student(int StudentTiket,String Name,String SecondName, String course,double AVGMathematic,double AVGEconomic,double AVGEnglish){
    this.StudentTiket=StudentTiket;
    this.Name=Name;
    this.SecondName=SecondName;
    this.Course=course;
    this.AVGMathematic=AVGMathematic;
    this.AVGEconomic=AVGEconomic;
    this.AVGEnglish=AVGEnglish;

}
Student(int StudentTiket1,String Name2,String SecondName2,String course1){
    this(StudentTiket1,Name2,SecondName2,course1,0.0,0.0,0.0);
}
Student(){
    this(0,null,null,null,0.0,0.0,0.0);
}

double podschetAVGMark(){
   double srednajaOcenka= (this.AVGMathematic + this.AVGEconomic + this.AVGEnglish)/3;
    System.out.println("Средняя оценка по всем предметам для студента "+ this.Name + " " + this.SecondName + " равна = "+ srednajaOcenka);
   return srednajaOcenka;
}
void info(){
    System.out.println("Nomer studencheskogo bileta: " + StudentTiket+ "; " + "Imja: " +Name+"; " + "Familija: " + SecondName+"; "+ "Nazvanije cursa: " +Course+"; "+ "Srednaja ocenka po matematice: " + AVGMathematic + "; " + "Srednaja ocenka po economoke: "+AVGEconomic+"; "+ "Srednaja ocenka po anglijskomu: "+AVGEnglish);
}


}