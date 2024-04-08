/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.main;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import rs.ac.bg.fon.ai.np.NPKlijent.ui.form.FrmLogin;

/**
 *
 * @author Cartman
 */
public class Main {
    public static void main(String[] args) {
        JDialog dialog=new JDialog((JFrame)null, "Login", true);
        JPanel panel=new FrmLogin();
        dialog.add(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setVisible(true);
    }
}
