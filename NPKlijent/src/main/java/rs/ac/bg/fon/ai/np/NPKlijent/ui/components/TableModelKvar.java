/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.components;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.UoceniKvar;

/**
 *
 * @author Asus
 */
public class TableModelKvar extends AbstractTableModel{

    List<UoceniKvar> kvarovi;
    String[] naziviKolone = {"Opis kvara"};

    public TableModelKvar() {
        kvarovi = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return kvarovi.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UoceniKvar k = kvarovi.get(rowIndex);
        
        switch(columnIndex){
            case 0: return k.getOpis();
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolone[column];
    }
    
    public void dodajKvar(UoceniKvar k){
        kvarovi.add(k);
        fireTableDataChanged();
    }
    
    public void obrisiKvar(int row){
        //kvarovi.remove(k);
        kvarovi.remove(row);
        fireTableDataChanged();
    }

    public List<UoceniKvar> getKvarovi() {
        return kvarovi;
    }

    public void setKvarovi(List<UoceniKvar> kvarovi) {
        this.kvarovi = kvarovi;
        fireTableDataChanged();
    }
    
    public void ocistiTabelu(){
        this.kvarovi.clear();
        fireTableDataChanged();
    }
    
}
