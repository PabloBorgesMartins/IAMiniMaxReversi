package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import ia.minimax.reversi.model.Posicao;
import ia.minimax.reversi.view.Interface;
import java.util.ArrayList;

public class ControllerEstado {

    public boolean jogo = true;
    public int teclaSelecionada;
    public static final int CASA_VAZIA = 0; // Representa uma casa vazia do tabuleiro do jogo
    public static final int JOGADOR = 1; // Inteiro para identificar o jogador
    public static final int IA = 2; // Inteiro para identificar a IA
    static Estado raiz;
    static int n = 8;
    static int matrizEstado[][] = new int[n][n]; // 1 - preto; 2 - branco; 0 - vazio

    public Estado inicializarMatriz() {

        // setando todas as posições para vazio
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizEstado[i][j] = 0;
            }
        }

        // setando as posições do meio para branco e preto
        matrizEstado[3][3] = IA;
        matrizEstado[3][4] = JOGADOR;
        matrizEstado[4][3] = JOGADOR;
        matrizEstado[4][4] = IA;

        // printando a matriz para conferir se está correta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizEstado[i][j] + " ");
            }
            System.out.println(" ");
        }

        raiz = new Estado(matrizEstado, 0, true, false);

        return raiz;
    }

    
    //Esse metodo recebe um estado e qual jogador fará a jogada no momento
    public void jogar(Estado raiz, int jogador) {
        
        int vez = jogador;
        Estado estadoAtual = raiz;

        // enquanto o jogo não terminar
        while (jogo) {
            if (vez == JOGADOR) {
                // habilita os botoes que o jogador pode clicar
                habilitarBotoes(estadoAtual);
                // jogador faz a jogada
                
                // estadoAtual recebe a jogada que o jogador fez
                
                // seta a interface
                setarInterface(estadoAtual);
                //
                vez = IA;
            } else {
                // desabilita todos os botoes para o jogador não poder jogar
                desabilitarBotoes();

                // IA faz a jogada chamando o minimax
                
                // estadoAtual recebe a jogada que a IA fez
                
                // seta a interface
                setarInterface(estadoAtual);
                
                // muda a vez do jogador
                vez = JOGADOR;

                // habilita os botoes possiveis para o jogador
                habilitarBotoes(estadoAtual);

            }

        }

    }
    
    // Este método deve desabilitar todos os botões para que o humano não possa jogar na vez da IA
    public void desabilitarBotoes () {
        
    }

    // Este método deve ser chamado após cada jogada da IA e receber o estado gerado pela jogada
    public void habilitarBotoes(Estado estadoAtual) {

        ArrayList<Posicao> botoes = new ArrayList<>();

        // encontra os botões possíveis para o humano
        botoes.addAll(procuraBotoesPossiveis(estadoAtual));

        //laço para habilitar os botoes possiveis na interface
        for (Posicao botao : botoes) {
            // habilita este botao na interface
        }

    }

    /*
    Este método é chamado toda vez que acontece uma jogada
    Espera como parâmetro o estado gerado pela jogada
    */
    public void setarInterface(Estado estadoAtual, Interface i) {

        /*
        seta a matriz para o estadoAtual
        */
    }

    /*
    // Funcao que busca lugares onde possa ser feito uma jogada
     */
    private ArrayList<Posicao> procuraBotoesPossiveis(Estado estadoAtual) {
        int jogadorAtual = JOGADOR, oponente = IA;
        /*
        Este método deve retornar os botões possíveis para o humano jogar,
        portando não precisa receber jogadorAtual e oponente,
        pois sempre vai procurar somente os botões possíveis para o humano.
         */

        ArrayList<Posicao> posicoes = new ArrayList<>();

        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (estadoAtual.getTabuleiro()[i][j] == oponente) {
                    int I = i, J = j;
                    if (i - 1 >= 0 && j - 1 >= 0 && estadoAtual.getTabuleiro()[i - 1][j - 1] == 0) {
                        i = i + 1;
                        j = j + 1;
                        while (i < 7 && j < 7 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i++;
                            j++;
                        }
                        if (i <= 7 && j <= 7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I - 1, J - 1));
                        }
                    }
                    i = I;
                    j = J;
                    if (i - 1 >= 0 && estadoAtual.getTabuleiro()[i - 1][j] == 0) {
                        i = i + 1;
                        while (i < 7 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i++;
                        }
                        if (i <= 7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I - 1, J));
                        }
                    }
                    i = I;
                    if (i - 1 >= 0 && j + 1 <= 7 && estadoAtual.getTabuleiro()[i - 1][j + 1] == 0) {
                        i = i + 1;
                        j = j - 1;
                        while (i < 7 && j > 0 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i++;
                            j--;
                        }
                        if (i <= 7 && j >= 0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I - 1, J + 1));
                        }
                    }
                    i = I;
                    j = J;
                    if (j - 1 >= 0 && estadoAtual.getTabuleiro()[i][j - 1] == 0) {
                        j = j + 1;
                        while (j < 7 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            j++;
                        }
                        if (j <= 7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I, J - 1));
                        }
                    }
                    j = J;
                    if (j + 1 <= 7 && estadoAtual.getTabuleiro()[i][j + 1] == 0) {
                        j = j - 1;
                        while (j > 0 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            j--;
                        }
                        if (j >= 0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I, J + 1));
                        }
                    }
                    j = J;
                    if (i + 1 <= 7 && j - 1 >= 0 && estadoAtual.getTabuleiro()[i + 1][j - 1] == 0) {
                        i = i - 1;
                        j = j + 1;
                        while (i > 0 && j < 7 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i--;
                            j++;
                        }
                        if (i >= 0 && j <= 7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I + 1, J - 1));
                        }
                    }
                    i = I;
                    j = J;
                    if (i + 1 <= 7 && estadoAtual.getTabuleiro()[i + 1][j] == 0) {
                        i = i - 1;
                        while (i > 0 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i--;
                        }
                        if (i >= 0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I + 1, J));
                        }
                    }
                    i = I;
                    if (i + 1 <= 7 && j + 1 <= 7 && estadoAtual.getTabuleiro()[i + 1][j + 1] == 0) {
                        i = i - 1;
                        j = j - 1;
                        while (i > 0 && j > 0 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i--;
                            j--;
                        }
                        if (i >= 0 && j >= 0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I + 1, J + 1));
                        }
                    }
                    i = I;
                    j = J;
                }
            }
        }
        return posicoes;
    }
    
    // 1 - preto; 2 - branco; 0 - vazio
    public ArrayList<Estado> gerarArvore(Estado raiz) {
        ArrayList<Estado> filhos = new ArrayList<>();
        int posicao;

        if (ehEstadoFinal(raiz)) {
            return null;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (raiz.getTabuleiro()[i][j] == 0) {
                    posicao = i * 8 + j;
                    Estado filho = verificarPossibilidades(raiz, posicao);
                    if (filho != null) {
                        filhos.add(filho);
                    }
                }
            }
        }

        return filhos;
    }

    public boolean ehEstadoFinal(Estado e) {

        return true;
    }

    // 1 - preto; 2 - branco; 0 - vazio
    public Estado verificarPossibilidades(Estado e, int posicao) {
        Estado retorno = new Estado();
        int n = 8;
        int[][] matriz = new int[n][n];
        int contador = 0;
        int linha = posicao / n;
        int coluna = posicao % n;

        // setando a matriz com posições vazias
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = 0;
            }
        }

        if (e.isMax()) {
            // verifica possibilidades para bola branca
            int i = 1;
            // verificando possibilidades na horizontal à direita
            while (e.getTabuleiro()[linha][coluna + i] == 1 && (coluna + i) < 4) {
                contador++;
                i++;
            }
            if (contador != 0 && (coluna + i) >= 4) {
                // estrapolou o vetor
                contador = 0;
            } else if (contador != 0) {
                i -= 1;
                while ((coluna + i) >= coluna) {
                    // setando posições à direita com bolas brancas
                    matriz[linha][coluna + i] = 2;
                    i--;
                }
            }

            i = 1;
            contador = 0;
            // verificando possibilidades na horizontal à esquerda
            while (e.getTabuleiro()[linha][coluna - i] == 1 && (coluna - 1) >= 0) {
                contador++;
                i++;
            }
            if (contador != 0 && (coluna + i) < 0) {
                // estrapolou o vetor
                contador = 0;
            } else if (contador != 0) {
                i -= 1;
                while ((coluna - i) <= coluna) {
                    // setando posições à esquerda com bolas brancas
                    matriz[linha][coluna - 1] = 2;
                }
            }
        } else {
            // verifica possibilidades para bola preta
        }

        return retorno;
    }

    /*
    //**Verificar se o botão é válido
    public void verificarjogada() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (valorMaior < matrizEstado[i][j]) {
                    valorMaior = matrizEstado[i][j];
                }
            }
        }
        System.out.println("O maior valor é: " + valorMaior);
       // System.out.println("Está na linha " + i + " coluna " + j);
        System.out.println();
    }*/
}
