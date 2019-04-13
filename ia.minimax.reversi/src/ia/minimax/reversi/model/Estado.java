package ia.minimax.reversi.model;

import java.util.ArrayList;

public class Estado {
    private int[][] tabuleiro = new int[4][4];
    private int minimax;
    private int nivel;
    private boolean min;
    private boolean max;
    private ArrayList<Estado> filhos = new ArrayList<>();
    
    public Estado (int[][] tabuleiro, int nivel, boolean min, boolean max){
        
        for (int i = 0; i < 4; i++){
            System.arraycopy(tabuleiro[i], 0, this.tabuleiro[i], 0, 4);
        }
        
        this.nivel = nivel;
        this.min = min;
        this.max = max;
    }
    
    public Estado (){
        
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getMinimax() {
        return minimax;
    }

    public void setMinimax(int minimax) {
        this.minimax = minimax;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Estado> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<Estado> filhos) {
        this.filhos = filhos;
    }

    public boolean isMin() {
        return min;
    }

    public boolean isMax() {
        return max;
    } 
    
}
