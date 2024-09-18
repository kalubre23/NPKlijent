/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.pokvarendeo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelAutomobil;

/**
 *
 * @author Asus
 */
public class FrmPretragaAuto extends javax.swing.JPanel {

    List<Automobil> automobili;
    FrmPokvarenDeoDetalji gf;
    /**
     * Creates new form FrmPretragaAuto
     */
    public FrmPretragaAuto(FrmPokvarenDeoDetalji gf, List<Automobil> automobili) {
        initComponents();
        this.gf = gf;
        this.automobili = automobili;
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
        txtTablice = new javax.swing.JTextField();
        btnPretrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        btnOdaberi = new javax.swing.JButton();
        btnNazad = new javax.swing.JButton();

        jLabel1.setText("Unesi tablice");

        btnPretrazi.setText("Pretrazi");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        btnOdaberi.setText("Odaberi");
        btnOdaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdaberiActionPerformed(evt);
            }
        });

        btnNazad.setText("Nazad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTablice, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPretrazi))
                            .addComponent(jSeparator3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnOdaberi)
                        .addGap(18, 18, 18)
                        .addComponent(btnNazad)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTablice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretrazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdaberi)
                    .addComponent(btnNazad))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        // TODO add your handling code here:
        //pretrazi treba samo da nadje te iz liste automobila
        List<Automobil> pretraga = new ArrayList<>();
        String tablice = txtTablice.getText().toLowerCase().trim();
        for(Automobil auto : this.automobili){
            if(auto.getTablice().toLowerCase().startsWith(tablice)){
                //dodaj ga u listu
                pretraga.add(auto);
            }
        }
        if(pretraga.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ne postoji takav automobil!", "Potvrda", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ((TableModelAutomobil)jTable1.getModel()).setListaAutomobila(pretraga);
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnOdaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdaberiActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        TableModelAutomobil tm = (TableModelAutomobil)jTable1.getModel();
        Automobil a = tm.getListaAutomobila().get(jTable1.getSelectedRow());
        //sad treba da se odabere u cb
        gf.postaviAutomobilCB(a);
        ((JDialog)this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_btnOdaberiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnOdaberi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTablice;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        //ovde treba da se odradi init stanje a to je da su svi automobil prikazani
        TableModelAutomobil tm = new TableModelAutomobil();
        jTable1.setModel(tm);
        tm.setListaAutomobila(automobili);
    }
}
