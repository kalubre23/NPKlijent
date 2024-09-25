/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.vlasnik;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Vlasnik;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelVlasnik;

/**
 * Predstavlja graficku formu za pretragu vlasnika. 
 * 
 * Pretraga se vrsi prema imenu vlasnika. 
 * Za vlasnika koji je vracen kao rezultat pretrage mogu se obrisati ili izmeniti podaci o njemu.
 * 
 * @see Vlasnik
 * @author Luka Obrenic
 * @since 1.1.0
 * 
 */
public class FrmSviVlasnici extends javax.swing.JPanel {

    List<Vlasnik> sviVlasnici;
    /**
     * Kreira novu formu FrmSviVlasnici
     */
    public FrmSviVlasnici() {
        initComponents();
        prepareView();
    }

    /**
     * Inicijalizacija grafickih komponenata forme. Ne dirati ovaj kod!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIme1 = new javax.swing.JTextField();
        btnPretrazi1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVlasnici = new javax.swing.JTable();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnDodajVlasnika = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Vlasnici");

        jLabel4.setText("Pretrazi prema imenu");

        btnPretrazi1.setText("Pretrazi");
        btnPretrazi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretrazi1ActionPerformed(evt);
            }
        });

        tblVlasnici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblVlasnici);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtIme1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPretrazi1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretrazi1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnIzmeni.setText("Izmeni ");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnDodajVlasnika.setForeground(new java.awt.Color(51, 51, 51));
        btnDodajVlasnika.setText("Dodaj novog vlasnika");
        btnDodajVlasnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajVlasnikaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnDodajVlasnika)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btnIzmeni)
                .addGap(27, 27, 27)
                .addComponent(btnObrisi)
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeni)
                    .addComponent(btnObrisi)
                    .addComponent(btnDodajVlasnika))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda koja se poziva klikom na dugme izmeni, nakon sto je selektovan vlasnik dobijen iz pretrage.
     * 
     * Otvara formu za izmenu podataka o selektovanom vlasniku.
     * @param evt
     */
    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        // TODO add your handling code here:
        if (tblVlasnici.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali vlasnika!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelVlasnik tm = (TableModelVlasnik) tblVlasnici.getModel();
        Vlasnik vlasnik = tm.getVlasnici().get(tblVlasnici.getSelectedRow());
        try {
            JDialog dialog = new JDialog((JDialog) this.getTopLevelAncestor(), "Izmeni vlasnika", true);
            JPanel frmIzmeniVlasnika = new FrmVlasnikDetalji(vlasnik, this);
            dialog.add(frmIzmeniVlasnika);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju vlasnika!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme obrisi, nakon sto je selektovan vlasnik dobijen iz pretrage.
     * 
     * Poziva metodu kontrolera za brisanje vlasnika iz baze. Ako je brisanje uspesno, brise vlasnika iz tabele.
     * @param evt
     */
    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        // TODO add your handling code here:
        if (tblVlasnici.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali vlasnika!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelVlasnik tm = (TableModelVlasnik) tblVlasnici.getModel();
        Vlasnik vlasnik = tm.getVlasnici().get(tblVlasnici.getSelectedRow());
        try {
           
            Controller.getInstance().obrisiVlasnika(vlasnik);
          
            JOptionPane.showMessageDialog(this, "Sistem je izbrisao podatke o vlasniku!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
            tm.obrisiVlasnika(vlasnik);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da izbrise vlasnika!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme pretrazi. Pretraga se vrsi prema imenu vlasnika.
     * 
     * Vrsi validaciju unetu vrednost imena i poziva metodu kontrolera za pretragu vlasnika u bazi.
     * Rezultat prerage se prikazuje u tabeli vlasnika.
     * 
     * @param evt
     */
    private void btnPretrazi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretrazi1ActionPerformed
        // TODO add your handling code here:
        if(txtIme1.getText().isBlank()){
            ((TableModelVlasnik) tblVlasnici.getModel()).setVlasnici(this.sviVlasnici);
            return;
        }
        if (!txtIme1.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Unesite samo slova!", "Greska pri unosu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String ime = txtIme1.getText().trim();
//        try {
//            Vlasnik vlasnik = new Vlasnik();
//            vlasnik.setIme(ime);
//            List<Vlasnik> listaVlasnika = Controller.getInstance().pronadjiVlasnike(vlasnik);
//            ((TableModelVlasnik) tblVlasnici.getModel()).setVlasnici(listaVlasnika);
//            JOptionPane.showMessageDialog(this, "Sistem je nasao vlasnike po zadatoj vredonsti!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje vlasnike po zadatoj vrednosti!\n"+ ex.getMessage(), "Greska pri pretrazi", JOptionPane.ERROR_MESSAGE);
//        }
        List<Vlasnik> pretraga = new ArrayList<>();
        for(Vlasnik v : this.sviVlasnici){
            if(v.getIme().toLowerCase().startsWith(ime)){
                pretraga.add(v);
            }
        }
        if(pretraga.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ne postoji takav vlasnik!", "Potvrda", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ((TableModelVlasnik)tblVlasnici.getModel()).setVlasnici(pretraga);
    }//GEN-LAST:event_btnPretrazi1ActionPerformed

    private void btnDodajVlasnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajVlasnikaActionPerformed
        // TODO add your handling code here:
        JDialog dialog = new JDialog((JDialog) this.getTopLevelAncestor(), "Kreiraj novog vlasnika", true);
        JPanel frmVlasnikDetalji = new FrmVlasnikDetalji(null, this);
        dialog.add(frmVlasnikDetalji);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDodajVlasnikaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajVlasnika;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPretrazi1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblVlasnici;
    private javax.swing.JTextField txtIme1;
    // End of variables declaration//GEN-END:variables

    /**
     * Inicijalizuje model tabele vlasnika.
     */
    private void prepareView() {
        tblVlasnici.setModel(new TableModelVlasnik());
        prikaziSveVlasnike();
    }

    /**
     * Osvezava prikaz tabele vlasnika.
     */
    void refreshTabela() {
        TableModelVlasnik tm = (TableModelVlasnik) tblVlasnici.getModel();
        tm.fireTableDataChanged();
    }

    void dodajVlasnikaUTabelu(Vlasnik vlasnikDodaj) {
        this.sviVlasnici.add(vlasnikDodaj);
        ((TableModelVlasnik)tblVlasnici.getModel()).dodajVlasnika(vlasnikDodaj);
    }

    private void prikaziSveVlasnike() {
        Vlasnik vlasnik = new Vlasnik();
        vlasnik.setIme("");
     
        try {
            sviVlasnici = Controller.getInstance().pronadjiVlasnike(vlasnik);
            ((TableModelVlasnik) tblVlasnici.getModel()).setVlasnici(this.sviVlasnici);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Greska pri vracanju vlasnika!", "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
            
    }
}
