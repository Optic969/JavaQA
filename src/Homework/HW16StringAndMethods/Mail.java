package Homework.HW16StringAndMethods;

public class Mail {

public void emailSend(String str) {

    /*for (int i = 0; i < mail.length(); ++i) {
        char c1 = mail.charAt(i);
        if (c1 != '.') {
            System.out.print(c1);}
            else   {

                    break;
            }
        }*/
    //String tmp;
    //System.out.println((tmp = str.substring(0, str.lastIndexOf('@'))).substring(tmp.lastIndexOf('.') + 1));//

    int a = 0; // @
    int b=0; //  .
    int c=0; //  ;
    while (c < str.length() -1 ) {

        a = str.indexOf('@', c);
        b = str.indexOf('.', c);
        c = str.indexOf(';', c+1);
        System.out.println(str.substring(a+1,b));
    }


}

    public static void main(String[] args) {
    Mail mail = new Mail();
        mail.emailSend("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}
