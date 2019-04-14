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
    public void jogar(Estado raiz, Interface tela) {

        int vez = JOGADOR;
        Estado estadoAtual = raiz;

        // habilita os botoes que o jogador pode clicar
        habilitarBotoes(estadoAtual, tela);

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
                desabilitarBotoes(tela);

                // IA faz a jogada chamando o minimax
                // estadoAtual recebe a jogada que a IA fez
                // seta a interface
                setarInterface(estadoAtual);

                // passa a vez
                vez = JOGADOR;

                // habilita os botoes possiveis para o jogador
                habilitarBotoes(estadoAtual, tela);

            }

        }

    }

    // Este método deve desabilitar todos os botões para que o humano não possa jogar na vez da IA
    public void desabilitarBotoes(Interface tela) {
        tela.botao0.setEnabled(false);
        tela.botao1.setEnabled(false);
        tela.botao2.setEnabled(false);
        tela.botao3.setEnabled(false);
        tela.botao4.setEnabled(false);
        tela.botao5.setEnabled(false);
        tela.botao6.setEnabled(false);
        tela.botao7.setEnabled(false);
        tela.botao8.setEnabled(false);
        tela.botao9.setEnabled(false);
        tela.botao10.setEnabled(false);
        tela.botao11.setEnabled(false);
        tela.botao12.setEnabled(false);
        tela.botao13.setEnabled(false);
        tela.botao14.setEnabled(false);
        tela.botao15.setEnabled(false);
        tela.botao16.setEnabled(false);
        tela.botao17.setEnabled(false);
        tela.botao18.setEnabled(false);
        tela.botao19.setEnabled(false);
        tela.botao20.setEnabled(false);
        tela.botao21.setEnabled(false);
        tela.botao22.setEnabled(false);
        tela.botao23.setEnabled(false);
        tela.botao24.setEnabled(false);
        tela.botao25.setEnabled(false);
        tela.botao26.setEnabled(false);
        tela.botao27.setEnabled(false);
        tela.botao28.setEnabled(false);
        tela.botao29.setEnabled(false);
        tela.botao30.setEnabled(false);
        tela.botao31.setEnabled(false);
        tela.botao32.setEnabled(false);
        tela.botao33.setEnabled(false);
        tela.botao34.setEnabled(false);
        tela.botao35.setEnabled(false);
        tela.botao36.setEnabled(false);
        tela.botao37.setEnabled(false);
        tela.botao38.setEnabled(false);
        tela.botao39.setEnabled(false);
        tela.botao40.setEnabled(false);
        tela.botao41.setEnabled(false);
        tela.botao42.setEnabled(false);
        tela.botao43.setEnabled(false);
        tela.botao44.setEnabled(false);
        tela.botao45.setEnabled(false);
        tela.botao46.setEnabled(false);
        tela.botao47.setEnabled(false);
        tela.botao48.setEnabled(false);
        tela.botao49.setEnabled(false);
        tela.botao50.setEnabled(false);
        tela.botao51.setEnabled(false);
        tela.botao52.setEnabled(false);
        tela.botao53.setEnabled(false);
        tela.botao54.setEnabled(false);
        tela.botao55.setEnabled(false);
        tela.botao56.setEnabled(false);
        tela.botao57.setEnabled(false);
        tela.botao58.setEnabled(false);
        tela.botao59.setEnabled(false);
        tela.botao60.setEnabled(false);
        tela.botao61.setEnabled(false);
        tela.botao62.setEnabled(false);
        tela.botao63.setEnabled(false);
    }

    // Este método deve ser chamado após cada jogada da IA e receber o estado gerado pela jogada
    public void habilitarBotoes(Estado estadoAtual, Interface tela) {

        ArrayList<Posicao> botoes = new ArrayList<>();

        // encontra os botões possíveis para o humano
        botoes.addAll(procuraBotoesPossiveis(estadoAtual));

        //laço para habilitar os botoes possiveis na interface
        for (Posicao botao : botoes) {
            // habilita este botao na interface
            switch(botao.getPosicaoX()*8 + botao.getPosicaoY()){  //conta que gera o numero do botao desejado
                case 0:
                    tela.botao0.setEnabled(true);break;
                case 1:
                    tela.botao1.setEnabled(true);break;
                case 2:
                    tela.botao2.setEnabled(true);break;
                case 3:
                    tela.botao3.setEnabled(true);break;
                case 4:
                    tela.botao4.setEnabled(true);break;
                case 5:
                    tela.botao5.setEnabled(true);break;
                case 6:
                    tela.botao6.setEnabled(true);break;
                case 7:
                    tela.botao7.setEnabled(true);break;
                case 8:
                    tela.botao8.setEnabled(true);break;
                case 9:
                    tela.botao9.setEnabled(true);break;
                case 10:
                    tela.botao10.setEnabled(true);break;
                case 11:
                    tela.botao11.setEnabled(true);break;
                case 12:
                    tela.botao12.setEnabled(true);break;
                case 13:
                    tela.botao13.setEnabled(true);break;
                case 14:
                    tela.botao14.setEnabled(true);break;
                case 15:
                    tela.botao15.setEnabled(true);break;
                case 16:
                    tela.botao16.setEnabled(true);break;
                case 17:
                    tela.botao17.setEnabled(true);break;
                case 18:
                    tela.botao18.setEnabled(true);break;
                case 19:
                    tela.botao19.setEnabled(true);break;
                case 20:
                    tela.botao20.setEnabled(true);break;
                case 21:
                    tela.botao21.setEnabled(true);break;
                case 22:
                    tela.botao22.setEnabled(true);break;
                case 23:
                    tela.botao23.setEnabled(true);break;
                case 24:
                    tela.botao24.setEnabled(true);break;
                case 25:
                    tela.botao25.setEnabled(true);break;
                case 26:
                    tela.botao26.setEnabled(true);break;    
                case 27:
                    tela.botao27.setEnabled(true);break;   
                case 28:
                    tela.botao28.setEnabled(true);break;    
                case 29:
                    tela.botao29.setEnabled(true);break;    
                case 30:
                    tela.botao30.setEnabled(true);break;
                case 31:
                    tela.botao31.setEnabled(true);break;    
                case 32:
                    tela.botao32.setEnabled(true);break;    
                case 33:
                    tela.botao33.setEnabled(true);break;    
                case 34:
                    tela.botao34.setEnabled(true);break;    
                case 35:
                    tela.botao35.setEnabled(true);break;    
                case 36:
                    tela.botao36.setEnabled(true);break;    
                case 37:
                    tela.botao37.setEnabled(true);break;   
                case 38:
                    tela.botao38.setEnabled(true);break;   
                case 39:
                    tela.botao39.setEnabled(true);break;   
                case 40:
                    tela.botao40.setEnabled(true);break;
                case 41:
                    tela.botao41.setEnabled(true);break;     
                case 42:
                    tela.botao42.setEnabled(true);break;     
                case 43:
                    tela.botao43.setEnabled(true);break;     
                case 44:
                    tela.botao44.setEnabled(true);break;     
                case 45:
                    tela.botao45.setEnabled(true);break;     
                case 46:
                    tela.botao46.setEnabled(true);break;     
                case 47:
                    tela.botao47.setEnabled(true);break;     
                case 48:
                    tela.botao48.setEnabled(true);break;    
                case 49:
                    tela.botao49.setEnabled(true);break;     
                case 50:
                    tela.botao50.setEnabled(true);break;     
                case 51:
                    tela.botao51.setEnabled(true);break;     
                case 52:
                    tela.botao52.setEnabled(true);break;    
                case 53:
                    tela.botao53.setEnabled(true);break;   
                case 54:
                    tela.botao54.setEnabled(true);break;    
                case 55:
                    tela.botao55.setEnabled(true);break;   
                case 56:
                    tela.botao56.setEnabled(true);break;  
                case 57:
                    tela.botao57.setEnabled(true);break;    
                case 58:
                    tela.botao58.setEnabled(true);break;    
                case 59:
                    tela.botao59.setEnabled(true);break;    
                case 60:
                    tela.botao60.setEnabled(true);break;    
                case 61:
                    tela.botao61.setEnabled(true);break;    
                case 62:
                    tela.botao62.setEnabled(true);break;
                case 63:
                    tela.botao63.setEnabled(true);break;
            }
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
