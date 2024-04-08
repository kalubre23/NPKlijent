/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.components;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;

/**
 *
 * @author Asus
 */
public class TableModelAutomobil extends AbstractTableModel{
    
    List<Automobil> listaAutomobila;
    String[] naziviKolona = {"Vlasnik", "Godiste", "Marka"};

    public TableModelAutomobil(){
        listaAutomobila = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return listaAutomobila.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Automobil automobil = listaAutomobila.get(rowIndex);
        
        switch(columnIndex){
            case 0: return automobil.getImePrezimeVlasnika();
            case 1: return automobil.getGodiste();
            case 2: return automobil.getMarka();
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void setListaAutomobila(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
        fireTableDataChanged();
    }

    public List<Automobil> getListaAutomobila() {
        return listaAutomobila;
    }

    public void izbirisiAutomobil(Automobil automobil) {
        listaAutomobila.remove(automobil);
        fireTableDataChanged();
    }
}
