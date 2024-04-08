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
 * Predstavlja model tabele za klasu Autmomobil. Nasledjuje apstraktni model tabele i imeplementira njegove metode.
 * 
 * Ima listu svih autmobila koji ce se prikazati u tabeli, get i set metode ove liste i
 * metodu za brisanje automobila iz liste.
 * 
 * @see AbstractTableModel
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class TableModelAutomobil extends AbstractTableModel{
	/**
	 * Lista svih automobila kao lista tipa Automobil.
	 * @see Automobil
	 */
    List<Automobil> listaAutomobila;
    /**
     * Nazivi kolona tabele kao niz stringova.
     */
    String[] naziviKolona = {"Vlasnik", "Godiste", "Marka"};

    /**
     * Neparametrizovani konstruktor koji inicijalizuje listu automobila.
     */
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

    /**
     * Postavlja novu listu automobila koji ce se prikazati u tabeli i osvezava prikaz tabele.
     * 
     * @param listaAutomobila koja ce se prikazati u tabeli, kao lista tipa {@link Automobil}.
     */
    public void setListaAutomobila(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
        fireTableDataChanged();
    }

    /**
     * Vraca listu automobila koji se prikazuju u tabeli.
     * 
     * @return listaAutomobila koji se prikazuju u tabeli, kao lista tipa {@link Automobil}
     */
    public List<Automobil> getListaAutomobila() {
        return listaAutomobila;
    }

    /**
     * Brise automobil iz tabele i osvezava prikaz tabele.
     * 
     * @param automobil koji ne treba vise da se prikazuje u tabeli, tipa {@link Automobil}
     */
    public void izbirisiAutomobil(Automobil automobil) {
        listaAutomobila.remove(automobil);
        fireTableDataChanged();
    }
}
