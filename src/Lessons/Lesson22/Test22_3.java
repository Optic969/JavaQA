package Lessons.Lesson22;

public class Test22_3 {
    void upSalary(Employee employee){
       employee.salary=employee.salary+100;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "Ivan";
        doctor.age = 50;
        doctor.experience=25;
        doctor.special = "Hirurg";
        doctor.eating();
        doctor.sleeping();
        doctor.healing();

    }
}
class Employee{
    String name;
    int age;
    int experience;
    double salary=100;
    void eating(){
        System.out.println("Eat food");
    }
    void sleeping(){
        System.out.println("Sleep");
    }
}

class Doctor extends Employee{
    String special;
    void healing(){
        System.out.println("Heal");
    }
}

class Hirurg extends Doctor{
    String skalpel;
    void operating(){
    }
}

class Teacher{
    int numberOfStudents;
    void teaching(){
        System.out.println("Teach");
    }
}
class Driver{
    String carNames;
    void driving(){
        System.out.println("Drive");
    }
}
