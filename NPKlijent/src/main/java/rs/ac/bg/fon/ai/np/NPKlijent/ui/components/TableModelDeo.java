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
 * Predstavlja model tabele za klasu {@link DeoAutomobila}. Nasledjuje apstraktni model tabele i imeplementira njegove metode.
 * 
 * Ima listu svih delova koji ce se prikazati u tabeli, get i set metode ove liste i
 * metodu za brisanje dela iz liste.
 * 
 * @see AbstractTableModel
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class TableModelDeo extends AbstractTableModel{
    /**
     * Lista delova automobila koji ce se prikazati u tabeli, tipa {@link DeoAutomobila}.
     */
    List<DeoAutomobila> delovi;
    
    /**
     * Nazivi kolona u tabeli dati kao niz stringova.
     */
    String[] naziviKolone = {"Naziv"};

    /**
     * Neparametrizovani konstruktor za kreiranje objekta. 
     * 
     * Inicijalizuje listu delova automobila.
     */
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
    
    /**
     * Dodaje deo automobila u listu koja ce se prikazati u tabeli i osvezava prikaz tabele.
     * 
     * @param deo deo automobila koji se dodaje u listu, tipa {@link DeoAutomobila}
     */
    public void dodajDeo(DeoAutomobila deo){
        delovi.add(deo);
        fireTableDataChanged();
    }

    /**
     * Vraca listu delova automobila koji se prikazuju u tabeli.
     * 
     * @return delovi koji se prikazuju u tabeli, kao lista tipa {@link DeoAutomobila}
     */
    public List<DeoAutomobila> getDelovi() {
        return delovi;
    }

    /**
     * Postavlja novu listu delova koji ce se prikazati u tabeli i osvezava prikaz tabele.
     * 
     * @param delovi koja ce se prikazati u tabeli, kao lista tipa {@link DeoAutomobila}.
     */
    public void setDelovi(List<DeoAutomobila> delovi) {
        this.delovi = delovi;
        fireTableDataChanged();
    }  
    
}
