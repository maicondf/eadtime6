package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.ListAssunto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Maicon
 */
public class ListAssuntoBO implements BO<ListAssunto> {

    @Override
    public void validar(ListAssunto entidade) throws NegocioException {
        throw new NegocioException("Selecione um assunto.");
            
    }

    @Override
    public void inserir(ListAssunto entidade) throws NegocioException {
        validar(entidade);
            JOptionPane.showMessageDialog(null, "Assunto adicionado com sucesso");
    }

    @Override
    public void alterar(ListAssunto entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getList_id());
        JOptionPane.showMessageDialog(null, "Assunto alterado com sucesso");
    }

    @Override
    public void excluir(ListAssunto entidade) throws NegocioException {
        consultar(entidade.getList_id());
        JOptionPane.showMessageDialog(null, "Assunto excluido com sucesso");
    }

    @Override
    public ListAssunto consultar(int id) throws NegocioException {
        return new ListAssunto();
    }

    @Override
    public List<ListAssunto> listar() throws NegocioException {
        return new ArrayList<ListAssunto>();
    }
    
}
