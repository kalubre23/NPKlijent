/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.vlasnik;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Vlasnik;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelVlasnik;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.automobil.FrmAutoDetalji;

/**
 *
 * @author Asus
 */
public class FrmPretragaVlasnik extends javax.swing.JPanel {

    /**
     * Lista svih vlasnika iz koje ce se vrsiti pretraga, tipa {@link Vlasnik}.
     */
    List<Vlasnik> vlasnici;
    /**
     * Panel koji je pozvao ovu formu, tipa {@link JPanel}.
     */
    FrmAutoDetalji gf;
    /**
     * Kreira novu formu FrmPretragaVlasnik
     */
    public FrmPretragaVlasnik(FrmAutoDetalji gf, List<Vlasnik> vlasnici) {
        initComponents();
        this.gf = gf;
        this.vlasnici = vlasnici;
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPretraga = new javax.swing.JTextField();
        btnPretrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVlasnici = new javax.swing.JTable();
        btnNazad = new javax.swing.JButton();
        btnOdaberi = new javax.swing.JButton();
        btnDodajVlasnika = new javax.swing.JButton();

        jLabel1.setText("Unesi ime:");

        btnPretrazi.setText("Pretrazi");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
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

        btnNazad.setText("Nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        btnOdaberi.setText("Odaberi");
        btnOdaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdaberiActionPerformed(evt);
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPretrazi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDodajVlasnika)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOdaberi)
                            .addGap(18, 18, 18)
                            .addComponent(btnNazad))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretrazi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNazad)
                    .addComponent(btnOdaberi)
                    .addComponent(btnDodajVlasnika))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Gasi formu.
     */
    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        // TODO add your handling code here:
        ((JDialog)this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_btnNazadActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme "Pretrazi".
     * 
     * Iz liste svih vlasnika, bira one cije ime pocinje sa vrednosti koja je 
     * uneta u teksualno polje i dodaje ih u podlistu, koja se prikazuje u tabeli.
     */
    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        // TODO add your handling code here:
        
        if(txtPretraga.getText().isBlank()){
            ((TableModelVlasnik)tblVlasnici.getModel()).setVlasnici(this.vlasnici);
            return;
        }
        
        List<Vlasnik> pretraga = new ArrayList<>();
        String ime = txtPretraga.getText().toLowerCase().trim();
        for(Vlasnik vlasnik : this.vlasnici){
            if(vlasnik.getIme().toLowerCase().startsWith(ime)){
                //dodaj ga u listu
                pretraga.add(vlasnik);
            }
        }
        if(pretraga.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ne postoji takav vlasnik!", "Potvrda", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ((TableModelVlasnik)tblVlasnici.getModel()).setVlasnici(pretraga);
    
    }//GEN-LAST:event_btnPretraziActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme "Odaberi".
     * 
     * Selektovani vlasnik iz tabele postavlja kao selektovani u combobox-u forme koja je pozvala ovu formu.
     */
    private void btnOdaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdaberiActionPerformed
        // TODO add your handling code here:
        if (tblVlasnici.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        TableModelVlasnik tm = (TableModelVlasnik)tblVlasnici.getModel();
        Vlasnik v = tm.getVlasnici().get(tblVlasnici.getSelectedRow());
        gf.postaviVlasnikaCB(v);
        ((JDialog)this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_btnOdaberiActionPerformed

    private void btnDodajVlasnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajVlasnikaActionPerformed
        // TODO add your handling code here:
        //ovde treba da se otvori forma za dodavanje novog vlasnika
        JDialog dialog = new JDialog((JDialog) this.getTopLevelAncestor(), "Kreiraj novog vlasnika", true);
        JPanel frmVlasnikDetalji = new FrmVlasnikDetalji(this);
        dialog.add(frmVlasnikDetalji);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDodajVlasnikaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajVlasnika;
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnOdaberi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVlasnici;
    private javax.swing.JTextField txtPretraga;
    // End of variables declaration//GEN-END:variables

    /**
     * Inicijalizuje prikaz tabele.
     */
    private void prepareView() {
        //ovde treba da se odradi init stanje a to je da su svi vlasnici prikazani
        TableModelVlasnik tm = new TableModelVlasnik();
        tblVlasnici.setModel(tm);
        tm.setVlasnici(this.vlasnici);
    }

    void dodajVlasnikaUTabelu(Vlasnik vlasnikDodaj) {
        gf.dodajVlasnikaUCB(vlasnikDodaj);
        ((TableModelVlasnik)tblVlasnici.getModel()).dodajVlasnika(vlasnikDodaj);
    }
}
