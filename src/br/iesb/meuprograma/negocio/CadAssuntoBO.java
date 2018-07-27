package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.CadAssunto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maicon
 */
public class CadAssuntoBO implements BO<CadAssunto> {

    @Override
    public void validar(CadAssunto entidade) throws NegocioException {
        if (entidade.getId() == 0){
            throw new NegocioException("Campo Id é obrigatório!");
        }
        
        if (entidade.getAssunto() == null || entidade.getAssunto().isEmpty()){
            throw new NegocioException("Campo Assunto é obrigatório!");
        }
        
        if (entidade.isSituacao() == false){
            throw new NegocioException("Campo Situação é obrigatório!");
        }
    }

    @Override
    public void inserir(CadAssunto entidade) throws NegocioException {
        validar(entidade);
    }

    @Override
    public void alterar(CadAssunto entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getId());
    }

    @Override
    public void excluir(CadAssunto entidade) throws NegocioException {
        consultar(entidade.getId());
    }

    @Override
    public CadAssunto consultar(int id) throws NegocioException {
        return new CadAssunto();
    }

    @Override
    public List<CadAssunto> listar() throws NegocioException {
        return new ArrayList<CadAssunto>();
    }
    
}
