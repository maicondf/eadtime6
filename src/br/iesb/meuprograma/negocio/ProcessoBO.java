/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Processo;
import java.util.List;

/**
 *
 * @author daniboy
 */
public class ProcessoBO implements BO<Processo>{
    
    @Override
    public void validar(Processo entidade) throws NegocioException {
        
    }

    @Override
    public void inserir(Processo entidade) throws NegocioException {

    }

    @Override
    public void alterar(Processo entidade) throws NegocioException {

    }

    @Override
    public void excluir(Processo entidade) throws NegocioException {

    }

    @Override
    public Processo consultar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Processo> listar() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
