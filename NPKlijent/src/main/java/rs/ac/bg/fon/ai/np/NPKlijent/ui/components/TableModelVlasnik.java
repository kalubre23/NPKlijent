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
 * Predstavlja model tabele za klasu {@link Vlasnik}. Nasledjuje apstraktni model tabele i imeplementira njegove metode.
 * 
 * Ima listu svih vlasnika koji ce se prikazati u tabeli, get i set metode ove liste i
 * metode za brisanje i dodavanje vlasnika iz liste.
 * 
 * @see AbstractTableModel
 * @author Luka Obrenic
 * @since 1.1.0
 */
public class TableModelVlasnik extends AbstractTableModel{

	/**
	 * Lista svih vlasnika kao lista tipa Vlasnik.
	 * @see Vlasnik
	 */
    List<Vlasnik> vlasnici;

    /**
     * Nazivi kolona tabele kao niz stringova.
     */
    String[] naziviKolona = {"Ime", "Prezime", "Email", "Telefon"};
    
    /**
     * Neparametrizovani konstruktor koji inicijalizuje listu vlasnika automobila.
     */
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
    
    /**
     * Dodaje vlasnika u tabelu i osvezava prikaz tabele.
     * 
     * @param vlasnik koji treba da se doda u tabeli, tipa {@link Vlasnik}
     */
    public void dodajVlasnika(Vlasnik vlasnik){
        vlasnici.add(vlasnik);
        fireTableDataChanged();
    }
    
    /**
     * Brise vlasnika iz tabele i osvezava prikaz tabele.
     * 
     * @param vlasnik koji ne treba vise da se prikazuje u tabeli, tipa {@link Vlasnik}
     */
    public void obrisiVlasnika(Vlasnik vlasnik){
        vlasnici.remove(vlasnik);
        fireTableDataChanged();
    }

    /**
     * Vraca listu vlasnika koji se prikazuju u tabeli.
     * 
     * @return vlasnici koji se prikazuju u tabeli, kao lista tipa {@link Vlasnik}
     */
    public List<Vlasnik> getVlasnici() {
        return vlasnici;
    }

    /**
     * Postavlja novu listu vlasnika koji ce se prikazati u tabeli i osvezava prikaz tabele.
     * 
     * @param vlasnici koji ce se prikazati u tabeli, kao lista tipa {@link Vlasnik}.
     */
    public void setVlasnici(List<Vlasnik> vlasnici) {
        this.vlasnici = vlasnici;
        fireTableDataChanged();
    }
    
}
