package Homework.HW11ParametrsInMethod;

   class Car {
     int dors;
     String color;
     String engine;

   public Car(int dors1,String color1,String engine1){
        dors=dors1;
        color=color1;
        engine=engine1;

    }

}

class CarTest{

       void changeDors(Car cars, int newdors){
       cars.dors = newdors;
    }

    public  void changeColors(Car c1,Car c2){//
       String carTemp = c1.color;
       c1.color=c2.color;
       c2.color=carTemp;

    }
    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car3 = new Car(4,"yellow","V4");
        Car car2 = new Car(3,"red","V6");
        System.out.println(car3.dors);
        ct.changeDors(car3,5);
        System.out.println(car3.dors);
        System.out.println(car3.color);
        ct.changeColors(car3,car2);
        System.out.println(car3 .color);
        System.out.println("Dors: "+car2.dors+" Color of cars: "+car2.color+" Engine: "+car2.engine);



    }



}

