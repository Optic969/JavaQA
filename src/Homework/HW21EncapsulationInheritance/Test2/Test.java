package Homework.HW21EncapsulationInheritance.Test2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bulka");
        System.out.println("Number of paw: " + dog.paw);
        Cat cat = new Cat("Pussy");
        cat.sleep();
    }
}
