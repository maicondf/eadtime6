
package br.iesb.meuprograma.entidades;

/**
 *
 * @author Maicon
 */
public class CadAssunto {
    private int id;
    private String assunto;
    private boolean situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setId(String Id){
        try {
            this.id = Integer.valueOf(Id);
        } catch (NumberFormatException e) {
            this.id = 0;
        }
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = "";
        if(assunto != null){
            this.assunto = assunto;
        }
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    
}
