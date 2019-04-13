package ia.minimax.reversi.model;

/**
 *
 * @author Waislan Sanches
 */
public class Arvore {
    private Estado raiz;
    
    public Arvore (Estado raiz){
        this.raiz = raiz;
    }

    public Estado getRaiz() {
        return raiz;
    }

    public void setRaiz(Estado raiz) {
        this.raiz = raiz;
    }
    
}
