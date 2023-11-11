import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;


public class _p141_LeyNewtonGUI extends JFrame implements ActionListener, ChangeListener {
    JPanel p1;
    JLabel lblFuerza, lblMasa, lblAceleration;
    JTextField txtFuerza, txtMasa, txtAceleration;
    ButtonGroup grpOpciones;
    JRadioButton rbtFuerza, rbtMasa, rbtAceleracion;
    JButton btnCalcular, btnSalir;

    public _p141_LeyNewtonGUI() {
        super("Calcular 2da Ley de Newton");
        setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new GridLayout(5,2));
        lblFuerza = new JLabel("Fuerza: ");p1.add(lblFuerza); txtFuerza = new  JTextField(); p1.add(txtFuerza);       
        lblMasa = new JLabel("Masa: ");p1.add(lblMasa); txtMasa = new  JTextField(); p1.add(txtMasa);
        lblAceleration = new JLabel("Aceleracion: ");p1.add(lblAceleration); txtAceleration = new  JTextField(); p1.add(txtAceleration);
        grpOpciones = new ButtonGroup();
        rbtFuerza = new JRadioButton("Fuerza"); rbtMasa = new JRadioButton("Masa"); rbtAceleracion = new JRadioButton("Aceleracion");
        grpOpciones.add(rbtFuerza); grpOpciones.add(rbtMasa); grpOpciones.add(rbtAceleracion);
        p1.add(rbtFuerza); p1.add(rbtMasa); p1.add(rbtAceleracion);
        add(p1);
        btnCalcular = new JButton("Calcular"); add(btnCalcular);
        btnSalir = new JButton("Salir"); add(btnSalir); 

        rbtFuerza.addChangeListener(this); rbtAceleracion.addChangeListener(this); rbtMasa.addChangeListener(this);
        btnCalcular.addActionListener(this); btnSalir.addActionListener(this);
    }
    

    public static void main(String[] args) {
        _p141_LeyNewtonGUI app = new _p141_LeyNewtonGUI();
        app.setBounds(10,10,300,200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    
}
