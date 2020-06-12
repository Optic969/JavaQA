package Lessons.Lesson22;

public class Human {
    final String sex;

    public Human(String sex) {
        this.sex = sex;
    }
    private String name;
    private int age;
    private int weight;
    private boolean clever;

    public boolean isClever (){
        return clever;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0){
            this.age=age;
        }
        //else{
            //System.out.println("Age is incorrect");
        //}

    }

    public void setWeight(int weight) {
        if(weight>0){
            this.weight=weight;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Human human = new Human("male");
        human.setName("Petr");
        human.setAge(12);
        human.setWeight(50);
        System.out.println(human.getAge());
        System.out.println(human.getName());
        System.out.println(human.getWeight());
        human.setWeight(-50);
        System.out.println(human.getWeight());
    }

}
