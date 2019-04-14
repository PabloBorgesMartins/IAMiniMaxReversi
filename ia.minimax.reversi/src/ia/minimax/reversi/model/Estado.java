package ia.minimax.reversi.model;

import java.util.ArrayList;

public class Estado {
    private int[][] tabuleiro = new int[8][8];
    private int minimax;
    private int nivel;
    private boolean min;
    private boolean max;
    private ArrayList<Estado> filhos = new ArrayList<>();
    
    public Estado (int[][] tabuleiro, int nivel, boolean min, boolean max){
        
        // copiando a matriz do argumento para a matriz do estado
        for (int i = 0; i < 8; i++){
            System.arraycopy(tabuleiro[i], 0, this.tabuleiro[i], 0, 8);
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
    
    public int getCorPecaTabuleiro(int i, int j){ //Esse método retorna de quem é a peça na casa[i][j]
        return this.tabuleiro[i][j];
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

    public void setMin(boolean min) {
        this.min = min;
    }

    public void setMax(boolean max) {
        this.max = max;
    }
    
}
