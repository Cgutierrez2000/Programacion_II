package prueba;
public class Alumno{
    public String nombre;
    public int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public class Main {

        public static void main(String[] args) {
            Alumno alumno1 = new Alumno("Juan", 20);
            Alumno alumno2 = new Alumno("Maria", 22);
            
            System.out.println("Nombre: " + alumno1.nombre + ", Edad: " + alumno1.edad);
            System.out.println("Nombre: " + alumno2.nombre + ", Edad: " + alumno2.edad);
        }

}}