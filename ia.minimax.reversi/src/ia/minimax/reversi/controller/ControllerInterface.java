package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import ia.minimax.reversi.model.Posicao;
import ia.minimax.reversi.view.Interface;
import java.util.ArrayList;

/**
 *
 * @author Pablo Borges
 */
public class ControllerInterface {
    
    private boolean jogo = true;
    private static final int JOGADOR = 1; // Inteiro para identificar o jogador
    private static final int IA = 2; // Inteiro para identificar a IA

    //Esse metodo recebe um estado
    public void jogar(Estado raiz) {

        int vez = JOGADOR;
        Estado estadoAtual = raiz;

        // habilita os botoes que o jogador pode clicar
        habilitarBotoes(estadoAtual);

        // enquanto o jogo não terminar
        while (jogo) {
            if (vez == JOGADOR) {

                // jogador faz a jogada
                // estadoAtual recebe a jogada que o jogador fez
                // seta a interface
                setarInterface(estadoAtual);

                // passa a vez
                vez = IA;
            } else {
                // desabilita todos os botoes para o jogador não poder jogar
                desabilitarBotoes();

                // IA faz a jogada chamando o minimax
                // estadoAtual recebe a jogada que a IA fez
                // seta a interface
                setarInterface(estadoAtual);

                // passa a vez
                vez = JOGADOR;

                // habilita os botoes possiveis para o jogador
                habilitarBotoes(estadoAtual);

            }

        }

    }

    // Este método deve desabilitar todos os botões para que o humano não possa jogar na vez da IA
    public void desabilitarBotoes() {

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

        int jogadorAtual = JOGADOR;
        int oponente = IA;
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

}
