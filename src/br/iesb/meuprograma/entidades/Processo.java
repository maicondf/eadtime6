/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author daniboy
 */
public class Processo {
    
    private Integer id;
    private Integer numProcesso;
    private Date dataProcesso;
    //private Assunto assunto;
    private String Assunto;
    private String descricao;
    private List<Anexo> anexos;

    public List<Anexo> getAnexos() {
        return anexos;
    }

    public void setAnexos(List<Anexo> anexos) {
        this.anexos = anexos;
    }

    public Integer getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(Integer numProcesso) {
        this.numProcesso = numProcesso;
    }
    
    public void setNumProcesso(String numProcesso) {
        try{
            this.numProcesso = Integer.valueOf(numProcesso);
        }catch(NumberFormatException e){
            this.numProcesso = 0;
        }
    }

    public Date getDataProcesso() {
        return dataProcesso;
    }

    public void setDataProcesso(Date dataProcesso) {
        this.dataProcesso = dataProcesso;
    }
    
    public void setDataProcesso(String dataProcesso) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
           this.dataProcesso = df.parse(dataProcesso);
        }catch(ParseException e){
            this.dataProcesso = null;
        }
    }
        
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

    /*public Assunto getAssunto() {
        return assunto;
    }/*

    /*public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
