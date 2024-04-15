package views;

import controllers.Core;
import controllers.Employee;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class karyawan extends javax.swing.JFrame {

    Employee employee = new Employee();
    Core core = new Core();
    DefaultTableModel tableModel;

    private void dataTable() {
        Object[] columnNames = {"ID", "Nama", "Alamat", "No.HP", "Jenis Kelamin", "Jabatan", "Divisi", "Cabang"};
        tableModel = new DefaultTableModel(null, columnNames);
        tableEmployee.setModel(tableModel);

        List<String[]> employeeData = employee.getAllEmployee();

        for (String[] rowData : employeeData) {
            tableModel.addRow(rowData);
        }

        // Mengatur kolom ID menjadi tersembunyi
        int columnIndex = 0; // Kolom ID
        tableEmployee.getColumnModel().getColumn(columnIndex).setMinWidth(0);
        tableEmployee.getColumnModel().getColumn(columnIndex).setMaxWidth(0);
        tableEmployee.getColumnModel().getColumn(columnIndex).setWidth(0);
    }

    public karyawan() {
        initComponents();
        dataTable();
        core.emptyInput(inputID, inputName, inputPhoneNumber);
        core.emptyInputArea(inputAddress);
        core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox<>();
        comboOccupation = new javax.swing.JComboBox<>();
        inputPhoneNumber = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAddress = new javax.swing.JTextArea();
        comboDepartment = new javax.swing.JComboBox<>();
        comboBranch = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        inputID = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        group2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Karyawan");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Karyawan");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel9.setText("Nama");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel10.setText("Alamat");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel11.setText("No. HP");

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel12.setText("Jenis Kelamin");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel13.setText("Jabatan");

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel14.setText("Divisi");

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel15.setText("Cabang");

        comboGender.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pria", "Wanita" }));
        comboGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comboOccupation.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        comboOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Staf", "Supervisi", "Kepala Divisi", "Manajer", "Direktur" }));
        comboOccupation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboOccupation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inputPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputAddress.setColumns(12);
        inputAddress.setRows(3);
        inputAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(inputAddress);

        comboDepartment.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        comboDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Accounting", "Finance", "Internal Audit", "Human Resource", "General Affair", "Operation", "Merchandiser", "Warehouse", "Information Technology" }));
        comboDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comboBranch.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        comboBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Jakarta", "Bogor", "Depok", "Tangerang", "Bekasi", "Serang", "Bandung", "Jogjakarta", "Semarang", "Surabaya" }));
        comboBranch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboBranch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tableEmployee.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Alamat", "No. HP", "Jenis Kelamin", "Jabatan", "Divisi", "Cabang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jScrollPane2.setViewportView(tableEmployee);

        btnSave.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnEdit.setText("Edit");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back To Main Menu");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setText("Clear All");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        inputID.setEditable(false);
        inputID.setBackground(new java.awt.Color(255, 255, 255));
        inputID.setForeground(new java.awt.Color(255, 255, 255));
        inputID.setAutoscrolls(false);
        inputID.setBorder(null);
        inputID.setCaretColor(new java.awt.Color(255, 255, 255));
        inputID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputID.setEnabled(false);
        inputID.setFocusable(false);
        inputID.setHighlighter(null);
        inputID.setRequestFocusEnabled(false);
        inputID.setSelectionColor(new java.awt.Color(255, 255, 255));
        inputID.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputPhoneNumber)
                                    .addComponent(jScrollPane1)
                                    .addComponent(inputName)))
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnClear))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(67, 67, 67)
                                        .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(314, 314, 314)
                    .addComponent(jLabel15)
                    .addGap(18, 18, 18)
                    .addComponent(comboBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(inputPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(comboBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(459, Short.MAX_VALUE)))
        );

        group2.setText("Kelompok 2");

        jMenuItem1.setText("Ilham Muharam Rivai - 202143500929");
        group2.add(jMenuItem1);

        jMenuItem2.setText("Ahmad Fuady - 202143500853");
        group2.add(jMenuItem2);

        jMenuItem3.setText("Zefri Andi - 202143500872");
        group2.add(jMenuItem3);

        jMenuItem4.setText("Yonatan Silvester - 202143500944");
        group2.add(jMenuItem4);

        jMenuItem5.setText("Muhammad Rijal Ma'arif - 202143500931");
        group2.add(jMenuItem5);

        jMenuItem6.setText("Renaldi Fitra Budiman - 202143500933");
        group2.add(jMenuItem6);

        jMenuItem7.setText("Firdiansyah - 202143500859");
        group2.add(jMenuItem7);

        jMenuItem8.setText("Ardho Tillah Pratama Sidik - 202143500899");
        group2.add(jMenuItem8);

        jMenuBar1.add(group2);

        menuLogout.setText("Logout");
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        int choice = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();

            login formLogin = new login();
            formLogin.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_menuLogoutMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Memanggil metode addEmployee untuk menambahkan data karyawan
        boolean isSuccess = employee.addEmployee(
                inputName.getText(),
                inputAddress.getText(),
                inputPhoneNumber.getText(),
                comboGender.getSelectedItem().toString(),
                comboOccupation.getSelectedItem().toString(),
                comboDepartment.getSelectedItem().toString(),
                comboBranch.getSelectedItem().toString()
        );

        // Memeriksa apakah penambahan data berhasil atau tidak
        if (isSuccess) {
            dataTable();
            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);

            // Jika berhasil, tampilkan pesan berhasil
            JOptionPane.showMessageDialog(null, "Data karyawan berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            dataTable();
            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);

            // Jika gagal, tampilkan pesan gagal
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data karyawan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Memanggil metode updateEmployee untuk mengubah data karyawan
        boolean isSuccess = employee.updateEmployee(
                Integer.parseInt(inputID.getText()),
                inputName.getText(),
                inputAddress.getText(),
                inputPhoneNumber.getText(),
                comboGender.getSelectedItem().toString(),
                comboOccupation.getSelectedItem().toString(),
                comboDepartment.getSelectedItem().toString(),
                comboBranch.getSelectedItem().toString()
        );

        // Memeriksa apakah perubahan data berhasil atau tidak
        if (isSuccess) {
            dataTable();
            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);

            // Jika berhasil, tampilkan pesan berhasil
            JOptionPane.showMessageDialog(null, "Data karyawan berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            dataTable();
            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);

            // Jika gagal, tampilkan pesan gagal
            JOptionPane.showMessageDialog(null, "Gagal mengubah data karyawan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Memanggil metode deleteEmployee untuk menghapus data karyawan
        boolean isSuccess = employee.deleteEmployee(Integer.parseInt(inputID.getText()));

        // Memeriksa apakah penghapusan data berhasil atau tidak
        if (isSuccess) {
            dataTable();
            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);

            // Jika berhasil, tampilkan pesan berhasil
            JOptionPane.showMessageDialog(null, "Data karyawan berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            dataTable();
            core.emptyInput(inputName, inputPhoneNumber);
            core.emptyInputArea(inputAddress);
            core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);

            // Jika gagal, tampilkan pesan gagal
            JOptionPane.showMessageDialog(null, "Gagal menghapus data karyawan!", "Error", JOptionPane.ERROR_MESSAGE);
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

        inputID.setText(rowData1);
        inputName.setText(rowData2);
        inputAddress.setText(rowData3);
        inputPhoneNumber.setText(rowData4);

        comboGender.setSelectedItem(rowData5);
        comboOccupation.setSelectedItem(rowData6);
        comboDepartment.setSelectedItem(rowData7);
        comboBranch.setSelectedItem(rowData8);
    }//GEN-LAST:event_tableEmployeeMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        core.emptyInput(inputID, inputName, inputPhoneNumber);
        core.emptyInputArea(inputAddress);
        core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        core.emptyInput(inputID, inputName, inputPhoneNumber);
        core.emptyInputArea(inputAddress);
        core.emptyCombo(comboBranch, comboDepartment, comboGender, comboOccupation);

        this.dispose();

        main_menu formMainMenu = new main_menu();
        formMainMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBranch;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JComboBox<String> comboOccupation;
    private javax.swing.JMenu group2;
    private javax.swing.JTextArea inputAddress;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhoneNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JTable tableEmployee;
    // End of variables declaration//GEN-END:variables
}
