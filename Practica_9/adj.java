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
public class Palco extends Boleto {
	public double precio;
	public Palco (int numero) {
		super(numero);
		this.precio=100.00;
	}
	@Override
	public String toString() {
		return "Palco [Numero: " + numero + "precio=" + precio + "]";
	}}
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
	}	}
	@Override
	public String toString() {
		return "Platea [Numero:" + numero + "diasAnticipacion=" + diasAnticipacion + ", precio=" + precio + "]";
	}
}
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
}}
import java.util.Scanner;
import java.util.Scanner;
public class TeatroMunicipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== Teatro Municipal ===");
            System.out.println("1. Boleto en  Palco");
            System.out.println("2. Boleto en Platea");
            System.out.println("3. Boleto en Galería");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Numero de boleto: ");
                    int num1 = sc.nextInt();
                    Boleto b1 = new Palco(num1);
                    System.out.println(b1);
                }
                case 2 -> {
                    System.out.print("Numero de boleto: ");
                    int num2 = sc.nextInt();
                    System.out.print("Dias de anticipacion: ");
                    int dias2 = sc.nextInt();
                    Boleto b2 = new Platea(num2, dias2);
                    System.out.println(b2);
                }
                case 3 -> {
                    System.out.print("Numero de boleto: ");
                    int num3 = sc.nextInt();
                    System.out.print("Dias de anticipacion: ");
                    int dias3 = sc.nextInt();
                    Boleto b3 = new Galeria(num3, dias3);
                    System.out.println(b3);
                }
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida, intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 4);
        sc.close();
    }}



