package Ejer1;

public class Palco extends Boleto {
	public double precio;
	
	public Palco (int numero) {
		super(numero);
		this.precio=100.00;
	}
	@Override
	public String toString() {
		return "Palco [Numero: " + numero + "precio=" + precio + "]";
	}

}
