/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.automobil;


import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelAutomobil;


/**
 * Predstavlja graficku formu za pretragu automobila. 
 * 
 * Pretraga se vrsi prema registarskim tablicama automobila. 
 * Za automobil koji je vracen kao rezultat pretrage mogu se obrisati ili izmeniti podaci o njemu.
 * 
 * @see Automobil
 * @author Luka Obrenic
 * @since 1.0.0
 * 
 */
public class FrmIzmeniAuto extends javax.swing.JPanel {

	/**
	 * Lista svih automobila kao rezultat pretrage, kao lista tipa {@link Automobil}.
	 */
    List<Automobil> listaSvihAutomobila;

    /**
     * Kreira novu formu FrmIzmeniAutoPanel
     */
    public FrmIzmeniAuto() {
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
        jSeparator3 = new javax.swing.JSeparator();
        btnPretrazi = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtTablice = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutomobili = new javax.swing.JTable();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnSviAutomobili = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Automobili");

        btnPretrazi.setText("Pretrazi");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtriraj automobile prema tablicama:");

        jLabel3.setText("Automobili");

        tblAutomobili.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAutomobili);

        btnIzmeni.setText("Izmeni");
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

        btnSviAutomobili.setText("Prikazi sve automobile");
        btnSviAutomobili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSviAutomobiliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIzmeni)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSviAutomobili))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTablice, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPretrazi)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSviAutomobili))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeni)
                    .addComponent(btnObrisi))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda koja se poziva klikom na dugme pretrazi. Pretraga se vrsi prema registarskim tablicama automobila.
     * 
     * Vrsi validaciju unetu vrednost registarske tablice i poziva metodu kontrolera za pretragu automobila u bazi.
     * Rezultat prerage se prikazuje u tabeli automobila.
     * 
     * @param evt
     */
    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        // TODO add your handling code here:
        if (txtTablice.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Unesite tablice!", "Greska pri unosu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTablice.getText().contains(" ")) {
            JOptionPane.showMessageDialog(this, "Tablice ne smeju da imaju blanko znak!", "Greska pri unosu", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //String imePrezimeVlasnika = txtImePrezimeVlasnika.getText().trim();
        String tablice = txtTablice.getText().trim();
        try {
            Automobil auto = new Automobil();
            auto.setTablice(tablice);
            List<Automobil> listaAutomobila = Controller.getInstance().pronadjiAutomobile(auto);
            ((TableModelAutomobil) tblAutomobili.getModel()).setListaAutomobila(listaAutomobila);
            JOptionPane.showMessageDialog(this, "Sistem je nasao automobile po zadatoj vredonsti!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje automobile po zadatoj vrednosti!\n"+ ex.getMessage(), "Greska pri pretrazi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPretraziActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme izmeni, nakon sto je selektovan automobil dobijen iz pretrage.
     * 
     * Otvara formu za izmenu podataka o selektovanom automobilu.
     * @param evt
     */
    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        // TODO add your handling code here:
        if (tblAutomobili.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali automobil!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelAutomobil tm = (TableModelAutomobil) tblAutomobili.getModel();
        Automobil automobil = tm.getListaAutomobila().get(tblAutomobili.getSelectedRow());
        try {
            JDialog dialog = new JDialog((JDialog) this.getTopLevelAncestor(), "Izmeni automobil", true);
            JPanel frmIzmeniAuto = new FrmAutoDetalji(automobil, this);
            dialog.add(frmIzmeniAuto);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
            //JOptionPane.showMessageDialog((JDialog)dialog, "Sistem je ucitao automobil!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju automobila!", "Greska", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnIzmeniActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme obrisi, nakon sto je selektovan automobil dobijen iz pretrage.
     * 
     * Poziva metodu kontrolera za brisanje automobila iz baze. Ako je brisanje uspesno, brise automobil iz tabele.
     * @param evt
     */
    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        // TODO add your handling code here:
        if (tblAutomobili.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali automobil!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelAutomobil tm = (TableModelAutomobil) tblAutomobili.getModel();
        Automobil automobil = tm.getListaAutomobila().get(tblAutomobili.getSelectedRow());
        try {
            
            //ovaj automobil treba da se obrise
            //ako je uspesno obrisan u bazi onda ga obrisi i u tabeli
            Controller.getInstance().obrisiAUtomobil(automobil);
          //nije se desila greska
            JOptionPane.showMessageDialog(this, "Sistem je izbrisao podatke o automobilu!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
            tm.izbirisiAutomobil(automobil);
        } catch (Exception ex) {
            String message = "Sistem ne moze da izbrise automobil!\n";
            if(ex instanceof java.sql.SQLIntegrityConstraintViolationException){
                message += "Postoje nalozi/pokvareni deolovi vezani za ovaj automobil.";
            }
            JOptionPane.showMessageDialog(this, message, "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme prikazi sve automobile.
     * 
     * Takodje poziva metodu kontrolera za pretragu ali kao kriterijum pretrage se dodeljuje da je tablica prazan string.
     * Na taj nacin se vracaju svi automobili iz baze. 
     * 
     * @param evt
     */
    private void btnSviAutomobiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSviAutomobiliActionPerformed
        // TODO add your handling code here:
        try {
            Automobil auto = new Automobil();
            auto.setTablice("");
            listaSvihAutomobila = Controller.getInstance().pronadjiAutomobile(auto);
            ((TableModelAutomobil)tblAutomobili.getModel()).setListaAutomobila(listaSvihAutomobila);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju svih automobila!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSviAutomobiliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnSviAutomobili;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblAutomobili;
    private javax.swing.JTextField txtTablice;
    // End of variables declaration//GEN-END:variables

    /**
     * Priprema formu za prikaz.
     * 
     * Inicijalizuje model tabele automobila.
     */
    private void prepareView() {
        tblAutomobili.setModel(new TableModelAutomobil());
    }

    /**
     * Osvezava prikaz tabele automobila preko modela tabele.
     */
    void refreshTabela() {
        TableModelAutomobil tm = (TableModelAutomobil) tblAutomobili.getModel();
        tm.fireTableDataChanged();
    }

}
