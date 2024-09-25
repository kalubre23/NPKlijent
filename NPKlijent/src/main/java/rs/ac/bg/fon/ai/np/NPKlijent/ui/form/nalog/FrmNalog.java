/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.nalog;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPCommon.domain.NalogZaServisiranje;
import rs.ac.bg.fon.ai.np.NPCommon.domain.PokvareniDeo;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Korisnik;
import rs.ac.bg.fon.ai.np.NPCommon.domain.UoceniKvar;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelPokvarenDeo;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.pokvarendeo.FrmPretragaAuto;


/**
 * Predstavlja graficku formu za unos podataka o nalogu. 
 * 
 * Nalog se pravi za jedan uceni kvar koji ima vise pokvarenih delova. Npr uoceni kvar: problemi sa motorom, pokvareni delovi: kvacilo, akumulator.
 * 
 * Administratoru se prikazuje lista svih automobila od kojih treba da se odabere jedan za koji ce se napraviti nalog.
 * Takodje mu se prikazuju svi pokvareni delovi za taj automobil za jedan uocen kvar i njihove cene. 
 * Ove cene se saberu i dodaju dodatni troskovi. Tako se dobija ukupna cena naloga za servisiranje.
 * Administrator takodje bira servisera kome ce biti dodeljen nalog za servisiranje na izvrsavanje.
 * 
 * @see NalogZaServisiranje
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class FrmNalog extends javax.swing.JPanel {

    /**
     * Lista svih automobila za koje se moze napraviti nalog, kao lista tipa {@link Automobil}.
     */
    List<Automobil> listaAutomobila;
    /**
     * Lista svih pokvarenih delova za odabrani automobil, kao lista tipa {@link PokvareniDeo}.
     */
    List<PokvareniDeo> listaPokvarenihDelova;
    
    /**
     * Lista svih servisera kojima moze biti dodeljen nalog za servisiranje.
     */
    List<Korisnik> listaServisera;
    
    /**
     * Ukupna cena servisa.
     */
    double konacnaCena;
    
    FrmSviNalozi frmSviNalozi;

    /**
     * Kreira novu formu FrmNoviNalog. 
     * 
     */
    public FrmNalog() {
        initComponents();
        konacnaCena = 0;
        prepareView();
    }
    
    public FrmNalog(FrmSviNalozi frmSviNalozi) {
        initComponents();
        this.frmSviNalozi = frmSviNalozi;
        konacnaCena = 0;
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
        lblIzaberiAutomobil = new javax.swing.JLabel();
        cbAutomobili = new javax.swing.JComboBox<>();
        lblIzaberiKvar = new javax.swing.JLabel();
        cbKvarovi = new javax.swing.JComboBox<>();
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
        cbServiseri = new javax.swing.JComboBox<>();
        btnPretragaAuto = new javax.swing.JButton();

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

        cbKvarovi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbKvarovi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKvaroviItemStateChanged(evt);
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

        jLabel6.setText("Datum kreiranja");

        lblDatum.setText("jLabel9");

        jLabel9.setText("Zaduzen serviser");

        cbServiseri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPretragaAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-20.png"))); // NOI18N
        btnPretragaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(lblUkupnaCena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSacuvaj)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIzaberiKvar)
                                    .addComponent(lblIzaberiAutomobil)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDatum)
                                    .addComponent(cbKvarovi, 0, 199, Short.MAX_VALUE)
                                    .addComponent(cbAutomobili, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbServiseri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnPretragaAuto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPretragaAuto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIzaberiAutomobil)
                        .addComponent(cbAutomobili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIzaberiKvar)
                    .addComponent(cbKvarovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbServiseri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
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

    /**
     * Metoda koja se izvrsava ako se selektuje drugi automobil iz combo-box-a.
     * 
     * Za selektovani automobil se popuni combo-box koji prikazuje sve uocene kvarove za taj automobil.
     * @param evt
     */
    private void cbAutomobiliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAutomobiliItemStateChanged
        // TODO add your handling code here:
        if (cbAutomobili.getSelectedIndex() == -1) {
            return;
        }

        Automobil auto = (Automobil) cbAutomobili.getSelectedItem();
        cbKvarovi.setModel(new DefaultComboBoxModel(auto.getUoceniKvarovi().toArray()));
        cbKvarovi.setSelectedIndex(-1);
    }//GEN-LAST:event_cbAutomobiliItemStateChanged

    /**
     * Metoda koja se izvrsava ako se selektuje drugi uoceni kvar iz combo-box-a.
     * 
     * Za selektovani kvar pronalaze se pokvareni delovi za taj kvar iz liste svih pokvarenih delova.
     * Nakon toga se izracuna cena servisa kao cena svih pokvarenih delova i dodatnih troskova.
     * 
     * @param evt
     */
    private void cbKvaroviItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKvaroviItemStateChanged
        // TODO add your handling code here:
        if (cbKvarovi.getSelectedIndex() == -1) {
            return;
        }

        UoceniKvar uk = (UoceniKvar) cbKvarovi.getSelectedItem();
        List<PokvareniDeo> podlista = new ArrayList<>();
        for (PokvareniDeo pokvareniDeo : listaPokvarenihDelova) {
            if (pokvareniDeo.getUoceniKvar().equals(uk)) {
                podlista.add(pokvareniDeo);
            }
        }
        //nalog ne moze da se pravi ako nema pokvarenih delova!
        
        if(podlista.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nema pokvarenih delova za ovaj kvar!\nPrvo unesite pokvarene delove.", "GRESKA", JOptionPane.ERROR_MESSAGE);
            ((JDialog) this.getTopLevelAncestor()).dispose();
            return;
        }
        
        ((TableModelPokvarenDeo) tblPokvareniDelovi.getModel()).setListaPokvarenihDelova(podlista);
        izracunajCene();
    }//GEN-LAST:event_cbKvaroviItemStateChanged

    /**
     * Metoda koja se poziva klikom na dugme sacuvaj.
     * 
     * Vrsi validaciju da li su selektovani automobil, kvar za taj automobil i da li je cena 0.
     * Nakon toga poziva metodu kontrolera za kreiranje novog naloga na osnovu svih unesenih vrednosti.
     * 
     * @param evt
     */
    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        // TODO add your handling code here:
        //prvo provere dal je sve odabrano i tako to
        if (cbAutomobili.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali automobil!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cbKvarovi.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali kvar!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (konacnaCena == 0) {
            JOptionPane.showMessageDialog(this, "Cena je 0!\nTabela pokvarenih delova je prazna!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        NalogZaServisiranje nalog = new NalogZaServisiranje();
        nalog.setKvar((UoceniKvar) cbKvarovi.getSelectedItem());
        nalog.setCena(this.konacnaCena);
        nalog.setDatumKreiranja(LocalDate.now());
        nalog.setServiser((Korisnik)cbServiseri.getSelectedItem());

        try {
            Controller.getInstance().zapamtiNalogZaServisiranje(nalog);
            JOptionPane.showMessageDialog(this, "Sistem je zapamtio nalog za servisiranje!", "Potvrda", JOptionPane.INFORMATION_MESSAGE);
            
            if(this.frmSviNalozi!=null){
                //to znaci da je pozvan iz frmSviNalozi i treba da se doda u tabelu
                frmSviNalozi.dodajNalogUTabelu(nalog);
            }
            
            ((JDialog) this.getTopLevelAncestor()).dispose();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti nalog za servisiranje!\n"+ ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    /**
     * Otvara pomocnu formu za pretragu automobila, nakon sto se klikne na lupu za pretragu pored polja za automobil.
     * 
     * @see FrmPretragaAuto 
     */
    private void btnPretragaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaAutoActionPerformed
        // TODO add your handling code here:
        JDialog dialog = new JDialog((JDialog) this.getTopLevelAncestor(), "Odaberi automobil", true);
        JPanel frmPretragaAuto = new FrmPretragaAuto((FrmNalog) this, this.listaAutomobila);
        dialog.add(frmPretragaAuto);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnPretragaAutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPretragaAuto;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox<String> cbAutomobili;
    private javax.swing.JComboBox<String> cbKvarovi;
    private javax.swing.JComboBox<String> cbServiseri;
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
    private javax.swing.JLabel lblSumiranaCena;
    private javax.swing.JLabel lblUkupnaCena;
    private javax.swing.JTable tblPokvareniDelovi;
    // End of variables declaration//GEN-END:variables

    /**
     * Priprema formu pre nego sto se prikaze.
     * 
     * Poziva metode za ucitavanje svih pokvarenih delova, automobila i servisera.
     * Postavlja default vrednosti labela.
     */
    private void prepareView() {
        vratiSvePokvareneDelove();
        tblPokvareniDelovi.setModel(new TableModelPokvarenDeo());
        vratiSveAutomobile();
        vratiSveServisere();
        //labele za cenu sve na pocetku 0
        lblAdministrativniTroskovi.setText("0");
        lblPorez.setText("0");
        lblSumiranaCena.setText("0");
        lblUkupnaCena.setText("0");
        // datum kreiranja labela
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        lblDatum.setText(df.format(new Date()));
        //lblServiser.setText(this.serviser.getIme() + " " + this.serviser.getPrezime());
    }

    /**
     * Vraca sve automobile iz baze kako bi se inicijalizovao combobox koji prikazuje sve automobile.
     * 
     * Koristi se metoda kontrolera za pretragu automobila i kao kriterijum pretrage za ime i prezime se unosi prazan string.
     * Na ovaj nacin se vraca lista svih automobila iz baze kojom se inicijalizuje combobox.
     */
    private void vratiSveAutomobile() {
        try {
            Automobil auto = new Automobil();
            auto.setTablice("");
            listaAutomobila = Controller.getInstance().pronadjiAutomobile(auto);
            cbAutomobili.setModel(new DefaultComboBoxModel(listaAutomobila.toArray()));
            cbAutomobili.setSelectedIndex(-1);
            cbKvarovi.removeAllItems();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju svih automobila!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Vraca sve pokvarene delove iz baze kako bi se prikazali u tabeli (ne svi vec samo oni za odabrani kvar).
     * 
     * Poziva se metoda kontrolera za pretragu pokvarenih delova i kao kriterijum pretrage za tablice se unosi prazan string.
     * Na ovaj nacin se vraca lista svih pokvarenih delova iz baze.
     */
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

    /**
     * Vraca sve servisere iz baze kako bi se prikazali u combobox-u servisera.
     * 
     * Poziva se metoda kontrolera za vracanje liste svih servisera pomocu koje se inicijalizuje combobox.
     */
    private void vratiSveServisere() {
        try {
            listaServisera = Controller.getInstance().vratiSveServisere();
            cbServiseri.setModel(new DefaultComboBoxModel(listaServisera.toArray()));
            cbServiseri.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju svih servisera!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Izracunava ukupnu cenu servisa.
     * 
     * Sabira sve cene pokvarenih delova, dodaje administrativne troskove i porez od 20% na tu cenu.
     */
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
    
    public void postaviAutomobilCB(Automobil a) {
        cbAutomobili.setSelectedItem(a);
    }

    public void dodajAutoUCB(Automobil auto) {
        ((DefaultComboBoxModel)cbAutomobili.getModel()).addElement(auto);

    }


}
