package Homework.HW7AccessModifier.Test2;



public class EmployeeSecond {
    public static void main(String[] args) {
        Homework.HW7AccessModifier.Test1.Employee emp1 = new Homework.HW7AccessModifier.Test1.Employee(2);
        //Homework.HW7AccessModifier.Test1.Employee emp2 = new Homework.HW7AccessModifier.Test1.Employee("Ales");
        //Homework.HW7AccessModifier.Test1.Employee emp3 = new Homework.HW7AccessModifier.Test1.Employee(2.4);

        emp1.showId();
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
    }
}
