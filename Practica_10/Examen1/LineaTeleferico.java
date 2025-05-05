package Examen1;

public class LineaTeleferico {
    public String color;
    public String tramo;
    public int nroCabinas;
    public int nroEmpleados;
    public String[][] empleados = new String[100][3];
    public int[] edades = new int[100];
    public double[] sueldos = new double[100];

    public LineaTeleferico(String color, String tramo, int nroCabinas, int nroEmpleados) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = nroEmpleados;
        for (int i = 0; i < nroEmpleados; i++) {
            this.empleados[i][0] = empleados[i][0];
            this.empleados[i][1] = empleados[i][1];
            this.empleados[i][2] = empleados[i][2];
            this.edades[i] = edades[i];
            this.sueldos[i] = sueldos[i];
        }
    }

    public LineaTeleferico() {
        this.color = "Rojo";
        this.tramo = "Estación Central, Estación Cementerio, Estación 16 de Julio";
        this.nroCabinas = 20;
        this.nroEmpleados = 4;
        this.empleados[0][0] = "Pedro";
        this.empleados[0][1] = "Rojas";
        this.empleados[0][2] = "Luna";
        this.edades[0] = 35;
        this.sueldos[0] = 2500;
        this.empleados[1][0] = "Lucy";
        this.empleados[1][1] = "Sosa";
        this.empleados[1][2] = "Rios";
        this.edades[1] = 43;
        this.sueldos[1] = 3250;
        this.empleados[2][0] = "Ana";
        this.empleados[2][1] = "Perez";
        this.empleados[2][2] = "Rojas";
        this.edades[2] = 26;
        this.sueldos[2] = 2700;
        this.empleados[3][0] = "Saul";
        this.empleados[3][1] = "Arce";
        this.empleados[3][2] = "Calle";
        this.edades[3] = 29;
        this.sueldos[3] = 2500;
    }

    public void eliminarPorApellido(String apellido) {
        System.out.println("Lista de empleados antes de eliminar:");
        mostrarListaEmpleados();
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (this.empleados[i][1] != null && this.empleados[i][1].equals(apellido) ||
                    this.empleados[i][2] != null && this.empleados[i][2].equals(apellido)) {
                for (int j = i; j < this.nroEmpleados - 1; j++) {
                    this.empleados[j][0] = this.empleados[j + 1][0];
                    this.empleados[j][1] = this.empleados[j + 1][1];
                    this.empleados[j][2] = this.empleados[j + 1][2];
                    this.edades[j] = this.edades[j + 1];
                    this.sueldos[j] = this.sueldos[j + 1];
                }
                this.empleados[this.nroEmpleados - 1][0] = null;
                this.empleados[this.nroEmpleados - 1][1] = null;
                this.empleados[this.nroEmpleados - 1][2] = null;
                this.edades[this.nroEmpleados - 1] = 0;
                this.sueldos[this.nroEmpleados - 1] = 0;
                this.nroEmpleados--;
                i--;
            }
        }
        System.out.println("Lista de empleados despues de eliminar:");
        mostrarListaEmpleados();
    }

    public void transferirEmpleado(LineaTeleferico destino, String nombreEmpleado) {
        int pos = -1;
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (this.empleados[i][0] != null && this.empleados[i][0].equals(nombreEmpleado)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Empleado con nombre '" + nombreEmpleado + "' no encontrado.");
            return;
        }
        destino.empleados[destino.nroEmpleados][0] = this.empleados[pos][0];
        destino.empleados[destino.nroEmpleados][1] = this.empleados[pos][1];
        destino.empleados[destino.nroEmpleados][2] = this.empleados[pos][2];
        destino.edades[destino.nroEmpleados] = this.edades[pos];
        destino.sueldos[destino.nroEmpleados] = this.sueldos[pos];
        destino.nroEmpleados++;
        for (int j = pos; j < this.nroEmpleados - 1; j++) {
            this.empleados[j][0] = this.empleados[j + 1][0];
            this.empleados[j][1] = this.empleados[j + 1][1];
            this.empleados[j][2] = this.empleados[j + 1][2];
            this.edades[j] = this.edades[j + 1];
            this.sueldos[j] = this.sueldos[j + 1];
        }
        this.empleados[this.nroEmpleados - 1][0] = null;
        this.empleados[this.nroEmpleados - 1][1] = null;
        this.empleados[this.nroEmpleados - 1][2] = null;
        this.edades[this.nroEmpleados - 1] = 0;
        this.sueldos[this.nroEmpleados - 1] = 0;
        this.nroEmpleados--;
        System.out.println("Empleado '" + nombreEmpleado + "' transferido exitosamente.");
        System.out.println("Lista de empleados en la linea de destino:");
        for (int i = 0; i < destino.nroEmpleados; i++) {
            System.out.println("Nombre: " + destino.empleados[i][0] + " " + destino.empleados[i][1] + " "
                    + destino.empleados[i][2] +
                    ", Edad: " + destino.edades[i] + ", Sueldo: " + destino.sueldos[i]);
        }
    }

    public void mostrar() {
        int mayorEdad = 0;
        int Mayor = -1;
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (this.edades[i] > mayorEdad) {
                mayorEdad = this.edades[i];
                Mayor = i;
            }
        }
        if (Mayor != -1) {
            System.out.println("Empleado con la mayor edad:");
            System.out.println("Nombre: " + this.empleados[Mayor][0] + " " + this.empleados[Mayor][1] + " "
                    + this.empleados[Mayor][2] +
                    ", Edad: " + this.edades[Mayor]);
        }
    }

    public void mostrar(boolean mostrarNombres) {
        double mayorSueldo = 0.0;
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (this.sueldos[i] > mayorSueldo) {
                mayorSueldo = this.sueldos[i];
            }
        }
        System.out.println("El sueldo mas alto es: " + mayorSueldo);
        if (mostrarNombres) {
            System.out.println("Empleados con el sueldo mas alto:");
            for (int i = 0; i < this.nroEmpleados; i++) {
                if (this.sueldos[i] == mayorSueldo) {
                    System.out.println("Nombre: " + this.empleados[i][0] + " " + this.empleados[i][1] + " "
                            + this.empleados[i][2]);
                }
            }
        }
    }

    public void mostrarListaEmpleados() {
        for (int i = 0; i < this.nroEmpleados; i++) {
            System.out.println(
                    "Nombre: " + this.empleados[i][0] + " " + this.empleados[i][1] + " " + this.empleados[i][2] +
                            ", Edad: " + this.edades[i] + ", Sueldo: " + this.sueldos[i]);
        }
    }
}