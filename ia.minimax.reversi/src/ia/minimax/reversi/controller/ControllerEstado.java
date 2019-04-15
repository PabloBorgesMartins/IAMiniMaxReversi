package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import java.util.ArrayList;

public class ControllerEstado {
    
    public static final int CASA_VAZIA = 0; // Representa uma casa vazia do tabuleiro do jogo
    public static final int JOGADOR = 1; // Inteiro para identificar o jogador
    public static final int IA = 2; // Inteiro para identificar a IA
    private static final int N = 8;
    static int matrizEstado[][] = new int[N][N]; // 1 - preto; 2 - branco; 0 - vazio

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

    // 1 - preto; 2 - branco; 0 - vazio
    public ArrayList<Estado> gerarArvore(Estado raiz) {
        ArrayList<Estado> filhos = new ArrayList<>();
        int posicao;

        if (ehEstadoFinal(raiz)) {
            return null;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (raiz.getTabuleiro()[i][j] == 0) {
                    posicao = i * N + j;
                    Estado filho = verificarPossibilidades(raiz, posicao);
                    if (filho != null) {
                        filhos.add(filho);
                    }
                }
            }
        }
        // fazer recursão
        return filhos;
    }

    
    public boolean ehEstadoFinal(Estado e) {
        // implementar este método
        return true;
    }

    
    // 1 - preto; 2 - branco; 0 - vazio
    public Estado verificarPossibilidades(Estado estadoAtual, int posicao) {

        Estado retorno = new Estado();
        int[][] matriz = new int[N][N];
        boolean flag = false;
        boolean flag2 = false;
        int linha = posicao / N;
        int coluna = posicao % N;

        // setando a matriz com posições vazias
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = 0;
            }
        }

        if (estadoAtual.isMax()) {
            // verifica possibilidades para bola branca
            // verificando possibilidades na horizontal à direita
            int i = coluna + 1;
            while (estadoAtual.getTabuleiro()[linha][i] == 1 && i < N) {
                // enquanto tiver bolas pretas à direta e enquanto não estrapolar o vetor
                flag = true;
                i++;
            }
            /* if (i >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas à direita
                if (estadoAtual.getTabuleiro()[linha][i] == 2) {
                    // se na posição [i] tiver uma bola branca
                    i -= 1;
                    flag2 = true;
                    while (i >= coluna) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[linha][i] = 2;
                        i--;
                    }
                }
            }

            //verificando possibilidades na horizontal à esquerda
            i = coluna - 1;
            flag = false;
            while (estadoAtual.getTabuleiro()[linha][i] == 1 && i >= 0) {
                // enquanto tiver bolas pretas à esquerda e enquanto não estrapolar o vetor
                flag = true;
                i--;
            }
            /* if (i < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas à esquerda
                if (estadoAtual.getTabuleiro()[linha][i] == 2) {
                    // se na posição [i] tiver uma bola branca
                    i += 1;
                    flag2 = true;
                    while (i <= coluna) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[linha][i] = 2;
                        i++;
                    }
                }
            }

            // verificando possibilidades na vertical acima
            i = linha - 1;
            flag = false;
            while (estadoAtual.getTabuleiro()[i][coluna] == 1 && i >= 0) {
                // enquanto tiver bolas pretas acima e enquanto não estrapolar o vetor
                flag = true;
                i--;
            }
            /* if (i < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas acima
                if (estadoAtual.getTabuleiro()[i][coluna] == 2) {
                    // se na posição [i] tiver uma bola branca
                    i += 1;
                    flag2 = true;
                    while (i <= linha) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[i][coluna] = 2;
                        i++;
                    }
                }
            }

            // verificando possibilidades na vertical abaixo
            i = linha + 1;
            flag = false;
            while (estadoAtual.getTabuleiro()[i][coluna] == 1 && i < N) {
                // enquanto tiver bolas pretas abaixo e enquanto não estrapolar o vetor
                flag = true;
                i++;
            }
            /* if (i >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas abaixo
                if (estadoAtual.getTabuleiro()[i][coluna] == 2) {
                    // se na posição [i] tiver uma bola branca
                    i -= 1;
                    flag2 = true;
                    while (i >= linha) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[i][coluna] = 2;
                        i--;
                    }
                }
            }

            // verificando possibilidades na diagonal inferior direita
            i = linha + 1;
            int j = coluna + 1;
            flag = false;
            while (estadoAtual.getTabuleiro()[i][j] == 1 && i < N && j < N) {
                // enquanto tiver bolas pretas na diagonal inferior direita e enquanto não estrapolar o vetor
                flag = true;
                i++;
                j++;
            }
            /* if (i >= N || j >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas na diagonal inferior direita
                if (estadoAtual.getTabuleiro()[i][j] == 2) {
                    // se na posição [i][j] tiver uma bola branca
                    i -= 1;
                    j -= 1;
                    flag2 = true;
                    while (i >= linha && j >= coluna) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[i][j] = 2;
                        i--;
                        j--;
                    }
                }
            }

            // verificando possibilidades na diagonal superior esquerda
            i = linha - 1;
            j = coluna - 1;
            flag = false;
            while (estadoAtual.getTabuleiro()[i][j] == 1 && i >= 0 && j >= 0) {
                // enquanto tiver bolas pretas na diagonal superior esquerda e enquanto não estrapolar o vetor
                flag = true;
                i--;
                j--;
            }
            /* if (i < 0 || j < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas na diagonal superior esquerda
                if (estadoAtual.getTabuleiro()[i][j] == 2) {
                    // se na posição [i][j] tiver uma bola branca
                    i += 1;
                    j += 1;
                    flag2 = true;
                    while (i <= linha && j <= coluna) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[i][j] = 2;
                        i++;
                        j++;
                    }
                }
            }

            // verificando possibilidades na diagonal inferior esquerda
            i = linha + 1;
            j = coluna - 1;
            flag = false;
            while (estadoAtual.getTabuleiro()[i][j] == 1 && i < N && j >= 0) {
                // enquanto tiver bolas pretas na diagonal inferior esquerda e enquanto não estrapolar o vetor
                flag = true;
                i++;
                j--;
            }
            /* if (i >= N || j < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas na diagonal inferior esquerda
                if (estadoAtual.getTabuleiro()[i][j] == 2) {
                    // se na posição [i][j] tiver uma bola branca
                    i -= 1;
                    j += 1;
                    flag2 = true;
                    while (i >= linha && j <= coluna) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[i][j] = 2;
                        i--;
                        j++;
                    }
                }
            }

            // verificando possibilidades na diagonal superior direita
            i = linha - 1;
            j = coluna + 1;
            flag = false;
            while (estadoAtual.getTabuleiro()[i][j] == 1 && i >= 0 && j < N) {
                // enquanto tiver bolas pretas na diagonal superior direita e enquanto não estrapolar o vetor
                flag = true;
                i++;
                j--;
            }
            /* if (i < 0 || j >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
            if (flag) {
                // se tiver bolas pretas na diagonal superior direita
                if (estadoAtual.getTabuleiro()[i][j] == 2) {
                    // se na posição [i][j] tiver uma bola branca
                    i += 1;
                    j -= 1;
                    flag2 = true;
                    while (i <= linha && j >= coluna) {
                        // vai retornando até a posição vazia e setando as bolas para branco
                        matriz[i][j] = 2;
                        i++;
                        j--;
                    }
                }
            }

            if (flag2) {
                // se tiver encontrado alguma possibilidade
                retorno.setTabuleiro(matriz);
                retorno.setNivel(estadoAtual.getNivel() + 1);
                retorno.setMin(estadoAtual.isMax()); // se o nó pai for max, retornará true e o nó criado terá o min setado como true (vice-versa)
                retorno.setMax(estadoAtual.isMin()); // se o nó pai for min, retornará true e o nó criado terá o max setado como true (vice-versa)

                return retorno;
            }

            return null;
        }
        /*
        senão, verifica possibilidades para bola preta
        */
        // verificando possibilidades na horizontal à direita
        int i = coluna + 1;
        while (estadoAtual.getTabuleiro()[linha][i] == 2 && i < N) {
            // enquanto tiver bolas brancas à direta e enquanto não estrapolar o vetor
            flag = true;
            i++;
        }
        /* if (i >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas à direita
            if (estadoAtual.getTabuleiro()[linha][i] == 1) {
                // se na posição [i] tiver uma bola preta
                i -= 1;
                flag2 = true;
                while (i >= coluna) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[linha][i] = 1;
                    i--;
                }
            }
        }

        //verificando possibilidades na horizontal à esquerda
        i = coluna - 1;
        flag = false;
        while (estadoAtual.getTabuleiro()[linha][i] == 2 && i >= 0) {
            // enquanto tiver bolas brancas à esquerda e enquanto não estrapolar o vetor
            flag = true;
            i--;
        }
        /* if (i < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas à esquerda
            if (estadoAtual.getTabuleiro()[linha][i] == 1) {
                // se na posição [i] tiver uma bola preta
                i += 1;
                flag2 = true;
                while (i <= coluna) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[linha][i] = 1;
                    i++;
                }
            }
        }

        // verificando possibilidades na vertical acima
        i = linha - 1;
        flag = false;
        while (estadoAtual.getTabuleiro()[i][coluna] == 2 && i >= 0) {
            // enquanto tiver bolas brancas acima e enquanto não estrapolar o vetor
            flag = true;
            i--;
        }
        /* if (i < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas acima
            if (estadoAtual.getTabuleiro()[i][coluna] == 1) {
                // se na posição [i] tiver uma bola preta
                i += 1;
                flag2 = true;
                while (i <= linha) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[i][coluna] = 1;
                    i++;
                }
            }
        }

        // verificando possibilidades na vertical abaixo
        i = linha + 1;
        flag = false;
        while (estadoAtual.getTabuleiro()[i][coluna] == 2 && i < N) {
            // enquanto tiver bolas brancas abaixo e enquanto não estrapolar o vetor
            flag = true;
            i++;
        }
        /* if (i >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas abaixo
            if (estadoAtual.getTabuleiro()[i][coluna] == 1) {
                // se na posição [i] tiver uma bola preta
                i -= 1;
                flag2 = true;
                while (i >= linha) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[i][coluna] = 1;
                    i--;
                }
            }
        }

        // verificando possibilidades na diagonal inferior direita
        i = linha + 1;
        int j = coluna + 1;
        flag = false;
        while (estadoAtual.getTabuleiro()[i][j] == 2 && i < N && j < N) {
            // enquanto tiver bolas brancas na diagonal inferior direita e enquanto não estrapolar o vetor
            flag = true;
            i++;
            j++;
        }
        /* if (i >= N || j >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas na diagonal inferior direita
            if (estadoAtual.getTabuleiro()[i][j] == 1) {
                // se na posição [i][j] tiver uma bola preta
                i -= 1;
                j -= 1;
                flag2 = true;
                while (i >= linha && j >= coluna) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[i][j] = 1;
                    i--;
                    j--;
                }
            }
        }

        // verificando possibilidades na diagonal superior esquerda
        i = linha - 1;
        j = coluna - 1;
        flag = false;
        while (estadoAtual.getTabuleiro()[i][j] == 2 && i >= 0 && j >= 0) {
            // enquanto tiver bolas brancas na diagonal superior esquerda e enquanto não estrapolar o vetor
            flag = true;
            i--;
            j--;
        }
        /* if (i < 0 || j < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas na diagonal superior esquerda
            if (estadoAtual.getTabuleiro()[i][j] == 1) {
                // se na posição [i][j] tiver uma bola preta
                i += 1;
                j += 1;
                flag2 = true;
                while (i <= linha && j <= coluna) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[i][j] = 1;
                    i++;
                    j++;
                }
            }
        }

        // verificando possibilidades na diagonal inferior esquerda
        i = linha + 1;
        j = coluna - 1;
        flag = false;
        while (estadoAtual.getTabuleiro()[i][j] == 2 && i < N && j >= 0) {
            // enquanto tiver bolas brancas na diagonal inferior esquerda e enquanto não estrapolar o vetor
            flag = true;
            i++;
            j--;
        }
        /* if (i >= N || j < 0) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas na diagonal inferior esquerda
            if (estadoAtual.getTabuleiro()[i][j] == 1) {
                // se na posição [i][j] tiver uma bola preta
                i -= 1;
                j += 1;
                flag2 = true;
                while (i >= linha && j <= coluna) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[i][j] = 1;
                    i--;
                    j++;
                }
            }
        }

        // verificando possibilidades na diagonal superior direita
        i = linha - 1;
        j = coluna + 1;
        flag = false;
        while (estadoAtual.getTabuleiro()[i][j] == 2 && i >= 0 && j < N) {
            // enquanto tiver bolas brancas na diagonal superior direita e enquanto não estrapolar o vetor
            flag = true;
            i++;
            j--;
        }
        /* if (i < 0 || j >= N) {
                // se estrapolar o vetor (provavelmente nunca vai entrar)
                flag = false;
            } else */
        if (flag) {
            // se tiver bolas brancas na diagonal superior direita
            if (estadoAtual.getTabuleiro()[i][j] == 1) {
                // se na posição [i][j] tiver uma bola preta
                i += 1;
                j -= 1;
                flag2 = true;
                while (i <= linha && j >= coluna) {
                    // vai retornando até a posição vazia e setando as bolas para preto
                    matriz[i][j] = 1;
                    i++;
                    j--;
                }
            }
        }

        if (flag2) {
            // se tiver encontrado alguma possibilidade
            retorno.setTabuleiro(matriz);
            retorno.setNivel(estadoAtual.getNivel() + 1);
            retorno.setMin(estadoAtual.isMax()); // se o nó pai for max, retornará true e o nó criado terá o min setado como true (vice-versa)
            retorno.setMax(estadoAtual.isMin()); // se o nó pai for min, retornará true e o nó criado terá o max setado como true (vice-versa)

            return retorno;
        }

        return null;

    }

}
