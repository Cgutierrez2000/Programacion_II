package Practica_4.SCFunciones;

public class FiguraGeometrica {
    
    // círculo
    public double area(double radio) {
        return Math.PI * radio * radio;
    }

    // rectángulo
    public double area(double largo, double ancho) {
        return largo * ancho;
    }

    // triángulo rectángulo
    public double area(double base, float altura) {
        return (base * altura) / 2;
    }

    // trapecio
    public double area(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    // pentágono
    public double area(int lado) {
        return (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado;
    }

    public static void main(String[] args) {
        FiguraGeometrica Fg = new FiguraGeometrica();
        

        System.out.println("círculo: " + Fg.area(5));
        System.out.println("rectángulo: " + Fg.area(4, 6));
        System.out.println("triángulo rectángulo: " + Fg.area(3, 4));
        System.out.println("trapecio: " + Fg.area(4, 6, 5));
        System.out.println("pentágono: " + Fg.area(3));
    }
}
/**
 *     public static void main(String[] args) {
        FiguraGeometrica Fg = new FiguraGeometrica();
        FiguraGeometrica Fg1 = new FiguraGeometrica();
        FiguraGeometrica Fg2 = new FiguraGeometrica();
        FiguraGeometrica Fg3 = new FiguraGeometrica();
        FiguraGeometrica Fg4 = new FiguraGeometrica();

        System.out.println("círculo: " + Fg.area(5));
        System.out.println("rectángulo: " + Fg1.area(4, 6));
        System.out.println("triángulo rectángulo: " + Fg2.area(3, 4));
        System.out.println("trapecio: " + Fg3.area(4, 6, 5));
        System.out.println("pentágono: " + Fg4.area(3));
    }
}
 */