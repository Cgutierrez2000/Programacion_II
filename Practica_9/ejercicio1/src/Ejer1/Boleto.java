package Ejer1;

public abstract class Boleto {
	public int numero;
	public double precio;
	public Boleto (int numero) {
		this.numero= numero;
	}
	@Override
	public String toString() {
        return "Numero: " + numero + ", Precio: " + precio;
}}
