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
 * Predstavlja model tabele za klasu {@link UoceniKvar}. Nasledjuje apstraktni model tabele i imeplementira njegove metode.
 * 
 * Ima listu svih uocenih kvarova koji ce se prikazati u tabeli, metode za dodavanje i brisanje automobila iz liste,
 * kao i metodu za brisanje svih uocenih kvarova iz liste.
 * 
 * @see AbstractTableModel
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class TableModelKvar extends AbstractTableModel{

    /**
     * Lista svih uocenih kvarova kao lista tipa UoceniKvar.
     * @see UoceniKvar
     */
    List<UoceniKvar> kvarovi;
    /**
     * Nazivi kolona tabele kao niz stringova.
     */
    String[] naziviKolone = {"RB, Opis kvara"};

    /**
     * Neparametrizovani konstruktor koji inicijalizuje listu uocenih kvarova.
     */
    public TableModelKvar() {
        kvarovi = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return kvarovi.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UoceniKvar k = kvarovi.get(rowIndex);
        
        switch(columnIndex){
            case 0: return (rowIndex+1)+"";
            case 1: return k.getOpis();
            default: return "n\\a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolone[column];
    }
    
    /**
     * Dodaje uoceni kvar u tabelu i osvezava prikaz tabele.
     * 
     * @param k uoceni kvar koji treba da se prikaze u tabeli, tipa {@link UoceniKvar}
     */
    public void dodajKvar(UoceniKvar k){
        kvarovi.add(k);
        fireTableDataChanged();
    }
    
    /**
     * Brise uoceni kvar iz tabele i osvezava prikaz tabele.
     * 
     * @param row uoceni kvar koji ne treba vise da se prikazuje u tabeli, tipa {@link UoceniKvar}
     */
    public void obrisiKvar(int row){
        kvarovi.remove(row);
        fireTableDataChanged();
    }

    /**
     * Vraca listu kvarova koji se prikazuju u tabeli.
     * 
     * @return kvarovi koji se prikazuju u tabeli, kao lista tipa {@link UoceniKvar}
     */
    public List<UoceniKvar> getKvarovi() {
        return kvarovi;
    }

    /**
     * Postavlja novu listu uocenih kvarova koji ce se prikazati u tabeli i osvezava prikaz tabele.
     * 
     * @param kvarovi koji ce se prikazati u tabeli, kao lista tipa {@link UoceniKvar}.
     */
    public void setKvarovi(List<UoceniKvar> kvarovi) {
        this.kvarovi = kvarovi;
        fireTableDataChanged();
    }
    
    /**
     * Brise sve uocene kvarove iz tabele i osvezava prikaz tabele.
     */
    public void ocistiTabelu(){
        this.kvarovi.clear();
        fireTableDataChanged();
    }
    
}
