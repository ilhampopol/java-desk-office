package views;

import controllers.Core;
import controllers.Employee;
import helper.InputValidator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class employee extends javax.swing.JFrame {

    Core core = new Core();
    InputValidator validator = new InputValidator();
    Employee employee = new Employee();
    
    DefaultTableModel tableModel = new DefaultTableModel();
    Object[] column = {"id", "name", "address", "phone_number", "gender", "occupation", "department", "branch", "status"};
    Object[] columnNames = {"ID", "Nama", "Alamat", "No.HP", "Jenis Kelamin", "Jabatan", "Divisi", "Cabang", "Status"};
    String query = "SELECT e.id,e.name,e.address,phone_number,gender,o.name AS occupation,d.name AS department,b.name AS branch,status FROM employee AS e JOIN occupation AS o ON e.occ_id = o.id JOIN department AS d ON e.dept_id = d.id JOIN branch as b ON e.branch_id = b.id WHERE status = 'AKTIF'";
    
    String gender;
    boolean isSuccess;

    public employee() {
        initComponents();

        radioButtonGroup.add(radiobtnMale);
        radioButtonGroup.add(radiobtnFemale);

        // munculkan data pada table
        core.dataTable(columnNames, column, tableModel, tableEmployee, query);

        // set id pada inputan dengan nilai yang sudah ditentukan
        inputID.setText(employee.lastEmployeeID());

        // Memunculkan data pada combo box
        core.populateComboBox(comboOccupation, "SELECT id, name FROM occupation");
        core.populateComboBox(comboDepartment, "SELECT id, name FROM department");
        core.populateComboBox(comboBranch, "SELECT id, name FROM branch");

        // Mengosongkan isi dari field
        core.emptyInput(inputName, inputPhoneNumber);
        core.emptyInputArea(inputAddress);
        core.emptyCombo(comboBranch, comboDepartment, comboOccupation);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        panelnput = new javax.swing.JPanel();
        labelNama = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelPhoneNumber = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelOccupation = new javax.swing.JLabel();
        labelDepartment = new javax.swing.JLabel();
        labelBranch = new javax.swing.JLabel();
        comboOccupation = new javax.swing.JComboBox<>();
        inputPhoneNumber = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        scrollpaneAddress = new javax.swing.JScrollPane();
        inputAddress = new javax.swing.JTextArea();
        comboDepartment = new javax.swing.JComboBox<>();
        comboBranch = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnFemale = new javax.swing.JRadioButton();
        panelTable = new javax.swing.JPanel();
        scrollpaneTableEmployee = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        labelKeyword = new javax.swing.JLabel();
        inputKeyword = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karyawan");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 0, 102));

        panelnput.setBackground(new java.awt.Color(41, 128, 185));

        labelNama.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelNama.setForeground(new java.awt.Color(204, 204, 204));
        labelNama.setText("Nama");

        labelAlamat.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(204, 204, 204));
        labelAlamat.setText("Alamat");

        labelPhoneNumber.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelPhoneNumber.setForeground(new java.awt.Color(204, 204, 204));
        labelPhoneNumber.setText("No. HP");

        labelGender.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelGender.setForeground(new java.awt.Color(204, 204, 204));
        labelGender.setText("Jenis Kelamin");

        labelOccupation.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelOccupation.setForeground(new java.awt.Color(204, 204, 204));
        labelOccupation.setText("Jabatan");

        labelDepartment.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelDepartment.setForeground(new java.awt.Color(204, 204, 204));
        labelDepartment.setText("Divisi");

        labelBranch.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelBranch.setForeground(new java.awt.Color(204, 204, 204));
        labelBranch.setText("Cabang");

        comboOccupation.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        comboOccupation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inputPhoneNumber.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        inputName.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        inputAddress.setColumns(12);
        inputAddress.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        inputAddress.setRows(3);
        scrollpaneAddress.setViewportView(inputAddress);

        comboDepartment.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        comboDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comboBranch.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        comboBranch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSave.setBackground(new java.awt.Color(52, 152, 219));
        btnSave.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(46, 204, 113));
        btnEdit.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(231, 76, 60));
        btnDelete.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(241, 196, 15));
        btnClear.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.setBorderPainted(false);
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        labelID.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(204, 204, 204));
        labelID.setText("ID Karyawan");

        inputID.setEditable(false);
        inputID.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        inputID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        radiobtnMale.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        radiobtnMale.setText("Laki-laki");

        radiobtnFemale.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        radiobtnFemale.setText("Perempuan");

        javax.swing.GroupLayout panelnputLayout = new javax.swing.GroupLayout(panelnput);
        panelnput.setLayout(panelnputLayout);
        panelnputLayout.setHorizontalGroup(
            panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelnputLayout.createSequentialGroup()
                        .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAlamat)
                            .addComponent(labelNama)
                            .addComponent(labelID)
                            .addComponent(labelDepartment)
                            .addComponent(labelBranch)
                            .addComponent(labelGender)
                            .addComponent(labelOccupation)
                            .addComponent(labelPhoneNumber))
                        .addGap(18, 18, 18)
                        .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputID)
                            .addComponent(inputName)
                            .addComponent(scrollpaneAddress)
                            .addComponent(inputPhoneNumber)
                            .addComponent(comboOccupation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBranch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelnputLayout.createSequentialGroup()
                                .addComponent(radiobtnMale)
                                .addGap(18, 18, 18)
                                .addComponent(radiobtnFemale)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelnputLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        panelnputLayout.setVerticalGroup(
            panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnputLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat)
                    .addComponent(scrollpaneAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPhoneNumber)
                    .addComponent(inputPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGender)
                    .addComponent(radiobtnMale)
                    .addComponent(radiobtnFemale))
                .addGap(20, 20, 20)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOccupation))
                .addGap(20, 20, 20)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDepartment)
                    .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBranch)
                    .addComponent(comboBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelnputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelTable.setBackground(new java.awt.Color(41, 128, 185));

        tableEmployee.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Alamat", "No. HP", "Jenis Kelamin", "Jabatan", "Divisi", "Cabang", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmployee.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableEmployee.getTableHeader().setReorderingAllowed(false);
        tableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeeMouseClicked(evt);
            }
        });
        scrollpaneTableEmployee.setViewportView(tableEmployee);

        labelKeyword.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        labelKeyword.setForeground(new java.awt.Color(255, 255, 255));
        labelKeyword.setText("Kata Kunci");

        inputKeyword.setFont(new java.awt.Font("Open Sans Medium", 0, 12)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(26, 188, 156));
        btnSearch.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelKeyword)
                .addGap(18, 18, 18)
                .addComponent(inputKeyword, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollpaneTableEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTableLayout.createSequentialGroup()
                    .addComponent(scrollpaneTableEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 93, Short.MAX_VALUE)))
        );

        labelTitle.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Data Karyawan");
        labelTitle.setAlignmentX(0.5F);

        btnBack.setBackground(new java.awt.Color(26, 188, 156));
        btnBack.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Main Menu");
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setMaximumSize(new java.awt.Dimension(90, 25));
        btnBack.setMinimumSize(new java.awt.Dimension(90, 25));
        btnBack.setPreferredSize(new java.awt.Dimension(90, 25));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(231, 76, 60));
        btnLogout.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setMaximumSize(new java.awt.Dimension(90, 25));
        btnLogout.setMinimumSize(new java.awt.Dimension(90, 25));
        btnLogout.setPreferredSize(new java.awt.Dimension(90, 25));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(panelnput, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelnput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Cek pilihan jenis kelamin
        if (radiobtnMale.isSelected()) {
            gender = radiobtnMale.getText();
        } else if (radiobtnFemale.isSelected()) {
            gender = radiobtnFemale.getText();
        }

        // Cek apakah masi ada field yang kosong
        if (inputName.getText().isEmpty()
                || inputAddress.getText().isEmpty()
                || inputPhoneNumber.getText().isEmpty()
                || gender.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan, masih ada field kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!validator.isValidInput(inputName.getText())) {
            
        }

        // Memanggil metode addEmployee untuk menambahkan data karyawan
        isSuccess = employee.addEmployee(
                inputID.getText(),
                inputName.getText(),
                inputAddress.getText(),
                inputPhoneNumber.getText(),
                gender,
                comboOccupation.getSelectedIndex(),
                comboDepartment.getSelectedIndex(),
                comboBranch.getSelectedIndex()
        );

        // Memeriksa apakah penambahan data berhasil atau tidak
        if (isSuccess) {
            // set id pada inputan dengan nilai yang sudah ditentukan
            inputID.setText(employee.lastEmployeeID());

            core.dataTable(columnNames, column, tableModel, tableEmployee, query);

            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

            // Jika berhasil, tampilkan pesan berhasil
            JOptionPane.showMessageDialog(null, "Data karyawan berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            core.dataTable(columnNames, column, tableModel, tableEmployee, query);

            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

            // Jika gagal, tampilkan pesan gagal
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data karyawan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (radiobtnMale.isSelected()) {
            gender = radiobtnMale.getText();
        } else if (radiobtnFemale.isSelected()) {
            gender = radiobtnFemale.getText();
        }

        if (inputName.getText().isEmpty()
                || inputAddress.getText().isEmpty()
                || inputPhoneNumber.getText().isEmpty()
                || gender.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan, masih ada field kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Memanggil metode addEmployee untuk menambahkan data karyawan
        isSuccess = employee.updateEmployee(
                inputID.getText(),
                inputName.getText(),
                inputAddress.getText(),
                inputPhoneNumber.getText(),
                gender,
                comboOccupation.getSelectedIndex(),
                comboDepartment.getSelectedIndex(),
                comboBranch.getSelectedIndex()
        );

        // Memeriksa apakah perubahan data berhasil atau tidak
        if (isSuccess) {
            // set id pada inputan dengan nilai yang sudah ditentukan
            inputID.setText(employee.lastEmployeeID());

            core.dataTable(columnNames, column, tableModel, tableEmployee, query);

            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

            // Jika berhasil, tampilkan pesan berhasil
            JOptionPane.showMessageDialog(null, "Data karyawan berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            core.dataTable(columnNames, column, tableModel, tableEmployee, query);

            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

            // Jika gagal, tampilkan pesan gagal
            JOptionPane.showMessageDialog(null, "Gagal mengubah data karyawan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan menon-aktifkan karyawan ini?", "Deactivate Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Memanggil metode deleteEmployee untuk menghapus data karyawan
            isSuccess = employee.deactivateEmployee(inputID.getText());

            // Memeriksa apakah penghapusan data berhasil atau tidak
            if (isSuccess) {
                // set id pada inputan dengan nilai yang sudah ditentukan
                inputID.setText(employee.lastEmployeeID());

                core.dataTable(columnNames, column, tableModel, tableEmployee, query);

                core.emptyInput(inputName, inputPhoneNumber);
                core.emptyInputArea(inputAddress);
                core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

                // Jika berhasil, tampilkan pesan berhasil
                JOptionPane.showMessageDialog(null, "Data karyawan berhasil dinon-aktifkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                core.dataTable(columnNames, column, tableModel, tableEmployee, query);

                core.emptyInput(inputName, inputPhoneNumber);
                core.emptyInputArea(inputAddress);
                core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

                // Jika gagal, tampilkan pesan gagal
                JOptionPane.showMessageDialog(null, "Gagal menghapus data karyawan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeeMouseClicked
        int bar = tableEmployee.getSelectedRow();

        String rowData1 = tableModel.getValueAt(bar, 0).toString();
        String rowData2 = tableModel.getValueAt(bar, 1).toString();
        String rowData3 = tableModel.getValueAt(bar, 2).toString();
        String rowData4 = tableModel.getValueAt(bar, 3).toString();
        String rowData5 = tableModel.getValueAt(bar, 4).toString();
        String rowData6 = tableModel.getValueAt(bar, 5).toString();
        String rowData7 = tableModel.getValueAt(bar, 6).toString();
        String rowData8 = tableModel.getValueAt(bar, 7).toString();

        btnSave.setEnabled(false);

        inputID.setText(rowData1);
        inputName.setText(rowData2);
        inputAddress.setText(rowData3);
        inputPhoneNumber.setText(rowData4);

        if (rowData5.equals(radiobtnMale.getText())) {
            radiobtnMale.setSelected(true);
        } else if (rowData5.equals(radiobtnFemale.getText())) {
            radiobtnFemale.setSelected(true);
        }

        comboOccupation.setSelectedItem(rowData6);
        comboDepartment.setSelectedItem(rowData7);
        comboBranch.setSelectedItem(rowData8);
    }//GEN-LAST:event_tableEmployeeMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        core.emptyInput(inputID, inputName, inputPhoneNumber);
        core.emptyInputArea(inputAddress);
        core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

        btnSave.setEnabled(true);

        // set id pada inputan dengan nilai yang sudah ditentukan
        inputID.setText(employee.lastEmployeeID());
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        core.emptyInput(inputID, inputName, inputPhoneNumber);
        core.emptyInputArea(inputAddress);
        core.emptyCombo(comboBranch, comboDepartment, comboOccupation);

        this.dispose();

        main_menu formMainMenu = new main_menu();
        formMainMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();

            login formLogin = new login();
            formLogin.setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new employee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboBranch;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JComboBox<String> comboOccupation;
    private javax.swing.JTextArea inputAddress;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputKeyword;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhoneNumber;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelBranch;
    private javax.swing.JLabel labelDepartment;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelKeyword;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelOccupation;
    private javax.swing.JLabel labelPhoneNumber;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelTable;
    private javax.swing.JPanel panelnput;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JScrollPane scrollpaneAddress;
    private javax.swing.JScrollPane scrollpaneTableEmployee;
    private javax.swing.JTable tableEmployee;
    // End of variables declaration//GEN-END:variables
}
