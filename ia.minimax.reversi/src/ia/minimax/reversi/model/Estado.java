package ia.minimax.reversi.model;

import java.util.ArrayList;

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
    
    
    
}
