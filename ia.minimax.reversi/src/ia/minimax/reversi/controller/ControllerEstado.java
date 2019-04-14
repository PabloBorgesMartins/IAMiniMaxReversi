package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;
import ia.minimax.reversi.model.Posicao;
import ia.minimax.reversi.view.Interface;
import java.util.ArrayList;

public class ControllerEstado {
    public boolean jogo = true;
    public int teclaSelecionada;
    public static final int CASA_VAZIA = 0; // Representa uma casa vazia do tabuleiro do jogo
    public static final int JOGADOR = 1; //Inteiro para identificar o jogador
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
    
    public void setarInterface(Estado raiz, Interface i){
        
        ArrayList<Posicao> jogadas = new ArrayList<>();
        int vez = JOGADOR;
        
        while(jogo){  
            
            if(vez == JOGADOR){   // Se for a vez do humano
                jogadas.addAll(procuraBotoesPossiveis(JOGADOR, IA, raiz));   //Gera as posicoes na qual o humano pode jogar
                int j = 0, flag=0;
                //laço pra percorrer o array jogadas e habilitar o botao referente a cada jogada
                while(j < jogadas.size() && flag == 0) {   
                    if (jogadas.get(j).transformaBotao() == i.getBotaoPressionado()) { //Se o botao pressionado for uma casa jogavel
                        matrizEstado[jogadas.get(j).getPosicaoX()][jogadas.get(j).getPosicaoY()] = 1;
                        raiz.setTabuleiro(matrizEstado);
                        //i. // Atualiza toda a matriz com valores de peças corretos 
                        flag=1;
                    }
                }
                jogadas.clear(); //limpa a array de jogadas que ele havia achado para a ocasiao
                vez = IA;
            }else{    //Se for a vez da IA
                
                  
                
                vez = JOGADOR;
            }   
        }
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
                    if (filho != null){
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
    
    
    /*
    // Funcao que busca lugares onde possa ser feito uma jogada
    */
    private ArrayList<Posicao> procuraBotoesPossiveis(int jogadorAtual, int oponente, Estado estadoAtual){ 
        ArrayList<Posicao> posicoes = new ArrayList<>();
        
        for(int i=0;i<8;++i){
            for(int j=0;j<8;++j){
                if(estadoAtual.getTabuleiro()[i][j] == oponente){
                    int I = i, J = j;  
                    if(i-1>=0 && j-1>=0 && estadoAtual.getTabuleiro()[i-1][j-1] == 0){ 
                        i = i+1; j = j+1;
                        while(i<7 && j<7 && estadoAtual.getTabuleiro()[i][j] == oponente){i++;j++;}
                        if(i<=7 && j<=7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){
                            posicoes.add(new Posicao(I-1, J-1));
                        }
                    } 
                    i=I;j=J;
                    if(i-1>=0 && estadoAtual.getTabuleiro()[i-1][j] == 0){
                        i = i+1;
                        while(i<7 && estadoAtual.getTabuleiro()[i][j] == oponente) i++;
                        if(i<=7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){     
                            posicoes.add(new Posicao(I-1, J));
                        }
                    } 
                    i=I;
                    if(i-1>=0 && j+1<=7 && estadoAtual.getTabuleiro()[i-1][j+1] == 0){
                        i = i+1; j = j-1;
                        while(i<7 && j>0 && estadoAtual.getTabuleiro()[i][j] == oponente){i++;j--;}
                        if(i<=7 && j>=0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){
                            posicoes.add(new Posicao(I-1, J+1));
                        }
                    }  
                    i=I;j=J;
                    if(j-1>=0 && estadoAtual.getTabuleiro()[i][j-1] == 0){
                        j = j+1;
                        while(j<7 && estadoAtual.getTabuleiro()[i][j] == oponente)j++;
                        if(j<=7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){
                            posicoes.add(new Posicao(I, J-1));
                        }
                    }
                    j=J;
                    if(j+1<=7 && estadoAtual.getTabuleiro()[i][j+1] == 0){
                        j=j-1;
                        while(j>0 && estadoAtual.getTabuleiro()[i][j] == oponente)j--;
                        if(j>=0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){
                            posicoes.add(new Posicao(I, J+1));
                        }
                    }
                    j=J;
                    if(i+1<=7 && j-1>=0 && estadoAtual.getTabuleiro()[i+1][j-1] == 0){
                        i=i-1;j=j+1;
                        while(i>0 && j<7 && estadoAtual.getTabuleiro()[i][j] == oponente){i--;j++;}
                        if(i>=0 && j<=7 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){
                            posicoes.add(new Posicao(I+1, J-1));
                        }
                    }
                    i=I;j=J;
                    if(i+1 <= 7 && estadoAtual.getTabuleiro()[i+1][j] == 0){
                        i=i-1;
                        while(i>0 && estadoAtual.getTabuleiro()[i][j] == oponente) i--;
                        if(i>=0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){
                            posicoes.add(new Posicao(I+1, J));
                        }
                    }
                    i=I;
                    if(i+1 <= 7 && j+1 <=7 && estadoAtual.getTabuleiro()[i+1][j+1] == 0){
                        i=i-1;j=j-1;
                        while(i>0 && j>0 && estadoAtual.getTabuleiro()[i][j] == oponente){i--;j--;}
                        if(i>=0 && j>=0 && estadoAtual.getTabuleiro()[i][j] == jogadorAtual){
                            posicoes.add(new Posicao(I+1, J+1));
                        }
                    }
                    i=I;j=J;
                    }
                } 
            } 
        return posicoes;
    }
    
    
    
    // 1 - preto; 2 - branco; 0 - vazio
    public Estado verificarPossibilidades(Estado e, int posicao) {
        Estado retorno = new Estado();
        int n = 8;
        int[][] matriz = new int[n][n];
        int contador = 0;
        int linha = posicao/n;
        int coluna = posicao%n;
        
        // setando a matriz com posições vazias
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = 0;
            }
        }
        
        if (e.isMax()) {
            // verifica possibilidades para bola branca
            int i = 1;
            // verificando possibilidades na horizontal à direita
            while (e.getTabuleiro()[linha][coluna+i] == 1 && (coluna+i) < 4){
                contador++;
                i++;
            }
            if (contador != 0 && (coluna+i) >= 4){
                // estrapolou o vetor
                contador = 0;
            }
            else if (contador != 0){
                i -= 1;
                while ((coluna+i) >= coluna){
                    // setando posições à direita com bolas brancas
                    matriz[linha][coluna+i] = 2;
                    i--;
                }
            }
            
            i = 1;
            contador = 0;
            // verificando possibilidades na horizontal à esquerda
            while (e.getTabuleiro()[linha][coluna-i] == 1 && (coluna-1) >= 0){
                contador++;
                i++;
            }
            if (contador != 0 && (coluna+i) < 0){
                // estrapolou o vetor
                contador = 0;
            } else if (contador != 0){
                i -= 1;
                while ((coluna-i) <= coluna){
                    // setando posições à esquerda com bolas brancas
                    matriz[linha][coluna-1] = 2;
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