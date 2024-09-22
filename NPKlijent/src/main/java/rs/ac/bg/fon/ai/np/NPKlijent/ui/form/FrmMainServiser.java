/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form;

import static java.lang.Thread.sleep;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Korisnik;
import rs.ac.bg.fon.ai.np.NPCommon.domain.NalogZaServisiranje;
import rs.ac.bg.fon.ai.np.NPCommon.domain.UoceniKvar;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.components.TableModelNalog;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.nalog.FrmNalogDetalji;

/**
 *
 * @author Asus
 */
public class FrmMainServiser extends javax.swing.JFrame {
    
    Korisnik serviser;
    List<NalogZaServisiranje> sviNalozi;
    /**
     * Creates new form FrmMainServiser
     */
    public FrmMainServiser(Korisnik serviser) {
        initComponents();
        this.serviser = serviser;
        setTitle("Auto-servis");
        setLocationRelativeTo(null);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        lblKorisnik.setText(this.serviser.getIme() + " " +this.serviser.getPrezime());
        new DatumVremeNit().start();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnPretrazi = new javax.swing.JButton();
        txtNalog = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNezavrseni = new javax.swing.JTable();
        btnDetalji = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        btnSviNezavrseni = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblZavrseni = new javax.swing.JTable();
        btnDetalji2 = new javax.swing.JButton();
        btnUkloni = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOdjaviSe = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblKorisnik = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        lblImaNaloga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPretrazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-20.png"))); // NOI18N
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        tblNezavrseni.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblNezavrseni);

        btnDetalji.setText("Detalji");
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj u zavrsene");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnSviNezavrseni.setText("Svi nalozi");
        btnSviNezavrseni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSviNezavrseniActionPerformed(evt);
            }
        });

        jLabel4.setText("Pretrazi prema tablicama");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalji))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSviNezavrseni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNalog, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPretrazi)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPretrazi)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNalog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSviNezavrseni)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalji)
                    .addComponent(btnDodaj))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nezavršeni", jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblZavrseni.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblZavrseni);

        btnDetalji2.setText("Detalji");
        btnDetalji2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalji2ActionPerformed(evt);
            }
        });

        btnUkloni.setText("Ukloni");
        btnUkloni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUkloniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUkloni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDetalji2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalji2)
                    .addComponent(btnUkloni))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Završeni", jPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nalozi");

        btnOdjaviSe.setText("Odjavi se");
        btnOdjaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjaviSeActionPerformed(evt);
            }
        });

        jLabel2.setText("Ulogovani korisnik: ");

        lblKorisnik.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblKorisnik.setText("jlblkorisnik");

        jLabel3.setText("Datum i vreme:");

        lblDatum.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDatum.setText("jlblkorisnik");

        lblImaNaloga.setForeground(new java.awt.Color(255, 0, 0));
        lblImaNaloga.setText("NE POSTOJE NALOZI ZA OVOG SERVISERA!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOdjaviSe)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImaNaloga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblKorisnik))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblDatum)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImaNaloga)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOdjaviSe)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
        // TODO add your handling code here:
        
        //uzmi selektovan nalog
        if (tblNezavrseni.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali nalog!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        TableModelNalog tm = (TableModelNalog)tblNezavrseni.getModel();
        NalogZaServisiranje nalog = tm.getListaNaloga().get(tblNezavrseni.getSelectedRow());
        
        
        JDialog dialog = new JDialog(this, "Nalog detalji", true);
        JPanel frmNalogDetalji = new FrmNalogDetalji(nalog);
        dialog.add(frmNalogDetalji);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDetaljiActionPerformed

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        // TODO add your handling code here:
        if(txtNalog.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Unesite validne tablice!", "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TableModelNalog tm = (TableModelNalog)tblNezavrseni.getModel();
        if(tm.getListaNaloga().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ne postoje nezavrseni nalozi!", "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String tablice = txtNalog.getText().toLowerCase().trim();
        List<NalogZaServisiranje> podlista = new ArrayList<>();
        for(NalogZaServisiranje n : tm.getListaNaloga()){
            if(n.getKvar().getAutomobil().getTablice().toLowerCase().startsWith(tablice)){
                podlista.add(n);
            }
        }
        
        if(podlista.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ne postoje takvi nalozi!", "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tm.setListaNaloga(podlista);
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnSviNezavrseniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSviNezavrseniActionPerformed
        // TODO add your handling code here:
        TableModelNalog tm = (TableModelNalog)tblNezavrseni.getModel();
        if(tm.getListaNaloga().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ne postoje nezavrseni nalozi!", "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        List<NalogZaServisiranje> nezavrseni = new ArrayList<>();
        for(NalogZaServisiranje nalog : sviNalozi){
            if(nalog.getStatus()==0){
                nezavrseni.add(nalog);
            }
        }
        ((TableModelNalog)tblNezavrseni.getModel()).setListaNaloga(nezavrseni);
    }//GEN-LAST:event_btnSviNezavrseniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
        //samo joption pane dje se kaze da  li siguran 
        String message = "Dodaj nalog u zavrsene?\nStatus: ZAVRSEN \nDatum izvrsenja: "+LocalDate.now();
        int odgovor = JOptionPane.showConfirmDialog(this, message, "Izvrsen nalog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(odgovor == JOptionPane.NO_OPTION || odgovor== JOptionPane.CANCEL_OPTION){
            return;
        }
        if(odgovor == JOptionPane.YES_OPTION){
            NalogZaServisiranje nalogIzmena = ((TableModelNalog)tblNezavrseni.getModel()).getListaNaloga().get(tblNezavrseni.getSelectedRow());
            try {
                //izmeni nalog
                nalogIzmena.setStatus((short)1);
                nalogIzmena.setDatumIzvrsenja(LocalDate.now());
                System.out.println("iznad se uzvrsava1");
                Controller.getInstance().izmeniNalogZaServisiranje(nalogIzmena);
                System.out.println("ispod se izvrsava1");
                
                //ako nije puklo mozda joption pane da je uspesno dodat u izvrsene
                JOptionPane.showMessageDialog(this, "Nalog uspesno izvrsen!", "INFO", JOptionPane.INFORMATION_MESSAGE);
                
                //onda da ga izbacim iz ove tabele i prebacim u drugu
                ((TableModelNalog)tblNezavrseni.getModel()).izbrisiNalog(nalogIzmena);
                ((TableModelNalog)tblZavrseni.getModel()).dodajNalog(nalogIzmena);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Greska pri izvrsenju naloga!\n"+ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
                nalogIzmena.setStatus((short)0);
                nalogIzmena.setDatumIzvrsenja(null);
            }
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnOdjaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjaviSeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Controller.getInstance().logout(this.serviser);
            this.setVisible(false);
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("Greska pri logout!!!");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnOdjaviSeActionPerformed

    private void btnUkloniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUkloniActionPerformed
        // TODO add your handling code here:
        String message = "Da li sigurno zelite da postavite nalog kao nezavrsen?\nDatum izvrsenja ce biti obrisan.";
        //ovde obrnuto treba
        int odgovor = JOptionPane.showConfirmDialog(this, message, "Postavi nalog kao nezavrsen", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if(odgovor == JOptionPane.NO_OPTION || odgovor== JOptionPane.CANCEL_OPTION){
            return;
        }
        if(odgovor == JOptionPane.YES_OPTION){
            NalogZaServisiranje nalogIzmena = ((TableModelNalog)tblZavrseni.getModel()).getListaNaloga().get(tblZavrseni.getSelectedRow());
            LocalDate datIzvrsenja = nalogIzmena.getDatumIzvrsenja();
            try {
                //izmeni nalog
                nalogIzmena.setStatus((short)0);
                nalogIzmena.setDatumIzvrsenja(null);
                System.out.println("iznad se uzvrsava u ukloni");
                Controller.getInstance().izmeniNalogZaServisiranje(nalogIzmena);
                System.out.println("ispod se izvrsava u ukloni");
                
                //ako nije puklo mozda joption pane da je uspesno dodat u izvrsene
                JOptionPane.showMessageDialog(this, "Nalog uspesno izmenjen!", "INFO", JOptionPane.INFORMATION_MESSAGE);
                
                //onda da ga izbacim iz ove tabele i prebacim u drugu
                ((TableModelNalog)tblZavrseni.getModel()).izbrisiNalog(nalogIzmena);
                TableModelNalog tm = (TableModelNalog)tblNezavrseni.getModel();
                tm.dodajNalog(nalogIzmena);
                System.out.println("I ovo se izvrsilo!");
                tm.sortirajNalogePoDatumuKreiranja();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Greska pri izvrsenju naloga!\n"+ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
                nalogIzmena.setStatus((short)1);
                nalogIzmena.setDatumIzvrsenja(datIzvrsenja);
            }
        }
    }//GEN-LAST:event_btnUkloniActionPerformed

    private void btnDetalji2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalji2ActionPerformed
        // TODO add your handling code here:
        //uzmi selektovan nalog
        if (tblZavrseni.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali nalog!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        TableModelNalog tm = (TableModelNalog)tblZavrseni.getModel();
        NalogZaServisiranje nalog = tm.getListaNaloga().get(tblZavrseni.getSelectedRow());
        
        JDialog dialog = new JDialog(this, "Nalog detalji", true);
        JPanel frmNalogDetalji = new FrmNalogDetalji(nalog);
        dialog.add(frmNalogDetalji);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnDetalji2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalji;
    private javax.swing.JButton btnDetalji2;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnOdjaviSe;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnSviNezavrseni;
    private javax.swing.JButton btnUkloni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblImaNaloga;
    private javax.swing.JLabel lblKorisnik;
    private javax.swing.JTable tblNezavrseni;
    private javax.swing.JTable tblZavrseni;
    private javax.swing.JTextField txtNalog;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        //treba da se vrate svi mozda nalozi pa onda da se raspodjele
        try {
            Automobil a = new Automobil();
            a.setTablice("");
            UoceniKvar uk = new UoceniKvar();
            uk.setAutomobil(a);
            NalogZaServisiranje n = new NalogZaServisiranje();
            n.setKvar(uk);
            n.setServiser(serviser);
            sviNalozi = Controller.getInstance().pronadjiNalogeZaServisiranje(n);
            
            if(!sviNalozi.isEmpty()){
                lblImaNaloga.setVisible(false);
                TableModelNalog tmNezavrseni = new TableModelNalog();
                tblNezavrseni.setModel(tmNezavrseni);

                TableModelNalog tmZavrseni = new TableModelNalog();
                tblZavrseni.setModel(tmZavrseni);

                List<NalogZaServisiranje> nezavrseni = new ArrayList<>();
                List<NalogZaServisiranje> zavrseni = new ArrayList<>();

                for(NalogZaServisiranje nalog : sviNalozi){
                    if(nalog.getStatus()==0){
                        nezavrseni.add(nalog);
                        System.out.println("Dodat "+nalog+" u nezavrsene jer je status="+nalog.getStatus());
                    } else {
                        zavrseni.add(nalog);
                    }
                }
                tmNezavrseni.setListaNaloga(nezavrseni);
                tmZavrseni.setListaNaloga(zavrseni);
            } else {
                lblImaNaloga.setVisible(true);
                txtNalog.setEnabled(false);
                btnDetalji.setEnabled(false);
                btnDodaj.setEnabled(false);
                btnPretrazi.setEnabled(false);
                btnUkloni.setEnabled(false);
                btnSviNezavrseni.setEnabled(false);
                btnDetalji2.setEnabled(false);
                jTabbedPane1.setEnabled(false);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Greska pri ucitavanju svih naloga!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    class DatumVremeNit extends Thread {

        @Override
        public void run() {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm");
            while (true) {
                lblDatum.setText(df.format(LocalDateTime.now()));
                try {
                    sleep(60000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
