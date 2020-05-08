package Lessons.Lesson13;

public class Employee {

    public static void main(String[] args) {
        int denNedeli = 1;
        //switch prinemaet tipi dannih byte,short,int,char,String
        switch ("sreda"){
            /*case "ponedelnik": System.out.println("Rabota do 18 00");
                break;//zakanchivaet vipolnenie case, esli ubrat to vipolnit vse posledushie case do break ili do default
            case "vtornik": System.out.println("Rabota do 18 00");
                break;
            case "sreda": System.out.println("Rabota do 18 00");
                break;
            case "chetverg":  System.out.println("Rabota do 18 00");
                break;
            case "piatnica": System.out.println("Rabota do 18 00");
            break;*/

           /** cod vishe mojno sokratitsja putem udalenija break togda
            proizajdet dalnejshee prohojdenie po codu do break,
            gde rezultat odinakov dlja uslovij vishe**/
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "piatnica": System.out.println("Rabota do 18 00");
                break;
            case "subbota": System.out.println("Rabota do 14 00");
                break;
            case "voskresenje": System.out.println("Vihodnoj");
                break;
            default: System.out.println("Den ukazan neverno");

        }
    }

}
