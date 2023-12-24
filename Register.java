
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

  /**
     * Implement User Registration Form GUI
     */
    
 private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        resgister = new javax.swing.JLabel();
        IDNumText = new javax.swing.JTextField();
        NameText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        LocationText = new javax.swing.JTextField();
        DepartmentText = new javax.swing.JTextField();
        PhoneNumberText = new javax.swing.JTextField();
        BatchNumText = new javax.swing.JTextField();
        RollNumText = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setLayout(null);

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(430, 10, 30, 30);

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(400, 10, 30, 30);

        resgister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resgister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resgisterMouseClicked(evt);
            }
        });
        jPanel1.add(resgister);
        resgister.setBounds(140, 460, 190, 50);

        IDNumText.setFont(new java.awt.Font("Calibri", 1, 16));
        IDNumText.setForeground(new java.awt.Color(100, 100, 100));
        IDNumText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDNumText.setText("ID No.");
        IDNumText.setBorder(null);
        IDNumText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDNumTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                IDNumTextFocusLost(evt);
            }
        });
        jPanel1.add(IDNumText);
        IDNumText.setBounds(320, 400, 100, 30);

        NameText.setFont(new java.awt.Font("Calibri", 1, 16));
        NameText.setForeground(new java.awt.Color(100, 100, 100));
        NameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NameText.setText("Name");
        NameText.setBorder(null);
        NameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                NameTextFocusLost(evt);
            }
        });
        jPanel1.add(NameText);
        NameText.setBounds(60, 90, 330, 25);

        EmailText.setFont(new java.awt.Font("Calibri", 1, 16));
        EmailText.setForeground(new java.awt.Color(100, 100, 100));
        EmailText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailText.setText("Email");
        EmailText.setBorder(null);
        EmailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailTextFocusLost(evt);
            }
        });
        jPanel1.add(EmailText);
        EmailText.setBounds(60, 150, 330, 30);

        LocationText.setFont(new java.awt.Font("Calibri", 1, 16));
        LocationText.setForeground(new java.awt.Color(100, 100, 100));
        LocationText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LocationText.setText("Location");
        LocationText.setBorder(null);
        LocationText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LocationTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                LocationTextFocusLost(evt);
            }
        });
        jPanel1.add(LocationText);
        LocationText.setBounds(60, 210, 330, 40);

        DepartmentText.setFont(new java.awt.Font("Calibri", 1, 16));
        DepartmentText.setForeground(new java.awt.Color(100, 100, 100));
        DepartmentText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DepartmentText.setText("Depertment");
        DepartmentText.setBorder(null);
        DepartmentText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DepartmentTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                DepartmentTextFocusLost(evt);
            }
        });
        jPanel1.add(DepartmentText);
        DepartmentText.setBounds(60, 280, 330, 30);

        PhoneNumberText.setFont(new java.awt.Font("Calibri", 1, 16));
        PhoneNumberText.setForeground(new java.awt.Color(100, 100, 100));
        PhoneNumberText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PhoneNumberText.setText("Phone");
        PhoneNumberText.setBorder(null);
        PhoneNumberText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneNumberTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneNumberTextFocusLost(evt);
            }
        });
        jPanel1.add(PhoneNumberText);
        PhoneNumberText.setBounds(60, 340, 330, 30);

        BatchNumText.setFont(new java.awt.Font("Calibri", 1, 16));
        BatchNumText.setForeground(new java.awt.Color(100, 100, 100));
        BatchNumText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BatchNumText.setText("Batch No");
        BatchNumText.setBorder(null);
        BatchNumText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BatchNumTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                BatchNumTextFocusLost(evt);
            }
        });
        jPanel1.add(BatchNumText);
        BatchNumText.setBounds(40, 400, 110, 30);

        RollNumText.setFont(new java.awt.Font("Calibri", 1, 16));
        RollNumText.setForeground(new java.awt.Color(100, 100, 100));
        RollNumText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RollNumText.setText("Roll");
        RollNumText.setBorder(null);
        RollNumText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RollNumTextFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                RollNumTextFocusLost(evt);
            }
        });
        jPanel1.add(RollNumText);
        RollNumText.setBounds(180, 400, 100, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Register.jpg")));
        jPanel1.add(background);
        background.setBounds(0, 0, 470, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE));

        pack();
    }

        /**
    * Event handler for the exit label's mouse click.
    * Displays a confirmation dialog asking the user if they want to close the Registration Form.
    * If the user selects 'Yes', the form is disposed of, effectively closing the application.
    *
    
    */

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        if (JOptionPane.showConfirmDialog(frame, "Do you want to Close?", "Close Registation Form",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            this.dispose();
        }
    }

      /**
 * Event handler for the minimize label's mouse click.
 * Minimizes the JFrame to the system tray when the label is clicked.
 *
 */

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

/**
 * Event handler for the register label's mouse click.
 * Displays a congratulatory message for completed registration and resets the input fields.
 *
 */

    private void resgisterMouseClicked(java.awt.event.MouseEvent evt) {

        JOptionPane.showMessageDialog(null, "Congratulation! Registation Completed");
        IDNumText.setText(null);
        NameText.setText(null);
        EmailText.setText(null);
        LocationText.setText(null);
        DepartmentText.setText(null);
        PhoneNumberText.setText(null);
        BatchNumText.setText(null);
        RollNumText.setText(null);
    }

      /**
 * Event handler for the focus gained event on the NameText field.
 * Clears the default "Name" text and changes the text color to black.
 *
 */


    private void NameTextFocusGained(java.awt.event.FocusEvent evt) {
        if (NameText.getText().equals("Name")) {
            NameText.setText(null);
            NameText.setForeground(Color.BLACK);
        }
    }

      /**
 * Event handler for the focus lost event on the NameText field.
 * Restores the default "Name" text and sets the text color to a lighter shade.
 *
 */

    private void NameTextFocusLost(java.awt.event.FocusEvent evt) {
        if (NameText.getText().equals("")) {
            NameText.setText("Name");
            NameText.setForeground(new Color(100, 100, 100));
        }
    }

          /**
 * Event handler for the focus gained event on the EmailText field.
 * If the current text in the EmailText field is "Email," it clears the text,
 * setting it to an empty string, and changes the text color to black.
 * This provides a user-friendly behavior by removing the default placeholder
 * text when the user starts typing their email address.
 *
 */

    private void EmailTextFocusGained(java.awt.event.FocusEvent evt) {
        if (EmailText.getText().equals("Email")) {
            EmailText.setText("");
            EmailText.setForeground(Color.BLACK);
        }
    }
  // **********
}
