package Lessons.Lesson12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount){
        this.engine=engine;
        this.doorCount=doorCount;
    }

}

class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car(1,5);
        Car c2 = new Car(2,6);

        if (c1.engine>c2.engine){
            if(c1.doorCount>c2.doorCount){
                System.out.println("Moshnost motora y mashini 1 i kolichestvo dverei bolshe ");}
            else{
                System.out.println("Moshnost motora y mashini 1 bolshe a kolichestvo dverei menshe ");}
        }
            else
                {
            System.out.println("Moshnost motora y mashini 1 menshe");}


    }
}
