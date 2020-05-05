package Lessons.Lesson6;

public class Employee {
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

    Employee(int id2, int age2, String surname2){
        this(id2,"Ivan",22,0,null );

//this и кол-во параметров указывает какой метод для компилятора будет подходящим
// и производит вызов overload constructor в другом конструкторе

    }
    public Employee(String surname3, int age3){
        surname=surname3;
        age=age3;
    }
//Используется правило Overloading для конструкторов

    int yvelichrnieZarplat(){
        int novajaZarplata= this.salary*2;
        return novajaZarplata;

    }


}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Inan",45,1000,"QA");
        Employee employee2 = new Employee(2,"Oleg",30,3000,"Dev");
        Employee employee3 = new Employee(3,22,"Egor");
        System.out.println("Новая зарплата: "+ employee1.yvelichrnieZarplat());
        System.out.println("Новая зарплата: "+ employee2.yvelichrnieZarplat());
    }
}



