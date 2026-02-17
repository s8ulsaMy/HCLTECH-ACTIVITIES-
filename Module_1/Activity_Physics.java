import static java.lang.Math.*;   // for power

interface PhysicalConstants {

    double C = 299792458;
    double G = 6.67428E-11;
    double g = 9.80665;
}

public class Activity_Physics implements PhysicalConstants {

    double energy(double m) {
        return m * pow(C, 2);
    }

    double force(double m1, double m2, double r) {
        return G * m1 * m2 / pow(r, 2);
    }

    double distance(double t) {
        return 0.5 * g * pow(t, 2);
    }

    public static void main(String[] args) {

        Activity_Physics obj = new Activity_Physics();

        System.out.println("Energy = " + obj.energy(10));
        System.out.println("Force = " + obj.force(5, 6, 2));
        System.out.println("Distance = " + obj.distance(3));
    }
}
