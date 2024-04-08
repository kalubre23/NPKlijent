/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Serviser;
import rs.ac.bg.fon.ai.np.NPKlijent.logic.Controller;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.automobil.FrmAutoDetalji;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.automobil.FrmIzmeniAuto;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.nalog.FrmNalogDetalji;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.nalog.FrmSviNalozi;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.pokvarendeo.FrmIzmeniPokvarenDeo;
import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.pokvarendeo.FrmPokvarenDeoDetalji;

/**
 * Predstavlja glavnu graficku formu na klijentskoj strani.
 * 
 * Klijentu se prikazuje u gornjem levom uglu njegovo ime i prezime kao i danasnji datum.
 * U meniju se nalaze opcije za otvaranje formi za rad sa automobilom, pokvarenim delovima i nalogom za servisiranje.
 * 
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class FrmMain extends javax.swing.JFrame {

	/**
	 * Serviser koji je ulogovan u sistem tipa {@link Serviser}.
	 */
    private Serviser serviser;

    /**
     * Kreira novu formu FrmMain. Centrira je, postavlja naslov, sliku i datum.
     */
    public FrmMain(Serviser serviser) {
        this.serviser = serviser;
        initComponents();
        setTitle("Auto-servis");
        setLocationRelativeTo(null);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        new DatumVremeNit().start();
        lblServiser.setText(this.serviser.getUsername());
        postaviSliku();
    }

    /**
     * Inicijalizacija grafickih komponenata forme. Ne dirati ovaj kod!
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        lblServiser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDatumVreme = new javax.swing.JLabel();
        btnOdjaviSe = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JPanelNole = new javax.swing.JPanel();
        lblNole = new javax.swing.JLabel();
        menuBarMain = new javax.swing.JMenuBar();
        meniAuto = new javax.swing.JMenu();
        meniItemNoviAuto = new javax.swing.JMenuItem();
        meniItemIzmeniAuto = new javax.swing.JMenuItem();
        meniPokvarenDeo = new javax.swing.JMenu();
        meniItemNoviPokvarenDeo = new javax.swing.JMenuItem();
        meniItemIzmeniPokvarenDeo = new javax.swing.JMenuItem();
        meniNalogZaSer = new javax.swing.JMenu();
        meniItemNoviNalog = new javax.swing.JMenuItem();
        meniItemObrisiNalog = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ulogovani serviser:");

        lblServiser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblServiser.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Datum i vreme:");

        lblDatumVreme.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDatumVreme.setText("jLabel3");

        btnOdjaviSe.setText("Odjavi se");
        btnOdjaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjaviSeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dobro dosli u aplikaciju za auto-servis");

        lblNole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/form/icon/slika.png"))); // NOI18N

        javax.swing.GroupLayout JPanelNoleLayout = new javax.swing.GroupLayout(JPanelNole);
        JPanelNole.setLayout(JPanelNoleLayout);
        JPanelNoleLayout.setHorizontalGroup(
            JPanelNoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelNoleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNole, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        JPanelNoleLayout.setVerticalGroup(
            JPanelNoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNoleLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblNole, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        meniAuto.setText("Automobil");

        meniItemNoviAuto.setText("Kreiraj novi automobil");
        meniItemNoviAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemNoviAutoActionPerformed(evt);
            }
        });
        meniAuto.add(meniItemNoviAuto);

        meniItemIzmeniAuto.setText("Izmeni automobil");
        meniItemIzmeniAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemIzmeniAutoActionPerformed(evt);
            }
        });
        meniAuto.add(meniItemIzmeniAuto);

        menuBarMain.add(meniAuto);

        meniPokvarenDeo.setText("Pokvaren deo");

        meniItemNoviPokvarenDeo.setText("Dodaj pokvaren deo");
        meniItemNoviPokvarenDeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemNoviPokvarenDeoActionPerformed(evt);
            }
        });
        meniPokvarenDeo.add(meniItemNoviPokvarenDeo);

        meniItemIzmeniPokvarenDeo.setText("Izmeni pokvaren deo");
        meniItemIzmeniPokvarenDeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemIzmeniPokvarenDeoActionPerformed(evt);
            }
        });
        meniPokvarenDeo.add(meniItemIzmeniPokvarenDeo);

        menuBarMain.add(meniPokvarenDeo);

        meniNalogZaSer.setText("Nalog za servisiranje");

        meniItemNoviNalog.setText("Kreiraj novi nalog");
        meniItemNoviNalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemNoviNalogActionPerformed(evt);
            }
        });
        meniNalogZaSer.add(meniItemNoviNalog);

        meniItemObrisiNalog.setText("Obrisi nalog");
        meniItemObrisiNalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniItemObrisiNalogActionPerformed(evt);
            }
        });
        meniNalogZaSer.add(meniItemObrisiNalog);

        menuBarMain.add(meniNalogZaSer);

        setJMenuBar(menuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDatumVreme, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblServiser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOdjaviSe)
                                .addGap(2, 2, 2)))))
                .addGap(18, 18, 18))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelNole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblServiser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatumVreme)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelNole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOdjaviSe)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda koja se poziva klikom na meni stavku krairaj novi automobil.
     * 
     * Otvara formu za rad sa automobilom.
     * @see FrmAutoDetalji
     * @param evt
     */
    private void meniItemNoviAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemNoviAutoActionPerformed
        try {
            JDialog dialog = new JDialog(this, "Novi automobil", true);
            System.out.println("Ovde ce doci program i puknuce!");
            JPanel panel = new FrmAutoDetalji();
            System.out.println("Ovde nece doci program");
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne moze se prikazati forma!\n" + ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_meniItemNoviAutoActionPerformed

    /**
     * Metoda koja se poziva klikom na meni stavku izmeni automobil.
     * 
     * Otvara formu za rad sa automobilom.
     * @see FrmIzmeniAuto
     * @param evt
     */
    private void meniItemIzmeniAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemIzmeniAutoActionPerformed
        // TODO add your handling code here:
        try {
            JDialog dialog = new JDialog(this, "Svi automobili", true);
            JPanel panel = new FrmIzmeniAuto();
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne moze se prikazati forma!\n" + ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_meniItemIzmeniAutoActionPerformed

    /**
     * Metoda koja se poziva klikom na meni stavku dodaj pokvareni deo.
     * 
     * Otvara formu za rad sa pokvarenim delom.
     * @see FrmPokvarenDeoDetalji
     * @param evt
     */
    private void meniItemNoviPokvarenDeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemNoviPokvarenDeoActionPerformed
        // TODO add your handling code here:
        try {
            JDialog dialog = new JDialog(this, "Dodaj pokvaren deo", true);
            JPanel panel = new FrmPokvarenDeoDetalji();
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne moze se prikazati forma!\n" + ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_meniItemNoviPokvarenDeoActionPerformed

    /**
     * Metoda koja se poziva klikom na meni stavku izmeni pokvareni deo.
     * 
     * Otvara formu za rad sa pokvarenim delom.
     * @see FrmIzmeniPokvarenDeo
     * @param evt
     */
    private void meniItemIzmeniPokvarenDeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemIzmeniPokvarenDeoActionPerformed
        // TODO add your handling code here:
        try {
            JDialog dialog = new JDialog(this, "Svi pokvareni delovi", true);
            JPanel panel = new FrmIzmeniPokvarenDeo();
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne moze se prikazati forma!\n" + ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_meniItemIzmeniPokvarenDeoActionPerformed

    /**
     * Metoda koja se poziva klikom na meni stavku kreiraj novi nalog.
     * 
     * Otvara formu za rad sa nalogom za servisiranje.
     * @see FrmNalogDetalji
     * @param evt
     */
    private void meniItemNoviNalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemNoviNalogActionPerformed
        // TODO add your handling code here:
        try {
            JDialog dialog = new JDialog(this, "Dodaj nalog za servisiranje", true);
            JPanel panel = new FrmNalogDetalji(this.serviser);
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne moze se prikazati forma!\n" + ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_meniItemNoviNalogActionPerformed

    /**
     * Metoda koja se poziva klikom na meni stavku obrisi nalog.
     * 
     * Otvara formu za rad sa nalogom za servisiranje.
     * @see FrmSviNalozi
     * @param evt
     */
    private void meniItemObrisiNalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniItemObrisiNalogActionPerformed
        // TODO add your handling code here:
        try {
            JDialog dialog = new JDialog(this, "Obrisi nalog za servisiranje", true);
            JPanel panel = new FrmSviNalozi();
            dialog.add(panel);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne moze se prikazati forma!\n" + ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_meniItemObrisiNalogActionPerformed

    /**
     * Metoda koja se pizva klikom na dugme odjavi se.
     * 
     * Poziva metodu kontrolera za logout servisera i gasi aplikaciju.
     * 
     * @param evt
     */
    private void btnOdjaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjaviSeActionPerformed
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

    private void postaviSliku() {
    }

    /**
     * Nit koja je zaduzena za prikaz datuma i vremena na formi. Implementirana je kao unutrasnja klasa ove klase jer se nigde
     * drugo ne koristi.
     * 
     * @author Luka Obrenic.
     * @since 1.0.0
     *
     */
    class DatumVremeNit extends Thread {

        @Override
        public void run() {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm");
            while (true) {
                lblDatumVreme.setText(df.format(LocalDateTime.now()));
                try {
                    sleep(60000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelNole;
    private javax.swing.JButton btnOdjaviSe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDatumVreme;
    private javax.swing.JLabel lblNole;
    private javax.swing.JLabel lblServiser;
    private javax.swing.JMenu meniAuto;
    private javax.swing.JMenuItem meniItemIzmeniAuto;
    private javax.swing.JMenuItem meniItemIzmeniPokvarenDeo;
    private javax.swing.JMenuItem meniItemNoviAuto;
    private javax.swing.JMenuItem meniItemNoviNalog;
    private javax.swing.JMenuItem meniItemNoviPokvarenDeo;
    private javax.swing.JMenuItem meniItemObrisiNalog;
    private javax.swing.JMenu meniNalogZaSer;
    private javax.swing.JMenu meniPokvarenDeo;
    private javax.swing.JMenuBar menuBarMain;
    // End of variables declaration//GEN-END:variables
}
