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
        // customize username input
        userid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20));
        userid.setBorder(null);
        userid.setBackground(new Color(0, 0, 0, 0));
        jPanel1.add(userid);
        userid.setBounds(580, 190, 250, 30);
        
        // customize password input
        password.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20));
        password.setBorder(null);
        password.setBackground(new Color(0, 0, 0, 0));
        jPanel1.add(password);
        password.setBounds(580, 304, 250, 30);

        // customize exit button
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(840, 0, 30, 40);
        
        // customzie minimize button
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(800, 0, 30, 40);

         // customize login button
        loinbuttton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loinbuttton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loinbutttonMouseClicked(evt);
            }
        });
        jPanel1.add(loinbuttton);
        loinbuttton.setBounds(620, 370, 160, 40);
        
         // customize window background
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Login.jpg")));
        jPanel1.add(background);
        background.setBounds(0, 0, 880, 500);

        // Add height and width to the window/ jpanel
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
// pack every components inside the window
        pack();
    }
    // add exit button listener
     private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }
// add minimize button listener
    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }
}
