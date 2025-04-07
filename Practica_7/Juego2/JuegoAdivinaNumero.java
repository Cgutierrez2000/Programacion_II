package Juego2;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    public int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11); // 0-10
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
            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Intenta otra vez.");
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

