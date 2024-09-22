/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.components;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.table.AbstractTableModel;


import rs.ac.bg.fon.ai.np.NPCommon.domain.NalogZaServisiranje;

/**
 * Predstavlja model tabele za klasu {@link NalogZaServisiranje}. Nasledjuje apstraktni model tabele i imeplementira njegove metode.
 * 
 * Ima listu svih naloga koji ce se prikazati u tabeli, get i set metode ove liste i
 * metodu za brisanje naloga iz liste.
 * 
 * @see AbstractTableModel
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class TableModelNalog extends AbstractTableModel{
	/**
	 * Lista svih naloga kao lista tipa NalogZaServisiranje.
	 * @see NalogZaServisiranje
	 */
    List<NalogZaServisiranje> listaNaloga;
    /**
     * Nazivi kolona tabele kao niz stringova.
     */
    String[] naziviKolona = {"Tablice", "Kvar", "Datum kreiranja", "Cena", "Status", "Datum izvrsenja"};

    /**
     * Neparametrizovani konstruktor koji inicijalizuje listu naloga za servisiranje.
     */
    public TableModelNalog() {
        listaNaloga = new ArrayList<>();
    }
    
    
    @Override
    public int getRowCount() {
        return listaNaloga.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NalogZaServisiranje n = listaNaloga.get(rowIndex);
        
        switch(columnIndex){
            case 0: return n.getKvar().getAutomobil().getTablice();
            case 1: return n.getKvar().getOpis();
            case 2: return n.getDatumKreiranja();
            case 3: return n.getCena();
            case 4: return n.getStatus() == 0 ? "U obradi" : "Zavrsen";
            case 5: return n.getDatumIzvrsenja()==null ? "/" : n.getDatumIzvrsenja();
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    /**
     * Vraca listu naloga koji se prikazuju u tabeli.
     * 
     * @return listaNaloga koji se prikazuju u tabeli, kao lista tipa {@link NalogZaServisiranje}
     */
    public List<NalogZaServisiranje> getListaNaloga() {
        return listaNaloga;
    }

    /**
     * Postavlja novu listu naloga koji ce se prikazati u tabeli i osvezava prikaz tabele.
     * 
     * @param listaNaloga koja ce se prikazati u tabeli, kao lista tipa {@link NalogZaServisiranje}.
     */
    public void setListaNaloga(List<NalogZaServisiranje> listaNaloga) {
        this.listaNaloga = listaNaloga;
        fireTableDataChanged();
    }
    
    /**
     * Brise nalog iz tabele i osvezava prikaz tabele.
     * 
     * @param nalog koji ne treba vise da se prikazuje u tabeli, tipa {@link NalogZaServisiranje}
     */
    public void izbrisiNalog(NalogZaServisiranje nalog){
        listaNaloga.remove(nalog);
        fireTableDataChanged();
    }
    
    public void dodajNalog(NalogZaServisiranje nalog){
        listaNaloga.add(nalog);
        fireTableDataChanged();
    }
    
    public void sortirajNalogePoDatumuKreiranja(){
        listaNaloga.sort((n1, n2) -> n2.getDatumKreiranja().compareTo(n1.getDatumKreiranja()));
        fireTableDataChanged();
    }
    
    
}
