import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class App extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel mainPanel;
    private JTextField userBox;
    private JPasswordField passBox;

    // Constructor de la ventana del login.
    public App() {
        this.setTitle("Favor de indentificarse guap@");
        this.setSize(345, 270);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("REGISRTO DE MIMIDOS");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();

    }

    // Metodo para inicializar
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();

    }

    private void colocarPaneles() {
        // Panel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        this.getContentPane().add(mainPanel); // Agregamos el panel

    }

    private void colocarBotones() {

        userBox = new JTextField();
        passBox = new JPasswordField();

        // Boton de salir
        JButton registroButton = new JButton("Registrarse");
        registroButton.setBackground(Color.white);
        registroButton.setBounds(160, 80, 160, 30);
        registroButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            Ventana2 newFrame = new Ventana2();
            newFrame.setVisible(true);
        });
        mainPanel.add(registroButton);

        JButton loginButton = new JButton("iniciar Sesion");
        loginButton.setBackground(Color.white);
        loginButton.setBounds(10, 80, 120, 25);
        mainPanel.add(loginButton);

        ActionListener userLoginButton = (ActionEvent e) -> {
            String usuarioUser = "Luis";
            String usuarioPass = "Supercapiron";

            if (usuarioUser.equals(userBox.getText())) {
                String contrasena = "";

                for (int i = 0; i < passBox.getPassword().length; i++) {
                    contrasena += passBox.getPassword()[i];
                }

                if (usuarioPass.equals(contrasena)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");

                } else {
                    JOptionPane.showMessageDialog(null, "Error, contraseña incorrecta");
                }

            } else {
                JOptionPane.showMessageDialog(null, "¿ Y tú quien eres?");
            }
        };

        loginButton.addActionListener(userLoginButton);

    }

    private void colocarEtiquetas() {

        // Etiqueta de usuario y contraseña
        JLabel userLabel = new JLabel("Usuario");
        userLabel.setForeground(Color.blue);
        userLabel.setBounds(10, 10, 120, 50);
        mainPanel.add(userLabel);

        userBox.setBounds(160, 20, 160, 25);
        mainPanel.add(userBox);

        JLabel userPass = new JLabel("Contraseña");
        userPass.setForeground(Color.BLUE);
        userPass.setBounds(10, 40, 80, 50);
        mainPanel.add(userPass);
        passBox.setBounds(160, 50, 160, 25);
        mainPanel.add(passBox);

        ImageIcon imagen = new ImageIcon("umaru.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta2.setBounds(10, 79, 306, 150);
        etiqueta2.setIcon(new ImageIcon(
                imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        mainPanel.add(etiqueta2);

    }

    public static void main(String[] args) {
        App mainPanel = new App();
        mainPanel.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}