package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import ia.minimax.reversi.model.Posicao;
import java.util.ArrayList;

/*
 *
 * @authores Waislan Sanches e William Martins
 */
public class ControllerEstado {
    
    public static int CASA_VAZIA;
    public static int JOGADOR;
    public static int IA;
    private static int N;
    private static int[][] matrizEstado;
    
    public ControllerEstado () {
        // 1 - preto; 2 - branco; 0 - vazio
        CASA_VAZIA = 0; // Representa uma casa vazia do tabuleiro do jogo
        JOGADOR = 1; // Inteiro para identificar o jogador
        IA = 2; // Inteiro para identificar a IA
        N = 8;
        matrizEstado = new int[N][N];
    }

    public Estado inicializarMatriz() {

        // Setando todas as posições para vazio
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizEstado[i][j] = 0; 
            }
        }

        // Setando as posições do meio para branco e preto
        matrizEstado[3][3] = IA;
        matrizEstado[3][4] = JOGADOR;
        matrizEstado[4][3] = JOGADOR;
        matrizEstado[4][4] = IA;
        
        Estado raiz = new Estado(matrizEstado, 0, true, false);

        return raiz;
    }

    /*
    Este método gera a árvore de possibilidades em profundidade e recursivamente a partir do estado atual
    A árvore é gerada até o nível de profundidade correspondente ao nível de dificuldade do jogo
    */ 
    public int gerarArvore(Estado estado, int nivelDificuldade, int jogadorAtual, int oponente){
        
        ArrayList<Estado> filhos = new ArrayList<>();
        
        if (estado.getNivel() == nivelDificuldade) {
            // Chegou até o último nível possível
            estado.setMinimax(calcularMiniMax(estado));
            return estado.getMinimax();
        }

        ArrayList<Posicao> posicoes = new ArrayList<>();
        ControllerInterface controle = new ControllerInterface();
        
        posicoes = controle.procuraBotoesPossiveis (estado, jogadorAtual, oponente);
        
        for (int i = 0; i < posicoes.size(); i++) {
            // Para cada posição possível cria um novo estado e coloca na lista de estados filhos do estado atual
            Estado aux = new Estado(estado.getTabuleiro(), estado.getNivel()+1, !estado.isMin(), !estado.isMax());
            aux.atualizaTabuleiro (posicoes.get(i).transformaBotao(), jogadorAtual, oponente);
            filhos.add(aux);
        }
        
        if (!filhos.isEmpty()) {
            estado.setFilhos(filhos);
        } else {
            // Não tem mais posições jogáveis, chegou na folha da árvore
            estado.setMinimax(calcularMiniMax(estado));
            return estado.getMinimax();
        }
        
        if (estado.isMax()){
            estado.setMinimax(-64);
        } else {
            estado.setMinimax(64);
        }
        
        for (Estado filho : filhos) {
            // Gera a árvore para cada estado filho do estado atual

            gerarArvore (filho, nivelDificuldade, oponente, jogadorAtual);
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
    
    /* 
    Este método cálcula o valor de MiniMax para estado recebido como parâmetro
    O valor é dado pela diferença entre as quantidades peças da IA e do humano
    */
    public int calcularMiniMax (Estado estado) {
        
        int pecasPretas = 0; // Peças da IA
        int pecasBrancas = 0; // Peças do humano
        
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (estado.getTabuleiro()[i][j] == 1){
                    // Se a peça for preta
                    pecasPretas++;
                } else if (estado.getTabuleiro()[i][j] == 2){
                    // Se a peça for branca
                    pecasBrancas++;
                }
            }
        }
        
        return pecasBrancas - pecasPretas;
        
    }

}
