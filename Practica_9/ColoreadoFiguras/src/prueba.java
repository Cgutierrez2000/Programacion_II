import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Object[] figuras = generarFigurasAleatoriasComoObject(5);
        mostrarDetallesFiguras(figuras);
    }

    // Método para generar un arreglo de figuras aleatorias como Object[]
    public static Object[] generarFigurasAleatoriasComoObject(int cantidad) {
        Object[] figuras = new Object[cantidad];
        Random rand = new Random();
        String[] colores = { "Rojo", "Verde", "Azul", "Amarillo", "Negro" };

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

    // Método para mostrar detalles de cada figura con verificación de tipo
    public static void mostrarDetallesFiguras(Object[] figuras) {
        for (Object obj : figuras) {
            if (obj instanceof Figura) {
                Figura f = (Figura) obj;
                System.out.println(f);
                System.out.printf("Área: %.2f\n", f.area());
                System.out.printf("Perímetro: %.2f\n", f.perimetro());

                if (f instanceof Coloreado) {
                    System.out.println("Como colorear: " + ((Coloreado) f).comoColorear());
                }
            } else {
                System.out.println("Este objeto no es una Figura.");
            }

            System.out.println("---------------------------");
        }
    }
}