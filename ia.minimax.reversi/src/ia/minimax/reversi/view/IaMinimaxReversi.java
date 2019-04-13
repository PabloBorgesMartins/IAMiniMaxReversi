package ia.minimax.reversi.view;

import ia.minimax.reversi.model.Arvore;
import ia.minimax.reversi.model.Estado;

/**
 *
 * @author Waislan Sanches
 */
public class IaMinimaxReversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tabuleiro = new int[4][4];
        
        // preenchendo o tabuleiro
        // 1 - preto; 2 - branco; 0 - vazio
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                tabuleiro[i][j] = 0;
            }
        } 
        tabuleiro[1][1] = 2;
        tabuleiro[1][2] = 1;
        tabuleiro[2][1] = 1;
        tabuleiro[2][2] = 2;
        
        Estado raiz = new Estado(tabuleiro, 0, false, true);
        Arvore a = new Arvore(raiz);
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("["+i+"]["+j+"]: " + a.getRaiz().getTabuleiro()[i][j]);
            }
        }
        
    }
    
    
}
