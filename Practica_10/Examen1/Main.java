package Examen1;

public class Main {
    public static void main(String[] args) {
        // instanciar de forma distinta dos objetos
        LineaTeleferico linea1 = new LineaTeleferico();
        LineaTeleferico linea2 = new LineaTeleferico("Cafe", "Cruce de Villas, Busch", 15, 2);
        linea2.empleados[0][0] = "Ramon";
        linea2.empleados[0][1] = "Lopez";
        linea2.empleados[0][2] = "Garcia";
        linea2.edades[0] = 40;
        linea2.sueldos[0] = 2200.00;
        linea2.empleados[1][0] = "Maria";
        linea2.empleados[1][1] = "Fernandez";
        linea2.empleados[1][2] = "Diaz";
        linea2.edades[1] = 32;
        linea2.sueldos[1] = 2800.00;
        System.out.println("---B) Eliminar a los empleados con apellido X, paterno o materno---");
        linea1.eliminarPorApellido("Rojas");
        System.out.println("---C) Transferir un empleado de una línea a otra---");
        linea2.transferirEmpleado(linea1, "Ramon");
        linea1.transferirEmpleado(linea2, "Lucy");
        System.out.println("---D) Sobrecargar un metodo---");
        linea1.mostrar();
        linea2.mostrar();
        linea1.mostrar(true);
        linea2.mostrar(true);
    }
}