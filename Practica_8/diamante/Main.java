
package Diamante;

public class Main{
	public static void main(String[] args) {
        D obj = new D(1, 2, 3);

        System.out.println("Valores iniciales:");
        obj.mostrar();

        obj.incrementarXZ();
        obj.mostrar();
        obj.incrementarYZ();
        obj.mostrar();
        obj.incrementarZ(); 
        obj.mostrar();
        obj.incrementarXYZ();
        obj.mostrar();
        System.out.println("\nValores finales:");
        obj.mostrar();
    }}