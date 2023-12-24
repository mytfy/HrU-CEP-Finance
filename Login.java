import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;

public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // Variables declaration
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loinbuttton;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userid;
    // End of variables declaration

    // add init components method
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        loinbuttton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        // customize the window
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);
    }
}
