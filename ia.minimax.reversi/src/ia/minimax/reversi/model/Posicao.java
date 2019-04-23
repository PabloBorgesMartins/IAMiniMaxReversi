
package ia.minimax.reversi.model;

/**
 *
 * @author Pablo Borges
 */
public class Posicao {
    int N = 8;
    
    int x, y;
    public Posicao(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getPosicaoX(){
        return this.x;
    }
 
    public int getPosicaoY(){
        return this.y;
    }

    public int transformaBotao(){
        return (((this.x)*N) + this.y); 
    }
}

