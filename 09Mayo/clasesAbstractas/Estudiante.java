package clasesAbstractas;

public class Estudiante extends Persona {
    private int ru;
    private float nota_1, nota_2;

    public Estudiante(String nombre, int edad, int ru, float nota_1, float nota_2) {
        super(nombre, edad);
        this.ru = ru;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    public int getRu() {
        return ru;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public float getNota_1() {
        return nota_1;
    }

    public void setNota_1(float nota_1) {
        this.nota_1 = nota_1;
    }

    public float getNota_2() {
        return nota_2;
    }

    public void setNota_2(float nota_2) {
        this.nota_2 = nota_2;
    }

    public float calcularNotaTotal(){
        return (nota_1 + nota_2) / 2;
    }
}