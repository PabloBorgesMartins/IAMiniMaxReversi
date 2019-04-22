package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
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
        N = 4;
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
        matrizEstado[1][1] = IA;
        matrizEstado[1][2] = JOGADOR;
        matrizEstado[2][1] = JOGADOR;
        matrizEstado[2][2] = IA;
        /*
        // printando a matriz para conferir se está correta
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrizEstado[i][j] + " ");
            }
            System.out.println(" ");
        }
        */
        Estado raiz = new Estado(matrizEstado, 0, true, false);

        return raiz;
    }

    public static void main(String[] args) {
        ControllerEstado controllerEstado = new ControllerEstado();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = 0;
            }
        }

        matriz[1][1] = IA;
        matriz[1][2] = JOGADOR;
        matriz[2][1] = JOGADOR;
        matriz[2][2] = IA;

        Estado raiz = new Estado();

        raiz.setTabuleiro(matriz);
        raiz.setMax(false);
        raiz.setMin(true);
        raiz.setNivel(0);

//        System.out.println("Nivel: " + raiz.getNivel());
//        System.out.println(raiz.toString());

        int nivelDificuldade = 4;
        controllerEstado.gerarArvore (raiz, nivelDificuldade);

    }
       
    public int gerarArvore(Estado estado, int nivelDificuldade){
        ArrayList<Estado> filhos = new ArrayList<>();
        int posicao;
        
        if (estado.getNivel() == nivelDificuldade) {
            estado.setMinimax(calcularMiniMax(estado));
            return estado.getMinimax();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (estado.getTabuleiro()[i][j] == 0) {
                    // se a posição for vazia
                    posicao = i * N + j;
                    Estado filho = verificarPossibilidades(estado, posicao);
                    //System.out.println("Adicionando filho " + filho.estadoEmStringDeUmaLinha());
                    if (filho != null) {
                        filhos.add(filho);
                    }
                }
            }
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
            gerarArvore(filho, nivelDificuldade);
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

    public Estado verificarPossibilidades(Estado estadoAtual, int posicao) {

        Estado retorno = new Estado();
        int[][] matriz = new int[N][N];
        boolean flag = false;
        boolean flag2 = false;
        int linha = posicao / N;
        int coluna = posicao % N;

        // setando a matriz com a matriz do estado atual
        for (int i = 0; i < N; i++) {
            System.arraycopy(estadoAtual.getTabuleiro()[i], 0, matriz[i], 0, N);
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
