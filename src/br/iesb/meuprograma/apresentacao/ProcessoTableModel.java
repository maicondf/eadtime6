/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Processo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author daniboy
 */
public class ProcessoTableModel extends AbstractTableModel{
    private List<Processo> processos = new ArrayList<>();
    private String[] colunas = {"Nº do Processo","Descricao","Data do Processo","Situação"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getColumnCount() {
       return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return processos.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return processos.get(linha).getNumProcesso();
            case 1:
                return processos.get(linha).getDescricao();
            case 2: 
               return processos.get(linha).getDescricao();
            case 3: 
               return processos.get(linha).getDataProcesso();
            case 4:
                return "situacao";
                
        }
        
        return null;
    }
    
    public void removeRow(int linha){
        this.processos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    } 
    
    public List<Processo> getTableData(){
        return processos;
    }
}
