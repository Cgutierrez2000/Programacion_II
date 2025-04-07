package Juego2;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (numero < 0 || numero > 10) {
            System.out.println("Número fuera del rango permitido (0-10).");
            return false;
        }
        if (numero % 2 == 0) {
            return true;
        } else {
            System.out.println("El número ingresado no es par.");
            return false;
        }
    }
}
