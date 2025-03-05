import java.awt.*;
import javax.swing.*;

public class Circulo extends JPanel {
    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        // Ajuste de coordenadas para centrar el círculo en el panel
        int x = (int) (centro.getX() * 10 + 200 - radio * 10);
        int y = (int) (centro.getY() * 10 + 200 - radio * 10);
        int diameter = (int) (2 * radio * 10);
        g.drawOval(x, y, diameter, diameter);
    }

    public void dibujaCirculo() {
        JFrame frame = new JFrame("Dibujar Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this); 
        frame.pack(); 
        frame.setVisible(true);
    }

    @Override
    public String toString() {
        return "Círculo con centro " + centro + " y radio " + radio;
    }

    public static void main(String[] args) {
        Punto centro = new Punto(5, 5);
        Circulo circulo = new Circulo(centro, 5);
        circulo.dibujaCirculo(); 
        System.out.println(circulo);
    }
}