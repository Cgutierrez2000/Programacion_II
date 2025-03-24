package Lab01.Ejer2;
import java.util.Scanner;
public class EstadisticaModular {
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double desviacion(double[] numeros, double promedio) {
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        double promedio = promedio(numeros);
        double desviacion = desviacion(numeros, promedio);

        System.out.println("El promedio es " + promedio);
        System.out.println("La desviación estándar es " + desviacion);

        sc.close();
    }
}
