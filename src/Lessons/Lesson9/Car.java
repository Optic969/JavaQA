package Lessons.Lesson9;

public class Car {

    int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz=5;
    int _sdsd=10;
    int Z=5;
    int ___Z_232=3;

    String color;
    String engine;//Instance variable принадлежат каждому объекту
    static int count;//Static variable принадлежат всему классу

    public Car(String color2, String engine2){


        count++;
        color=color2;
        engine=engine2;
    }

    void abc(int a, int b){

    }
    void abcd(int a, int b){// применение одних и тех же переменных не приводит к конфликту, так они работаю только внутри методов

    }

    void changeColor1(String color){
        System.out.println(this.color);
    }

    public void showColor(){
        System.out.println("Cvet mashini: " + color);
        this.changeColor("red");
    }

    public void changeColor(String color3){ //Parametr переменная область видимости которой все тело метода
        System.out.println("Cvet mashini izmenilsja");
        int cena = 5000; //Local variable переменноые созданные внутри метода и видны только в нем
        color = color3;
        cena +=1000;
    }

    public static void main(String[] args) {
        Car car = new Car("red","V6");
        System.out.println(car.color);
        car.changeColor1("black");
        System.out.println(car.color);
    }

}


