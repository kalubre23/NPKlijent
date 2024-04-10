/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form.automobil;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Marka;
import rs.ac.bg.fon.ai.np.NPCommon.domain.UoceniKvar;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Vlasnik;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelKvar;

/**
 * Predstavlja graficku formu koja prikazuje podatke o jednom automobilu. 
 * 
 * Sluzi za dodavanje novog automobila u bazu ili za izmenu postojeceg automobila u bazi.
 * 
 * @see Automobil
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class FrmAutoDetalji extends javax.swing.JPanel {

	/**
	 * Automobil za koga se se vrsi izmena podataka, tipa {@link Automobil}.
	 */
    Automobil automobil;
    /**
     * Referenca ka formi za izmenu automobila.
     */
    FrmIzmeniAuto frmIzmeniAuto;

    /**
     * Kreira novu formu FrmAutoDetalji. Ovaj konstruktor se koristi kada treba sacuvati novi automobil.
     */
    public FrmAutoDetalji() throws Exception {
        initComponents();
        prepareView();
    }

    /**
     * Kreira novu formu FrmAutoDetalji. Ovaj konstruktor dodeljuje automobil za koga se vrsi izmena podataka.
     * 
     */
    public FrmAutoDetalji(Automobil automobil, FrmIzmeniAuto frmIzmeniAuto) throws Exception {
        initComponents();
        this.automobil = automobil;
        this.frmIzmeniAuto = frmIzmeniAuto;
        prepareView();
    }

    /**
     * Inicijalizacija grafickih komponenata forme. Ne dirati ovaj kod!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImePrezimeVlasnika = new javax.swing.JLabel();
        lblGodiste = new javax.swing.JLabel();
        lblMarka = new javax.swing.JLabel();
        txtGodiste = new javax.swing.JTextField();
        cbVlasnik = new javax.swing.JComboBox<>();
        btnSacuvaj = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRegistarskaTablica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKvarovi = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnDodajKvar = new javax.swing.JButton();
        btnObrisiKvar = new javax.swing.JButton();
        cbMarke = new javax.swing.JComboBox<>();

        lblImePrezimeVlasnika.setText("Vlasnik");

        lblGodiste.setText("Godiste");

        lblMarka.setText("Marka");

        cbVlasnik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSacuvaj.setText("Sacuvaj automobil");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        btnCancel.setText("Nazad");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Registarska tablica");

        tblKvarovi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblKvarovi);

        jLabel2.setText("Kvarovi");

        btnDodajKvar.setText("Dodaj kvar");
        btnDodajKvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKvarActionPerformed(evt);
            }
        });

        btnObrisiKvar.setText("Obrisi kvar");
        btnObrisiKvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiKvarActionPerformed(evt);
            }
        });

        cbMarke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblMarka)
                                    .addComponent(lblGodiste)
                                    .addComponent(lblImePrezimeVlasnika))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtGodiste)
                                        .addComponent(txtRegistarskaTablica)
                                        .addComponent(cbVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbMarke, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSacuvaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDodajKvar)
                            .addComponent(btnObrisiKvar))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegistarskaTablica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImePrezimeVlasnika)
                    .addComponent(cbVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGodiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGodiste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarka)
                    .addComponent(cbMarke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajKvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisiKvar)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvaj)
                    .addComponent(btnCancel))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda se poziva klikom na dugme sacuvaj automobil. Sluzi za cuvanje novog automobila ili izmenu postojeceg.
     * 
     * Vrsi validaciju imena i prezimena vlasnika, godista i registarske tablice. Nakon toga
     * poziva metodu kontrolera za cuvanje ili izmenu automobila u zavisnosti od toga da li je
     * atribut automobil null. 
     * Ako jeste null to znaci da treba napraviti novi automobil i pozvati metodu kontrolera za cuvanje automobila u bazi.
     * Ako nije null to znaci da taj automobil vec postoji i treba izmeniti podatke o njemu. Nakon toga se poziva metoda kontrolera za izmenu podataka o automobilu.
     * 
     * @param evt
     */
    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed

//        if (!txtImePrezimeVlasnika.getText().matches("^[A-Z][a-z]+(?:\\s[A-Z][a-z]+)+$")) {
//            JOptionPane.showMessageDialog(this, "Ime i prezime nije validno!", "Greska pri unosu!", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        if (!txtGodiste.getText().matches("^[0-9]{4}+")) {
            JOptionPane.showMessageDialog(this, "Godiste mora biti cetvorocifren broj koji predstavlja godinu!\nnpr: 2004", "Greska pri unosu!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!txtRegistarskaTablica.getText().matches("^[A-Z0-9]{8}+")) {
            JOptionPane.showMessageDialog(this, "Duzina registarske tablice je 8 i mora sadrzati samo velika slova i brojeve!\nnpr: PV240A50", "Greska pri unosu!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cbVlasnik.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "Nista izabrali vlasnika!", "Greska pri unosu!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cbMarke.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "Nista izabrali marku!", "Greska pri unosu!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tablice = txtRegistarskaTablica.getText();
        //String imePrezimeVlasnika = txtImePrezimeVlasnika.getText();
        Vlasnik vlasnik = (Vlasnik) cbVlasnik.getSelectedItem();
        int godiste = Integer.parseInt(txtGodiste.getText().trim());
        Marka marka = (Marka) cbMarke.getSelectedItem();
        List<UoceniKvar> kvarovi = ((TableModelKvar) tblKvarovi.getModel()).getKvarovi();

        if (automobil == null) {
            //sacuvaj novi automobil
            Automobil auto = new Automobil(tablice, vlasnik, godiste, marka, kvarovi);

            kvarovi.forEach(kvar -> {kvar.setAutomobil(auto);});
            try {
                Controller.getInstance().sacuvajAutomobil(auto);
                
                JOptionPane.showMessageDialog(this, "Sistem je zapamtio automobil!", "Kreiraj automobil", JOptionPane.INFORMATION_MESSAGE);
                int opcija = JOptionPane.showConfirmDialog(this, "Nastavi unos?", "Potvrda", JOptionPane.YES_NO_OPTION);
                if(opcija == JOptionPane.YES_OPTION){
                    pripremiFormuZaNoviUnos();
                }else{
                   ((JDialog) this.getTopLevelAncestor()).dispose();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti automobil!\n" + ex.getMessage(), "Kreiraj automobil", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            //automobil.setAutoID(tablice);
            automobil.setVlasnik(vlasnik);
            automobil.setGodiste(godiste);
            automobil.setMarka(marka);
            automobil.setUoceniKvarovi(kvarovi);
            kvarovi.forEach(kvar -> {kvar.setAutomobil(automobil);});
            try {
                Controller.getInstance().izmeniAutomobil(automobil);
                JOptionPane.showMessageDialog(this, "Sistem je izmenio automobil!", "Izmeni automobil", JOptionPane.INFORMATION_MESSAGE);
                //ukoliko je uspesno izmenjen automobil treba da se refreshuje tabela
                frmIzmeniAuto.refreshTabela();
                ((JDialog)this.getTopLevelAncestor()).dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da izmeni automobil!\n" + ex.getMessage(), "Kreiraj automobil", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme nazad.
     * 
     * Gasi ovu formu.
     * @param evt
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        ((JDialog) this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme dodaj kvar.
     * 
     * Otvara formu za dodavanje uocenih kvarova za automobil. Kvarovi ce se prikazati u tabeli.
     * @param evt
     */
    private void btnDodajKvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKvarActionPerformed
        // TODO add your handling code here:
        JDialog dialog = new JDialog((JDialog) this.getTopLevelAncestor(), "Dodaj kvar", true);
        JPanel frmDodajKvar = new FrmDodajKvar((TableModelKvar) tblKvarovi.getModel());
        dialog.add(frmDodajKvar);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDodajKvarActionPerformed

    /**
     * Metoda koja se poziva klikom na dugme obrisi kvar.
     * 
     * Brise uceni kvar za automobil iz tabele.
     * @param evt
     */
    private void btnObrisiKvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiKvarActionPerformed
        // TODO add your handling code here:
        if (tblKvarovi.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali kvar!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelKvar tm = (TableModelKvar) tblKvarovi.getModel();
        //UoceniKvar k = tm.getKvarovi().get(tblKvarovi.getSelectedRow());
        tm.obrisiKvar(tblKvarovi.getSelectedRow());
    }//GEN-LAST:event_btnObrisiKvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDodajKvar;
    private javax.swing.JButton btnObrisiKvar;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox<Object> cbMarke;
    private javax.swing.JComboBox<Object> cbVlasnik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGodiste;
    private javax.swing.JLabel lblImePrezimeVlasnika;
    private javax.swing.JLabel lblMarka;
    private javax.swing.JTable tblKvarovi;
    private javax.swing.JTextField txtGodiste;
    private javax.swing.JTextField txtRegistarskaTablica;
    // End of variables declaration//GEN-END:variables

    /**
     * Priprema izgled forme pre nego sto se prikaze.
     * 
     * Ukoliko se dodaje novi automobil dodace samo listu automobila na formi (ostale podatke unosi serviser).
     * Ukoliko se vrsi izmena podataka automobila, prikazace se vrednosti svih atributa tog automobila na formi.
     * @throws Exception
     */
    private void prepareView() throws Exception {
        vratiMarke();
        vratiVlasnike();
        System.out.println("Ovo se nece izvrsiti jer izuzetak samo treba dalje baciti!");
        tblKvarovi.setModel(new TableModelKvar());
        if (automobil != null) {
            txtGodiste.setText(automobil.getGodiste() + "");
            cbVlasnik.setSelectedItem((Vlasnik)automobil.getVlasnik());
            txtRegistarskaTablica.setText(automobil.getTablice());
            txtRegistarskaTablica.setEditable(false);
            ((TableModelKvar) tblKvarovi.getModel()).setKvarovi(automobil.getUoceniKvarovi());
            cbMarke.setSelectedItem((Marka)automobil.getMarka());
        }
    }

    /**
     * Vraca sve marke automobila. Poziva metodu kontrolera za vracanje svih marki automobila iz baze.
     * 
     * @throws Exception
     */
    private void vratiMarke() throws Exception {
        try {
            List<Marka> marke = Controller.getInstance().ucitajListuMarki();
            cbMarke.setModel(new DefaultComboBoxModel(marke.toArray()));
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "Greska!\n"+e.getMessage(), "Greska!", JOptionPane.ERROR_MESSAGE);
            //AKO PUKNE BILO STA U prepareView() NE TREBA DA OTVARAS FORMU
            //Ovde treba exception sa astrane servera da se baci i da pise
            //ne mogu se ucitati marke
            //posto je uhvacen ovaj izuzetak nastavice se rad prepareView(); i uspesno
            //ce se izvrsiti konstruktor e to ne treba da se desi vec ovde treba baciti izuzetak opet
            System.out.println("Ovde ce da uhvati gaaa");
            throw e;
        }
    }

    /**
     * Priprema formu za novi unos. Cisti sva polja i postavlja vrednosti na default.
     */
    private void pripremiFormuZaNoviUnos() {
        txtRegistarskaTablica.setText("");
        txtGodiste.setText("");
        //txtImePrezimeVlasnika.setText("");
        cbVlasnik.setSelectedIndex(-1);
        cbMarke.setSelectedIndex(-1);
        //sad treba da ispraznim listu kvarova
        ((TableModelKvar)tblKvarovi.getModel()).ocistiTabelu();
    }

    private void vratiVlasnike() throws Exception {
        try {
            Vlasnik v = new Vlasnik();
            v.setIme("");
            List<Vlasnik> vlasnici = Controller.getInstance().pronadjiVlasnike(v);
            cbVlasnik.setModel(new DefaultComboBoxModel(vlasnici.toArray()));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
