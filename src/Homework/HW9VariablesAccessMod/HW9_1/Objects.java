package Homework.HW9VariablesAccessMod.HW9_1;

public class Objects {

    public static void abc(){
        String s1 = new String("111");
        String s2 = new String("222");
    }

}

class OjectTest{
    public static void main(String[] args) { Objects ob1 = new Objects();
       Objects.abc();
       Objects.abc();
       Objects.abc();
       String ss = new String("232323");


    }

}
