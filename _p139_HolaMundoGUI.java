import java.awt.Font;

import javax.swing.*;

public class _p139_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public _p139_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo GUI, Bienvenido");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblSaludo.setBounds(20, 30, 600, 30);
        add(lblSaludo);
    }

    public static void main(String[] args) {
        _p139_HolaMundoGUI app = new _p139_HolaMundoGUI();
        app.setBounds(10, 10, 700, 300);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
