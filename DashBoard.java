
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
      // Initialize the variables
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        options = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();

      // customize the window
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

      // customize the exit button
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(770, 460, 30, 30);

      // cutomize logout button
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 460, 110, 30);

      // cutomize payment button
        payment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentMouseClicked(evt);
            }
        });
        jPanel1.add(payment);
        payment.setBounds(390, 350, 180, 30);

      // customzie database button
        Data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataMouseClicked(evt);
            }
        });
        jPanel1.add(Data);
        Data.setBounds(440, 230, 180, 30);

      // customzie register button
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(390, 110, 180, 30);

      // place payment, database and register button in the center
        jPanel1.add(options);
        options.setBounds(90, 70, 600, 380);

      // customize the dashboard with background image
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Dashboard.jpg")));
        jPanel1.add(dashboard);
        dashboard.setBounds(0, 0, 811, 499);

      // adjust the width and height
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE));

      // pack everything
        pack();
    }

      private void logoutMouseClicked(java.awt.event.MouseEvent evt) {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout !", "Logout",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            Login log = new Login();
            this.dispose();
            log.setVisible(true);
        }
    }

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {
        Register reg = new Register();
        reg.setVisible(true);
    }

    private void paymentMouseClicked(java.awt.event.MouseEvent evt) {
        Payment hm = new Payment();
        this.dispose();
        hm.setVisible(true);
    }

    private void DataMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "This option is underdevelopment");
    }
      
      // // unit testing
      // public static void main(String args[]) {
      //   /*
      //    * Set the Nimbus look and feel
      //    */
      //   try {
      //       for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
      //           if ("Nimbus".equals(info.getName())) {
      //               javax.swing.UIManager.setLookAndFeel(info.getClassName());
      //               break;
      //           }
      //       }
        // } catch (ClassNotFoundException ex) {
        //     java.util.ororlogging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        // } catch (InstantiationException ex) {
        //     java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        // } catch (IllegalAccessException ex) {
        //     java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //     java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        // }

            
        // java.awt.EventQueue.invokeLater(new Runnable() {
      // 
    //         public void run() {
    //             new DashBoard().setVisible(true);
    //         }
    //     });
    // }
}
