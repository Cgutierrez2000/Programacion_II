import java.awt.*;
import javax.swing.*;

public class Linea extends JPanel {
    public Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        setPreferredSize(new Dimension(400, 400)); // Tamaño del panel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine((int) p1.getX() * 10, (int) p1.getY() * 10, (int) p2.getX() * 10, (int) p2.getY() * 10);
    }

    public void dibujaLinea() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this); // Agrega el panel Linea directamente
        frame.pack(); // Ajusta el tamaño según el panel
        frame.setVisible(true);
    }

    @Override
    public String toString() {
        return "Linea de " + p1 + " a " + p2;
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(5, 5);
        Punto p2 = new Punto(3, 3);
        Linea linea = new Linea(p1, p2);
        linea.dibujaLinea(); // Muestra la ventana con la línea
        System.out.println(linea);
    }
}