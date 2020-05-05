package Lessons.Lesson8;

public class Student {
    String name;
    int course;
    static int count;//стала class variable,становиться общей для всех созданных объектов
    public static final int c=1;
    //константа пренадлежащая всему классу, сначала пишется access модификаторы
    //потом non-access модификаторы
    int a;

    public Student(String name2,int course2){
        count++;
        name=name2;
        course=course2;
        System.out.println("Student # "+ count + "sozdan");

    }

    public static void showCount(){
        System.out.println("Vsego sozdano studentov: " + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the student class");
    }
    void abc(){
        a++;
        count++;
    }
    static void abcd(){
        count++;
        Student st2 = new Student("Petr",2);
        st2.a++; //пример ошибки использования не static переменных в static методе
        //если она создается ранее чем объект в котором она существует
    }

//class StudentTest{
    public static void main(String[] args) {
        //Student st1= new Student("Ivan",1);
        //Student st2= new Student("Petr",2);
        //Student st3= new Student("Masha",4);

        //System.out.println(st1.name);
        //System.out.println(Student.count);//после применения static, вызов переменной происходит с обращением к классу
        //System.out.println();
        //Student.showCount();
        abcd();
        Student st3 = new Student("Ivan",4);
        st3.abc();//пример правильного применения
        //abc();//пример ошибки использования не static методов
        //если она вызываются ранее чем объект которому он пренадлежит



    }

}
