package Examen2;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar dos objetos Ministerio de diferente forma
        Ministerio minis1 = new Ministerio();
        Ministerio minis2 = new Ministerio("Cafe", "Cruce de Villas, Busch", 2);
        minis2.empleados[0][0] = "Carla";
        minis2.empleados[1][0] = "Gutierrez";
        minis2.empleados[2][0] = "Garcia";
        minis2.edades[0] = 52;
        minis2.sueldos[0] = 3800;

        minis2.empleados[0][1] = "Paolo";
        minis2.empleados[1][1] = "Torrez";
        minis2.empleados[2][1] = "Calle";
        minis2.edades[1] = 32;
        minis2.sueldos[1] = 2800;
        System.out.println("\n--- Ministerio 1 ---");
        minis1.mostrarListaEmpleados();
        System.out.println("\n--- Ministerio 2 ---");
        minis2.mostrarListaEmpleados();
        // b) Eliminar empleados con edad 26
        System.out.println("\n--- Ministerio 1 ---");
        minis1.eliminarPorEdad(26);
        System.out.println("\n--- Ministerio 2 ---");
        minis2.eliminarPorEdad(32);
        // c) Transferir empleado "Ramon" del Ministerio 2 al Ministerio 1
        System.out.println("\n--- Transferir empleado  ---");
        minis1.transferirEmpleado(minis2, "Lucy");
        minis2.transferirEmpleado(minis1, "Carla");
        // d) Mostrar empleados con la menor edad en Ministerio 1
        System.out.println("\n--- Empleado con la menor edad en Ministerio 1 ---");
        minis1.mostrar();
        System.out.println("\n--- Empleado con la menor edad en Ministerio 2 ---");
        minis2.mostrar();
        // d) Mostrar empleados con el menor sueldo en Ministerio 1
        System.out.println("\n--- Empleados con el menor sueldo en Ministerio 1 ---");
        minis1.mostrar(true);
        System.out.println("\n--- Empleados con el menor sueldo en Ministerio 2 ---");
        minis2.mostrar(true);
    }
}