package views;

import javax.swing.JOptionPane;

class main_menu extends javax.swing.JFrame {

    public main_menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnKaryawan = new javax.swing.JButton();
        btnJabatan = new javax.swing.JButton();
        btnCuti = new javax.swing.JButton();
        btnCabang = new javax.swing.JButton();
        btnAbsensi = new javax.swing.JButton();
        btnMutasi = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setPreferredSize(new java.awt.Dimension(800, 560));

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMutasi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCuti, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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

        btnLogout.setBackground(new java.awt.Color(26, 188, 156));
        btnLogout.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setPreferredSize(new java.awt.Dimension(80, 25));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaryawanActionPerformed
        karyawan formKaryawan = new karyawan();

        this.dispose();

        formKaryawan.setVisible(true);
    }//GEN-LAST:event_btnKaryawanActionPerformed

    private void btnJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJabatanActionPerformed
        jabatan formJabatan = new jabatan();

        this.dispose();

        formJabatan.setVisible(true);
    }//GEN-LAST:event_btnJabatanActionPerformed

    private void btnCutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutiActionPerformed

    }//GEN-LAST:event_btnCutiActionPerformed

    private void btnCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabangActionPerformed

    }//GEN-LAST:event_btnCabangActionPerformed

    private void btnAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsensiActionPerformed

    }//GEN-LAST:event_btnAbsensiActionPerformed

    private void btnMutasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutasiActionPerformed

    }//GEN-LAST:event_btnMutasiActionPerformed

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
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
