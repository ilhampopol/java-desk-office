package views;

import controllers.Core;
import controllers.Employee;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mutation extends javax.swing.JFrame {

    Core core = new Core();
    Employee employee = new Employee();

    // Mengambil tanggal saat ini
    LocalDate currentDate = LocalDate.now();
    // Membuat formatter untuk format yang diinginkan
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd"), formatter1, formatter2;

    DefaultTableModel tableModel = new DefaultTableModel();
    Object[] column = {"id", "date", "employee_id", "name", "occupation", "old_branch", "new_branch"};
    Object[] columnNames = {"No. Mutasi", "Tanggal", "ID Karyawan", "Nama", "Jabatan", "Cabang Lama", "Cabang Baru"};
    String query = "SELECT m.id,date,employee_id,e.name AS name,o.name AS occupation,old_branch,new_branch"
            + " FROM mutation AS m"
            + " JOIN employee AS e"
            + " ON m.employee_id = e.id"
            + " JOIN occupation AS o"
            + " ON e.occ_id = o.id"
            + " WHERE e.id != ''";

    public mutation() {
        initComponents();

        // munculkan data pada table
        core.dataTable(columnNames, column, tableModel, tableMutation, query);
        core.populateComboBox(comboNewBranch, "SELECT id, name FROM branch");

        // set id pada inputan dengan nilai yang sudah ditentukan
        inputID.setText("M" + core.lastIdByDate("javadesk_app.mutation", currentDate.format(formatter)));
        inputEmployeeName.setEnabled(false);
        inputEmployeeOccupation.setEnabled(false);

        // set id pada inputan dengan nilai yang sudah ditentukan
        formatter1 = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", new Locale("id"));
        inputDate.setText(currentDate.format(formatter1));

        // Placeholder
        core.addPlaceholder(inputKeyword, "Cari data karyawan menggunakan ID");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelID1 = new javax.swing.JLabel();
        labelID2 = new javax.swing.JLabel();
        labelID3 = new javax.swing.JLabel();
        labelID4 = new javax.swing.JLabel();
        labelID5 = new javax.swing.JLabel();
        labelID6 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        inputEmployeeID = new javax.swing.JTextField();
        comboNewBranch = new javax.swing.JComboBox<>();
        inputID = new javax.swing.JTextField();
        inputDate = new javax.swing.JTextField();
        inputEmployeeName = new javax.swing.JTextField();
        inputEmployeeOccupation = new javax.swing.JTextField();
        btnSearchEmployee = new javax.swing.JButton();
        inputOldBranch = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMutation = new javax.swing.JTable();
        labelKeyword = new javax.swing.JLabel();
        inputKeyword = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

        labelID.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(204, 204, 204));
        labelID.setText("No. Mutasi");

        labelID1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID1.setForeground(new java.awt.Color(204, 204, 204));
        labelID1.setText("Tanggal");

        labelID2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID2.setForeground(new java.awt.Color(204, 204, 204));
        labelID2.setText("ID Karyawan");

        labelID3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID3.setForeground(new java.awt.Color(204, 204, 204));
        labelID3.setText("Nama");

        labelID4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID4.setForeground(new java.awt.Color(204, 204, 204));
        labelID4.setText("Jabatan");

        labelID5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID5.setForeground(new java.awt.Color(204, 204, 204));
        labelID5.setText("Cabang Lama");

        labelID6.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID6.setForeground(new java.awt.Color(204, 204, 204));
        labelID6.setText("Cabang Baru");

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

        btnPrint.setBackground(new java.awt.Color(230, 126, 34));
        btnPrint.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.setBorder(null);
        btnPrint.setBorderPainted(false);
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

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

        inputID.setEditable(false);
        inputID.setAutoscrolls(false);
        inputID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        inputDate.setEditable(false);
        inputDate.setAutoscrolls(false);
        inputDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnSearchEmployee.setBackground(new java.awt.Color(26, 188, 156));
        btnSearchEmployee.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnSearchEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchEmployee.setText("Cari");
        btnSearchEmployee.setBorder(null);
        btnSearchEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchEmployee.setPreferredSize(new java.awt.Dimension(70, 25));
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        inputOldBranch.setEditable(false);
        inputOldBranch.setAutoscrolls(false);
        inputOldBranch.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelID5)
                            .addComponent(labelID2)
                            .addComponent(labelID6)
                            .addComponent(labelID)
                            .addComponent(labelID1)
                            .addComponent(labelID3)
                            .addComponent(labelID4))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(inputEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputEmployeeOccupation)
                            .addComponent(inputEmployeeName)
                            .addComponent(inputDate)
                            .addComponent(inputID)
                            .addComponent(inputOldBranch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboNewBranch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID1)
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID2)
                    .addComponent(inputEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID3)
                    .addComponent(inputEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID4)
                    .addComponent(inputEmployeeOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID5)
                    .addComponent(inputOldBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID6)
                    .addComponent(comboNewBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        labelTitle.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Data Mutasi");
        labelTitle.setAlignmentX(0.5F);

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));

        tableMutation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Mutasi", "Tanggal", "ID Karyawan", "Nama", "Jabatan", "Cabang Lama", "Cabang Baru"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMutation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableMutation.getTableHeader().setReorderingAllowed(false);
        tableMutation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMutationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMutation);

        labelKeyword.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        labelKeyword.setForeground(new java.awt.Color(255, 255, 255));
        labelKeyword.setText("Kata Kunci");

        inputKeyword.setFont(new java.awt.Font("Open Sans Medium", 0, 12)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(26, 188, 156));
        btnSearch.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Cari");
        btnSearch.setBorder(null);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setPreferredSize(new java.awt.Dimension(70, 25));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelKeyword)
                .addGap(18, 18, 18)
                .addComponent(inputKeyword)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (inputEmployeeID.getText().isBlank() || inputEmployeeName.getText().isBlank() || inputEmployeeOccupation.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan, masih ada field kosong.", "Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (comboNewBranch.getSelectedItem().toString().equals(inputOldBranch.getText())) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan, cabang baru tidak boleh sama dengan cabang lama.", "Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String[] data = {inputID.getText(), currentDate.format(formatter2), inputEmployeeID.getText(), inputOldBranch.getText(), comboNewBranch.getSelectedItem().toString()};

            core.addEntity("mutation", data);
            core.updateBranch(inputEmployeeID.getText(), comboNewBranch.getSelectedIndex());

            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data mutasi.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // munculkan data pada table
            core.dataTable(columnNames, column, tableModel, tableMutation, query);
            core.populateComboBox(comboNewBranch, "SELECT id, name FROM branch");

            // set id pada inputan dengan nilai yang sudah ditentukan
            inputID.setText("M" + core.lastIdByDate("javadesk_app.mutation", currentDate.format(formatter)));
            inputEmployeeID.setEnabled(true);
            inputEmployeeName.setEnabled(false);
            inputEmployeeOccupation.setEnabled(false);
            btnSearchEmployee.setEnabled(true);

            // set id pada inputan dengan nilai yang sudah ditentukan
            inputDate.setText(currentDate.format(formatter1));
            core.emptyInput(inputEmployeeID, inputEmployeeName, inputEmployeeOccupation, inputOldBranch);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        Object[] data = {"src/report/reportMutation.jasper", inputID.getText()};
        core.printReportByID(data);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // set id pada inputan dengan nilai yang sudah ditentukan
        inputID.setText("M" + core.lastIdByDate("javadesk_app.mutation", currentDate.format(formatter)));

        // set id pada inputan dengan nilai yang sudah ditentukan
        formatter1 = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", new Locale("id"));
        inputDate.setText(currentDate.format(formatter1));

        core.emptyInput(inputEmployeeID, inputEmployeeName, inputEmployeeOccupation, inputOldBranch);
        inputEmployeeID.setEnabled(true);
        btnSearchEmployee.setEnabled(true);
        btnSave.setEnabled(true);

        core.populateComboBox(comboNewBranch, "SELECT id, name FROM branch");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        String[] employeeData = employee.searchEmployee(inputEmployeeID.getText());

        if (inputEmployeeID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "ID Karyawan masih kosong!");
        } else if (employeeData == null) {
            JOptionPane.showMessageDialog(null, "Data karyawan tidak ditemukan");

            inputEmployeeID.setText("");
        } else {
            inputEmployeeName.setText(employeeData[0]);
            inputEmployeeOccupation.setText(employeeData[1]);
            inputOldBranch.setText(employeeData[2]);

            inputEmployeeID.setEnabled(false);
            inputEmployeeName.setEnabled(false);
            inputEmployeeOccupation.setEnabled(false);
            btnSearchEmployee.setEnabled(false);
        }
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        core.emptyInput();

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        core.search(inputKeyword.getText(), columnNames, column, tableModel, tableMutation, query);

        core.addPlaceholder(inputKeyword, "Cari data karyawan menggunakan id");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableMutationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMutationMouseClicked
        int bar = tableMutation.getSelectedRow();

        String rowData1 = tableModel.getValueAt(bar, 0).toString();
        String rowData2 = tableModel.getValueAt(bar, 1).toString();
        String rowData3 = tableModel.getValueAt(bar, 2).toString();
        String rowData4 = tableModel.getValueAt(bar, 3).toString();
        String rowData5 = tableModel.getValueAt(bar, 4).toString();
        String rowData6 = tableModel.getValueAt(bar, 5).toString();

        btnSave.setEnabled(false);
        btnSearchEmployee.setEnabled(false);
        inputEmployeeID.setEnabled(false);

        inputID.setText(rowData1);
        inputDate.setText(rowData2);
        inputEmployeeID.setText(rowData3);
        inputEmployeeName.setText(rowData4);
        inputEmployeeOccupation.setText(rowData5);
        inputOldBranch.setText(rowData6);
    }//GEN-LAST:event_tableMutationMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mutation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new mutation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JComboBox<String> comboNewBranch;
    private javax.swing.JTextField inputDate;
    private javax.swing.JTextField inputEmployeeID;
    private javax.swing.JTextField inputEmployeeName;
    private javax.swing.JTextField inputEmployeeOccupation;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputKeyword;
    private javax.swing.JTextField inputOldBranch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelID1;
    private javax.swing.JLabel labelID2;
    private javax.swing.JLabel labelID3;
    private javax.swing.JLabel labelID4;
    private javax.swing.JLabel labelID5;
    private javax.swing.JLabel labelID6;
    private javax.swing.JLabel labelKeyword;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTable tableMutation;
    // End of variables declaration//GEN-END:variables
}
