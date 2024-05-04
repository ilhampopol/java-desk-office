package views;

import javax.swing.JOptionPane;

class main_menu extends javax.swing.JFrame {

    public main_menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnKaryawan = new javax.swing.JButton();
        btnJabatan = new javax.swing.JButton();
        btnCuti = new javax.swing.JButton();
        btnCabang = new javax.swing.JButton();
        btnAbsensi = new javax.swing.JButton();
        btnMutasi = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setPreferredSize(new java.awt.Dimension(800, 560));

        panelMenu.setBackground(new java.awt.Color(41, 128, 185));

        btnKaryawan.setBackground(new java.awt.Color(26, 188, 156));
        btnKaryawan.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        btnKaryawan.setText("Karyawan");
        btnKaryawan.setBorder(null);
        btnKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaryawanActionPerformed(evt);
            }
        });

        btnJabatan.setBackground(new java.awt.Color(26, 188, 156));
        btnJabatan.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnJabatan.setForeground(new java.awt.Color(255, 255, 255));
        btnJabatan.setText("Jabatan");
        btnJabatan.setBorder(null);
        btnJabatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJabatanActionPerformed(evt);
            }
        });

        btnCuti.setBackground(new java.awt.Color(26, 188, 156));
        btnCuti.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnCuti.setForeground(new java.awt.Color(255, 255, 255));
        btnCuti.setText("Cuti");
        btnCuti.setBorder(null);
        btnCuti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCuti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutiActionPerformed(evt);
            }
        });

        btnCabang.setBackground(new java.awt.Color(26, 188, 156));
        btnCabang.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnCabang.setForeground(new java.awt.Color(255, 255, 255));
        btnCabang.setText("Cabang");
        btnCabang.setBorder(null);
        btnCabang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabangActionPerformed(evt);
            }
        });

        btnAbsensi.setBackground(new java.awt.Color(26, 188, 156));
        btnAbsensi.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnAbsensi.setForeground(new java.awt.Color(255, 255, 255));
        btnAbsensi.setText("Absensi");
        btnAbsensi.setBorder(null);
        btnAbsensi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsensiActionPerformed(evt);
            }
        });

        btnMutasi.setBackground(new java.awt.Color(26, 188, 156));
        btnMutasi.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnMutasi.setForeground(new java.awt.Color(255, 255, 255));
        btnMutasi.setText("Mutasi");
        btnMutasi.setBorder(null);
        btnMutasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMutasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMutasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(btnMutasi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCuti, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCuti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnMutasi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnLogout.setBackground(new java.awt.Color(231, 76, 60));
        btnLogout.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setPreferredSize(new java.awt.Dimension(80, 25));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaryawanActionPerformed
        this.dispose();
        
        employee formEmployee = new employee();
        formEmployee.setVisible(true);
    }//GEN-LAST:event_btnKaryawanActionPerformed

    private void btnJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJabatanActionPerformed
        this.dispose();
        
        occupation formOccupation = new occupation();
        formOccupation.setVisible(true);
    }//GEN-LAST:event_btnJabatanActionPerformed

    private void btnCutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutiActionPerformed
        this.dispose();
        
        leave formLeave = new leave();
        formLeave.setVisible(true);
    }//GEN-LAST:event_btnCutiActionPerformed

    private void btnCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabangActionPerformed
        this.dispose();
        
        branch formBranch = new branch();
        formBranch.setVisible(true);
    }//GEN-LAST:event_btnCabangActionPerformed

    private void btnAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsensiActionPerformed

    }//GEN-LAST:event_btnAbsensiActionPerformed

    private void btnMutasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutasiActionPerformed

    }//GEN-LAST:event_btnMutasiActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // Memunculkan konfirmasi logout
        int choice = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        // Jika user memilih ya, maka akan kembali ke form Login
        if (choice == JOptionPane.YES_OPTION) {
            // Tutup form yang sedang aktif
            this.dispose();

            // Memunculkan form Login
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
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new main_menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbsensi;
    private javax.swing.JButton btnCabang;
    private javax.swing.JButton btnCuti;
    private javax.swing.JButton btnJabatan;
    private javax.swing.JButton btnKaryawan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMutasi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
