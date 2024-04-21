package views;

import controllers.Auth;
import controllers.Core;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    // membuat pemanggilan ulang atau alias pada controller yang di import
    Core core = new Core();
    Auth auth = new Auth();

    public login() {
        initComponents();

        Core.addPlaceholder(inputUsername, "Masukkan username");
        Core.addPlaceholder(inputPassword, "Masukkan password");

        btnLogin.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        inputPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        inputUsername = new javax.swing.JTextField();
        labelRegis = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(290, 310));
        setResizable(false);

        panelLogin.setBackground(new java.awt.Color(52, 152, 219));

        inputPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnLogin.setBackground(new java.awt.Color(46, 204, 113));
        btnLogin.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log In");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(231, 76, 60));
        btnCancel.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        inputUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        labelRegis.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        labelRegis.setForeground(new java.awt.Color(255, 255, 255));
        labelRegis.setText("Registration >>");
        labelRegis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegisMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Login");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelRegis)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnLogin))
                .addGap(18, 18, 18)
                .addComponent(labelRegis)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // kosongkan semua inputan
        core.emptyInput(inputUsername, inputPassword);

        // tutup form
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // ambil form Main Menu dan masukkan kedalam variable
        main_menu formMainMenu = new main_menu();

        // mengambil inputan dari form Login
        String username = inputUsername.getText();
        char[] password = inputPassword.getPassword();

        if (auth.authenticateUser(username, String.valueOf(password))) {
            // tutup form Login
            this.dispose();

            // hapus isi dari array password
            Arrays.fill(password, ' ');

            // munculkan form Main Menu
            formMainMenu.setVisible(true);
        } else {
            // hapus isi dari array password
            Arrays.fill(password, ' ');

            // munculkan pesan kesalahan
            JOptionPane.showMessageDialog(null, "Username atau Password salah!");

            Core.addPlaceholder(inputUsername, "Masukkan username");
            Core.addPlaceholder(inputPassword, "Masukkan password");

            btnLogin.requestFocus();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void labelRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegisMouseClicked
        this.dispose();

        registration formRegis = new registration();
        formRegis.setVisible(true);
    }//GEN-LAST:event_labelRegisMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelRegis;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables
}
