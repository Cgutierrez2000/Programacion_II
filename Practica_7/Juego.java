import java.util.Scanner;

public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        System.out.println("\nNueva partida iniciada con " + numeroDeVidas + " vidas.");
    }
    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo récord! Total: " + record);
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vidas.");
            return true;
        } else {
            System.out.println("¡No te quedan vidas! ");
            return false;
        }
    }
}
