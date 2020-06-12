package Homework.HW21EncapsulationInheritance.Test2;
import Homework.HW21EncapsulationInheritance.Test2.Animal;

public class Pet extends Animal {
     String name;
     final int tail = 1;
     final int paw = 4;

    public Pet() {
        eyes=2;
        System.out.println("I am pet");
    }
    public void run(){
        System.out.println("Run pets");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }
}
