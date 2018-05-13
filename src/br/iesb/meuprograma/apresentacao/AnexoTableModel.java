/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Anexo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author daniboy
 */
public class AnexoTableModel extends AbstractTableModel{

    private List<Anexo> anexos = new ArrayList<>();
    private String[] colunas = {"Item","Nome do Arquivo","Ação"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return anexos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return anexos.get(linha).getId();
                
            case 1:
                return anexos.get(linha).getNomeArquivo();
            
            case 2: 
                return "Remover";
        }
        
        return null;
    }
    
    
    public void addAnexo(Anexo anexo){
        this.anexos.add(anexo);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.anexos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    } 
    
    public List<Anexo> getTableData(){
        return anexos;
    }
}
