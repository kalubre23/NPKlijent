/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.components;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.NalogZaServisiranje;

/**
 *
 * @author Asus
 */
public class TableModelNalog extends AbstractTableModel{
    List<NalogZaServisiranje> listaNaloga;
    String[] naziviKolona = {"Tablice", "Kvar", "Datum", "Cena"};

    public TableModelNalog() {
        listaNaloga = new ArrayList<>();
    }
    
    
    @Override
    public int getRowCount() {
        return listaNaloga.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NalogZaServisiranje n = listaNaloga.get(rowIndex);
        
        switch(columnIndex){
            case 0: return n.getKvar().getAutomobil().getTablice();
            case 1: return n.getKvar().getOpis();
            case 2: return n.getDatum();
            case 3: return n.getCena();
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public List<NalogZaServisiranje> getListaNaloga() {
        return listaNaloga;
    }

    public void setListaNaloga(List<NalogZaServisiranje> listaNaloga) {
        this.listaNaloga = listaNaloga;
        fireTableDataChanged();
    }
    
    public void izbrisiNalog(NalogZaServisiranje nalog){
        listaNaloga.remove(nalog);
        fireTableDataChanged();
    }
    
    
}
