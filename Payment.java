
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Payment extends javax.swing.JFrame {

    private JFrame frame; 

    int Xmouse;
    int Ymouse;
    // Variables declaration 
    private javax.swing.JLabel Batch;
    private javax.swing.JScrollPane Bg_ScrollPane2;
    private javax.swing.JLabel Department;
    private javax.swing.JLabel RegNo;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Roll;
    private javax.swing.JLabel Student_Name;
    private javax.swing.JTextField AdmissionField;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField BatchNoField;
    private javax.swing.JPanel body;
    private javax.swing.JTextField DepartmentField;
    private javax.swing.JTextField ExaminationField;
    private javax.swing.JTextField FineLateField;
    private javax.swing.JButton getrecipt;
    private javax.swing.JTextField ImprovementFeild;
    private javax.swing.JPanel items;
    private javax.swing.JCheckBox AdmissionFeeCheck;
    private javax.swing.JCheckBox ReAdmissionCheck;
    private javax.swing.JCheckBox SemesterCheck;
    private javax.swing.JCheckBox LabCheck;
    private javax.swing.JCheckBox LibraryCheck;
    private javax.swing.JCheckBox ExaminationCheck;
    private javax.swing.JCheckBox ImprovementFee;
    private javax.swing.JCheckBox MArksSheetCheck;
    private javax.swing.JCheckBox FineLateCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField LabFeeFeild;
    private javax.swing.JTextField LibraryFeeFeild;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField MarksSheetField;
    private javax.swing.JScrollPane print_area;
    private javax.swing.JButton printrecipt;
    private javax.swing.JTextField ReAdmissionField;
    private javax.swing.JTextField RollNoField;
    private javax.swing.JTextField RegNoField;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField SemesterField;
    private javax.swing.JTextField StudentNaameField;
    private javax.swing.JPanel taskbar;
    private javax.swing.JTextField TotalCost;
    private javax.swing.JLabel text;
    private javax.swing.JButton total;
    private javax.swing.JTextField totalcost;
    private javax.swing.JLabel Exit;
    // End of variables declaration

        /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

        private void initComponents() {

        // initialize the variables
        jPanel1 = new javax.swing.JPanel();
        taskbar = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        body = new javax.swing.JPanel();
        Bg_ScrollPane2 = new javax.swing.JScrollPane();
        items = new javax.swing.JPanel();
        AdmissionFeeCheck = new javax.swing.JCheckBox();
        ReAdmissionCheck = new javax.swing.JCheckBox();
        SemesterCheck = new javax.swing.JCheckBox();
        LabCheck = new javax.swing.JCheckBox();
        LibraryCheck = new javax.swing.JCheckBox();
        ExaminationCheck = new javax.swing.JCheckBox();
        ImprovementFee = new javax.swing.JCheckBox();
        MArksSheetCheck = new javax.swing.JCheckBox();
        FineLateCheck = new javax.swing.JCheckBox();
        ReAdmissionField = new javax.swing.JTextField();
        SemesterField = new javax.swing.JTextField();
        LabFeeFeild = new javax.swing.JTextField();
        LibraryFeeFeild = new javax.swing.JTextField();
        ExaminationField = new javax.swing.JTextField();
        ImprovementFeild = new javax.swing.JTextField();
        MarksSheetField = new javax.swing.JTextField();
        FineLateField = new javax.swing.JTextField();
        AdmissionField = new javax.swing.JTextField();
        logout = new javax.swing.JLabel();
        Student_Name = new javax.swing.JLabel();
        Batch = new javax.swing.JLabel();
        RegNo = new javax.swing.JLabel();
        Roll = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        StudentNaameField = new javax.swing.JTextField();
        RegNoField = new javax.swing.JTextField();
        BatchNoField = new javax.swing.JTextField();
        DepartmentField = new javax.swing.JTextField();
        RollNoField = new javax.swing.JTextField();
        totalcost = new javax.swing.JTextField();
        TotalCost = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        total = new javax.swing.JButton();
        getrecipt = new javax.swing.JButton();
        printrecipt = new javax.swing.JButton();
        print_area = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(8, 100, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 5));
        jPanel1.setLayout(null);

        taskbar.setBackground(new java.awt.Color(255, 255, 255));
        taskbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                taskbarMouseDragged(evt);
            }
        });
        taskbar.setLayout(null);

        // customize minimize button
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/minimize.jpg"))); 
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        taskbar.add(minimize);
        minimize.setBounds(962, 0, 30, 60);

        // customize exit button 
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/exit.jpg"))); 
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        taskbar.add(Exit);
        Exit.setBounds(1010, 0, 30, 60);

        // customize header text
        text.setFont(new java.awt.Font("Domino Jack", 0, 24)); 
        text.setText("Student Payment System");
        taskbar.add(text);
        text.setBounds(31, 0, 468, 60);

        // customize jlabel1 and add it to taskbar and add taskbar to jpanel1
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        taskbar.add(jLabel1);
        jLabel1.setBounds(910, 0, 30, 60);

        jPanel1.add(taskbar);
        taskbar.setBounds(0, 0, 1100, 60);

        // add body background and items background
        body.setBackground(new java.awt.Color(8, 100, 0));

        items.setBackground(new java.awt.Color(255, 255, 255));

        // customize admission Fee checbox
        AdmissionFeeCheck.setBackground(new java.awt.Color(255, 255, 255));
        AdmissionFeeCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        AdmissionFeeCheck.setForeground(new java.awt.Color(51, 51, 51));
        AdmissionFeeCheck.setText("Admission Fee");
        AdmissionFeeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmissionFeeCheckActionPerformed(evt);
            }
        });

        // customize readmission checkbox
        ReAdmissionCheck.setBackground(new java.awt.Color(255, 255, 255));
        ReAdmissionCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        ReAdmissionCheck.setForeground(new java.awt.Color(51, 51, 51));
        ReAdmissionCheck.setText("Re-Admission Fee");
        ReAdmissionCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReAdmissionCheckActionPerformed(evt);
            }
        });

        // customize semester fee checkbox
        SemesterCheck.setBackground(new java.awt.Color(255, 255, 255));
        SemesterCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        SemesterCheck.setForeground(new java.awt.Color(51, 51, 51));
        SemesterCheck.setText("Semester Fee");
        SemesterCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterCheckActionPerformed(evt);
            }
        });

        // customize lab fee checkbox
        LabCheck.setBackground(new java.awt.Color(255, 255, 255));
        LabCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        LabCheck.setForeground(new java.awt.Color(51, 51, 51));
        LabCheck.setText("Lab Fee");
        LabCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabCheckActionPerformed(evt);
            }
        });

        // customize library fee checkbox
        LibraryCheck.setBackground(new java.awt.Color(255, 255, 255));
        LibraryCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        LibraryCheck.setForeground(new java.awt.Color(51, 51, 51));
        LibraryCheck.setText("Library Fee");
        LibraryCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibraryCheckActionPerformed(evt);
            }
        });

        // customzie examination fee checkbox
        ExaminationCheck.setBackground(new java.awt.Color(255, 255, 255));
        ExaminationCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        ExaminationCheck.setForeground(new java.awt.Color(51, 51, 51));
        ExaminationCheck.setText("Examinatiom Fee");
        ExaminationCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExaminationCheckActionPerformed(evt);
            }
        });

        // customize improvement fee checkbox
        ImprovementFee.setBackground(new java.awt.Color(255, 255, 255));
        ImprovementFee.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        ImprovementFee.setForeground(new java.awt.Color(51, 51, 51));
        ImprovementFee.setText("Improvement Fee");
        ImprovementFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprovementFeeActionPerformed(evt);
            }
        });
    }
}
