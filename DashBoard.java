
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DashBoard extends javax.swing.JFrame {
      // Variables declaration 
    private javax.swing.JLabel Data;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel options;
    private javax.swing.JLabel payment;
    private javax.swing.JLabel register;
    // End of variables declaration

    /**
     * Creates new form DashBoard
     */
          public DashBoard() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

          private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        options = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(770, 460, 30, 30);

        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 460, 110, 30);

        payment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentMouseClicked(evt);
            }
        });
        jPanel1.add(payment);
        payment.setBounds(390, 350, 180, 30);

        Data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataMouseClicked(evt);
            }
        });
        jPanel1.add(Data);
        Data.setBounds(440, 230, 180, 30);

        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(390, 110, 180, 30);

        jPanel1.add(options);
        options.setBounds(90, 70, 600, 380);

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Dashboard.jpg")));
        jPanel1.add(dashboard);
        dashboard.setBounds(0, 0, 811, 499);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE));

        pack();
    }





      
}
