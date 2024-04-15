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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnKaryawan.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnKaryawan.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnKaryawan.setText("Karyawan");
        btnKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaryawanActionPerformed(evt);
            }
        });

        btnJabatan.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnJabatan.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnJabatan.setText("Jabatan");
        btnJabatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJabatanActionPerformed(evt);
            }
        });

        btnCuti.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnCuti.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnCuti.setText("Cuti");
        btnCuti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCuti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutiActionPerformed(evt);
            }
        });

        btnCabang.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnCabang.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnCabang.setText("Cabang");
        btnCabang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabangActionPerformed(evt);
            }
        });

        btnAbsensi.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnAbsensi.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnAbsensi.setText("Absensi");
        btnAbsensi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsensiActionPerformed(evt);
            }
        });

        btnMutasi.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnMutasi.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnMutasi.setText("Mutasi");
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
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuti, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMutasi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuti, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMutasi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jMenu1.setText("Kelompok 2");

        jMenuItem1.setText("Ilham Muharam Rivai - 202143500929");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ahmad Fuady - 202143500853");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Zefri Andi - 202143500872");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Yonatan Silvester - 202143500944");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Muhammad Rijal Ma'arif - 202143500931");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Renaldi Fitra Budiman - 202143500933");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Firdiansyah - 202143500859");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Ardho Tillah Pratama Sidik - 202143500899");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    }//GEN-LAST:event_btnJabatanActionPerformed

    private void btnCutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutiActionPerformed

    }//GEN-LAST:event_btnCutiActionPerformed

    private void btnCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabangActionPerformed

    }//GEN-LAST:event_btnCabangActionPerformed

    private void btnAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsensiActionPerformed

    }//GEN-LAST:event_btnAbsensiActionPerformed

    private void btnMutasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutasiActionPerformed

    }//GEN-LAST:event_btnMutasiActionPerformed

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        int choice = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();

            login formLogin = new login();
            formLogin.setVisible(true);
        } else {
            // Jika pengguna membatalkan logout, tambahkan kode yang sesuai di sini
            System.out.println("Logout dibatalkan.");
        }
    }//GEN-LAST:event_menuLogoutMouseClicked

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
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbsensi;
    private javax.swing.JButton btnCabang;
    private javax.swing.JButton btnCuti;
    private javax.swing.JButton btnJabatan;
    private javax.swing.JButton btnKaryawan;
    private javax.swing.JButton btnMutasi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuLogout;
    // End of variables declaration//GEN-END:variables
}
