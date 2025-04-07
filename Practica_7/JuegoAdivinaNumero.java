import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas); // 👈 Aquí se llama al constructor de la clase padre
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11); // de 0 a 10
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento;
            try {
                intento = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
                continue;
            }
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste! 🎉");
                actualizaRecord();
                break;
            } else {
                if (!quitaVida()) break;
                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
            }
        }
    }
}
