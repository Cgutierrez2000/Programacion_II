package poo;

public class AppFraccion {

	public static void main(String[] args) {
		Fraccion a = new Fraccion(1,2);
		Fraccion b = new Fraccion(3,4);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		Fraccion c = a.suma(b);
		System.out.println("c = " + c);
		Fraccion d = a.resta(b);
		System.out.println("d = " + d);
	}

}
