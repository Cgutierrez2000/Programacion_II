package Ejer1;

public class Platea extends Boleto {
	public int diasAnticipacion;
	public int precio;
	
	public Platea (int numero, int dias ) {
		super(numero);
		this.diasAnticipacion=dias;
		
		if (dias>=10) {
			this.precio=50;
		}else {
			this.precio=60;
		}
	}

	@Override
	public String toString() {
		return "Platea [Numero:" + numero + "diasAnticipacion=" + diasAnticipacion + ", precio=" + precio + "]";
	}
	
	

}
