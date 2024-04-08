/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.nalog;


import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPCommon.domain.NalogZaServisiranje;
import rs.ac.bg.fon.ai.np.NPCommon.domain.PokvareniDeo;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Serviser;
import rs.ac.bg.fon.ai.np.NPCommon.domain.UoceniKvar;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelPokvarenDeo;


/**
 *
 * @author Asus
 */
public class FrmNalogDetalji extends javax.swing.JPanel {

    List<Automobil> listaAutomobila;
    List<PokvareniDeo> listaPokvarenihDelova;
    double konacnaCena;
    Serviser serviser;
    //za read only
    NalogZaServisiranje nalog;

    /**
     * Creates new form FrmNoviNalog
     */
    public FrmNalogDetalji(Serviser serviser) {
        initComponents();
        konacnaCena = 0;
        this.serviser = serviser;
        prepareView();
        System.out.println(serviser);
    }

    public FrmNalogDetalji(NalogZaServisiranje nalog) {
        initComponents();
        konacnaCena = 0;
        this.nalog = nalog;
        System.out.println(nalog);
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
        jSeparator1 = new javax.swing.JSeparator();
        lblIzaberiAutomobil = new javax.swing.JLabel();
        cbAutomobili = new javax.swing.JComboBox<>();
        lblIzaberiKvar = new javax.swing.JLabel();
        cvKvarovi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPokvareniDelovi = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblSumiranaCena = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAdministrativniTroskovi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPorez = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSacuvaj = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        lblUkupnaCena = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblServiser = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nalog za servisiranje");

        lblIzaberiAutomobil.setText("Izaberi automobil");

        cbAutomobili.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAutomobili.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAutomobiliItemStateChanged(evt);
            }
        });

        lblIzaberiKvar.setText("Izaberi kvar");

        cvKvarovi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cvKvarovi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cvKvaroviItemStateChanged(evt);
            }
        });

        tblPokvareniDelovi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPokvareniDelovi);

        jLabel4.setText("Pokvareni delovi automobila za izabrani kvar");

        jLabel5.setText("Sumirana cena: ");

        lblSumiranaCena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSumiranaCena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSumiranaCena.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("€");

        jLabel8.setText("Administrativni troskovi: ");

        lblAdministrativniTroskovi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAdministrativniTroskovi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAdministrativniTroskovi.setText("jLabel6");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("€");

        jLabel11.setText("Porez: ");

        lblPorez.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPorez.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPorez.setText("jLabel6");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("€");

        btnSacuvaj.setText("Sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Ukupna cena:");

        lblUkupnaCena.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblUkupnaCena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUkupnaCena.setText("jLabel15");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("€");

        jLabel6.setText("Datum");

        lblDatum.setText("jLabel9");

        jLabel9.setText("Izdao");

        lblServiser.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIzaberiKvar)
                                    .addComponent(lblIzaberiAutomobil)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAutomobili, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cvKvarovi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDatum)
                                            .addComponent(lblServiser))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPorez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAdministrativniTroskovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblSumiranaCena, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7)))
                        .addGap(29, 29, 29))))
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(lblUkupnaCena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSacuvaj)
                .addGap(23, 23, 23))
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
                    .addComponent(jLabel6)
                    .addComponent(lblDatum))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIzaberiAutomobil)
                    .addComponent(cbAutomobili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIzaberiKvar)
                    .addComponent(cvKvarovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblServiser))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSumiranaCena)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblAdministrativniTroskovi)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblPorez)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblUkupnaCena)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(btnSacuvaj)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbAutomobiliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAutomobiliItemStateChanged
        // TODO add your handling code here:
        if (this.nalog == null) {
            if (cbAutomobili.getSelectedIndex() == -1) {
                return;
            }

            Automobil auto = (Automobil) cbAutomobili.getSelectedItem();
            cvKvarovi.setModel(new DefaultComboBoxModel(auto.getUoceniKvarovi().toArray()));
            cvKvarovi.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_cbAutomobiliItemStateChanged

    private void cvKvaroviItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cvKvaroviItemStateChanged
        // TODO add your handling code here:
        if (this.nalog == null) {
            if (cvKvarovi.getSelectedIndex() == -1) {
                return;
            }

            UoceniKvar uk = (UoceniKvar) cvKvarovi.getSelectedItem();
            List<PokvareniDeo> podlista = new ArrayList<>();
            for (PokvareniDeo pokvareniDeo : listaPokvarenihDelova) {
                if (pokvareniDeo.getUoceniKvar().equals(uk)) {
                    podlista.add(pokvareniDeo);
                }
            }
            ((TableModelPokvarenDeo) tblPokvareniDelovi.getModel()).setListaPokvarenihDelova(podlista);

            izracunajCene();
        }
    }//GEN-LAST:event_cvKvaroviItemStateChanged

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        // TODO add your handling code here:
        //prvo provere dal je sve odabrano i tako to
        if (cbAutomobili.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali automobil!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cvKvarovi.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali kvar!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (konacnaCena == 0) {
            JOptionPane.showMessageDialog(this, "Cena je 0!\nTabela pokvarenih delova je prazna!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        NalogZaServisiranje nalog = new NalogZaServisiranje();
        nalog.setKvar((UoceniKvar) cvKvarovi.getSelectedItem());
        nalog.setCena(this.konacnaCena);
        nalog.setDatum(LocalDate.now());
        nalog.setServiser(this.serviser);

        try {
            Controller.getInstance().zapamtiNalogZaServisiranje(nalog);
            JOptionPane.showMessageDialog(this, "Sistem je zapamtio nalog za servisiranje!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
            int result = JOptionPane.showConfirmDialog(this, "Nastavi unos?", "Potvrda", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                pripremiFormuZaUnos();
            } else {
                ((JDialog) this.getTopLevelAncestor()).dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti nalog za servisiranje!\n"+ ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox<String> cbAutomobili;
    private javax.swing.JComboBox<String> cvKvarovi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAdministrativniTroskovi;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblIzaberiAutomobil;
    private javax.swing.JLabel lblIzaberiKvar;
    private javax.swing.JLabel lblPorez;
    private javax.swing.JLabel lblServiser;
    private javax.swing.JLabel lblSumiranaCena;
    private javax.swing.JLabel lblUkupnaCena;
    private javax.swing.JTable tblPokvareniDelovi;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        vratiSvePokvareneDelove();
        tblPokvareniDelovi.setModel(new TableModelPokvarenDeo());
        if (this.nalog == null) {
            System.out.println("OVO SE NE IZVRSAVA");
            vratiSveAutomobile();
            lblAdministrativniTroskovi.setText("0");
            lblPorez.setText("0");
            lblSumiranaCena.setText("0");
            lblUkupnaCena.setText("0");
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
            lblDatum.setText(df.format(new Date()));
            lblServiser.setText(this.serviser.getIme() + " " + this.serviser.getPrezime());
        } else {
            prikaziDetaljeNaloga();
        }
    }

    private void vratiSveAutomobile() {
        try {
            Automobil auto = new Automobil();
            auto.setImePrezimeVlasnika("");
            listaAutomobila = Controller.getInstance().pronadjiAutomobile(auto);
            cbAutomobili.setModel(new DefaultComboBoxModel(listaAutomobila.toArray()));
            cbAutomobili.setSelectedIndex(-1);
            cvKvarovi.removeAllItems();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju svih automobila!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void vratiSvePokvareneDelove() {
        try {
            PokvareniDeo pd = new PokvareniDeo();
            Automobil a = new Automobil();
            a.setTablice("");
            UoceniKvar uk = new UoceniKvar();
            uk.setAutomobil(a);
            pd.setUoceniKvar(uk);
            listaPokvarenihDelova = Controller.getInstance().pronadjiPokvareneDelove(pd);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju svih pokvarenih delova!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void izracunajCene() {
        double sumiranaCena = 0;
        for (PokvareniDeo pokvareniDeo : ((TableModelPokvarenDeo) tblPokvareniDelovi.getModel()).getListaPokvarenihDelova()) {
            sumiranaCena += pokvareniDeo.getCena();
        }
        lblSumiranaCena.setText(String.valueOf(sumiranaCena));
        double administrativniTroskovi = sumiranaCena * 0.2;
        lblAdministrativniTroskovi.setText(String.format("%.2f", administrativniTroskovi));
        double porez = (sumiranaCena + administrativniTroskovi) * 0.2;
        lblPorez.setText(String.format("%.2f", porez));

        this.konacnaCena = sumiranaCena + administrativniTroskovi + porez;
        lblUkupnaCena.setText(String.format("%.2f", konacnaCena));
        System.out.println("Konacna cena: " + konacnaCena);
    }

    private void pripremiFormuZaUnos() {
        lblAdministrativniTroskovi.setText("0");
        lblPorez.setText("0");
        lblSumiranaCena.setText("0");
        lblUkupnaCena.setText("0");
        lblServiser.setText(this.serviser.getIme() + " " + this.serviser.getPrezime());
        cbAutomobili.setSelectedIndex(-1);
        cvKvarovi.removeAllItems();
        ((TableModelPokvarenDeo) tblPokvareniDelovi.getModel()).ocistiListu();
    }

    private void prikaziDetaljeNaloga() {
        lblDatum.setText(nalog.getDatum().format(DateTimeFormatter.ofPattern("dd.MM.yyyy.")));
        lblIzaberiAutomobil.setText("Automobil");
        lblIzaberiKvar.setText("Kvar");
        lblServiser.setText(nalog.getServiser().getIme() + " " + nalog.getServiser().getPrezime());
        cbAutomobili.removeAllItems();
        cbAutomobili.addItem("<html><font color = black>"+nalog.getKvar().getAutomobil().getTablice()+"</font></html>");
        cbAutomobili.setEnabled(false);
        cvKvarovi.removeAllItems();
        cvKvarovi.addItem("<html><font color = black>"+nalog.getKvar().getOpis()+"</font></html>");
        cvKvarovi.setEnabled(false);
        UoceniKvar uk = nalog.getKvar();
        List<PokvareniDeo> podlista = new ArrayList<>();
        for (PokvareniDeo pokvareniDeo : listaPokvarenihDelova) {
            if (pokvareniDeo.getUoceniKvar().equals(uk)) {
                podlista.add(pokvareniDeo);
            }
        }
        ((TableModelPokvarenDeo) tblPokvareniDelovi.getModel()).setListaPokvarenihDelova(podlista);
        tblPokvareniDelovi.setEnabled(false);
        izracunajCene();
        btnSacuvaj.setVisible(false);
    }
}