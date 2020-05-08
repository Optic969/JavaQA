package Lessons.Lesson14;

public class Test14_5 {
    public void time() {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loopa");

            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
                if (minuta == 30) {
                    break OUTER;
                }
                    //if (minuta == 22) {
                        //break;
                    //}
                }

            }
        System.out.println("konec outer loopa");

            }



        public static void main (String[]args){
            Test14_5 t = new Test14_5();
            t.time();
        }

}

