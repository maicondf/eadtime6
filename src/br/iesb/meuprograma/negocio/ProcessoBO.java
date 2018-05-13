/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Processo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniboy
 */
public class ProcessoBO implements BO<Processo>{
    
    @Override
    public void validar(Processo entidade) throws NegocioException {
        if (entidade.getNumProcesso() == 0){
            throw new NegocioException("Campo Numero do Processo é obrigatorio! Portanto não pode estar vazio");
        }
        
        if (entidade.getDescricao().isEmpty()){
            throw new NegocioException("Campo Descricao é obrigatorio! Portanto não pode estar vazio");
        }
        
        if(entidade.getDescricao().length() > 100){
            throw new NegocioException("Campo Descricao com conteúdo acima de 100 caracteres");
        }
        
       if(entidade.getDataProcesso() == null){
            throw new NegocioException("Campo Data do Processo não preenchido ou esta incorreto!");
       }
       
       if(entidade.getAnexos().isEmpty()){
            throw new NegocioException("O processo deve ter ao menos um anexo!");
       }
       
       if(entidade.getAssunto() == null){
            throw new NegocioException("O processo deve estar associado a um assunto");
       }       
    }

    @Override
    public void inserir(Processo entidade) throws NegocioException {
        validar(entidade);
    }

    @Override
    public void alterar(Processo entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getId());
    }

    @Override
    public void excluir(Processo entidade) throws NegocioException {
        consultar(entidade.getNumProcesso());
    }

    @Override
    public Processo consultar(int id) throws NegocioException {
        if (id == 0){
            throw new NegocioException("Campo Numero do Processo é obrigatorio! Portanto não pode estar vazio");
        }
        return new Processo();
    }

    @Override
    public List<Processo> listar() throws NegocioException {
        return new ArrayList<Processo>();
    }
    
}
