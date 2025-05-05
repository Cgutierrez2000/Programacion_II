package Ejer1;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class TeatroGUI extends JFrame {
    // Campos de texto reducidos a la mitad de ancho (8 columnas)
    private JTextField txtNumero = new JTextField(8);
    private JTextField txtDias   = new JTextField(8);
    private JLabel lblRes        = new JLabel(" ", SwingConstants.CENTER);
    private JRadioButton rbPalco   = new JRadioButton("Palco");
    private JRadioButton rbPlatea  = new JRadioButton("Platea");
    private JRadioButton rbGaleria = new JRadioButton("Galería");
    private ButtonGroup grupoTipo = new ButtonGroup();

    public TeatroGUI() {
        super("Teatro Municipal");
        setLayout(new BorderLayout(10, 0));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ----- Header Panel -----
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(Color.WHITE);
        header.setOpaque(true);
        header.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Imagen al lado derecho, pequeña y separada del borde
        ImageIcon rawIcon = new ImageIcon(getClass().getResource("/Ejer1/imagenes/teatro.png"));
        Image img = rawIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        JLabel imgLabel = new JLabel(icon);
        imgLabel.setPreferredSize(new Dimension(60, 60));
        header.add(imgLabel, BorderLayout.EAST);

        // Título centrado en azul y fondo blanco
        JLabel title = new JLabel("Teatro Municipal", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 28));
        title.setForeground(Color.BLUE);
        header.add(title, BorderLayout.CENTER);

        // ----- Center Panel: Datos del boleto -----
        JPanel center = new JPanel(new GridBagLayout());
        TitledBorder tb = new TitledBorder("Datos del boleto");
        tb.setTitleJustification(TitledBorder.LEFT);
        center.setBorder(BorderFactory.createCompoundBorder(
            tb,
            BorderFactory.createEmptyBorder(2, 20, 5, 20)
        ));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 8, 4, 8);
        gbc.anchor = GridBagConstraints.WEST;

        // Fila 1: radio buttons en extremos y centro
        grupoTipo.add(rbPalco);
        grupoTipo.add(rbPlatea);
        grupoTipo.add(rbGaleria);
        rbPalco.setSelected(true);
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.33;
        gbc.gridx = 0; center.add(rbPalco, gbc);
        gbc.gridx = 1; center.add(rbPlatea, gbc);
        gbc.gridx = 2; center.add(rbGaleria, gbc);
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;

        // Fila 2: Número (campo de 8 columnas)
        gbc.gridy = 1;
        gbc.gridx = 0;
        center.add(new JLabel("Número:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        // Permitir que el campo de texto se expanda horizontalmente
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        center.add(txtNumero, gbc);
        // Restaurar valores predeterminados
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 1;

        // Fila 3: Cant. Días (etiqueta gris, campo ancho)
        gbc.gridy = 2;
        gbc.gridx = 0;
        JLabel lblDias = new JLabel("Cant. dias para el Evento:");
        lblDias.setForeground(Color.GRAY);
        center.add(lblDias, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        // Permitir que el campo de texto se expanda horizontalmente
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        center.add(txtDias, gbc);
        // Restaurar valores predeterminados
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 1;

        // Fila 4: Botones Vender y Salir centrados en toda la pantalla
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        JButton btnVender = new JButton("Vender");
        JButton btnSalir  = new JButton("Salir");
        btnPanel.add(btnVender);
        btnPanel.add(btnSalir);
        center.add(btnPanel, gbc);
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;

        // ----- Footer Panel: Información -----
        JPanel footer = new JPanel(new BorderLayout());
        TitledBorder tf = new TitledBorder("Información");
        footer.setBorder(tf);
        footer.setPreferredSize(new Dimension(0, 120));
        lblRes.setForeground(Color.BLUE);
        lblRes.setFont(new Font("Serif", Font.PLAIN, 16));
        footer.add(lblRes, BorderLayout.CENTER);

        // Añadir paneles
        add(header, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);

        // Listeners
        btnVender.addActionListener(e -> onVender());
        btnSalir.addActionListener(e -> System.exit(0));

        pack();
        setSize(400, 380); // Cambio: tamaño fijo 400x380
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void onVender() {
        try {
            int num = Integer.parseInt(txtNumero.getText());
            Boleto b;
            if (rbPalco.isSelected()) {
                b = new Palco(num);
            } else {
                int dias = Integer.parseInt(txtDias.getText());
                if (rbPlatea.isSelected()) b = new Platea(num, dias);
                else                        b = new Galeria(num, dias);
            }
            lblRes.setText(b.toString());
        } catch (NumberFormatException ex) {
            lblRes.setText("Entrada inválida");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TeatroGUI::new);
    }
}
