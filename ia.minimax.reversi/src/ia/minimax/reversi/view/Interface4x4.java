package ia.minimax.reversi.view;

import ia.minimax.reversi.controller.ControllerEstado;
import ia.minimax.reversi.controller.ControllerInterface;
import ia.minimax.reversi.model.Estado;
import static ia.minimax.reversi.view.Interface.IA;
import static ia.minimax.reversi.view.Interface.JOGADOR;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Interface4x4 extends javax.swing.JFrame {

    private int botaoPressionado;
    private static final Color JOGADORCOR = Color.BLACK;
    private static final Color IACOR = Color.WHITE;
    private static final Color COR_CASA_VAZIA = Color.GREEN;
    private static final int QUATRO = 4;
    public Object lock = new Object();
    
    public Interface4x4() {
        initComponents();
    }
    
    public void pintaBotaoIA(JButton botao){
        botao.setBackground(IACOR);
    }
    
    public void pintaBotaoJOGADOR(JButton botao){
        botao.setBackground(JOGADORCOR);
    }
    
    public int getBotaoPressionado() {
        return botaoPressionado;
    }

    public void dificuldadeSelecionada (int dificuldade, Interface4x4 i){
        
        ControllerEstado controleEstado = new ControllerEstado();
        Estado estadoInicial = controleEstado.inicializarMatriz();
        /*
        System.out.println("o valor de X é: " + x);
        System.out.println("O valor do minimax raiz é : " + inicio.getMinimax());
        for (int j = 0; j < inicio.getFilhos().size(); j++) {
            System.out.println("minimax filho("+j+") = " + inicio.getFilho(j).getMinimax());
        }*/
        ControllerInterface controleInterface = new ControllerInterface();
        controleInterface.jogar(estadoInicial, i, dificuldade);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botao0 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao10 = new javax.swing.JButton();
        botao11 = new javax.swing.JButton();
        botao12 = new javax.swing.JButton();
        botao13 = new javax.swing.JButton();
        botao14 = new javax.swing.JButton();
        botao15 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        placarHumano = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        placarIA = new javax.swing.JLabel();
        vencedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reversi");
        setIconImage( new ImageIcon(getClass().getResource("/ia/minimax/reversi/img/icone_reversi.png")).
            getImage());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reversi");

        botao0.setBackground(new java.awt.Color(0, 102, 0));
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao1.setBackground(new java.awt.Color(0, 102, 0));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setBackground(new java.awt.Color(0, 102, 0));
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setBackground(new java.awt.Color(0, 102, 0));
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setBackground(new java.awt.Color(0, 102, 0));
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setBackground(new java.awt.Color(255, 255, 255));
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setBackground(new java.awt.Color(0, 0, 0));
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setBackground(new java.awt.Color(0, 102, 0));
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setBackground(new java.awt.Color(0, 102, 0));
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setBackground(new java.awt.Color(0, 0, 0));
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao10.setBackground(new java.awt.Color(255, 255, 255));
        botao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao10ActionPerformed(evt);
            }
        });

        botao11.setBackground(new java.awt.Color(0, 102, 0));
        botao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao11ActionPerformed(evt);
            }
        });

        botao12.setBackground(new java.awt.Color(0, 102, 0));
        botao12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao12ActionPerformed(evt);
            }
        });

        botao13.setBackground(new java.awt.Color(0, 102, 0));
        botao13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao13ActionPerformed(evt);
            }
        });

        botao14.setBackground(new java.awt.Color(0, 102, 0));
        botao14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao14ActionPerformed(evt);
            }
        });

        botao15.setBackground(new java.awt.Color(0, 102, 0));
        botao15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(botao12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botao8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botao12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        botao0.getAccessibleContext().setAccessibleName("botao0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Humano");

        placarHumano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        placarHumano.setText("2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(placarHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(placarHumano)
                .addGap(19, 19, 19))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Máquina");

        placarIA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        placarIA.setText("2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(placarIA)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(placarIA)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addComponent(vencedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(505, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        int n = 7, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 7;
        lock.notify();
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao15ActionPerformed
        int n = 15, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 15;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao15ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        int n = 6, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 6;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao14ActionPerformed
        int n = 14, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 14;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao14ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        int n = 4, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 4;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao12ActionPerformed
        int n = 12, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 12;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao12ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        int n = 5, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 5;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao13ActionPerformed
        int n = 13, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 13;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao13ActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        int n = 0, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 0;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao0ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        int n = 8, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 8;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        int n = 1, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 1;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        int n = 9, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 9;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao10ActionPerformed
        int n = 10, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 10;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao10ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        int n = 2, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 2;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        int n = 3, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 3;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao3ActionPerformed

    private void botao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao11ActionPerformed
        int n = 11, linha, coluna = 0;
        linha = n / QUATRO;
        coluna = n % QUATRO;
        botaoPressionado = 11;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao11ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botao0;
    public javax.swing.JButton botao1;
    public javax.swing.JButton botao10;
    public javax.swing.JButton botao11;
    public javax.swing.JButton botao12;
    public javax.swing.JButton botao13;
    public javax.swing.JButton botao14;
    public javax.swing.JButton botao15;
    public javax.swing.JButton botao2;
    public javax.swing.JButton botao3;
    public javax.swing.JButton botao4;
    public javax.swing.JButton botao5;
    public javax.swing.JButton botao6;
    public javax.swing.JButton botao7;
    public javax.swing.JButton botao8;
    public javax.swing.JButton botao9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel placarHumano;
    public javax.swing.JLabel placarIA;
    public javax.swing.JLabel vencedor;
    // End of variables declaration//GEN-END:variables
}
