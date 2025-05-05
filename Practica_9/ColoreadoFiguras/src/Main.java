import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = figuraAleatoria(5);
        mostrarFig(figuras);
    }

    public static Figura[] figuraAleatoria(int cantidad) {
        Figura[] figuras = new Figura[cantidad];
        Random rand = new Random();
        String[] colores = { "Cafe", "Magenta", "Naranja", "Rosa", "Celeste" };

        for (int i = 0; i < cantidad; i++) {
            String color = colores[rand.nextInt(colores.length)];
            boolean esCuadrado = rand.nextBoolean();

            if (esCuadrado) {
                double lado = 1 + rand.nextDouble() * 10;
                figuras[i] = new Cuadrado(color, lado);
            } else {
                double radio = 1 + rand.nextDouble() * 10;
                figuras[i] = new Circulo(color, radio);
            }
        }

        return figuras;
    }

    public static void mostrarFig(Figura[] figuras) {
        for (Figura f : figuras) {
            System.out.println(f);
            System.out.printf("Área: %.2f\n", f.area());
            System.out.printf("Perímetro: %.2f\n", f.perimetro());

            if (f instanceof Coloreado) {
                System.out.println("Como colorear: " + ((Coloreado) f).comoColorear());
            }

            System.out.println("---------------------------");
        }
    }
}