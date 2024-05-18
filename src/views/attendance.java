package views;

import controllers.Core;
import controllers.Employee;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class attendance extends javax.swing.JFrame {

    Core core = new Core();
    Employee employee = new Employee();

    SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
    // Mendapatkan waktu saat ini
    LocalTime currentTime = LocalTime.now();
    // Mengambil tanggal saat ini
    LocalDate currentDate = LocalDate.now();
    // Membuat formatter untuk format yang diinginkan
    DateTimeFormatter formatter1, formatter2, formatter3;

    DefaultTableModel tableModel = new DefaultTableModel();
    Object[] column = {"date", "employee_id", "name", "in", "out"};
    Object[] columnNames = {"Tanggal", "ID Karyawan", "Nama", "Masuk", "Pulang"};
    String query = "SELECT a.date, a.employee_id, e.name AS name, a.in, a.out FROM attendance AS a JOIN employee AS e ON a.employee_id = e.id WHERE a.date = '" + currentDate + "'";

    public attendance() {
        initComponents();

        formatter1 = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", new Locale("id"));

        core.dataTable(columnNames, column, tableModel, tableAttendance, query);

        // set id pada inputan dengan nilai yang sudah ditentukan
        inputDate.setText(currentDate.format(formatter1));

        // Placeholder
        core.addPlaceholder(inputKeyword, "Cari data karyawan menggunakan id");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelEmployeeID = new javax.swing.JLabel();
        labelEmployeeName = new javax.swing.JLabel();
        labelClockIn = new javax.swing.JLabel();
        labelClockOut = new javax.swing.JLabel();
        inputEmployeeID = new javax.swing.JTextField();
        inputEmployeeName = new javax.swing.JTextField();
        inputClockIn = new javax.swing.JTextField();
        inputClockOut = new javax.swing.JTextField();
        btnSearchEmployee = new javax.swing.JButton();
        inputDate = new javax.swing.JTextField();
        btnClockIn = new javax.swing.JButton();
        btnClockOut = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAttendance = new javax.swing.JTable();
        inputSearchDate1 = new com.toedter.calendar.JDateChooser();
        inputSearchDate2 = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        labelTo = new javax.swing.JLabel();
        inputKeyword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

        labelID.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(204, 204, 204));
        labelID.setText("Tanggal");

        labelEmployeeID.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelEmployeeID.setForeground(new java.awt.Color(204, 204, 204));
        labelEmployeeID.setText("ID Karyawan");

        labelEmployeeName.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelEmployeeName.setForeground(new java.awt.Color(204, 204, 204));
        labelEmployeeName.setText("Nama");

        labelClockIn.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelClockIn.setForeground(new java.awt.Color(204, 204, 204));
        labelClockIn.setText("Jam Masuk");

        labelClockOut.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelClockOut.setForeground(new java.awt.Color(204, 204, 204));
        labelClockOut.setText("Jam Keluar");

        inputClockIn.setEditable(false);
        inputClockIn.setEnabled(false);
        inputClockIn.setFocusable(false);

        inputClockOut.setEditable(false);
        inputClockOut.setEnabled(false);
        inputClockOut.setFocusable(false);

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

        inputDate.setEditable(false);
        inputDate.setAutoscrolls(false);
        inputDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnClockIn.setBackground(new java.awt.Color(52, 152, 219));
        btnClockIn.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnClockIn.setForeground(new java.awt.Color(255, 255, 255));
        btnClockIn.setText("Clock In");
        btnClockIn.setBorder(null);
        btnClockIn.setBorderPainted(false);
        btnClockIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClockInActionPerformed(evt);
            }
        });

        btnClockOut.setBackground(new java.awt.Color(46, 204, 113));
        btnClockOut.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnClockOut.setForeground(new java.awt.Color(255, 255, 255));
        btnClockOut.setText("Clock Out");
        btnClockOut.setBorder(null);
        btnClockOut.setBorderPainted(false);
        btnClockOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClockOutActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmployeeID)
                            .addComponent(labelEmployeeName)
                            .addComponent(labelClockIn)
                            .addComponent(labelClockOut)
                            .addComponent(labelID))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(inputEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputEmployeeName)
                                    .addComponent(inputClockOut)
                                    .addComponent(inputClockIn)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnClockIn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClockOut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmployeeID)
                    .addComponent(inputEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmployeeName)
                    .addComponent(inputEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClockIn)
                    .addComponent(inputClockIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClockOut)
                    .addComponent(inputClockOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClockOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClockIn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTitle.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Data Absensi");
        labelTitle.setAlignmentX(0.5F);

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));

        tableAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "ID Karyawan", "Nama", "Masuk", "Pulang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAttendanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAttendance);

        inputSearchDate1.setDateFormatString("yyyy-MM-dd");
        inputSearchDate1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        inputSearchDate1.setMaxSelectableDate(new java.util.Date(1893434493000L));
        inputSearchDate1.setMinSelectableDate(new java.util.Date(946663293000L));

        inputSearchDate2.setDateFormatString("yyyy-MM-dd");
        inputSearchDate2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        inputSearchDate2.setMaxSelectableDate(new java.util.Date(1893434493000L));
        inputSearchDate2.setMinSelectableDate(new java.util.Date(946663293000L));

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

        labelTo.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelTo.setForeground(new java.awt.Color(204, 204, 204));
        labelTo.setText("s.d");

        inputKeyword.setFont(new java.awt.Font("Open Sans Medium", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputKeyword)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(inputSearchDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSearchDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(inputKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputSearchDate2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(inputSearchDate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClockInActionPerformed
        if (inputEmployeeID.getText().isBlank() || inputEmployeeName.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Data karyawan masih kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String[] data = {null, inputEmployeeID.getText(), currentDate.format(formatter2), currentTime.format(formatter3), "-"};

        boolean attCheck = core.checkClockIn(inputEmployeeID.getText(), currentDate.format(formatter2));
        if (attCheck) {
            JOptionPane.showMessageDialog(null, "Sudah absen masuk hari ini.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            core.addEntity("attendance", data);

            JOptionPane.showMessageDialog(null, "Berhasil absen.", "Success", JOptionPane.INFORMATION_MESSAGE);

            core.dataTable(columnNames, column, tableModel, tableAttendance, query);
            core.emptyInput(inputEmployeeID, inputEmployeeName);

            inputEmployeeID.setEnabled(true);
            inputEmployeeName.setEnabled(true);
            btnSearchEmployee.setEnabled(true);
        }
    }//GEN-LAST:event_btnClockInActionPerformed

    private void btnClockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClockOutActionPerformed
        if (inputEmployeeID.getText().isBlank() || inputEmployeeName.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Data karyawan masih kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String[] columns = {"attendance.out"};
        String[] data = {currentTime.format(formatter3)};
        String condition = "employee_id = '" + inputEmployeeID.getText() + "' AND date = '" + currentDate.format(formatter2) + "'";

        boolean attCheck = core.checkClockOut(inputEmployeeID.getText(), currentDate.format(formatter2));
        if (attCheck) {
            core.updateEntity("attendance", columns, data, condition);

            JOptionPane.showMessageDialog(null, "Berhasil absen.", "Success", JOptionPane.INFORMATION_MESSAGE);

            core.dataTable(columnNames, column, tableModel, tableAttendance, query);
            core.emptyInput(inputEmployeeID, inputEmployeeName);

            inputEmployeeID.setEnabled(true);
            inputEmployeeName.setEnabled(true);
            btnSearchEmployee.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sudah absen pulang hari ini.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnClockOutActionPerformed

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

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            String employee_id;
            String date1 = simpleDate.format(inputSearchDate1.getDate());
            String date2 = simpleDate.format(inputSearchDate2.getDate());

            if (inputEmployeeID.getText().isBlank()) {
                int choice = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mencetak semua data?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    core.printReport("src/report/reportAttendanceAll.jasper");
                }
            } else {
                employee_id = inputEmployeeID.getText();
                Object[] data = {"src/report/reportAttendance.jasper", employee_id, date1, date2};
                core.printReportByID(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tanggal tidak boleh kosong!");
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        inputDate.setText(currentDate.format(formatter1));

        core.emptyInput(inputEmployeeID, inputEmployeeName, inputClockIn, inputClockOut);

        inputEmployeeID.setEnabled(true);
        inputEmployeeName.setEnabled(true);
        btnSearchEmployee.setEnabled(true);
        btnClockIn.setEnabled(true);
        btnClockOut.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        String[] employeeData = employee.searchEmployee(inputEmployeeID.getText());

        if (inputEmployeeID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "ID Karyawan masih kosong!");
        } else if (employeeData == null) {
            JOptionPane.showMessageDialog(null, "Data karyawan tidak ditemukan");

            inputEmployeeID.setText("");
        } else {
            inputEmployeeID.setEnabled(false);
            inputEmployeeName.setText(employeeData[0]);
            inputEmployeeName.setEnabled(false);
            btnSearchEmployee.setEnabled(false);
        }
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    private void tableAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAttendanceMouseClicked
        int bar = tableAttendance.getSelectedRow();

        String rowData1 = tableModel.getValueAt(bar, 0).toString();
        String rowData2 = tableModel.getValueAt(bar, 1).toString();
        String rowData3 = tableModel.getValueAt(bar, 2).toString();
        String rowData4 = tableModel.getValueAt(bar, 3).toString();
        String rowData5 = tableModel.getValueAt(bar, 4).toString();

        btnClockIn.setEnabled(false);
        btnClockOut.setEnabled(false);
        inputEmployeeID.setEnabled(false);
        inputEmployeeName.setEnabled(false);

        inputDate.setText(rowData1);
        inputEmployeeID.setText(rowData2);
        inputEmployeeName.setText(rowData3);
        inputClockIn.setText(rowData4);
        inputClockOut.setText(rowData5);
    }//GEN-LAST:event_tableAttendanceMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String keyword;
            if (inputKeyword.getText().isBlank() || inputKeyword.getText().equals("Cari data karyawan menggunakan id")) {
                keyword = "";
            } else {
                keyword = inputKeyword.getText();
            }

            String date1 = simpleDate.format(inputSearchDate1.getDate());
            String date2 = simpleDate.format(inputSearchDate2.getDate());

            Object[] param = {keyword, date1, date2};
            core.searchByDate(param, columnNames, column, tableModel, tableAttendance, query);

            core.addPlaceholder(inputKeyword, "Cari data karyawan menggunakan id");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tanggal tidak boleh kosong!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new attendance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClockIn;
    private javax.swing.JButton btnClockOut;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JTextField inputClockIn;
    private javax.swing.JTextField inputClockOut;
    private javax.swing.JTextField inputDate;
    private javax.swing.JTextField inputEmployeeID;
    private javax.swing.JTextField inputEmployeeName;
    private javax.swing.JTextField inputKeyword;
    private com.toedter.calendar.JDateChooser inputSearchDate1;
    private com.toedter.calendar.JDateChooser inputSearchDate2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClockIn;
    private javax.swing.JLabel labelClockOut;
    private javax.swing.JLabel labelEmployeeID;
    private javax.swing.JLabel labelEmployeeName;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTo;
    private javax.swing.JTable tableAttendance;
    // End of variables declaration//GEN-END:variables
}
