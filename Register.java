
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
      private Component frame;
    int Xmouse;
    int Ymouse;

    // Variables declaration 
    private javax.swing.JTextField IDNumText;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField EmailText;
    private javax.swing.JTextField LocationText;
    private javax.swing.JTextField DepartmentText;
    private javax.swing.JTextField PhoneNumberText;
    private javax.swing.JTextField BatchNumText;
    private javax.swing.JTextField RollNumText;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel resgister;
    // End of variables declaration

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        IDNumText.setBackground(new Color(0, 0, 0, 0));
        NameText.setBackground(new Color(0, 0, 0, 0));
        EmailText.setBackground(new Color(0, 0, 0, 0));
        LocationText.setBackground(new Color(0, 0, 0, 0));
        DepartmentText.setBackground(new Color(0, 0, 0, 0));
        PhoneNumberText.setBackground(new Color(0, 0, 0, 0));
        BatchNumText.setBackground(new Color(0, 0, 0, 0));
        RollNumText.setBackground(new Color(0, 0, 0, 0));
    }

  // **********
}
