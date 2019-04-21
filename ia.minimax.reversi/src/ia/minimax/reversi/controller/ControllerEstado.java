package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import ia.minimax.reversi.model.Posicao;
import java.util.ArrayList;

public class ControllerEstado {
    
    public static final int CASA_VAZIA = 0; // Representa uma casa vazia do tabuleiro do jogo
    public static final int JOGADOR = 1; // Inteiro para identificar o jogador
    public static final int IA = 2; // Inteiro para identificar a IA
    private static final int N = 4;
    static int matrizEstado[][] = new int[N][N]; // 1 - preto; 2 - branco; 0 - vazio

    public Estado inicializarMatriz() {

        // setando todas as posições para vazio
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizEstado[i][j] = 0;
            }
        }

        // setaNdo as posições do meio para branco e preto
        matrizEstado[1][1] = IA;
        matrizEstado[1][2] = JOGADOR;
        matrizEstado[2][1] = JOGADOR;
        matrizEstado[2][2] = IA;

        // printando a matriz para conferir se está correta
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrizEstado[i][j] + " ");
            }
            System.out.println(" ");
        }

        Estado raiz = new Estado(matrizEstado, 0, true, false);

        return raiz;
    }

    
    // Essa funcao gerará a arvore
    public int gerador(Estado no, int jogadorAtual, int oponente){
        int valMinMax;
        ArrayList<Posicao> posicoes;
        ControllerInterface aux = new ControllerInterface();
        posicoes = aux.procuraBotoesPossiveis(no, jogadorAtual, oponente);//procura possiveis jogadas no tabuleiro atual
        
        if(posicoes.size() > 0){   
            //System.out.println("nivel: " + no.getNivel());
            //Dentro desse for, ele gerará todos os filhos e chamará essa funçao recursivamente passando o filho
            for (int i = 0; i < posicoes.size(); i++) {
                //Cria um estado novo com o tabuleiro igual ao pai, mas com um nivel maior e com min e max invertido
                Estado novo = new Estado(no.getTabuleiro(), no.getNivel()+1, !no.isMin(), !no.isMax());
                //Atualiza o filho, com uma das jogadas achadas
                novo.atualizaTabuleiro(posicoes.get(i).transformaBotao(), jogadorAtual, oponente);
                no.addFilho(novo);
                //chama a funcao recursivamente, passando esse filho como um dos parametros, e alterando o jogador e oponente
                valMinMax = gerador(novo, oponente, jogadorAtual); 
                //System.out.println("o valMinMax é : " + valMinMax);
                //System.out.println("o minimax desse nó é : " + no.getMinimax());
                if(no.isMax()) { //Se estiver em nivel max, ele pegara o maior valor max dos filhos
                    if (no.getMinimax() < valMinMax) {
                        no.setMinimax(valMinMax);
                    }
                }
                if(no.isMin()) { // Se estiver em nivel min, ele pegara o menor valor min dos filhos
                    if (no.getMinimax() > valMinMax) {
                        no.setMinimax(valMinMax);
                    }
                }
            }
        }
        //Quando nao houver mais filhos, ele simplesmente retorna o valor da Heuristica criada pra ele.
        //Neste caso a heuristica é pecasIA-pecasHumano, ou seja, sempre analisando o melhor valor pra IA
        return no.getPontuacao();
    }

}
