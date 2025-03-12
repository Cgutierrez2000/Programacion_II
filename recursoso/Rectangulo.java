package recursoso;
public class Rectangulo{
    public float base, altura;
    public Rectangulo(float base, float altura){
        this.base = a;
        this.altura = b;
    }
    public float area(){
        return base * altura;
    }
    @Override
    public String toString(){
        return String.format("%f %f", this.base, this.altura);

    }
public static void main (String []args){
    Rectangulo r = new Rectangulo(3, 4);
    System.out.println(r);
    System.out.println(r.area());
}