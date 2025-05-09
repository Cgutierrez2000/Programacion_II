package clasesAbstractas;

public class Docente  {

    private float salario;
    private int antiguedad;

    public Docente(float salario, int antiguedad) {
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}











