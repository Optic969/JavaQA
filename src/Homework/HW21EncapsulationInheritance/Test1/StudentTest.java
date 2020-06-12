package Homework.HW21EncapsulationInheritance.Test1;

public class StudentTest extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Iva");
        student.setCourse(3);
        student.setGrade(11);
        System.out.println(" "+student);
        System.out.println(student.getName());


    }

}
