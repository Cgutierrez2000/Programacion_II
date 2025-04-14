import D;

public class Main{
public static void main(String[] args) {
    D nums = new D(4,7,6);
    System.out.println("numeros iniciales");
    nums.mostrar();
    
    nums.incrementarXYZ();
    System.out.println("Incrementado en XYZ:");
    nums.mostrar();
       
    nums.incrementarXZ();
    System.out.println("Incrementado en XZ:");
    nums.mostrar();

    nums.incrementarYZ();
    System.out.println("Incrementado en YZ:");
    nums.mostrar();

    nums.incrementarZ();
    System.out.println("Incrementado en Z:");
    nums.mostrar();

    
}}