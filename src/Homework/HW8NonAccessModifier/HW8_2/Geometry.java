package Homework.HW8NonAccessModifier.HW8_2;

public class Geometry {
    static final double pi = 3.14;

    public double buildCircle(double rad1) {
        double ploshad = pi * rad1 * rad1;
        return ploshad;
    }

    public static double podschetOkr(double rad2) {
        double dlina_okr = 2 * pi * rad2;
        return dlina_okr;
    }

    public void getInfo(double rad3) {
        System.out.println("Radius raven: " + rad3 + " Ploshad kruga rovna: " + buildCircle(rad3) + " Dlinna okrujnosti rovna: " + podschetOkr(rad3));
    }

}
class GeometryTest{
    public static void main(String[] args) {
        Geometry geo = new Geometry();
        System.out.println("Ploshad kruga rovna: " + geo.buildCircle(6));
        System.out.println("Ploshad kruga rovna: "+ Geometry.podschetOkr(4));
        geo.getInfo(5);
    }
}

