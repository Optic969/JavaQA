package Lessons.Lesson9;

public class Student {

}

class StudentTest{
    public static void main(String[] args) {
        Student st1= new Student();
        Student st2= new Student();
        Student st3;// нет обращения к конструктору и нет объекта
        String s = "privet"; //(String это класс) единственная возможность создать объект без обращения к конструктору
        st1= null;// мертвые объекты удаляет garbage collector сборщик мусора
    }
}
