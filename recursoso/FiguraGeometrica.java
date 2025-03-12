package recursoso;


public class FiguraGeometrica {
	double area(double radio) {
		return Math.PI*radio*radio;
	}
	double area(double base,double altura) {
		return base=altura;
	}
	double area(double baseT, float alturaT) {
		return(baseT*alturaT)/2;
	}
	double area(double base1, double base2,double altura) {
		return((base1*base2)*altura)/2;
	}
	double area(float lado) {
		return(3*Math.sqrt(3)*Math.pow(lado, 2))/2;
	}
	public static void main(String[] args) {
		FiguraGeometrica f1= new FiguraGeometrica();
		FiguraGeometrica f2 = new FiguraGeometrica();
		FiguraGeometrica f3 = new FiguraGeometrica();
		FiguraGeometrica f4 = new FiguraGeometrica();
		FiguraGeometrica f5 = new FiguraGeometrica();
		System.out.println("Circulo:  "+f1.area(1));
		System.out.println("Rectangulo:  "+f2.area(2, 4));
		System.out.println("Triangulo Rectangulo "+f3.area(3, 5));
		System.out.println("Trapecio "+f4.area(3, 4, 6));
		System.out.println("THexagono "+f5.area(5));
	}
}