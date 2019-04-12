package ia.minimax.reversi.controller;

import ia.minimax.reversi.model.Estado;

public class ControllerEstado {

    static int n = 8;
    static int matrizEstado[][] = new int[n][n]; // 1 para preto 2 para branco e 0 para vazio

    public static void inicializarMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizEstado[i][j] = 0;
            }
        }
        matrizEstado[3][3] = 2;
        matrizEstado[4][3] = 1;
        matrizEstado[3][4] = 1;
        matrizEstado[4][4] = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizEstado[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

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
    }


public void gerarFilhos(Estado raiz) {

    }

    public boolean ehEstadoFinal(Estado e) {

        return true;
    }

}
