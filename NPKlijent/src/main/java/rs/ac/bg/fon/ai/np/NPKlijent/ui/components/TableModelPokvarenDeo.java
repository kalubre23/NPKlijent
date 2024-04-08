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
 * Predstavlja model tabele za klasu {@link PokvareniDeo}. Nasledjuje apstraktni model tabele i imeplementira njegove metode.
 * 
 * Ima listu svih pokvarenih delova koji ce se prikazati u tabeli, get i set metode ove liste i
 * metode za brisanje jednog i svih naloga iz liste.
 * 
 * @see AbstractTableModel
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class TableModelPokvarenDeo extends AbstractTableModel{
	/**
	 * Lista svih povkarenih delova kao lista tipa PokvareniDeo.
	 * @see PokvareniDeo
	 */
    List<PokvareniDeo> listaPokvarenihDelova;
    /**
     * Nazivi kolona tabele kao niz stringova.
     */
    String[] naziviKolona = {"Tablice", "Opis kvara", "Pokvareni deo", "Cena"};

    /**
     * Neparametrizovani konstruktor koji inicijalizuje listu pokvarenih delova.
     */
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

    /**
     * Vraca listu pokvarenih delova koji se prikazuju u tabeli.
     * 
     * @return listaPokvarenihDelova koji se prikazuju u tabeli, kao lista tipa {@link PokvareniDeo}
     */
    public List<PokvareniDeo> getListaPokvarenihDelova() {
        return listaPokvarenihDelova;
    }

    /**
     * Postavlja novu listu pokvarenih delova koji ce se prikazati u tabeli i osvezava prikaz tabele.
     * 
     * @param listaPokvarenihDelova koja ce se prikazati u tabeli, kao lista tipa {@link PokvareniDeo}.
     */
    public void setListaPokvarenihDelova(List<PokvareniDeo> listaPokvarenihDelova) {
        this.listaPokvarenihDelova = listaPokvarenihDelova;
        fireTableDataChanged();
    }
    
    /**
     * Brise pokvareni deo iz tabele i osvezava prikaz tabele.
     * 
     * @param pd pokvareni deo koji ne treba vise da se prikazuje u tabeli, tipa {@link PokvareniDeo}
     */
    public void izbrisiPokvarenDeo(PokvareniDeo pd){
        listaPokvarenihDelova.remove(pd);
        fireTableDataChanged();
    }
    
    /**
     * Dodaje pokvareni deo u tabelu i osvezava prikaz tabele.
     * 
     * @param pd pokvareni deo koji treba da se prikaze u tabeli, tipa {@link PokvareniDeo}
     */
    public void dodajPokvarenDeo(PokvareniDeo pd){
        listaPokvarenihDelova.add(pd);
        fireTableDataChanged();
    }

    /**
     * Brise sve pokvarene delove iz tabele i osvezava prikaz tabele.
     */
    public void ocistiListu() {
        listaPokvarenihDelova.clear();
        fireTableDataChanged();
    }
}
