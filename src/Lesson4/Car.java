package Lesson4;

public class Car {
    Car(String cvet, String motor) {
        color=cvet;
        engine=motor;
   }



    String color ;
    String engine;
    }

    class CarTest {
        public static void main(String[] args) {
            Car car1 = new Car("yellow","V4");
            System.out.println(car1.color);
            System.out.println(car1.engine);

            //int a=5;
            //Car car1 = new Car();
            //car1.color="black";
            //car1.engine="V8";
            //System.out.println("Cvet: "+ car1.color);
            //System.out.println("Motor: "+ car1.engine);
        }


    }

