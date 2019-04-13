
package ia.minimax.reversi.model;

/**
 *
 * @author pablo
 */
public class Posicao {
    
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
        return (((this.x)*8) + this.y); 
    }
}

