package Lessons.Lesson11;

public class Employee {
public String name;
public double salary;

Employee(String name, double salary){
    this.name=name;
    this.salary=salary;
}

public double zp2(){ //
    salary=salary*2;
    return salary;
}

public double unelichitel(double a){ // Исползуя примитивный тип данных как параметр. Используется только данные, а не сама переменная
    a=a*2;
    return a;
}

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Inan",100.55);
        double d = emp1.unelichitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}
