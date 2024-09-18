/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.components;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.ai.np.NPCommon.domain.DeoAutomobila;

/**
 *
 * @author Asus
 */
public class TableModelDeo extends AbstractTableModel{
    
    List<DeoAutomobila> delovi;
    
    String[] naziviKolone = {"Naziv"};

    public TableModelDeo() {
        delovi = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return delovi.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DeoAutomobila d = delovi.get(rowIndex);
        
        switch(columnIndex){
            case 0: return d.getNaziv();
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolone[column];
    }
    
    public void dodajDeo(DeoAutomobila deo){
        delovi.add(deo);
        fireTableDataChanged();
    }

    public List<DeoAutomobila> getDelovi() {
        return delovi;
    }

    public void setDelovi(List<DeoAutomobila> delovi) {
        this.delovi = delovi;
        fireTableDataChanged();
    }  
    
}
