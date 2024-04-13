/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.vlasnik;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Vlasnik;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;

/**
 * Predstavlja graficku formu koja prikazuje podatke o jednom vlasniku. 
 * 
 * Sluzi za dodavanje novog vlasnika u bazu ili za izmenu postojeceg vlasnika u bazi.
 * 
 * @see Vlasnik
 * @author Luka Obrenic
 * @since 1.1.0
 */
public class FrmVlasnikDetalji extends javax.swing.JPanel {

	/**
	 * Vlasnik za koga se vrsi izmena podataka, tipa {@link Vlasnik}.
	 */
    Vlasnik vlasnik;

    /**
     * Referenca ka formi za pretragu vlasnika.
     */
    FrmSviVlasnici frmSviVlasnici;

    /**
     * Kreira novu formu FrmVlasnikDetalji. Ovaj konstruktor se koristi kada treba sacuvati novog vlasnika.
     */
    public FrmVlasnikDetalji() {
        initComponents();
        prepareView();
    }

    /**
     * Kreira novu formu FrmVlasnikDetalji. Ovaj konstruktor dodeljuje vlasnika za koga se vrsi izmena podataka.
     * 
     * @see FrmVlasnikDetalji
     * @param vlasnik za koga se vrsi izmena podataka, tipa {@link Vlasnik}
     * @param frmSviVlasnici referenca ka formi za pretragu vlasnika
     */
    public FrmVlasnikDetalji(Vlasnik vlasnik, FrmSviVlasnici frmSviVlasnici) {
        initComponents();
        this.vlasnik = vlasnik;
        this.frmSviVlasnici = frmSviVlasnici;
        prepareView();
    }

    /**
     * Inicijalizacija grafickih komponenata forme. Ne dirati ovaj kod!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        txtIme1 = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSacuvaj = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Email");

        jLabel4.setText("Telefon");

        btnSacuvaj.setText("Sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        btnNazad.setText("Nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefon)
                                    .addComponent(txtPrezime)
                                    .addComponent(txtIme1)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSacuvaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnNazad)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvaj)
                    .addComponent(btnNazad))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda se poziva klikom na dugme sacuvaj. Sluzi za cuvanje novog vlasnika ili izmenu postojeceg.
     * 
     * Vrsi validaciju imena, prezimena, email-a i telefona. Nakon toga
     * poziva metodu kontrolera za cuvanje ili izmenu vlasnika u zavisnosti od toga da li je
     * atribut vlasnik null. 
     * Ako jeste null to znaci da treba napraviti novi objekat vlasnika i pozvati metodu kontrolera za cuvanje vlasnika u bazi.
     * Ako nije null to znaci da taj vlasnik vec postoji i treba izmeniti podatke o njemu. Nakon toga se poziva metoda kontrolera za izmenu podataka o vlasniku.
     * 
     * @param evt
     */
    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        // TODO add your handling code here:
        if (!txtIme1.getText().matches("^[A-Z][a-z]+")) {
            JOptionPane.showMessageDialog(this, "Pogresno uneto ime!", "Greska pri unosu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!txtPrezime.getText().matches("^[A-Z][a-z]+")) {
            JOptionPane.showMessageDialog(this, "Pogresno uneto prezime!", "Greska pri unosu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!txtEmail.getText().matches("^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Pogresno unet email!", "Greska pri unosu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!txtTelefon.getText().matches("[0-9]{9,10}")) {
            JOptionPane.showMessageDialog(this, "Pogresno unet broj telefona!", "Greska pri unosu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String ime = txtIme1.getText().trim();
        String prezime = txtPrezime.getText().trim();
        String email = txtEmail.getText().trim();
        String telefon = txtTelefon.getText().trim();

        if (this.vlasnik == null) {
            //dodaje se novi vlasnik
            Vlasnik vlasnikDodaj = new Vlasnik();
            vlasnikDodaj.setIme(ime);
            vlasnikDodaj.setPrezime(prezime);
            vlasnikDodaj.setEmail(email);
            vlasnikDodaj.setTelefon(telefon);

            try {
                Controller.getInstance().sacuvajVlasnika(vlasnikDodaj);
                JOptionPane.showMessageDialog(this, "Sistem je zapamtio vlasnika!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
                int result = JOptionPane.showConfirmDialog(this, "Nastavi unos?", "Potvrda", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    pripremiFormuZaNoviUnos();
                } else {
                    ((JDialog) this.getTopLevelAncestor()).dispose();
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Sistem ne moze sacuva da vlasnika!\n" + ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            //izmena podataka o vlasniku
            vlasnik.setIme(txtIme1.getText().trim());
            vlasnik.setPrezime(txtPrezime.getText().trim());
            vlasnik.setEmail(txtEmail.getText().trim());
            vlasnik.setTelefon(txtTelefon.getText().trim());

            try {
                Controller.getInstance().izmeniVlasnika(vlasnik);
                JOptionPane.showMessageDialog(this, "Sistem je izmenio vlasnika!", "Izmeni vlasnika", JOptionPane.INFORMATION_MESSAGE);
                frmSviVlasnici.refreshTabela();
                //zatvara se forma
                ((JDialog)this.getTopLevelAncestor()).dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da izmeni vlasnika!\n" + ex.getMessage(), "Izmeni vlasnika", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnSacuvajActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme nazad.
     * 
     * Gasi ovu formu.
     */
    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        // TODO add your handling code here:
        ((JDialog) this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_btnNazadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme1;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables

    private void pripremiFormuZaNoviUnos() {
        txtIme1.setText("");
        txtPrezime.setText("");
        txtEmail.setText("");
        txtTelefon.setText("");
    }

    /**
     * Priprema izgled forme pre nego sto se prikaze.
     * 
     * Ukoliko se vrsi izmena podataka vlasnika, prikazace se vrednosti svih atributa tog vlasnika na formi.
     */
    private void prepareView() {
        if (vlasnik != null) {
            txtIme1.setText(vlasnik.getIme() + "");
            txtPrezime.setText(vlasnik.getPrezime());
            txtEmail.setText(vlasnik.getEmail());
            txtTelefon.setText(vlasnik.getTelefon());
        }
    }
}
