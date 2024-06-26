/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.automobil;


import rs.ac.bg.fon.ai.np.NPCommon.domain.UoceniKvar;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelKvar;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


/**
 * Predstavlja graficku formu za dodavanje uocenog kvara automobila. Unosi se opis uocenog kvara.
 * 
 * @see UoceniKvar
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class FrmDodajKvar extends javax.swing.JPanel {
	/**
	 * Model tabele za prikaz tabele uocenih kvarova tipa {@link TableModelKvar}.
	 */
    TableModelKvar tm;
    /**
     * Kreira novu formu FrmDodajKvar. Dodeljuje se model tabele atributu tm.
     */
    public FrmDodajKvar(TableModelKvar tm) {
        initComponents();
        this.tm = tm;
    }

    /**
     * Inicijalizacija grafickih komponenata forme. Ne dirati ovaj kod!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOpisKvara = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDodajKvar = new javax.swing.JButton();

        jLabel1.setText("Opis kvara:");

        txtAreaOpisKvara.setColumns(20);
        txtAreaOpisKvara.setRows(5);
        jScrollPane1.setViewportView(txtAreaOpisKvara);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Dodaj kvar");

        btnDodajKvar.setText("Dodaj");
        btnDodajKvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDodajKvar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addComponent(btnDodajKvar)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda koja se poziva klikom na dugme dodaj kvar.
     * 
     * Proverava da li je unet opis kvara i dodaje ga u tabelu ucenih kvarova.
     * @param evt
     */
    private void btnDodajKvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKvarActionPerformed
        // TODO add your handling code here:
        if(txtAreaOpisKvara.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Unesite opis kvara!", "Greska!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String opis = txtAreaOpisKvara.getText().trim();
        UoceniKvar k = new UoceniKvar();
        k.setOpis(opis);
        tm.dodajKvar(k);
        ((JDialog)this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_btnDodajKvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajKvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtAreaOpisKvara;
    // End of variables declaration//GEN-END:variables
}
