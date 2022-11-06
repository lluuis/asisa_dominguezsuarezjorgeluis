import javax.swing.*;

public class Ventana {

    public static void main(String[] arg) {
        JFrame ventana = new JFrame("hola mundo");

        ventana.setSize(400, 150);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);

        agregarComponentes(panel);

        ventana.setVisible(true);

    }

    private static void agregarComponentes(JPanel panel) {
        panel.setLayout(null);
        JLabel userlLabel = new JLabel("nombre de usuario");
        userlLabel.setBounds(10, 10, 120, 50);

        panel.add(userlLabel);

    }

}
