package Homework.HW5DeclaringAndCallingMethods.HW53;

 class Employee {
     int id;
     String surname;
     int age;
     int salary;
     String departament;

     Employee(int id1, String surname1,int age1,int salary1,String departament1){
         id=id1;
         surname=surname1;
         age=age1;
         salary=salary1;
         departament=departament1;
     }

     int yvelichrnieZarplat(){
         int novajaZarplata= this.salary*2;
         return novajaZarplata;

     }




}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Inan",45,1000,"QA");
        Employee employee2 = new Employee(2,"Oleg",30,3000,"Dev");
        System.out.println("Новая зарплата: "+ employee1.yvelichrnieZarplat());
        System.out.println("Новая зарплата: "+ employee2.yvelichrnieZarplat());
    }
}
