import java.awt.*;
import javax.swing.*;

public class Linea extends JPanel {
    public Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        setPreferredSize(new Dimension(400, 400)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        // Ajuste de coordenadas para que la línea se dibuje correctamente
        int x1 = (int) (p1.getX() * 10 + 200);
        int y1 = (int) (200 - p1.getY() * 10);
        int x2 = (int) (p2.getX() * 10 + 200);
        int y2 = (int) (200 - p2.getY() * 10);
        g.drawLine(x1, y1, x2, y2);
    }

    public void dibujaLinea() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this); 
        frame.pack(); 
        frame.setVisible(true);
    }

    @Override
    public String toString() {
        return "Linea de " + p1 + " a " + p2;
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(-5, -5);
        Linea linea = new Linea(p1, p2);
        linea.dibujaLinea();
        System.out.println(linea);
    }
}