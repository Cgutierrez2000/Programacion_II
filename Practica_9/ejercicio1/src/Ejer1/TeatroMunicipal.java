package Ejer1;

import java.util.Scanner;


import java.util.Scanner;

public class TeatroMunicipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Teatro Municipal ===");
            System.out.println("1. Boleto Palco");
            System.out.println("2. Boleto Platea");
            System.out.println("3. Boleto Galería");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Número de boleto: ");
                    int num1 = sc.nextInt();
                    Boleto b1 = new Palco(num1);
                    System.out.println(b1);
                }
                case 2 -> {
                    System.out.print("Número de boleto: ");
                    int num2 = sc.nextInt();
                    System.out.print("Días de anticipación: ");
                    int dias2 = sc.nextInt();
                    Boleto b2 = new Platea(num2, dias2);
                    System.out.println(b2);
                }
                case 3 -> {
                    System.out.print("Número de boleto: ");
                    int num3 = sc.nextInt();
                    System.out.print("Días de anticipación: ");
                    int dias3 = sc.nextInt();
                    Boleto b3 = new Galeria(num3, dias3);
                    System.out.println(b3);
                }
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida, intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 4);

        sc.close();
    }
}



