package Lab01.Ejer2;
import java.util.Scanner;
public class EstadisticaModular {
    public static float promedio(float[] numeros) {
        float suma = 0;
        for (float num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static float desviacion(float[] numeros, float promedio) {
        float suma = 0;
        for (float num : numeros) {
            suma += Math.pow(num - promedio, 2);
        }
        return (float) Math.sqrt(suma / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] numeros = new float[10];

        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextFloat();
        }

        float promedio = promedio(numeros);
        float desviacion = desviacion(numeros, promedio);

        System.out.println("El promedio es " + promedio);
        System.out.println("La desviación estándar es " + desviacion);

        sc.close();
    }
}