/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.nalog;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPCommon.domain.NalogZaServisiranje;
import rs.ac.bg.fon.ai.np.NPCommon.domain.UoceniKvar;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelNalog;


/**
 * Predstavlja graficku formu za pretragu naloga za servisiranje. 
 * 
 * Pretraga se vrsi prema tablicama automobila. 
 * Za nalog koji je vracen kao rezultat pretrage se mogu videti detalji o njemu ili se moze izbrisati.
 * 
 * @see NalogZaServisiranje
 * @author Luka Obrenic
 * @since 1.0.0
 * 
 */
public class FrmSviNalozi extends javax.swing.JPanel {

	/**
	 * Lista svih naloga kao rezultat pretrage, kao lista tipa {@link NalogZaServisiranje}.
	 */
    List<NalogZaServisiranje> sviNalozi;

    /**
     * Kreira novu formu FrmSviNalozi
     */
    public FrmSviNalozi() {
        initComponents();
        prepareView();
    }

    /**
     * Inicijalizacija grafickih komponenata forme. Ne dirati ovaj kod!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtTablice = new javax.swing.JTextField();
        btnPretrazi = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnPrikaziSve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNalozi = new javax.swing.JTable();
        btnObrisi = new javax.swing.JButton();
        btnDetalji = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nalozi za servisiranje");

        jLabel2.setText("Pretrazi prema tablicama:");

        btnPretrazi.setText("Pretrazi");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        jLabel3.setText("Nalozi za servisiranje");

        btnPrikaziSve.setText("Prikazi sve");
        btnPrikaziSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveActionPerformed(evt);
            }
        });

        tblNalozi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblNalozi);

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnDetalji.setText("Detalji");
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDetalji)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTablice, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnPretrazi))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrikaziSve)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTablice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretrazi))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrikaziSve)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObrisi)
                    .addComponent(btnDetalji))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda koja se poziva klikom na dugme pretrazi. Pretraga se vrsi prema tablicama automobila.
     * 
     * Vrsi validaciju unete vrednosti za tablice i poziva metodu kontrolera za pretragu naloga u bazi.
     * Rezultat pretrage se prikazuje u tabeli naloga.
     * 
     * @param evt
     */
    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        // TODO add your handling code here:
        if (txtTablice.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Niste uneli tablice!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTablice.getText().contains(" ")) {
            JOptionPane.showMessageDialog(this, "Tablice ne smeju da imaju blanko znak!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tablice = txtTablice.getText().trim();
        try {
            Automobil a = new Automobil();
            a.setTablice(tablice);
            UoceniKvar uk = new UoceniKvar();
            uk.setAutomobil(a);
            NalogZaServisiranje n = new NalogZaServisiranje();
            n.setKvar(uk);
            List<NalogZaServisiranje> nalozi = Controller.getInstance().pronadjiNalogeZaServisiranje(n);
            ((TableModelNalog) tblNalozi.getModel()).setListaNaloga(nalozi);
            if (nalozi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje naloge za servisiranje po zadatoj vrednosti!", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(this, "Sistem je nasao naloge za servisiranje po zadatoj vrednsti!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje naloge za servisiranje po zadatoj vrednosti!", "Greska", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnPretraziActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme prikazi sve.
     * 
     * Takodje poziva metodu kontrolera za pretragu naloga ali kao kriterijum pretrage se dodeljuje da su tablice automobila prazan string.
     * Na taj nacin se vracaju svi nalozi iz baze. 
     * 
     * @param evt
     */
    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed
        // TODO add your handling code here:
        try {
            Automobil a = new Automobil();
            a.setTablice("");
            UoceniKvar uk = new UoceniKvar();
            uk.setAutomobil(a);
            NalogZaServisiranje n = new NalogZaServisiranje();
            n.setKvar(uk);
            sviNalozi = Controller.getInstance().pronadjiNalogeZaServisiranje(n);
            ((TableModelNalog) tblNalozi.getModel()).setListaNaloga(sviNalozi);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju svih naloga!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrikaziSveActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme obrisi, nakon sto je selektovan nalog dobijen iz pretrage.
     * 
     * Poziva metodu kontrolera za brisanje naloga iz baze. Ako je brisanje uspesno, brise nalog iz tabele koja se prikazuje.
     * @param evt
     */
    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        // TODO add your handling code here:
        if (tblNalozi.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali nijedan nalog!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        TableModelNalog tm = (TableModelNalog) tblNalozi.getModel();
        NalogZaServisiranje nalog = tm.getListaNaloga().get(tblNalozi.getSelectedRow());
        //ovaj nalog treba obrisati
        try {
            throw new Exception();
//            Controller.getInstance().obrisiNalogZaServisiranje(nalog);
//            //nije se desila greska
//            JOptionPane.showMessageDialog(this, "Sistem je obrisao nalog za servisiranje!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
//            tm.izbrisiNalog(nalog);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da obrise nalog za servisiranje!\n"/* + ex.getMessage()*/, "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme detalji, nakon sto je selektovan nalog dobijen iz pretrage.
     * 
     * Otvara formu za prikaz detalja o selektovanom nalogu.
     * @param evt
     */
    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
        // TODO add your handling code here:
        //TODO da se otvori read only FrmNalogDetalji i ispise detalje sve
        if (tblNalozi.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali nalog!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        TableModelNalog tm = (TableModelNalog) tblNalozi.getModel();
        NalogZaServisiranje nalog = tm.getListaNaloga().get(tblNalozi.getSelectedRow());
        try {
            JDialog dialog = new JDialog((JDialog) this.getTopLevelAncestor(), "Detalji", true);
            JPanel frmNalogDetalji = new FrmNalogDetalji(nalog);
            dialog.add(frmNalogDetalji);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
            //JOptionPane.showMessageDialog(dialog, "Sistem je ucitao pokvaren deo!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju naloga!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDetaljiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalji;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnPrikaziSve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblNalozi;
    private javax.swing.JTextField txtTablice;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        tblNalozi.setModel(new TableModelNalog());
//        vratiSveNaloge();
    }

//    private void vratiSveNaloge() {
//        try {
//            sviNalozi = Controller.getInstance().vratiSveNaloge();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Sistem nije mogao da ucita sve naloge!", "Greska", JOptionPane.ERROR_MESSAGE);
//        }
//    }
}
