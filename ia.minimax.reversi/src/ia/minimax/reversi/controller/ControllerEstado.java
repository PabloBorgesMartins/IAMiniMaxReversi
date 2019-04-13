package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import java.util.ArrayList;

/**
 *
 * @author Waislan Sanches
 */
public class ControllerEstado {

    // 1 - preto; 2 - branco; 0 - vazio
    public void gerarFilhos(Estado raiz) {
        ArrayList<Estado> filhos = new ArrayList<>();
        int posicao;

        if (ehEstadoFinal(raiz)) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (raiz.getTabuleiro()[i][j] == 0) {
                    posicao = i * 4 + j;
                    Estado filho = verificarPossibilidades(raiz, posicao);
                }
            }
        }

    }

    public boolean ehEstadoFinal(Estado e) {

        return true;
    }

    // 1 - preto; 2 - branco; 0 - vazio
    public Estado verificarPossibilidades(Estado e, int posicao) {
        Estado retorno = new Estado();
        int[][] matriz = new int[4][4];
        int contador = 0;
        int linha = posicao/4;
        int coluna = posicao%4;
        
        // setando a matriz com posições vazias
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = 0;
            }
        }
        
        if (e.isMax()) {
            // verifica possibilidades para bola branca
            int i = 1;
            // verificando possibilidades na horizontal à direita
            while (e.getTabuleiro()[linha][coluna+i] == 1 && (coluna+i) < 4){
                contador++;
                i++;
            }
            if (contador != 0 && (coluna+i) >= 4){
                // estrapolou o vetor
                contador = 0;
            }
            else if (contador != 0){
                i -= 1;
                while ((coluna+i) >= coluna){
                    // setando posições à direita com bolas brancas
                    matriz[linha][coluna+i] = 2;
                    i--;
                }
            }
            
            i = 1;
            contador = 0;
            // verificando possibilidades na horizontal à esquerda
            while (e.getTabuleiro()[linha][coluna-i] == 1 && (coluna-1) >= 0){
                contador++;
                i++;
            }
            if (contador != 0 && (coluna+i) < 0){
                // estrapolou o vetor
                contador = 0;
            } else if (contador != 0){
                i -= 1;
                while ((coluna-i) <= coluna){
                    // setando posições à esquerda com bolas brancas
                    matriz[linha][coluna-1] = 2;
                }
            }
            
            
        } else {
            // verifica possibilidades para bola preta
        }

        return retorno;

    }

}
