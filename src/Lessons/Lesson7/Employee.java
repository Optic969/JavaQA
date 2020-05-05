package Lessons.Lesson7;

public class Employee {
    public double salary;

     public void dvoynajaZP(){
          double result = salary*2;//является локальной переменной, на которую не распространяются модификаторы доступа
        System.out.println("Novaja ZP= " + result);
    }

     public Employee (double salary2){
        salary=salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynajaZP();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynajaZP();
    }
}
