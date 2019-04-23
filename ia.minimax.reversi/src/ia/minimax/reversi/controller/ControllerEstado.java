package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import ia.minimax.reversi.model.Posicao;
import java.util.ArrayList;

public class ControllerEstado {
    
    public static int CASA_VAZIA;
    public static int JOGADOR;
    public static int IA;
    private static int N;
    private static int[][] matrizEstado;
    
    public ControllerEstado () {
        CASA_VAZIA = 0; // Representa uma casa vazia do tabuleiro do jogo
        JOGADOR = 1; // Inteiro para identificar o jogador
        IA = 2; // Inteiro para identificar a IA
        N = 8;
        matrizEstado = new int[N][N]; // 1 - preto; 2 - branco; 0 - vazio
    }

    public Estado inicializarMatriz() {

        // setando todas as posições para vazio
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizEstado[i][j] = 0; 
            }
        }

        // setaNdo as posições do meio para branco e preto
        matrizEstado[3][3] = IA;
        matrizEstado[3][4] = JOGADOR;
        matrizEstado[4][3] = JOGADOR;
        matrizEstado[4][4] = IA;
        
        Estado raiz = new Estado(matrizEstado, 0, true, false);

        return raiz;
    }

       
    public int gerarArvore(Estado estado, int nivelDificuldade, int jogadorAtual, int oponente){
        ArrayList<Estado> filhos = new ArrayList<>();
        
        if (estado.getNivel() == nivelDificuldade) {
            estado.setMinimax(calcularMiniMax(estado));
            return estado.getMinimax();
        }
        
        
        ArrayList<Posicao> posicoes = new ArrayList<>();
        ControllerInterface controle = new ControllerInterface();
        posicoes = controle.procuraBotoesPossiveis(estado, jogadorAtual, oponente);
        for (int i = 0; i < posicoes.size(); i++) {
            Estado aux = new Estado(estado.getTabuleiro(), estado.getNivel()+1, !estado.isMin(), !estado.isMax());
            aux.atualizaTabuleiro(posicoes.get(i).transformaBotao(), jogadorAtual, oponente);
            filhos.add(aux);
        }
        
        if (!filhos.isEmpty()) {
            estado.setFilhos(filhos);
        } else {
            // está em um estado final
            estado.setMinimax(calcularMiniMax(estado));
            return estado.getMinimax();
        }
        
        if (estado.isMax()){
            estado.setMinimax(-64);
        } else {
            estado.setMinimax(64);
        }
        
        for (Estado filho : filhos) {
            gerarArvore(filho, nivelDificuldade, oponente, jogadorAtual);
            if (estado.isMax()){
                if (filho.getMinimax() > estado.getMinimax()){
                    estado.setMinimax(filho.getMinimax());
                }
            } else {
                if (filho.getMinimax() < estado.getMinimax()){
                    estado.setMinimax(filho.getMinimax());
                }
            }
        }
        
        return estado.getMinimax();
    }
    
    public int calcularMiniMax (Estado estado) {
        int pecasPretas = 0; // peças da IA
        int pecasBrancas = 0;
        
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (estado.getTabuleiro()[i][j] == 1){
                    // se a peça for preta
                    pecasPretas++;
                } else if (estado.getTabuleiro()[i][j] == 2){
                    // se a peça for branca
                    pecasBrancas++;
                }
            }
        }
        
        return pecasBrancas - pecasPretas;
    }

}
