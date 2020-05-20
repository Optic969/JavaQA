package Homework.HW17StringBuilder;

public class StringComparison {

    public static boolean comparsionNew(StringBuilder sb,StringBuilder sb2){
        if (sb.toString().equals(sb2.toString())){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("TestTTT");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Test");
        System.out.println(StringComparison.comparsionNew(sb,sb2));
        System.out.println(StringComparison.comparsionNew(new StringBuilder(""),new StringBuilder("")));
        System.out.println(StringComparison.comparsionNew(new StringBuilder(),new StringBuilder()));
        //System.out.println(sb.toString().equals(sb2.toString()));

    }
}
