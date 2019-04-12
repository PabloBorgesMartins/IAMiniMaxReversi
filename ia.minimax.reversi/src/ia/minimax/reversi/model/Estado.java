package ia.minimax.reversi.model;

import java.util.ArrayList;

/**
 *
 * @author Waislan Sanches
 */
public class Estado {
    private int[][] tabuleiro = new int[8][8];
    private int minimax;
    private int nivel;
    private ArrayList<Estado> filhos = new ArrayList<>();

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
    
    
}
