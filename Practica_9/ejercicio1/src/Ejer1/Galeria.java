package Ejer1;

public class Galeria extends Platea {
	public Galeria(int numero, int dias) {
		super(numero, dias);
		
		if (dias>=10) {
			this.precio=25;
		
		}else {
			this.precio=30;
		}
	}

	@Override
	public String toString() {
	    return super.toString();
	}


	

}
