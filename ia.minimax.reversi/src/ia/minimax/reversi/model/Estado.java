package ia.minimax.reversi.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Estado {
    private int[][] tabuleiro = new int[8][8];
    private int minimax;
    private int nivel;
    private boolean min;
    private boolean max;
    private Queue<Estado> filhos = new LinkedList<>();
    
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
    
    public void atualizaTabuleiro(int tecla, int player, int opponent){
        int i = tecla/8, j = tecla%8;
        this.tabuleiro[i][j] = player; 
        int I = i, J = j;  
        
        if(i-1>=0 && j-1>=0 && this.tabuleiro[i-1][j-1] == opponent){ 
            i = i-1; j = j-1;
            while(i>0 && j>0 && this.tabuleiro[i][j] == opponent){i--;j--;}
            if(i>=0 && j>=0 && this.tabuleiro[i][j] == player) {while(i!=I-1 && j!=J-1)this.tabuleiro[++i][++j]=player;}
        } 
        i=I;j=J; 
        if(i-1>=0 && this.tabuleiro[i-1][j] == opponent){
            i = i-1;
            while(i>0 && this.tabuleiro[i][j] == opponent) i--;
            if(i>=0 && this.tabuleiro[i][j] == player) {while(i!=I-1)this.tabuleiro[++i][j]=player;}
        } 
        i=I; 
        if(i-1>=0 && j+1<=7 && this.tabuleiro[i-1][j+1] == opponent){
            i = i-1; j = j+1;
            while(i>0 && j<7 && this.tabuleiro[i][j] == opponent){i--;j++;}
            if(i>=0 && j<=7 && this.tabuleiro[i][j] == player) {while(i!=I-1 && j!=J+1)this.tabuleiro[++i][--j] = player;}
        }   
        i=I;j=J;
        if(j-1>=0 && this.tabuleiro[i][j-1] == opponent){
            j = j-1;
            while(j>0 && this.tabuleiro[i][j] == opponent)j--;
            if(j>=0 && this.tabuleiro[i][j] == player) {while(j!=J-1)this.tabuleiro[i][++j] = player;}
        }
        j=J; 
        if(j+1<=7 && this.tabuleiro[i][j+1] == opponent){
            j=j+1;
            while(j<7 && this.tabuleiro[i][j] == opponent)j++;
            if(j<=7 && this.tabuleiro[i][j] == player) {while(j!=J+1)this.tabuleiro[i][--j] = player;}
        }
        j=J; 
        if(i+1<=7 && j-1>=0 && this.tabuleiro[i+1][j-1] == opponent){ 
            i=i+1;j=j-1;
            while(i<7 && j>0 && this.tabuleiro[i][j] == opponent){i++;j--;}
            if(i<=7 && j>=0 && this.tabuleiro[i][j] == player) {while(i!=I+1 && j!=J-1)this.tabuleiro[--i][++j] = player;}
        }
        i=I;j=J; 
        if(i+1 <= 7 && this.tabuleiro[i+1][j] == opponent){ 
            i=i+1;
            while(i<7 && this.tabuleiro[i][j] == opponent) i++;
            if(i<=7 && this.tabuleiro[i][j] == player) {while(i!=I+1)this.tabuleiro[--i][j] = player;}
        }
        i=I;

        if(i+1 <= 7 && j+1 <=7 && this.tabuleiro[i+1][j+1] == opponent){
            i=i+1;j=j+1;
            while(i<7 && j<7 && this.tabuleiro[i][j] == opponent){i++;j++;}
            if(i<=7 && j<=7 && this.tabuleiro[i][j] == player)while(i!=I+1 && j!=J+1)this.tabuleiro[--i][--j] = player;}
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

    public Queue<Estado> getFilhos() {
        return filhos;
    }

    public void setFilhos(Queue<Estado> filhos) {
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
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro[0].length; j++){
                sb.append(tabuleiro[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public String estadoEmStringDeUmaLinha(){
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro[0].length; j++){
                sb.append(tabuleiro[i][j]);
            }
        }
        return sb.toString();
    }
    
}
