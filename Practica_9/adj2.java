public interface Coloreado {
    String comoColorear();
}
public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Color: " + color;
    }

    public abstract double area();

    public abstract double perimetro();
}
public class Cuadrado extends Figura implements Coloreado {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    public String toString() {
        return "Cuadrado - " + super.toString() + ", Lado: " + lado;
    }
}
public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "Círculo - " + super.toString() + ", Radio: " + radio;
    }
}
