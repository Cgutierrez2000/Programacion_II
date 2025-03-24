package poo;

public class Fraccion {
	// Atributos
	private int numerador;
	private int denominador;
	
	// Metodos
	public Fraccion(int a, int b){
		this.numerador = a;
		this.denominador = b;
	}
	/*
	 c = a.suma(b) =>  c = a + b
	 c.numerador = a.numerador * b.denominador +
	            a.denominador * b.numerador
	 c.denominador = a.denominador * b.denominador
	*/
	
	public Fraccion suma(Fraccion o){
		int a = this.numerador * o.denominador +
				this.denominador * o.numerador;
		int b = this.denominador * o.denominador;
		return new Fraccion(a,b);
	}
	/*
	 c = a.resta(b) =>  c = a - b
	 c.numerador = a.numerador * b.denominador -
	            a.denominador * b.numerador
	 c.denominador = a.denominador * b.denominador
	*/
	public Fraccion resta(Fraccion o){
		Fraccion c = new Fraccion(0, 1);
		c.numerador = this.numerador * o.denominador -
				this.denominador * o.numerador;
		c.denominador = this.denominador * o.denominador;
		return c;
	}
	
	public String toString(){
		return String.format("%d/%d", this.numerador,this.denominador);
	}
}
