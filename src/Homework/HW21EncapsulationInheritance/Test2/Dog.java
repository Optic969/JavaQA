package Homework.HW21EncapsulationInheritance.Test2;

public class Dog extends Pet {

    public Dog(String name) {
        System.out.println("I am dog and my name is: " + name);
    }
    public void play(){
        System.out.println("Dog plays");
    }
}
