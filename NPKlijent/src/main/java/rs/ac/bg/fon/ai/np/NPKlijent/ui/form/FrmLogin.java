/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Korisnik;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Uloga;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;

/**
 * Predstavlja graficku formu za logovanje korisnika u sistem. Korisnik unosi username i password da bi se ulogovao.
 * 
 * @author Luka Obrenic
 * @since 1.0.0
 * @see Korisnik
 */
public class FrmLogin extends javax.swing.JPanel {

    /**
     * Kreira novu formu FrmLogin
     */
    public FrmLogin() {
        initComponents();
    }

    /**
     * Inicijalizacija grafickih komponenata forme. Ne dirati ovaj kod!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        checkAdmin = new javax.swing.JCheckBox();

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        btnLogin.setText("Uloguj se");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setText("Izadji");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        checkAdmin.setText("Uloguj se kao admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogin)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkAdmin)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtPassword))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(checkAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda koja se poziva klikom na dugme login.
     * 
     * Poziva metodu kontrolera za logovanje koja vraca da li je login uspesan ili ne.
     * Ako jeste prikazuje se glavna forma (koja je razlicita ako je ulogovan admin ili serviser), ako ne prikazuje se upozorenje o neuspesnom login-u.
     * @param evt
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            if(txtUsername.getText().isBlank()){
                JOptionPane.showMessageDialog(this, "Invalidni username i password", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(new String(txtPassword.getPassword()).isBlank()){
                JOptionPane.showMessageDialog(this, "Invalidni username i password", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            Korisnik korisnik = new Korisnik(txtUsername.getText(), new String(txtPassword.getPassword()));
            Uloga u = new Uloga();
            if(checkAdmin.isSelected()){
                System.out.println("Selektovan!");
                u.setUloga("admin");
                korisnik.setUloga(u);
            }else {
                u.setUloga("serviser");
                korisnik.setUloga(u);
            }
            korisnik=Controller.getInstance().login(korisnik);
            JOptionPane.showMessageDialog(this, korisnik.getIme()+" se ulogovao!", "Prijava na sistem", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(korisnik);
            
            if(korisnik.getUloga().getUloga().equals("admin")){
                JFrame frame = new FrmMain(korisnik);
                this.getTopLevelAncestor().setVisible(false);
                frame.setVisible(true);
            }else {
                //ulogovao se serviser i njemu prikazati njegov UI
                JFrame frame = new FrmMainServiser(korisnik);
                this.getTopLevelAncestor().setVisible(false);
                frame.setVisible(true);
            }
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Prijava na sistem neuspesna!\n"+ex.getMessage(), "Prijava na sistem", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme cancel koja gasi aplikaciju.
     * 
     * @param evt
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.getTopLevelAncestor().setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkAdmin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
