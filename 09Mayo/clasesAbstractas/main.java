public class Main {
    public static void main(String[] args) {
        // Crear un docente
        Docente docente = new Docente("Juan Pérez");

        // Crear una materia
        Materia materia = new Materia("Matemáticas", "Curso de matemáticas básicas", docente);

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Ana García", 50);
        Estudiante estudiante2 = new Estudiante("Carlos López", 70);
        Estudiante estudiante3 = new Estudiante("María Rodríguez", 40);

        // Agregar estudiantes a la materia
        materia.agregarEstudiante(estudiante1);
        materia.agregarEstudiante(estudiante2);
        materia.agregarEstudiante(estudiante3);

        // Mostrar estudiantes reprobados
        System.out.println("Estudiantes reprobados:");
        materia.reprobados();
    }
}