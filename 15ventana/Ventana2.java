
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.white;
import java.awt.Image;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel panel;

    public Ventana2() {

        this.setSize(800, 500);
        setTitle("REGISRTO DE MIMIDOS");
        setLocation(500, 250); // localisacion de tu pantalla
        setLocationRelativeTo(null);// centro de pantalla pra todo tipo de tamaño de compu
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("REGISRTO DE MIMIDOS");

        iniciarComponentes();
        panel.add(etiqueta1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {

        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();

    }

    private void colocarPaneles() {

        setPanel(new JPanel());

        getPanel().setBackground(black);
        getPanel().setLayout(null);
        this.getContentPane().add(getPanel());

    }

    private void colocarEtiquetas() {
        JLabel etiqueta = new JLabel();
        etiqueta.setText("NOMBRE:");
        etiqueta.setBounds(10, 30, 60, 20);
        etiqueta.setOpaque(true);
        etiqueta.setForeground(white);
        etiqueta.setBackground(blue);

        // campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(80, 30, 130, 20);
        getPanel().add(usertext);
        getPanel().add(etiqueta);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("APELLIDO PATERNO:");
        etiqueta2.setBounds(10, 60, 120, 20);
        etiqueta2.setOpaque(true);
        etiqueta2.setForeground(white);
        etiqueta2.setBackground(blue);

        // campo de texto
        JTextField text = new JTextField(20);
        text.setBounds(140, 60, 130, 20);
        getPanel().add(text);
        getPanel().add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("APELLIDO MATERNO:");
        etiqueta3.setBounds(10, 90, 120, 20);
        etiqueta3.setOpaque(true);
        etiqueta3.setForeground(white);
        etiqueta3.setBackground(blue);

        // campo de texto
        JTextField texto = new JTextField(20);
        texto.setBounds(140, 90, 130, 20);
        getPanel().add(texto);

        getPanel().add(etiqueta3);

        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("FECHA DE NACIMIENTO:");
        etiqueta4.setBounds(10, 120, 150, 20);
        etiqueta4.setOpaque(true);
        etiqueta4.setForeground(white);
        etiqueta4.setBackground(blue);

        // campo de texto
        JTextField texto2 = new JTextField(20);
        texto2.setBounds(170, 120, 130, 20);
        getPanel().add(texto2);

        getPanel().add(etiqueta4);

        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText("USUARIO:");
        etiqueta5.setBounds(10, 150, 70, 20);
        etiqueta5.setOpaque(true);
        etiqueta5.setForeground(white);
        etiqueta5.setBackground(blue);

        // campo de texto
        JTextField texto3 = new JTextField(20);
        texto3.setBounds(90, 150, 130, 20);
        getPanel().add(texto3);

        getPanel().add(etiqueta5);

        JLabel etiqueta6 = new JLabel();
        etiqueta6.setText("CONTRASEÑA:");
        etiqueta6.setBounds(10, 180, 100, 20);
        etiqueta6.setOpaque(true);
        etiqueta6.setForeground(white);
        etiqueta6.setBackground(blue);

        // campo de texto
        JTextField texto4 = new JTextField(20);
        texto4.setBounds(120, 180, 130, 20);
        getPanel().add(texto4);

        getPanel().add(etiqueta6);
    }

    private void colocarBotones() {
        JButton boton1 = new JButton("ENVIAR");
        boton1.setBounds(400, 350, 120, 30);
        boton1.setEnabled(true);
        getPanel().add(boton1);

        ImageIcon imagen = new ImageIcon("bochi.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 1, 800, 500);
        etiqueta2.setIcon(new ImageIcon(
                imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        getPanel().add(etiqueta2);

    }

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

}