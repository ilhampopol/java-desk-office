package views;

import controllers.Core;
import controllers.Employee;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class leave extends javax.swing.JFrame {

    Core core = new Core();
    Employee employee = new Employee();

    // PERTANGGALAN DUNIAWI
    // Mengambil tanggal dari objek
    SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
    // Mengambil tanggal saat ini
    LocalDate currentDate = LocalDate.now();
    // Membuat formatter untuk format yang diinginkan
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    DefaultTableModel tableModel = new DefaultTableModel();
    Object[] column = {"id", "date1", "date2", "employee_id", "name", "note"};
    Object[] columnNames = {"No.Pengajuan", "Dari", "Sampai", "ID Karyawan", "Nama", "Alasan"};
    String query = "SELECT l.id, l.date1, l.date2, l.employee_id, e.name AS name, l.note FROM javadesk_app.leave AS l JOIN employee AS e ON l.employee_id = e.id WHERE l.id != ''";

    public leave() {
        initComponents();

        // munculkan data pada table
        core.dataTable(columnNames, column, tableModel, tableLeave, query);

        // set id pada inputan dengan nilai yang sudah ditentukan
        inputID.setText("C" + core.lastIdByDate("javadesk_app.leave", currentDate.format(formatter)));

        // Placeholder
        core.addPlaceholder(inputKeyword, "Cari data karyawan menggunakan ID");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelEmployeeID = new javax.swing.JLabel();
        labelEmployeeName = new javax.swing.JLabel();
        labelNote = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        inputID = new javax.swing.JTextField();
        inputEmployeeID = new javax.swing.JTextField();
        inputEmployeeName = new javax.swing.JTextField();
        inputDate1 = new com.toedter.calendar.JDateChooser();
        inputDate2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputNote = new javax.swing.JTextArea();
        labelTo = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        btnSearchEmployeeID = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLeave = new javax.swing.JTable();
        labelKeyword = new javax.swing.JLabel();
        inputKeyword = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(0, 0, 102));

        labelTitle.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Data Cuti");

        inputPanel.setBackground(new java.awt.Color(41, 128, 185));

        labelID.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(204, 204, 204));
        labelID.setText("No. Pengajuan");

        labelDate.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelDate.setForeground(new java.awt.Color(204, 204, 204));
        labelDate.setText("Tanggal");

        labelEmployeeID.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelEmployeeID.setForeground(new java.awt.Color(204, 204, 204));
        labelEmployeeID.setText("ID Karyawan");

        labelEmployeeName.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelEmployeeName.setForeground(new java.awt.Color(204, 204, 204));
        labelEmployeeName.setText("Nama");

        labelNote.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelNote.setForeground(new java.awt.Color(204, 204, 204));
        labelNote.setText("Alasan");

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

        inputID.setEditable(false);
        inputID.setAutoscrolls(false);
        inputID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        inputNote.setColumns(20);
        inputNote.setRows(5);
        jScrollPane1.setViewportView(inputNote);

        labelTo.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        labelTo.setForeground(new java.awt.Color(204, 204, 204));
        labelTo.setText("s.d");

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

        btnSearchEmployeeID.setBackground(new java.awt.Color(26, 188, 156));
        btnSearchEmployeeID.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        btnSearchEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchEmployeeID.setText("Cari");
        btnSearchEmployeeID.setBorder(null);
        btnSearchEmployeeID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchEmployeeID.setPreferredSize(new java.awt.Dimension(70, 25));
        btnSearchEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelID)
                            .addComponent(labelDate))
                        .addGap(20, 20, 20)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputID)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(inputDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEmployeeID)
                                    .addComponent(labelEmployeeName)
                                    .addComponent(labelNote))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                                            .addComponent(inputEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSearchEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDate)
                    .addComponent(inputDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputDate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelEmployeeID))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelEmployeeName))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(inputEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNote)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tablePanel.setBackground(new java.awt.Color(41, 128, 185));

        tableLeave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No. Pengajuan", "Dari", "Sampai", "ID Karyawan", "Nama Karyawan", "Alasan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLeave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableLeave.getTableHeader().setReorderingAllowed(false);
        tableLeave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLeaveMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableLeave);

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

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelKeyword)
                .addGap(18, 18, 18)
                .addComponent(inputKeyword)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            LocalDate date1 = LocalDate.parse(simpleDate.format(inputDate1.getDate()));
            LocalDate date2 = LocalDate.parse(simpleDate.format(inputDate2.getDate()));

            if (inputID.getText().isBlank() || inputEmployeeName.getText().isBlank() || inputNote.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon lengkapi semua field!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (date1.isBefore(currentDate) || date2.isBefore(currentDate)) {
                JOptionPane.showMessageDialog(null, "Tanggal awal dan akhir harus setelah hari ini!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (date2.isBefore(date1)) {
                JOptionPane.showMessageDialog(null, "Tanggal akhir harus setelah tanggal awal!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String[] data = {inputID.getText(), date1.toString(), date2.toString(), inputEmployeeID.getText(), inputNote.getText()};
            core.addEntity("javadesk_app.leave", data);

            JOptionPane.showMessageDialog(null, "Data cuti berhasil ditambahkan.", "Success", JOptionPane.INFORMATION_MESSAGE);

            inputID.setText("C" + core.lastIdByDate("javadesk_app.leave", currentDate.format(formatter)));
            inputDate1.setDate(null);
            inputDate2.setDate(null);

            core.dataTable(columnNames, column, tableModel, tableLeave, query);
            core.emptyInput(inputEmployeeID, inputEmployeeName);
            core.emptyInputArea(inputNote);

            inputEmployeeID.setEnabled(true);
            inputEmployeeName.setEnabled(true);
            btnSearchEmployeeID.setEnabled(true);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tanggal tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            LocalDate date1 = LocalDate.parse(simpleDate.format(inputDate1.getDate()));
            LocalDate date2 = LocalDate.parse(simpleDate.format(inputDate2.getDate()));

            if (inputID.getText().isBlank() || inputEmployeeName.getText().isBlank() || inputNote.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon lengkapi semua field!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (date1.isBefore(currentDate) || date2.isBefore(currentDate)) {
                JOptionPane.showMessageDialog(null, "Tanggal awal dan akhir harus setelah hari ini!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (date2.isBefore(date1)) {
                JOptionPane.showMessageDialog(null, "Tanggal akhir harus setelah tanggal awal!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String[] columns = {"date1", "date2", "note"};
            String[] data = {date1.toString(), date2.toString(), inputNote.getText()};
            String condition = "id = '" + inputID.getText() + "'";
            core.updateEntity("javadesk_app.leave", columns, data, condition);

            JOptionPane.showMessageDialog(null, "Data cuti berhasil diubah.", "Success", JOptionPane.INFORMATION_MESSAGE);

            inputID.setText("C" + core.lastIdByDate("javadesk_app.leave", currentDate.format(formatter)));
            inputDate1.setDate(null);
            inputDate2.setDate(null);

            core.dataTable(columnNames, column, tableModel, tableLeave, query);
            core.emptyInput(inputEmployeeID, inputEmployeeName);
            core.emptyInputArea(inputNote);

            inputEmployeeID.setEnabled(true);
            inputEmployeeName.setEnabled(true);
            btnSearchEmployeeID.setEnabled(true);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tanggal tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (inputID.getText().isBlank() || inputEmployeeName.getText().isBlank() || inputNote.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int choice = JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan menghapus data cuti ini?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            core.deleteEntity("javadesk_app.leave", inputID.getText());

            JOptionPane.showMessageDialog(null, "Data cuti berhasil dihapus.", "Success", JOptionPane.INFORMATION_MESSAGE);

            inputID.setText("C" + core.lastIdByDate("javadesk_app.leave", currentDate.format(formatter)));
            inputDate1.setDate(null);
            inputDate2.setDate(null);

            core.dataTable(columnNames, column, tableModel, tableLeave, query);
            core.emptyInput(inputEmployeeID, inputEmployeeName);
            core.emptyInputArea(inputNote);

            inputEmployeeID.setEnabled(true);
            inputEmployeeName.setEnabled(true);
            btnSearchEmployeeID.setEnabled(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        inputID.setText("C" + core.lastIdByDate("javadesk_app.leave", currentDate.format(formatter)));
        inputDate1.setDate(null);
        inputDate2.setDate(null);

        core.emptyInput(inputEmployeeID, inputEmployeeName);
        core.emptyInputArea(inputNote);

        inputEmployeeID.setEnabled(true);
        inputEmployeeName.setEnabled(true);
        btnSearchEmployeeID.setEnabled(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

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
        Object[] data = {"src/report/reportLeave.jasper", inputID.getText()};
        core.printReportByID(data);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeIDActionPerformed
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
            btnSearchEmployeeID.setEnabled(false);
        }
    }//GEN-LAST:event_btnSearchEmployeeIDActionPerformed

    private void tableLeaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLeaveMouseClicked
        int bar = tableLeave.getSelectedRow();

        String rowData1 = tableModel.getValueAt(bar, 0).toString();
        String rowData2 = tableModel.getValueAt(bar, 1).toString();
        String rowData3 = tableModel.getValueAt(bar, 2).toString();
        String rowData4 = tableModel.getValueAt(bar, 3).toString();
        String rowData5 = tableModel.getValueAt(bar, 4).toString();
        String rowData6 = tableModel.getValueAt(bar, 5).toString();

        LocalDate date1 = LocalDate.parse(rowData2);
        LocalDate date2 = LocalDate.parse(rowData3);

        Date newDate1 = Date.from(date1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date newDate2 = Date.from(date2.atStartOfDay(ZoneId.systemDefault()).toInstant());

        btnSave.setEnabled(false);
        btnSearchEmployeeID.setEnabled(false);
        inputEmployeeID.setEnabled(false);
        inputEmployeeName.setEnabled(false);

        inputID.setText(rowData1);
        inputDate1.setDate(newDate1);
        inputDate2.setDate(newDate2);
        inputEmployeeID.setText(rowData4);
        inputEmployeeName.setText(rowData5);
        inputNote.setText(rowData6);
    }//GEN-LAST:event_tableLeaveMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        core.search(inputKeyword.getText(), columnNames, column, tableModel, tableLeave, query);

        core.addPlaceholder(inputKeyword, "Cari data karyawan menggunakan id");
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
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new leave().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchEmployeeID;
    private com.toedter.calendar.JDateChooser inputDate1;
    private com.toedter.calendar.JDateChooser inputDate2;
    private javax.swing.JTextField inputEmployeeID;
    private javax.swing.JTextField inputEmployeeName;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputKeyword;
    private javax.swing.JTextArea inputNote;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelEmployeeID;
    private javax.swing.JLabel labelEmployeeName;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelKeyword;
    private javax.swing.JLabel labelNote;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tableLeave;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
