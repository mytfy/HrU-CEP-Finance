
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

        // customize marksheet checkbox
        MArksSheetCheck.setBackground(new java.awt.Color(255, 255, 255));
        MArksSheetCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        MArksSheetCheck.setForeground(new java.awt.Color(51, 51, 51));
        MArksSheetCheck.setText("Marks Sheet Fee ");
        MArksSheetCheck.setActionCommand(" Chicken BBQ");
        MArksSheetCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MArksSheetCheckActionPerformed(evt);
            }
        });

        // customize fine / late fee checbox
                FineLateCheck.setBackground(new java.awt.Color(255, 255, 255));
        FineLateCheck.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        FineLateCheck.setForeground(new java.awt.Color(51, 51, 51));
        FineLateCheck.setText("Fine/ Late Fee");
        FineLateCheck.setActionCommand("");
        FineLateCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FineLateCheckActionPerformed(evt);
            }
        });

        // customzie readmission fee field 
        ReAdmissionField.setEditable(false);
        ReAdmissionField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        ReAdmissionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReAdmissionField.setText("0");

        // customize semsester fee field
        SemesterField.setEditable(false);
        SemesterField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        SemesterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SemesterField.setText("0");

        // customize lab fee field
        LabFeeFeild.setEditable(false);
        LabFeeFeild.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        LabFeeFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LabFeeFeild.setText("0");

        // customize library fee field
        LibraryFeeFeild.setEditable(false);
        LibraryFeeFeild.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        LibraryFeeFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LibraryFeeFeild.setText("0");

        // customize examination feee field
        ExaminationField.setEditable(false);
        ExaminationField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        ExaminationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ExaminationField.setText("0");

        // customize improvement fee field
        ImprovementFeild.setEditable(false);
        ImprovementFeild.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        ImprovementFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImprovementFeild.setText("0");

        // customize marks sheet fee field
        MarksSheetField.setEditable(false);
        MarksSheetField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        MarksSheetField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MarksSheetField.setText("0");

        // customize fine/late fee field
        FineLateField.setEditable(false);
        FineLateField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        FineLateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FineLateField.setText("0");

        // customize admission fee field
        AdmissionField.setEditable(false);
        AdmissionField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        AdmissionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AdmissionField.setText("0");

        // customize items horizontal group
        javax.swing.GroupLayout itemsLayout = new javax.swing.GroupLayout(items);
        items.setLayout(itemsLayout);
        itemsLayout.setHorizontalGroup(
            itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemsLayout.createSequentialGroup()
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AdmissionFeeCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReAdmissionCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(161, 161, 161)
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdmissionField)
                            .addComponent(ReAdmissionField)))
                    .addGroup(itemsLayout.createSequentialGroup()
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(LibraryCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SemesterCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ExaminationCheck)
                            .addComponent(ImprovementFee)
                            .addComponent(MArksSheetCheck)
                            .addComponent(FineLateCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FineLateField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(MarksSheetField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(ImprovementFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(ExaminationField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(LabFeeFeild, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(SemesterField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(LibraryFeeFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );

        // customize items vertical group
                itemsLayout.setVerticalGroup(
            itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdmissionFeeCheck)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AdmissionField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReAdmissionCheck)
                    .addComponent(ReAdmissionField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SemesterCheck)
                    .addComponent(SemesterField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabCheck)
                    .addComponent(LabFeeFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LibraryCheck)
                    .addComponent(LibraryFeeFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExaminationCheck)
                    .addComponent(ExaminationField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImprovementFee)
                    .addComponent(ImprovementFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MArksSheetCheck)
                    .addComponent(MarksSheetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FineLateCheck)
                    .addComponent(FineLateField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        // add background scroll pane
        Bg_ScrollPane2.setViewportView(items);

        // customize student name text
        Student_Name.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); 
        Student_Name.setForeground(new java.awt.Color(255, 255, 255));
        Student_Name.setText("Student Name :");

        // customize batch text
        Batch.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); 
        Batch.setForeground(new java.awt.Color(255, 255, 255));
        Batch.setText("Batch No:");

        // customize reg number text
        RegNo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); 
        RegNo.setForeground(new java.awt.Color(255, 255, 255));
        RegNo.setText("Registation No:");

        // customize roll number text
        Roll.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); 
        Roll.setForeground(new java.awt.Color(255, 255, 255));
        Roll.setText("Roll No:");

        // customize department text
        Department.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); 
        Department.setForeground(new java.awt.Color(255, 255, 255));
        Department.setText("Department:");

        // customize student name, reg no, batch no, roll no fields
        StudentNaameField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        StudentNaameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        RegNoField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        RegNoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BatchNoField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        BatchNoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DepartmentField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        DepartmentField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        RollNoField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        RollNoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        // customize total cost text and field
        totalcost.setEditable(false);
        totalcost.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        totalcost.setText(" Total Cost");
        totalcost.setBorder(null);

        TotalCost.setEditable(false);
        TotalCost.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        TotalCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        // customize reset button text
        Reset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        // customize total button text
        total.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        total.setText("Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        // customize getreciept button text
        getrecipt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        getrecipt.setText("Get Receipt");
        getrecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getreciptActionPerformed(evt);
            }
        });

        // customize print reciept button text
        printrecipt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); 
        printrecipt.setText("Print Receipt");
        printrecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreciptActionPerformed(evt);
            }
        });

        // customize print area text
        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 0, 18)); 
        area.setRows(5);
        print_area.setViewportView(area);


        // customzie body horizontal groups 
                javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Batch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Student_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RegNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Bg_ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Roll, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(StudentNaameField)
                                        .addComponent(RegNoField)
                                        .addComponent(BatchNoField)
                                        .addComponent(RollNoField)
                                        .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(Reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyLayout.createSequentialGroup()
                                .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logout)
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(print_area, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addComponent(getrecipt)
                                    .addGap(100, 100, 100)
                                    .addComponent(printrecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        // customize body vertical groups
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Student_Name))
                            .addComponent(StudentNaameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegNo))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BatchNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Batch))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Roll)
                            .addComponent(RollNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Department)
                            .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Bg_ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reset)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(total))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(print_area, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printrecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getrecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        // add body to scroll pane
        scrollPane1.add(body);

        // add scroll pane to jpanel
        jPanel1.add(scrollPane1);
        scrollPane1.setBounds(0, 60, 1100, 800);

        // set jpanel height and width
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        // pack all components
        pack();
    }

    // add resetACtion listener
        private void ResetActionPerformed(java.awt.event.ActionEvent evt) {
        //area null
        area.setText(null);
        BatchNoField.setText(null);
        RollNoField.setText(null);
        StudentNaameField.setText(null);
        DepartmentField.setText(null);        
        RegNoField.setText(null);        
        
        FineLateField.setText("0");

        ExaminationField.setText("0");
        
        LibraryFeeFeild.setText("0");
        ReAdmissionField.setText("0");
        
        ImprovementFeild.setText("0");
        MarksSheetField.setText("0");
        
        AdmissionField.setText("0");
        
        SemesterField.setText("0");
        
        LabFeeFeild.setText("0");
        
        TotalCost.setText(null);

        //checkbox null

        AdmissionFeeCheck.setSelected(false);
        ReAdmissionCheck.setSelected(false);
        SemesterCheck.setSelected(false);
       
        LabCheck.setSelected(false);
        LibraryCheck.setSelected(false);
        ExaminationCheck.setSelected(false);
        ImprovementFee.setSelected(false);
        MArksSheetCheck.setSelected(false);
        FineLateCheck.setSelected(false);
    }

    // add total button listener
        private void totalActionPerformed(java.awt.event.ActionEvent evt) {

        double EFR = Double.parseDouble(AdmissionField.getText());
        
        double BM = Double.parseDouble(FineLateField.getText());
        
        double CC = Double.parseDouble(ExaminationField.getText());
       
        double CF = Double.parseDouble(LibraryFeeFeild.getText());
        double CFR = Double.parseDouble(ReAdmissionField.getText());
        
        double CS = Double.parseDouble(ImprovementFeild.getText());
        double CSK = Double.parseDouble(MarksSheetField.getText());
      
        double PFR = Double.parseDouble(SemesterField.getText());
        
        double SFR = Double.parseDouble(LabFeeFeild.getText());
        

        //.................calculation.................................

        double total =BM +CC+CF+CFR+CS+CSK+EFR+PFR+SFR ;
        

        //.................show values in text fild...................

        String item_total = String.format("%3f", total);
        TotalCost.setText((String) item_total);
    }

    // add logout button listener
    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout !", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            Login log = new Login();
            this.dispose();
            log.setVisible(true);;
        }
    }

    // add print reciept button listener
    private void printreciptActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            area.print();
        } catch (Exception e) {
        }
    }

    // add get recipet listener
        private void getreciptActionPerformed(java.awt.event.ActionEvent evt) {

        // decoration
        area.setText("*********************************\n");
        area.setText(area.getText() + "******   Payment Recipt   *******\n");
        area.setText(area.getText() + "*********************************\n");

        //Date
        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText() + "" + date + "\n");
        
        area.setText(area.getText() + "---------------------------------\n");

        area.setText(area.getText() + "---------------------------------\n");
        
        // items
        area.setText(area.getText() + " Name: " + StudentNaameField.getText() + "\n");
        area.setText(area.getText() + " Department: " + DepartmentField.getText() + "\n");
        area.setText(area.getText() + " Batch No: " + BatchNoField.getText() + "\n");
        area.setText(area.getText() + " Registation No: " + RegNoField.getText() + "\n");
        area.setText(area.getText() + " Roll no: " + RollNoField.getText() + "\n\n");
        area.setText(area.getText() + " Discriptation         Amounts\n");
        area.setText(area.getText() + "---------------------------------\n");        
        if (AdmissionFeeCheck.isSelected()) {
            area.setText(area.getText() + " Admission Fee............" + AdmissionField.getText() + "\n");
        }
        
        if (ReAdmissionCheck.isSelected()) {
            area.setText(area.getText() + " Re-Admission Fee........." + ReAdmissionField.getText() + "\n");
        }
        if (SemesterCheck.isSelected()) {
            area.setText(area.getText() + " Semester Fee............." + SemesterField.getText() + "\n");
        }
        if (LabCheck.isSelected()) {
            area.setText(area.getText() + " Lab Fee.................." + LabFeeFeild.getText() + "\n");
        }
        if (LibraryCheck.isSelected()) {
            area.setText(area.getText() + " Library Fee.............." + LibraryFeeFeild.getText() + "\n");
        }
        if (ExaminationCheck.isSelected()) {
            area.setText(area.getText() + " Examination Fee.........." + ExaminationField.getText() + "\n");
        }
        if (ImprovementFee.isSelected()) {
            area.setText(area.getText() + " Improvement Fee.........." + ImprovementFeild.getText() + "\n");
        }
        if (MArksSheetCheck.isSelected()) {
            area.setText(area.getText() + " Marks Sheet Fee.........." + MarksSheetField.getText() + "\n");
        }
        if (FineLateCheck.isSelected()) {
            area.setText(area.getText() + " Fine/Late fee............" + FineLateField.getText() + "\n");
        }
  
        area.setText(area.getText() + "---------------------------------\n");

        //bill
     
        area.setText(area.getText() + " Total Cost       " + TotalCost.getText()+"ETB" + "\n");
        area.setText(area.getText() + "---------------------------------\n\n");
    }

    // add fine late action listener
    private void FineLateCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (FineLateCheck.isSelected()) {
            FineLateField.setEditable(true);
            FineLateField.setText("100");
            FineLateField.requestFocus();
        } else {
            FineLateField.setEditable(false);
            FineLateField.setText("0");
        }
    }

    // add marks sheet listener
    private void MArksSheetCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (MArksSheetCheck.isSelected()) {
            MarksSheetField.setEditable(true);
            MarksSheetField.setText("500");
            MarksSheetField.requestFocus();
        } else {
            MarksSheetField.setEditable(false);
            MarksSheetField.setText("0");
        }
    }

    // add improvement action litener
    private void ImprovementFeeActionPerformed(java.awt.event.ActionEvent evt) {
        if (ImprovementFee.isSelected()) {
            ImprovementFeild.setEditable(true);
            ImprovementFeild.setText("2500");
            ImprovementFeild.requestFocus();
        } else {
            ImprovementFeild.setEditable(false);
            ImprovementFeild.setText("0");
        }
    }

    // add examination action listener
    private void ExaminationCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (ExaminationCheck.isSelected()) {
            ExaminationField.setEditable(true);
            ExaminationField.setText("500");
            ExaminationField.requestFocus();
        } else {
            ExaminationField.setEditable(false);
            ExaminationField.setText("0");
        }
    }

    // add library action listener
    private void LibraryCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (LibraryCheck.isSelected()) {
            LibraryFeeFeild.setEditable(true);
            LibraryFeeFeild.setText("2000");
            LibraryFeeFeild.requestFocus();
        } else {
            LibraryFeeFeild.setEditable(false);
            LibraryFeeFeild.setText("0");
        }
    }

    // add lab action listener 
    private void LabCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (LabCheck.isSelected()) {
            LabFeeFeild.setEditable(true);
            LabFeeFeild.setText("500");
            LabFeeFeild.requestFocus();
        } else {
            LabFeeFeild.setEditable(false);
            LabFeeFeild.setText("0");
        }
    }

    // add semester action listener
    private void SemesterCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (SemesterCheck.isSelected()) {
            SemesterField.setEditable(true);
            SemesterField.setText("24500");
            SemesterField.requestFocus();
        } else {
            SemesterField.setEditable(false);
            SemesterField.setText("0");
        }
    }

    // add readmission action listener
     private void ReAdmissionCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (ReAdmissionCheck.isSelected()) {
            ReAdmissionField.setEditable(true);
            ReAdmissionField.setText("20000");
            ReAdmissionField.requestFocus();
        } else {
            ReAdmissionField.setEditable(false);
            ReAdmissionField.setText("0");
        }
    }

    // add admission acion listener
    private void AdmissionFeeCheckActionPerformed(java.awt.event.ActionEvent evt) {
        if (AdmissionFeeCheck.isSelected()) {
            AdmissionField.setEditable(true);
            AdmissionField.setText("20000");
            AdmissionField.requestFocus();
        } else {
            AdmissionField.setEditable(false);
            AdmissionField.setText("0");
        }
    }

    // add exit button listener
        private void ExitMouseClicked(java.awt.event.MouseEvent evt) {
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {    
        System.exit(0);
        }
    }
}
