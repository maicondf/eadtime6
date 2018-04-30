/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author daniboy
 */
public class Processo {
    
    private String numProcesso;
    private Date dataProcesso;
    private int idAssunto;
    private String descricao;
    private ArrayList<Anexo> arquivo;

    public String getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(String numProcesso) {
        this.numProcesso = numProcesso;
    }

    public Date getDataProcesso() {
        return dataProcesso;
    }

    public void setDataProcesso(Date dataProcesso) {
        this.dataProcesso = dataProcesso;
    }

    public int getIdAssunto() {
        return idAssunto;
    }

    public void setIdAssunto(int idAssunto) {
        this.idAssunto = idAssunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Anexo> getArquivo() {
        return arquivo;
    }

    public void setArquivo(ArrayList<Anexo> arquivo) {
        this.arquivo = arquivo;
    }
}
