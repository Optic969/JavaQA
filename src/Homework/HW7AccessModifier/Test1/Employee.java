package Homework.HW7AccessModifier.Test1;

public class Employee {
    public int id;
    public String surname;
    int age;
    double salary;
    String departament;

public Employee (int id){
        this.id=id;
}
Employee (String surname){
    this.surname=surname;
}
Employee (double salary){
    this.salary=salary;

}


        public void showSalary (){
            System.out.println(salary);
        }
        public void showSurname (){
            System.out.println(surname);
        }
        public void showId (){
            System.out.println(id);
        }


    }


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(2);
        Employee emp2 = new Employee(2.5);
        emp1.showId();
        emp2.showSalary();
        System.out.println(emp2.salary);

    }
}
