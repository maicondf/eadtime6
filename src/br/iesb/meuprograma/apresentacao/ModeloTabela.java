/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juliano Barbosa
 */
public class ModeloTabela extends DefaultTableModel {//Criação de um modelo de tabela próprio

    private ArrayList<Object[]> linhas = new ArrayList();
    private String[] colunas;

    public ModeloTabela() {//contrutor vasio

    }

    public ModeloTabela(String[] colunas) {//contrutor com apenas o cabeçalho
        this.colunas = colunas;
    }

    public Object[] getRow(int linha) {//seleciona linha da tabela retornando um vetor
        Object[] linhaSelecionada = linhas.get(linha);
        return linhaSelecionada;
    }

    public int getColumnCount() {//pega numero de colunas 
        return colunas.length;
    }
    
    public String getColumnName(int col) {//seleciona nome da coluna especificada
        return colunas[col];
    }

    public void removeRowAt(int row) {//remove a linha especificada
        linhas.remove(row);
        fireTableDataChanged();
    }

    public void addRows(ArrayList<Object[]> linhas) {//adiciona linhad na tabela 
        for (int i = 0; i <= linhas.size() - 1; i++) {
            super.addRow(linhas.get(i));
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int mColIndex) {//método que bloqueia a edição das celulas da tabela
        return false;
    }

    public void setTamanhoColuna(JTable tabela, Integer[] larguras) {//seta as laguras das colunas
        int i = 0;
        while (i <= (larguras.length - 1)) {
            tabela.getColumnModel().getColumn(i).setPreferredWidth((int) larguras[i]);
            i++;
        }
    }

}
