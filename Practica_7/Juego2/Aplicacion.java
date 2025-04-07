package Juego2;

public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("\n--- Juego Adivina Número ---");
        juego1.juega();

        System.out.println("\n--- Juego Adivina Número Par ---");
        juego2.juega();

        System.out.println("\n--- Juego Adivina Número Impar ---");
        juego3.juega();
    }
}
