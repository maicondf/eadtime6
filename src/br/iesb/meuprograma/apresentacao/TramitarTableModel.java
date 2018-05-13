/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Unidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author daniboy
 */
public class TramitarTableModel extends AbstractTableModel{

    private List<Unidade> unidades = new ArrayList<>();
    private String[] colunas = {"Item","Unidade","Ação"};
    
    @Override
    public int getRowCount() {
        return unidades.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                //return unidades.get(linha).getId();
                
            case 1:
                //return unidades.get(linha).getUnidade();
            
            case 2: 
                return "Remover";
        }
        
        return null;
    }
    
    public void addProcesso(Unidade unidade){
        this.unidades.add(unidade);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.unidades.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    } 
    
}
