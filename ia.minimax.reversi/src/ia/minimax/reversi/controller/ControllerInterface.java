package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import ia.minimax.reversi.model.Posicao;
import ia.minimax.reversi.view.Interface;
import java.awt.Color;
import java.util.ArrayList;

/*
 *
 * @author Pablo Borges
 */
public class ControllerInterface { 
    int nivel;
    int N ;
    private boolean jogo;
    private static int JOGADOR; // Inteiro para identificar o jogador
    private static int IA; // Inteiro para identificar a IA
    int vez;
    Estado atual;
    Estado aux;
    
    public ControllerInterface(){
        nivel = 0;
        N = 8;
        jogo = true;
        JOGADOR = 1;
        IA = 2; 
        vez = JOGADOR;
    }

    // Este método é chamado para começar o jogo
    public void jogar (Estado raiz, Interface tela, int dificuldade) {
        
        this.atual = raiz;
        ControllerEstado controle = new ControllerEstado();

        Thread t = new Thread(() -> {
            int flagHumano = 0, flagIA = 0;

            while (jogo) {
                // Enquanto o jogo não terminar
                if (atual.verificaFinal()) {
                    // Se o jogo tiver acabado
                    jogo = false;
                }
                
                if (vez == JOGADOR) {
                    
                    int jogadaHumano = esperaJogadaHumano(atual, tela);
                    
                    if (jogadaHumano > -1) {
                        // Matriz é atualizada com a jogada do humano
                        atual.atualizaTabuleiro(jogadaHumano, JOGADOR, IA);
                        
                        nivel++; 
                        // Atualiza o tabuleiro na interface
                        setarInterface(atual, tela);
                        //Atualiza o placar do jogo
                        atualizaScore(atual, tela);
                        // Passa a vez
                        vez = IA; 
                    } else {
                        flagHumano++;
                    }
                    
                    if (flagHumano == 2) {
                        vez = IA;
                    }
                    
                } else {
                    flagHumano = 0;
                    // Desabilita todos os botões para o jogador não poder jogar na vez da IA
                    //desabilitarBotoes(tela);
                    
                    // Gera uma árvore e atribui os valores de miniMax a ela
                    atual.setNivel(0);
                    controle.gerarArvore(atual, dificuldade, IA, JOGADOR);
                    Estado escolhido = new Estado();
                    escolhido.setMinimax(-64);
                    
                    //procura qual filho tem maior valor de minimax
                    if (!atual.getFilhos().isEmpty()) {
                        for (Estado filho : atual.getFilhos()) {
                            if (escolhido.getMinimax() < filho.getMinimax()) {
                                escolhido = filho;
                            }
                        }
                    }

                    if (atual.getMinimax() != -64) {
                        // Realiza a jogada da IA
                        atual = escolhido;

                        nivel++;
                        // Atualiza o tabuleiro na interface
                        setarInterface(atual, tela);
                        // Atualiza o placar do jogo
                        atualizaScore(atual, tela);
                    }

                    vez = JOGADOR; 
                      
                }
            }
            //atualizaScore(atual, tela);
        });
        
        t.start();
        
        //atualizaScore(atual, tela);
        //printarVencedor(tela, atual);
    } 
    
    public void printarVencedor(Interface tela, Estado estado){
        
        int pecasHumano = 0, pecasIA = 0;
        
        for (int i = 0; i < N*N; i++) {
            if (estado.getTabuleiro()[i / N][i % N] == JOGADOR) {
                pecasHumano++;
            }
            if (estado.getTabuleiro()[i / N][i % N] == IA) {
                pecasIA++;
            }
        }
        if (pecasHumano > pecasIA) {
            tela.vencedor.setBackground(Color.green);
            tela.vencedor.setText("Você venceu!");   
        }
        if (pecasHumano < pecasIA) {
            tela.vencedor.setBackground(Color.red);
            tela.vencedor.setText("Você foi derrotado!");
        }
        if (pecasHumano == pecasIA) {
            tela.vencedor.setBackground(Color.yellow);
            tela.vencedor.setText("Empate!");
        }
    }

    // Este método espera o humano realizar uma jogada possível
    public int esperaJogadaHumano(Estado estadoAtual, Interface tela) {

        int flag = 0;
        ArrayList<Posicao> posicoesJogaveis = new ArrayList<>();
        posicoesJogaveis.addAll(procuraBotoesPossiveis(estadoAtual, JOGADOR, IA));

        while (flag == 0 && posicoesJogaveis.size() > 0) {
            System.out.println("w");
            for (int i = 0; i < posicoesJogaveis.size(); i++) {
                // Verifica se o botão pressionado está dentro do array de posições jogáveis
                if (posicoesJogaveis.get(i).transformaBotao() == tela.getBotaoPressionado()) {
                    return tela.getBotaoPressionado();
                }
            }
        }
        
        return -1;
        
    }

    //Esse método atualiza o placar com o numero de peças de cada jogador
    public void atualizaScore(Estado estado, Interface tela) {
        
        Integer pecasHumano = 0, pecasIA = 0;
        
        for (int i = 0; i < N*N; i++) {
            if (estado.getTabuleiro()[i / N][i % N] == JOGADOR) {
                pecasHumano++;
            }
            if (estado.getTabuleiro()[i / N][i % N] == IA) {
                pecasIA++;
            }
        }
        
        tela.placarHumano.setText(pecasHumano.toString());
        tela.placarIA.setText(pecasIA.toString());
        
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

    // Este método deve ser chamado após cada jogada da IA e deve receber o estado gerado pela jogada
    public void habilitarBotoes(Estado estadoAtual, Interface tela) {
        ArrayList<Posicao> botoes = new ArrayList<>();

        // Encontra os botões possíveis para o humano
        botoes.addAll(procuraBotoesPossiveis(estadoAtual, JOGADOR, IA));

        // Laço para habilitar os botões possíveis na interface
        for (int i=0; i< botoes.size(); i++) {
            // Habilita este botão na interface
            switch (botoes.get(i).getPosicaoX() * N + botoes.get(i).getPosicaoY()) {  //conta que gera o numero do botao desejado
                case 0:
                    tela.botao0.setEnabled(true);
                    break;
                case 1:
                    tela.botao1.setEnabled(true);
                    break;
                case 2:
                    tela.botao2.setEnabled(true);
                    break;
                case 3:
                    tela.botao3.setEnabled(true);
                    break;
                case 4:
                    tela.botao4.setEnabled(true);
                    break;
                case 5:
                    tela.botao5.setEnabled(true);
                    break;
                case 6:
                    tela.botao6.setEnabled(true);
                    break;
                case 7:
                    tela.botao7.setEnabled(true);
                    break;
                case 8:
                    tela.botao8.setEnabled(true);
                    break;
                case 9:
                    tela.botao9.setEnabled(true);
                    break;
                case 10:
                    tela.botao10.setEnabled(true);
                    break;
                case 11:
                    tela.botao11.setEnabled(true);
                    break;
                case 12:
                    tela.botao12.setEnabled(true);
                    break;
                case 13:
                    tela.botao13.setEnabled(true);
                    break;
                case 14:
                    tela.botao14.setEnabled(true);
                    break;
                case 15:
                    tela.botao15.setEnabled(true);
                    break;
                case 16:
                    tela.botao16.setEnabled(true);
                    break;
                case 17:
                    tela.botao17.setEnabled(true);
                    break;
                case 18:
                    tela.botao18.setEnabled(true);
                    break;
                case 19:
                    tela.botao19.setEnabled(true);
                    break;
                case 20:
                    tela.botao20.setEnabled(true);
                    break;
                case 21:
                    tela.botao21.setEnabled(true);
                    break;
                case 22:
                    tela.botao22.setEnabled(true);
                    break;
                case 23:
                    tela.botao23.setEnabled(true);
                    break;
                case 24:
                    tela.botao24.setEnabled(true);
                    break;
                case 25:
                    tela.botao25.setEnabled(true);
                    break;
                case 26:
                    tela.botao26.setEnabled(true);
                    break;
                case 27:
                    tela.botao27.setEnabled(true);
                    break;
                case 28:
                    tela.botao28.setEnabled(true);
                    break;
                case 29:
                    tela.botao29.setEnabled(true);
                    break;
                case 30:
                    tela.botao30.setEnabled(true);
                    break;
                case 31:
                    tela.botao31.setEnabled(true);
                    break;
                case 32:
                    tela.botao32.setEnabled(true);
                    break;
                case 33:
                    tela.botao33.setEnabled(true);
                    break;
                case 34:
                    tela.botao34.setEnabled(true);
                    break;
                case 35:
                    tela.botao35.setEnabled(true);
                    break;
                case 36:
                    tela.botao36.setEnabled(true);
                    break;
                case 37:
                    tela.botao37.setEnabled(true);
                    break;
                case 38:
                    tela.botao38.setEnabled(true);
                    break;
                case 39:
                    tela.botao39.setEnabled(true);
                    break;
                case 40:
                    tela.botao40.setEnabled(true);
                    break;
                case 41:
                    tela.botao41.setEnabled(true);
                    break;
                case 42:
                    tela.botao42.setEnabled(true);
                    break;
                case 43:
                    tela.botao43.setEnabled(true);
                    break;
                case 44:
                    tela.botao44.setEnabled(true);
                    break;
                case 45:
                    tela.botao45.setEnabled(true);
                    break;
                case 46:
                    tela.botao46.setEnabled(true);
                    break;
                case 47:
                    tela.botao47.setEnabled(true);
                    break;
                case 48:
                    tela.botao48.setEnabled(true);
                    break;
                case 49:
                    tela.botao49.setEnabled(true);
                    break;
                case 50:
                    tela.botao50.setEnabled(true);
                    break;
                case 51:
                    tela.botao51.setEnabled(true);
                    break;
                case 52:
                    tela.botao52.setEnabled(true);
                    break;
                case 53:
                    tela.botao53.setEnabled(true);
                    break;
                case 54:
                    tela.botao54.setEnabled(true);
                    break;
                case 55:
                    tela.botao55.setEnabled(true);
                    break;
                case 56:
                    tela.botao56.setEnabled(true);
                    break;
                case 57:
                    tela.botao57.setEnabled(true);
                    break;
                case 58:
                    tela.botao58.setEnabled(true);
                    break;
                case 59:
                    tela.botao59.setEnabled(true);
                    break;
                case 60:
                    tela.botao60.setEnabled(true);
                    break;
                case 61:
                    tela.botao61.setEnabled(true);
                    break;
                case 62:
                    tela.botao62.setEnabled(true);
                    break;
                case 63:
                    tela.botao63.setEnabled(true);
                    break;
            }
        }
    }

    /*
    Este método é chamado toda vez que acontece uma jogada
    Espera como parâmetro o estado gerado pela jogada
     */
    public void setarInterface(Estado estadoAtual, Interface tela) {
        // Percorrerá toda a matriz do estado atual e alterará as posições do tabuleiro da tela com as cores correspondentes
        
        for (int j = 0; j < N*N; j++) {
            switch (j) {
                case 0:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao0.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao0.setBackground(Color.WHITE);
                    }
                    break;
                case 1:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao1.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao1.setBackground(Color.WHITE);
                    }
                    break;
                case 2:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao2.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao2.setBackground(Color.WHITE);
                    }
                    break;
                case 3:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao3.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao3.setBackground(Color.WHITE);
                    }
                    break;
                case 4:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao4.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao4.setBackground(Color.WHITE);
                    }
                    break;
                case 5:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao5.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao5.setBackground(Color.WHITE);
                    }
                    break;
                case 6:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao6.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao6.setBackground(Color.WHITE);
                    }
                    break;
                case 7:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao7.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao7.setBackground(Color.WHITE);
                    }
                    break;
                case 8:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao8.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao8.setBackground(Color.WHITE);
                    }
                    break;
                case 9:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao9.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao9.setBackground(Color.WHITE);
                    }
                    break;
                case 10:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao10.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao10.setBackground(Color.WHITE);
                    }
                    break;
                case 11:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao11.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao11.setBackground(Color.WHITE);
                    }
                    break;
                case 12:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao12.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao12.setBackground(Color.WHITE);
                    }
                    break;
                case 13:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao13.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao13.setBackground(Color.WHITE);
                    }
                    break;
                case 14:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao14.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao14.setBackground(Color.WHITE);
                    }
                    break;
                case 15:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.botao15.setBackground(Color.BLACK);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.botao15.setBackground(Color.WHITE);
                    }
                    break;
                case 16:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao16);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao16);
                    }
                    break;
                case 17:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao17);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao17);
                    }
                    break;
                case 18:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao18);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao18);
                    }
                    break;
                case 19:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao19);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao19);
                    }
                    break;
                case 20:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao20);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao20);
                    }
                    break;
                case 21:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao21);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao21);
                    }
                    break;
                case 22:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao22);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao22);
                    }
                    break;
                case 23:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao23);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao23);
                    }
                    break;
                case 24:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao24);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao24);
                    }
                    break;
                case 25:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao25);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao25);
                    }
                    break;
                case 26:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao26);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao26);
                    }
                    break;
                case 27:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao27);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao27);
                    }
                    break;
                case 28:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao28);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao28);
                    }
                    break;
                case 29:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao29);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao29);
                    }
                    break;
                case 30:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao30);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao30);
                    }
                    break;
                case 31:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao31);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao31);
                    }
                    break;
                case 32:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao32);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao32);
                    }
                    break;
                case 33:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao33);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao33);
                    }
                    break;
                case 34:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao34);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao34);
                    }
                    break;
                case 35:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao35);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao35);
                    }
                    break;
                case 36:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao36);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao36);
                    }
                    break;
                case 37:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao37);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao37);
                    }
                    break;
                case 38:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao38);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao38);
                    }
                    break;
                case 39:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao39);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao39);
                    }
                    break;
                case 40:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao40);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao40);
                    }
                    break;
                case 41:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao41);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao41);
                    }
                    break;
                case 42:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao42);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao42);
                    }
                    break;
                case 43:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao43);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao43);
                    }
                    break;
                case 44:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao44);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao44);
                    }
                    break;
                case 45:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao45);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao45);
                    }
                    break;
                case 46:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao46);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao46);
                    }
                    break;
                case 47:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao47);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao47);
                    }
                    break;
                case 48:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao48);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao48);
                    }
                    break;
                case 49:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao49);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao49);
                    }
                    break;
                case 50:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao50);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao50);
                    }
                    break;
                case 51:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao51);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao51);
                    }
                    break;
                case 52:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao52);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao52);
                    }
                    break;
                case 53:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao53);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao53);
                    }
                    break;
                case 54:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao54);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao54);
                    }
                    break;
                case 55:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao55);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao55);
                    }
                    break;
                case 56:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao56);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao56);
                    }
                    break;
                case 57:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao57);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao57);
                    }
                    break;
                case 58:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao58);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao58);
                    }
                    break;
                case 59:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao59);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao59);
                    }
                    break;
                case 60:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao60);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao60);
                    }
                    break;
                case 61:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao61);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao61);
                    }
                    break;
                case 62:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao62);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao62);
                    }
                    break;
                case 63:
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 1) {
                        tela.pintaBotaoJOGADOR(tela.botao63);
                    }
                    if (estadoAtual.getCorPecaTabuleiro(j / N, j % N) == 2) {
                        tela.pintaBotaoIA(tela.botao63);
                    }
                    break;
            }
        }
    }

    // Este método busca as posições que contêm jogas possíveis e as retorna num array
    public ArrayList<Posicao> procuraBotoesPossiveis(Estado estadoAtual, int jogadorAtual, int oponente) {
        
        int N = 8;
        ArrayList<Posicao> posicoes = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (estadoAtual.getTabuleiro()[i][j] == oponente) {
                    int I = i, J = j;
                    if (i - 1 >= 0 && j - 1 >= 0 && estadoAtual.getTabuleiro()[i - 1][j - 1] == 0) {
                        i = i + 1;
                        j = j + 1;
                        while (i < N-1 && j < N-1 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i++;
                            j++;
                        }
                        if (i <= N-1 && j <= N-1 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I - 1, J - 1));
                        }
                    }
                    i = I;
                    j = J;
                    if (i - 1 >= 0 && estadoAtual.getTabuleiro()[i - 1][j] == 0) {
                        i = i + 1;
                        while (i < N-1 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i++;
                        }
                        if (i <= N-1 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I - 1, J));
                        }
                    }
                    i = I;
                    if (i - 1 >= 0 && j + 1 <= N-1 && estadoAtual.getTabuleiro()[i - 1][j + 1] == 0) {
                        i = i + 1;
                        j = j - 1;
                        while (i < N-1 && j > 0 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i++;
                            j--;
                        }
                        if (i <= N-1 && j >= 0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I - 1, J + 1));
                        }
                    }
                    i = I;
                    j = J;
                    if (j - 1 >= 0 && estadoAtual.getTabuleiro()[i][j - 1] == 0) {
                        j = j + 1;
                        while (j < N-1 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            j++;
                        }
                        if (j <= N-1 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I, J - 1));
                        }
                    }
                    j = J;
                    if (j + 1 <= N-1 && estadoAtual.getTabuleiro()[i][j + 1] == 0) {
                        j = j - 1;
                        while (j > 0 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            j--;
                        }
                        if (j >= 0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I, J + 1));
                        }
                    }
                    j = J;
                    if (i + 1 <= N-1 && j - 1 >= 0 && estadoAtual.getTabuleiro()[i + 1][j - 1] == 0) {
                        i = i - 1;
                        j = j + 1;
                        while (i > 0 && j < N-1 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i--;
                            j++;
                        }
                        if (i >= 0 && j <= N-1 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I + 1, J - 1));
                        }
                    }
                    i = I;
                    j = J;
                    if (i + 1 <= N-1 && estadoAtual.getTabuleiro()[i + 1][j] == 0) {
                        i = i - 1;
                        while (i > 0 && estadoAtual.getTabuleiro()[i][j] == oponente) {
                            i--;
                        }
                        if (i >= 0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual) {
                            posicoes.add(new Posicao(I + 1, J));
                        }
                    }
                    i = I;
                    if (i + 1 <= N-1 && j + 1 <= N-1 && estadoAtual.getTabuleiro()[i + 1][j + 1] == 0) {
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
