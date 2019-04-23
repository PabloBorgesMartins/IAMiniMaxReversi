package ia.minimax.reversi.model;

import java.util.ArrayList;

/*
 *
 * @authors Waislan Sanches e Pablo Borges
 */
public class Estado {
    int N = 8;
    private int[][] tabuleiro = new int[N][N];
    private int minimax = 0;
    private int nivel;
    private boolean min;
    private boolean max;
    private ArrayList<Estado> filhos = new ArrayList<>();
    
    public Estado (int[][] tabuleiro, int nivel, boolean min, boolean max){
        
        // copiando a matriz do argumento para a matriz do estado
        for (int i = 0; i < N; i++){
            System.arraycopy(tabuleiro[i], 0, this.tabuleiro[i], 0, N);
        }
        
        this.nivel = nivel;
        this.min = min;
        this.max = max;
        
    }
    
    public Estado (){
        
    }
    
    public void atualizaTabuleiro(int tecla, int jogador, int oponente){
        int i = tecla/N, j = tecla%N;
        this.tabuleiro[i][j] = jogador; 
        int I = i, J = j;  
        
        if(i-1>=0 && j-1>=0 && this.tabuleiro[i-1][j-1] == oponente){ 
            i = i-1; j = j-1;
            while(i>0 && j>0 && this.tabuleiro[i][j] == oponente){i--;j--;}
            if(i>=0 && j>=0 && this.tabuleiro[i][j] == jogador) {while(i!=I-1 && j!=J-1)this.tabuleiro[++i][++j]=jogador;}
        } 
        i=I;j=J; 
        if(i-1>=0 && this.tabuleiro[i-1][j] == oponente){
            i = i-1;
            while(i>0 && this.tabuleiro[i][j] == oponente) i--;
            if(i>=0 && this.tabuleiro[i][j] == jogador) {while(i!=I-1)this.tabuleiro[++i][j]=jogador;}
        } 
        i=I; 
        if(i-1>=0 && j+1<=N-1 && this.tabuleiro[i-1][j+1] == oponente){
            i = i-1; j = j+1;
            while(i>0 && j<N-1 && this.tabuleiro[i][j] == oponente){i--;j++;}
            if(i>=0 && j<=N-1 && this.tabuleiro[i][j] == jogador) {while(i!=I-1 && j!=J+1)this.tabuleiro[++i][--j] = jogador;}
        }   
        i=I;j=J;
        if(j-1>=0 && this.tabuleiro[i][j-1] == oponente){
            j = j-1;
            while(j>0 && this.tabuleiro[i][j] == oponente)j--;
            if(j>=0 && this.tabuleiro[i][j] == jogador) {while(j!=J-1)this.tabuleiro[i][++j] = jogador;}
        }
        j=J; 
        if(j+1<=N-1 && this.tabuleiro[i][j+1] == oponente){
            j=j+1;
            while(j<N-1 && this.tabuleiro[i][j] == oponente)j++;
            if(j<=N-1 && this.tabuleiro[i][j] == jogador) {while(j!=J+1)this.tabuleiro[i][--j] = jogador;}
        }
        j=J; 
        if(i+1<=N-1 && j-1>=0 && this.tabuleiro[i+1][j-1] == oponente){ 
            i=i+1;j=j-1;
            while(i<N-1 && j>0 && this.tabuleiro[i][j] == oponente){i++;j--;}
            if(i<=N-1 && j>=0 && this.tabuleiro[i][j] == jogador) {while(i!=I+1 && j!=J-1)this.tabuleiro[--i][++j] = jogador;}
        }
        i=I;j=J; 
        if(i+1 <= N-1 && this.tabuleiro[i+1][j] == oponente){ 
            i=i+1;
            while(i<N-1 && this.tabuleiro[i][j] == oponente) i++;
            if(i<=N-1 && this.tabuleiro[i][j] == jogador) {while(i!=I+1)this.tabuleiro[--i][j] = jogador;}
        }
        i=I;

        if(i+1 <= N-1 && j+1 <=N-1 && this.tabuleiro[i+1][j+1] == oponente){
            i=i+1;j=j+1;
            while(i<N-1 && j<N-1 && this.tabuleiro[i][j] == oponente){i++;j++;}
            if(i<=N-1 && j<=N-1 && this.tabuleiro[i][j] == jogador)while(i!=I+1 && j!=J+1)this.tabuleiro[--i][--j] = jogador;}
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
        return this.filhos;
    }
    
    public void addFilho(Estado e) {
        this.filhos.add(e);
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
    

    public int getPontuacao() {
        int jogador=0, maquina=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (this.tabuleiro[i][j] == 1) {
                    jogador++;
                }
                if (this.tabuleiro[i][j] == 2) {
                    maquina++;
                }
            }
        }
        if (maquina-jogador > 0) {
            return 1;
        }
        if (maquina-jogador == 0) {
            return 0;
        }
        return -1;
    }

    public Estado getFilho(int x) {
        return this.filhos.get(x);
    }
    
    // Este método verifica se o jogo acabou e retorna true caso tenha acabado
    public boolean verificaFinal(){
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (this.tabuleiro[i][j] == 1 || this.tabuleiro[i][j] == 2) {
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
}
