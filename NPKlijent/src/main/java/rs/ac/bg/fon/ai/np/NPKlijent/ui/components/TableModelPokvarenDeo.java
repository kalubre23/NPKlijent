/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.components;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import rs.ac.bg.fon.ai.np.NPCommon.domain.PokvareniDeo;

/**
 *
 * @author Asus
 */
public class TableModelPokvarenDeo extends AbstractTableModel{
    List<PokvareniDeo> listaPokvarenihDelova;
    String[] naziviKolona = {"Tablice", "Opis kvara", "Pokvareni deo", "Cena"};

    public TableModelPokvarenDeo() {
        listaPokvarenihDelova = new ArrayList<>();
    }
    
    
    @Override
    public int getRowCount() {
        return listaPokvarenihDelova.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PokvareniDeo pd = listaPokvarenihDelova.get(rowIndex);
        
        switch(columnIndex){
            case 0: return pd.getUoceniKvar().getAutomobil().getTablice();
            case 1: return pd.getUoceniKvar().getOpis();
            case 2: return pd.getDeo();
            case 3: return pd.getCena()+"";
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public List<PokvareniDeo> getListaPokvarenihDelova() {
        return listaPokvarenihDelova;
    }

    public void setListaPokvarenihDelova(List<PokvareniDeo> listaPokvarenihDelova) {
        this.listaPokvarenihDelova = listaPokvarenihDelova;
        fireTableDataChanged();
    }
    
    public void izbrisiPokvarenDeo(PokvareniDeo pd){
        listaPokvarenihDelova.remove(pd);
        fireTableDataChanged();
    }
    
    public void dodajPokvarenDeo(PokvareniDeo pd){
        listaPokvarenihDelova.add(pd);
        fireTableDataChanged();
    }

    public void ocistiListu() {
        listaPokvarenihDelova.clear();
        fireTableDataChanged();
    }
}
