package Lessons.Lesson16;

public class Test16_4 {
    int a;
}



class Employee{
    double salary;
    boolean isManager;

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}
class TestEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(100.5,true);

        System.out.println("Hi is manager ? "+emp.isManager+ " Him salary : " + emp.salary);
    }
}