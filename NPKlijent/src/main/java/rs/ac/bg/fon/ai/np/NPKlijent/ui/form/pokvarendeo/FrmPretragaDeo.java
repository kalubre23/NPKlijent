/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.pokvarendeo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ai.np.NPCommon.domain.DeoAutomobila;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelDeo;

/**
 *
 * @author Asus
 */
public class FrmPretragaDeo extends javax.swing.JPanel {

    List<DeoAutomobila> delovi;
    FrmPokvarenDeoDetalji gf;
    

    /**
     * Creates new form FrmPretragaDeo
     */
    public FrmPretragaDeo(FrmPokvarenDeoDetalji gf, List<DeoAutomobila> delovi) {
        initComponents();
        this.gf = gf;
        this.delovi = delovi;
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
        txtDeo = new javax.swing.JTextField();
        btnPretrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDelovi = new javax.swing.JTable();
        btnOdaberi = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();

        jLabel1.setText("Unesi naziv");

        btnPretrazi.setText("Pretrazi");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        tblDelovi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDelovi);

        btnOdaberi.setText("Odaberi");
        btnOdaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdaberiActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDeo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPretrazi))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnOdaberi)
                        .addGap(18, 18, 18)
                        .addComponent(btnNazad)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretrazi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdaberi)
                    .addComponent(btnNazad))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        // TODO add your handling code here:
        List<DeoAutomobila> pretraga = new ArrayList<>();
        String naziv = txtDeo.getText().toLowerCase().trim();
        for(DeoAutomobila deo : this.delovi){
            if(deo.getNaziv().toLowerCase().startsWith(naziv)){
                //dodaj ga u listu
                pretraga.add(deo);
            }
        }
        if(pretraga.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ne postoji takav deo!", "Potvrda", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ((TableModelDeo)tblDelovi.getModel()).setDelovi(pretraga);
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnOdaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdaberiActionPerformed
        // TODO add your handling code here:
        if (tblDelovi.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        TableModelDeo tm = (TableModelDeo)tblDelovi.getModel();
        DeoAutomobila d = tm.getDelovi().get(tblDelovi.getSelectedRow());
        //sad treba da se odabere u cb
        gf.postaviDeoCB(d);
        ((JDialog)this.getTopLevelAncestor()).dispose();

    }//GEN-LAST:event_btnOdaberiActionPerformed

    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        // TODO add your handling code here:
        ((JDialog)this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_btnNazadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnOdaberi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDelovi;
    private javax.swing.JTextField txtDeo;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        TableModelDeo tm = new TableModelDeo();
        tblDelovi.setModel(tm);
        tm.setDelovi(delovi);
    }
}
