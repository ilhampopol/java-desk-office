package views;

import controllers.Auth;
import controllers.Core;
import helper.InputValidator;
import javax.swing.JOptionPane;

public class registration extends javax.swing.JFrame {

    login formLogin = new login();
    Auth auth = new Auth();

    public registration() {
        initComponents();

        Core.addPlaceholder(inputUsername, "Masukkan username");
        Core.addPlaceholder(inputPassword, "Masukkan password");

        btnConfirm.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Registration");

        btnConfirm.setBackground(new java.awt.Color(46, 204, 113));
        btnConfirm.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("<< Back to Login");
        labelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelLogin)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(inputUsername, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnConfirm)
                .addGap(20, 20, 20)
                .addComponent(labelLogin)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void labelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLoginMouseClicked
        this.dispose();

        formLogin.setVisible(true);
    }//GEN-LAST:event_labelLoginMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
// Mengambil inputan dari form Login
        String username = inputUsername.getText();
        String password = new String(inputPassword.getPassword()); // Mengubah char[] password menjadi String

        // Melakukan validasi input username dan password
        if (inputUsername.getText().equals("") || inputPassword.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh kosong!");
            Core.addPlaceholder(inputUsername, "Masukkan username");
            Core.addPlaceholder(inputPassword, "Masukkan password");
            return; // Keluar dari method jika username tidak valid
        } else if (!InputValidator.isValidUsername(username)) {
            JOptionPane.showMessageDialog(null, "Username harus terdiri dari minimal 5 karakter, hanya huruf dan angka, tanpa spasi");
            Core.addPlaceholder(inputUsername, "Masukkan username");
            inputUsername.requestFocus(); // Fokus kembali ke input username
            return; // Keluar dari method jika username tidak valid
        } else if (!InputValidator.isValidPassword(password)) {
            JOptionPane.showMessageDialog(null, "Password harus terdiri dari minimal 8 karakter, minimal satu huruf besar, satu huruf kecil, dan satu angka");
            Core.addPlaceholder(inputPassword, "Masukkan password");
            inputPassword.requestFocus(); // Fokus kembali ke input password
            return; // Keluar dari method jika password tidak valid
        } else {
            if (auth.registerUser(username, password)) {
                int choice = JOptionPane.showConfirmDialog(null, "Registrasi berhasil, apakah anda ingin kembali ke halaman login?", "Registration Successful", JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    // Tutup form Regis
                    this.dispose();

                    // Munculkan form Login
                    formLogin.setVisible(true);
                } else {
                    Core.addPlaceholder(inputUsername, "Masukkan username");
                    Core.addPlaceholder(inputPassword, "Masukkan password");

                    btnConfirm.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogin;
    // End of variables declaration//GEN-END:variables
}
