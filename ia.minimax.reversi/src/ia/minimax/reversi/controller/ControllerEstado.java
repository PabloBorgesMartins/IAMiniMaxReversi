package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

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

    public static void main(String[] args) {
        ControllerEstado controllerEstado = new ControllerEstado();

        int[][] matriz = new int[8][8];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = 0;
            }
        }

        matriz[3][3] = IA;
        matriz[3][4] = JOGADOR;
        matriz[4][3] = JOGADOR;
        matriz[4][4] = IA;

        Estado raiz = new Estado();

        raiz.setTabuleiro(matriz);
        raiz.setMax(false);
        raiz.setMin(true);
        raiz.setNivel(0);

//        System.out.println("Nivel: " + raiz.getNivel());
//        System.out.println(raiz.toString());

        Queue<Estado> fila = new LinkedList<>();
        Queue<Estado> fila2 = new LinkedList<>();

        HashSet<String> estadosGerados = new HashSet<>();
        
        fila.addAll(controllerEstado.gerarArvore(raiz, estadosGerados));

        //System.out.println("Nivel: " + fila.element().getNivel());
//        for (Estado e : fila) {
//            System.out.println(e.toString());
//        }

        while (!fila.isEmpty()) {
            Estado estado = fila.remove();
            Queue<Estado> aux = controllerEstado.gerarArvore(estado, estadosGerados);
            if (aux != null) {
                fila2.addAll(aux);
                if (fila.isEmpty() && fila2 != null) {
                    System.out.println("Nivel " + fila2.element().getNivel());
//                    for (Estado e : fila2) {
//                        System.out.println(e.toString());
//                    }

                    fila.addAll(fila2);
                    fila2.clear();
                }
            }

        }

    }

    // 1 - preto; 2 - branco; 0 - vazio
    public Queue<Estado> gerarArvore(Estado raiz, HashSet<String> estadosGerados) {
        Queue<Estado> filhos = new LinkedList<>();
        int posicao;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (raiz.getTabuleiro()[i][j] == 0) {
                    posicao = i * N + j;
                    Estado filho = verificarPossibilidades(raiz, posicao);
                    //System.out.println("Adicionando filho " + filho.estadoEmStringDeUmaLinha());
                    if (filho != null && estadosGerados.add(filho.estadoEmStringDeUmaLinha())) {
                        filhos.add(filho);
                    }
                }
            }
        }

        if (!filhos.isEmpty()) {
            raiz.setFilhos(filhos);
            return filhos;
        }

        // se o array filhos estiver vazio, a raiz é um estado final
        return null;

    }

    public Estado verificarPossibilidades(Estado estadoAtual, int posicao) {

        Estado retorno = new Estado();
        int[][] matriz = new int[N][N];
        boolean flag = false;
        boolean flag2 = false;
        int linha = posicao / N;
        int coluna = posicao % N;

        // setando a matriz com a matriz do estado atual
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = estadoAtual.getTabuleiro()[i][j];
            }
        }

        if (estadoAtual.isMax()) {

            // verifica possibilidades para bola branca
            // verificando possibilidades na horizontal à direita
            int i = coluna + 1;
            while (i < N - 1 && estadoAtual.getTabuleiro()[linha][i] == 1) {
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
            while (i > 0 && estadoAtual.getTabuleiro()[linha][i] == 1) {
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
            while (i > 0 && estadoAtual.getTabuleiro()[i][coluna] == 1) {
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
            while (i < N - 1 && estadoAtual.getTabuleiro()[i][coluna] == 1) {
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
            while (j < N - 1 && i < N - 1 && estadoAtual.getTabuleiro()[i][j] == 1) {
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
            while (j > 0 && i > 0 && estadoAtual.getTabuleiro()[i][j] == 1) {
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
            while (j > 0 && i < N - 1 && estadoAtual.getTabuleiro()[i][j] == 1) {
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
            while (j < N - 1 && i > 0 && estadoAtual.getTabuleiro()[i][j] == 1) {
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
        while (i < N - 1 && estadoAtual.getTabuleiro()[linha][i] == 2) {
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
        //System.out.println(estadoAtual.toString());
        //System.out.println("Acessando posicao [" +linha+"]["+i+"]");
        while (i > 0 && estadoAtual.getTabuleiro()[linha][i] == 2) {
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
        while (i > 0 && estadoAtual.getTabuleiro()[i][coluna] == 2) {
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
        while (i < N - 1 && estadoAtual.getTabuleiro()[i][coluna] == 2) {
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
        while (i < N - 1 && j < N - 1 && estadoAtual.getTabuleiro()[i][j] == 2) {
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
        while (i > 0 && j > 0 && estadoAtual.getTabuleiro()[i][j] == 2) {
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
        while (i < N - 1 && j > 0 && estadoAtual.getTabuleiro()[i][j] == 2) {
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
        while (i > 0 && j < N - 1 && estadoAtual.getTabuleiro()[i][j] == 2) {
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
