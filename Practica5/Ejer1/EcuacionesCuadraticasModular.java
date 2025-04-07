package Lab01.Ejer1;
import java.util.Scanner;

public class EcuacionesCuadraticasModular {
    public static double getDiscriminante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double getRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminante = getDiscriminante(a, b, c);

        if (discriminante > 0) {
            double r1 = getRaiz1(a, b, discriminante);
            double r2 = getRaiz2(a, b, discriminante);
            System.out.println("La ecuación tiene dos raíces " + r1 + " y " + r2);
        } else if (discriminante == 0) {
            double r = getRaiz1(a, b, discriminante);
            System.out.println("La ecuación tiene una raíz " + r);
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        sc.close();
    }
}
