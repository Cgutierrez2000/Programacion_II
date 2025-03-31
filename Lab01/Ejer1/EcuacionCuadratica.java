package Lab01.Ejer1;
import java.util.Scanner;

public class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b + Math.sqrt(discriminante)) / (2 * a);
        }
        return Double.NaN;
    }

    public double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b - Math.sqrt(discriminante)) / (2 * a);
        }
        return Double.NaN;
    }

    public void solucion() {
        
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos raíces " + getRaiz1() + " y " + getRaiz2());
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una raíz " + getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        EcuacionCuadratica ec = new EcuacionCuadratica(a, b, c);

        ec.solucion();

        sc.close();
    }
}
}