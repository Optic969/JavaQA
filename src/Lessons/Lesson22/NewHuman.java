package Lessons.Lesson22;

public class NewHuman {
    public String name="Kolija";
    public static int salary = 150;

   /* public NewHuman(String name) {
        this.name = name;
    }*/

    void work(){
        System.out.println("Work");
    }
    static void rest(){
        System.out.println("Rest");
    }
}
class Student extends NewHuman{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.salary);
        student.work();
        Student.rest();
    }

}
