/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.components;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Vlasnik;

/**
 *
 * @author Asus
 */
public class TableModelVlasnik extends AbstractTableModel{

    List<Vlasnik> vlasnici;
    
    String[] naziviKolona = {"Ime", "Prezime", "Email", "Telefon"};
    
    public TableModelVlasnik(){
        vlasnici = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return vlasnici.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vlasnik v = vlasnici.get(rowIndex);
        
        switch(columnIndex){
            case 0: return v.getIme();
            case 1: return v.getPrezime();
            case 2: return v.getEmail();
            case 3: return v.getTelefon();
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }
    
    public void dodajVlasnika(Vlasnik vlasnik){
        vlasnici.add(vlasnik);
        fireTableDataChanged();
    }
    
    public void obrisiVlasnika(Vlasnik vlasnik){
        vlasnici.remove(vlasnik);
        fireTableDataChanged();
    }

    public List<Vlasnik> getVlasnici() {
        return vlasnici;
    }

    public void setVlasnici(List<Vlasnik> vlasnici) {
        this.vlasnici = vlasnici;
        fireTableDataChanged();
    }
    
}
