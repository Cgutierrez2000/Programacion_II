package Examen2;

public class Ministerio {
    public String nombre;
    public String direccion;
    public int nroEmpleados;
    public String[][] empleados = new String[3][100];
    public int[] edades = new int[100];
    public double[] sueldos = new double[100];

    public Ministerio(String nombre, String direccion, int nroEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = nroEmpleados;
        for (int j = 0; j < nroEmpleados; j++) {
            this.empleados[0][j] = empleados[0][j];
            this.empleados[1][j] = empleados[1][j];
            this.empleados[2][j] = empleados[2][j];
            this.edades[j] = edades[j];
            this.sueldos[j] = sueldos[j];
        }
    }

    public Ministerio() {
        this.nombre = "Rojo";
        this.direccion = "Estación Central, Estación Cementerio, Estación 16 de Julio";
        this.nroEmpleados = 4;
        this.empleados[0][0] = "Pedro";
        this.empleados[1][0] = "Rojas";
        this.empleados[2][0] = "Luna";
        this.empleados[0][1] = "Lucy";
        this.empleados[1][1] = "Sosa";
        this.empleados[2][1] = "Rios";
        this.empleados[0][2] = "Ana";
        this.empleados[1][2] = "Perez";
        this.empleados[2][2] = "Rojas";
        this.empleados[0][3] = "Saul";
        this.empleados[1][3] = "Arce";
        this.empleados[2][3] = "Calle";
        this.edades[0] = 35;
        this.edades[1] = 43;
        this.edades[2] = 26;
        this.edades[3] = 29;
        this.sueldos[0] = 2500;
        this.sueldos[1] = 3250;
        this.sueldos[2] = 2700;
        this.sueldos[3] = 2500;
    }

    public void eliminarPorEdad(int edad) {
        System.out.println("Lista de empleados antes de eliminar:");
        mostrarListaEmpleados();
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (this.edades[i] == edad) {
                for (int j = i; j < this.nroEmpleados - 1; j++) {
                    this.empleados[0][j] = this.empleados[0][j + 1];
                    this.empleados[1][j] = this.empleados[1][j + 1];
                    this.empleados[2][j] = this.empleados[2][j + 1];
                    this.edades[j] = this.edades[j + 1];
                    this.sueldos[j] = this.sueldos[j + 1];
                }
                this.empleados[0][this.nroEmpleados - 1] = null;
                this.empleados[1][this.nroEmpleados - 1] = null;
                this.empleados[2][this.nroEmpleados - 1] = null;
                this.edades[this.nroEmpleados - 1] = 0;
                this.sueldos[this.nroEmpleados - 1] = 0;
                this.nroEmpleados--;
                i--;
            }
        }
        System.out.println("Lista de empleados después de eliminar:");
        mostrarListaEmpleados();
    }

    public void mostrarListaEmpleados() {
        for (int i = 0; i < this.nroEmpleados; i++) {
            System.out.println(
                    "Nombre: " + this.empleados[0][i] + " " + this.empleados[1][i] + " " + this.empleados[2][i] +
                            ", Edad: " + this.edades[i] + ", Sueldo: " + this.sueldos[i]);
        }
    }

    public void transferirEmpleado(Ministerio destino, String nombreEmpleado) {
        int pos = -1;
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (this.empleados[0][i] != null && this.empleados[0][i].equals(nombreEmpleado)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Empleado con nombre '" + nombreEmpleado + "' no encontrado.");
            return;
        }
        destino.empleados[0][destino.nroEmpleados] = this.empleados[0][pos];
        destino.empleados[1][destino.nroEmpleados] = this.empleados[1][pos];
        destino.empleados[2][destino.nroEmpleados] = this.empleados[2][pos];
        destino.edades[destino.nroEmpleados] = this.edades[pos];
        destino.sueldos[destino.nroEmpleados] = this.sueldos[pos];
        destino.nroEmpleados++;
        for (int j = pos; j < this.nroEmpleados - 1; j++) {
            this.empleados[0][j] = this.empleados[0][j + 1];
            this.empleados[1][j] = this.empleados[1][j + 1];
            this.empleados[2][j] = this.empleados[2][j + 1];
            this.edades[j] = this.edades[j + 1];
            this.sueldos[j] = this.sueldos[j + 1];
        }
        this.empleados[0][this.nroEmpleados - 1] = null;
        this.empleados[1][this.nroEmpleados - 1] = null;
        this.empleados[2][this.nroEmpleados - 1] = null;
        this.edades[this.nroEmpleados - 1] = 0;
        this.sueldos[this.nroEmpleados - 1] = 0;
        this.nroEmpleados--;
        System.out.println("Empleado '" + nombreEmpleado + "' transferido exitosamente.");
        System.out.println("Lista de empleados en el ministerio de destino:");
        destino.mostrarListaEmpleados();
    }

    public void mostrar() {
        if (this.nroEmpleados == 0) {
            System.out.println("No hay empleados en el ministerio.");
            return;
        }
        int menorEdad = this.edades[0];
        int menor = 0;
        for (int i = 1; i < this.nroEmpleados; i++) {
            if (this.edades[i] < menorEdad) {
                menorEdad = this.edades[i];
                menor = i;
            }
        }
        System.out.println("Empleado con la menor edad:");
        System.out.println("Nombre: " + this.empleados[0][menor] + " " + this.empleados[1][menor] + " "
                + this.empleados[2][menor] +
                ", Edad: " + this.edades[menor]);
    }

    public void mostrar(boolean mostrarNombres) {
        if (this.nroEmpleados == 0) {
            System.out.println("No hay empleados en el ministerio.");
            return;
        }
        double menorSueldo = this.sueldos[0];
        for (int i = 1; i < this.nroEmpleados; i++) {
            if (this.sueldos[i] < menorSueldo) {
                menorSueldo = this.sueldos[i];
            }
        }
        System.out.println("El sueldo más bajo es: " + menorSueldo);
        if (mostrarNombres) {
            System.out.println("Empleados con el sueldo más bajo:");
            for (int i = 0; i < this.nroEmpleados; i++) {
                if (this.sueldos[i] == menorSueldo) {
                    System.out.println("Nombre: " + this.empleados[0][i] + " " + this.empleados[1][i] + " "
                            + this.empleados[2][i]);
                }
            }
        }
    }
}