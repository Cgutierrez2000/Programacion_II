package Lab01.Ejer2;
import java.util.Scanner;

public class Estadisticas {
    private float[] numeros;

    public Estadisticas(float[] numeros) {
        this.numeros = numeros;
    }

    public float getPromedio() {
        float suma = 0;
        for (float num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public float getDesviacion() {
        float promedio = getPromedio();
        float suma = 0;
        for (float num : numeros) {
            suma += Math.pow(num - promedio, 2);
        }
        return (float) Math.sqrt(suma / (numeros.length - 1));
    }

    public void mostrarEstadisticas() {
        System.out.println("El promedio es " + getPromedio());
        System.out.println("La desviación estándar es " + getDesviacion());
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] numeros = new float[10];

        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextFloat();
        }

        Estadisticas est = new Estadisticas(numeros);
        est.mostrarEstadisticas();

        sc.close();
    }
}
