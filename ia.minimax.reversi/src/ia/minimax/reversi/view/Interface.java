package ia.minimax.reversi.view;

import ia.minimax.reversi.controller.ControllerEstado;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Interface extends javax.swing.JFrame {

    private int botaoPressionado;
    private static final Color JOGADORCOR = Color.BLACK;
    private static final Color IACOR = Color.WHITE;
    private static final Color COR_CASA_VAZIA = Color.GREEN;

    public Interface() {
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

    public void dificuldadeSelecionada(int dificuldade){
        ControllerEstado controleEstado = new ControllerEstado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botao7 = new javax.swing.JButton();
        botao15 = new javax.swing.JButton();
        botao23 = new javax.swing.JButton();
        botao31 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao30 = new javax.swing.JButton();
        botao22 = new javax.swing.JButton();
        botao14 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao28 = new javax.swing.JButton();
        botao20 = new javax.swing.JButton();
        botao12 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao13 = new javax.swing.JButton();
        botao21 = new javax.swing.JButton();
        botao29 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao16 = new javax.swing.JButton();
        botao24 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao17 = new javax.swing.JButton();
        botao25 = new javax.swing.JButton();
        botao26 = new javax.swing.JButton();
        botao18 = new javax.swing.JButton();
        botao10 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao11 = new javax.swing.JButton();
        botao19 = new javax.swing.JButton();
        botao27 = new javax.swing.JButton();
        botao63 = new javax.swing.JButton();
        botao55 = new javax.swing.JButton();
        botao47 = new javax.swing.JButton();
        botao39 = new javax.swing.JButton();
        botao38 = new javax.swing.JButton();
        botao46 = new javax.swing.JButton();
        botao54 = new javax.swing.JButton();
        botao61 = new javax.swing.JButton();
        botao62 = new javax.swing.JButton();
        botao53 = new javax.swing.JButton();
        botao45 = new javax.swing.JButton();
        botao37 = new javax.swing.JButton();
        botao36 = new javax.swing.JButton();
        botao44 = new javax.swing.JButton();
        botao52 = new javax.swing.JButton();
        botao60 = new javax.swing.JButton();
        botao59 = new javax.swing.JButton();
        botao51 = new javax.swing.JButton();
        botao43 = new javax.swing.JButton();
        botao35 = new javax.swing.JButton();
        botao34 = new javax.swing.JButton();
        botao42 = new javax.swing.JButton();
        botao50 = new javax.swing.JButton();
        botao58 = new javax.swing.JButton();
        botao57 = new javax.swing.JButton();
        botao49 = new javax.swing.JButton();
        botao41 = new javax.swing.JButton();
        botao33 = new javax.swing.JButton();
        botao32 = new javax.swing.JButton();
        botao40 = new javax.swing.JButton();
        botao48 = new javax.swing.JButton();
        botao56 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reversi");
        setIconImage( new ImageIcon(getClass().getResource("/ia/minimax/reversi/img/icone_reversi.png")).
            getImage());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reversi");

        botao7.setBackground(new java.awt.Color(0, 102, 0));
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao15.setBackground(new java.awt.Color(0, 102, 0));
        botao15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao15ActionPerformed(evt);
            }
        });

        botao23.setBackground(new java.awt.Color(0, 102, 0));
        botao23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao23ActionPerformed(evt);
            }
        });

        botao31.setBackground(new java.awt.Color(0, 102, 0));
        botao31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao31ActionPerformed(evt);
            }
        });

        botao6.setBackground(new java.awt.Color(0, 102, 0));
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao30.setBackground(new java.awt.Color(0, 102, 0));
        botao30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao30ActionPerformed(evt);
            }
        });

        botao22.setBackground(new java.awt.Color(0, 102, 0));
        botao22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao22ActionPerformed(evt);
            }
        });

        botao14.setBackground(new java.awt.Color(0, 102, 0));
        botao14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao14ActionPerformed(evt);
            }
        });

        botao4.setBackground(new java.awt.Color(0, 102, 0));
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao28.setBackground(new java.awt.Color(0, 0, 0));
        botao28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao28ActionPerformed(evt);
            }
        });

        botao20.setBackground(new java.awt.Color(0, 102, 0));
        botao20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao20ActionPerformed(evt);
            }
        });

        botao12.setBackground(new java.awt.Color(0, 102, 0));
        botao12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao12ActionPerformed(evt);
            }
        });

        botao5.setBackground(new java.awt.Color(0, 102, 0));
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao13.setBackground(new java.awt.Color(0, 102, 0));
        botao13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao13ActionPerformed(evt);
            }
        });

        botao21.setBackground(new java.awt.Color(0, 102, 0));
        botao21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao21ActionPerformed(evt);
            }
        });

        botao29.setBackground(new java.awt.Color(0, 102, 0));
        botao29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao29ActionPerformed(evt);
            }
        });

        botao0.setBackground(new java.awt.Color(0, 102, 0));
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao8.setBackground(new java.awt.Color(0, 102, 0));
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao16.setBackground(new java.awt.Color(0, 102, 0));
        botao16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao16ActionPerformed(evt);
            }
        });

        botao24.setBackground(new java.awt.Color(0, 102, 0));
        botao24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao24ActionPerformed(evt);
            }
        });

        botao1.setBackground(new java.awt.Color(0, 102, 0));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao9.setBackground(new java.awt.Color(0, 102, 0));
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao17.setBackground(new java.awt.Color(0, 102, 0));
        botao17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao17ActionPerformed(evt);
            }
        });

        botao25.setBackground(new java.awt.Color(0, 102, 0));
        botao25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao25ActionPerformed(evt);
            }
        });

        botao26.setBackground(new java.awt.Color(0, 102, 0));
        botao26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao26ActionPerformed(evt);
            }
        });

        botao18.setBackground(new java.awt.Color(0, 102, 0));
        botao18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao18ActionPerformed(evt);
            }
        });

        botao10.setBackground(new java.awt.Color(0, 102, 0));
        botao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao10ActionPerformed(evt);
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

        botao11.setBackground(new java.awt.Color(0, 102, 0));
        botao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao11ActionPerformed(evt);
            }
        });

        botao19.setBackground(new java.awt.Color(0, 102, 0));
        botao19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao19ActionPerformed(evt);
            }
        });

        botao27.setBackground(new java.awt.Color(255, 255, 255));
        botao27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao27ActionPerformed(evt);
            }
        });

        botao63.setBackground(new java.awt.Color(0, 102, 0));
        botao63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao63ActionPerformed(evt);
            }
        });

        botao55.setBackground(new java.awt.Color(0, 102, 0));
        botao55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao55ActionPerformed(evt);
            }
        });

        botao47.setBackground(new java.awt.Color(0, 102, 0));
        botao47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao47ActionPerformed(evt);
            }
        });

        botao39.setBackground(new java.awt.Color(0, 102, 0));
        botao39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao39ActionPerformed(evt);
            }
        });

        botao38.setBackground(new java.awt.Color(0, 102, 0));
        botao38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao38ActionPerformed(evt);
            }
        });

        botao46.setBackground(new java.awt.Color(0, 102, 0));
        botao46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao46ActionPerformed(evt);
            }
        });

        botao54.setBackground(new java.awt.Color(0, 102, 0));
        botao54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao54ActionPerformed(evt);
            }
        });

        botao61.setBackground(new java.awt.Color(0, 102, 0));
        botao61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao61ActionPerformed(evt);
            }
        });

        botao62.setBackground(new java.awt.Color(0, 102, 0));
        botao62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao62ActionPerformed(evt);
            }
        });

        botao53.setBackground(new java.awt.Color(0, 102, 0));
        botao53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao53ActionPerformed(evt);
            }
        });

        botao45.setBackground(new java.awt.Color(0, 102, 0));
        botao45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao45ActionPerformed(evt);
            }
        });

        botao37.setBackground(new java.awt.Color(0, 102, 0));
        botao37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao37ActionPerformed(evt);
            }
        });

        botao36.setBackground(new java.awt.Color(255, 255, 255));
        botao36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao36ActionPerformed(evt);
            }
        });

        botao44.setBackground(new java.awt.Color(0, 102, 0));
        botao44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao44ActionPerformed(evt);
            }
        });

        botao52.setBackground(new java.awt.Color(0, 102, 0));
        botao52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao52ActionPerformed(evt);
            }
        });

        botao60.setBackground(new java.awt.Color(0, 102, 0));
        botao60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao60ActionPerformed(evt);
            }
        });

        botao59.setBackground(new java.awt.Color(0, 102, 0));
        botao59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao59ActionPerformed(evt);
            }
        });

        botao51.setBackground(new java.awt.Color(0, 102, 0));
        botao51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao51ActionPerformed(evt);
            }
        });

        botao43.setBackground(new java.awt.Color(0, 102, 0));
        botao43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao43ActionPerformed(evt);
            }
        });

        botao35.setBackground(new java.awt.Color(0, 0, 0));
        botao35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao35ActionPerformed(evt);
            }
        });

        botao34.setBackground(new java.awt.Color(0, 102, 0));
        botao34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao34ActionPerformed(evt);
            }
        });

        botao42.setBackground(new java.awt.Color(0, 102, 0));
        botao42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao42ActionPerformed(evt);
            }
        });

        botao50.setBackground(new java.awt.Color(0, 102, 0));
        botao50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao50ActionPerformed(evt);
            }
        });

        botao58.setBackground(new java.awt.Color(0, 102, 0));
        botao58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao58ActionPerformed(evt);
            }
        });

        botao57.setBackground(new java.awt.Color(0, 102, 0));
        botao57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao57ActionPerformed(evt);
            }
        });

        botao49.setBackground(new java.awt.Color(0, 102, 0));
        botao49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao49ActionPerformed(evt);
            }
        });

        botao41.setBackground(new java.awt.Color(0, 102, 0));
        botao41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao41ActionPerformed(evt);
            }
        });

        botao33.setBackground(new java.awt.Color(0, 102, 0));
        botao33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao33ActionPerformed(evt);
            }
        });

        botao32.setBackground(new java.awt.Color(0, 102, 0));
        botao32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao32ActionPerformed(evt);
            }
        });

        botao40.setBackground(new java.awt.Color(0, 102, 0));
        botao40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao40ActionPerformed(evt);
            }
        });

        botao48.setBackground(new java.awt.Color(0, 102, 0));
        botao48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao48ActionPerformed(evt);
            }
        });

        botao56.setBackground(new java.awt.Color(0, 102, 0));
        botao56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao56ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao56, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao57, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao59, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botao39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao63, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao0.getAccessibleContext().setAccessibleName("botao0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Humano");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("2");

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
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Máquina");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("2");

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
                        .addComponent(jLabel5)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(782, 715));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        int n = 7, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 7;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao15ActionPerformed
        int n = 15, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 15;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao15ActionPerformed

    private void botao23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao23ActionPerformed
        int n = 23, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 23;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao23ActionPerformed

    private void botao31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao31ActionPerformed
        int n = 31, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 31;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao31ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        int n = 6, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 6;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao30ActionPerformed
        int n = 30, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 30;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao30ActionPerformed

    private void botao22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao22ActionPerformed
        int n = 22, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 22;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao22ActionPerformed

    private void botao14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao14ActionPerformed
        int n = 14, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 14;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao14ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        int n = 4, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 4;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao28ActionPerformed
        int n = 28, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 28;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao28ActionPerformed

    private void botao20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao20ActionPerformed
        int n = 20, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 20;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao20ActionPerformed

    private void botao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao12ActionPerformed
        int n = 12, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 12;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao12ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        int n = 5, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 5;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao13ActionPerformed
        int n = 13, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 13;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao13ActionPerformed

    private void botao21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao21ActionPerformed
        int n = 21, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 21;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao21ActionPerformed

    private void botao29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao29ActionPerformed
        int n = 29, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 29;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao29ActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        int n = 0, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 0;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao0ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        int n = 8, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 8;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao16ActionPerformed
        int n = 16, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 16;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao16ActionPerformed

    private void botao24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao24ActionPerformed
        int n = 24, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 24;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao24ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        int n = 1, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 1;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        int n = 9, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 9;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao17ActionPerformed
        int n = 17, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 17;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao17ActionPerformed

    private void botao25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao25ActionPerformed
        int n = 25, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 25;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao25ActionPerformed

    private void botao26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao26ActionPerformed
        int n = 26, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 26;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao26ActionPerformed

    private void botao18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao18ActionPerformed
        int n = 18, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 18;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao18ActionPerformed

    private void botao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao10ActionPerformed
        int n = 10, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 10;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao10ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        int n = 2, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 2;
        System.out.println("Linha " + linha + " Coluna " + coluna);
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        int n = 3, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 3;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao3ActionPerformed

    private void botao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao11ActionPerformed
        int n = 11, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 11;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao11ActionPerformed

    private void botao19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao19ActionPerformed
        int n = 19, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 19;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao19ActionPerformed

    private void botao27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao27ActionPerformed
        int n = 27, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 27;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao27ActionPerformed

    private void botao63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao63ActionPerformed
        int n = 63, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 63;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao63ActionPerformed

    private void botao55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao55ActionPerformed
        int n = 55, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 55;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao55ActionPerformed

    private void botao47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao47ActionPerformed
        int n = 47, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 47;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao47ActionPerformed

    private void botao39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao39ActionPerformed
        int n = 39, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 39;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao39ActionPerformed

    private void botao38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao38ActionPerformed
        int n = 38, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 38;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao38ActionPerformed

    private void botao46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao46ActionPerformed
        int n = 46, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 46;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao46ActionPerformed

    private void botao54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao54ActionPerformed
        int n = 54, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 54;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao54ActionPerformed

    private void botao61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao61ActionPerformed
        int n = 61, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 61;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao61ActionPerformed

    private void botao62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao62ActionPerformed
        int n = 62, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 62;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao62ActionPerformed

    private void botao53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao53ActionPerformed
        int n = 53, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 53;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao53ActionPerformed

    private void botao45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao45ActionPerformed
        int n = 45, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 45;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao45ActionPerformed

    private void botao37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao37ActionPerformed
        int n = 37, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 37;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao37ActionPerformed

    private void botao36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao36ActionPerformed
        int n = 36, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 36;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao36ActionPerformed

    private void botao44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao44ActionPerformed
        int n = 44, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 44;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao44ActionPerformed

    private void botao52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao52ActionPerformed
        int n = 52, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 52;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao52ActionPerformed

    private void botao60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao60ActionPerformed
        int n = 60, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 60;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao60ActionPerformed

    private void botao59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao59ActionPerformed
        int n = 59, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 59;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao59ActionPerformed

    private void botao51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao51ActionPerformed
        int n = 51, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 51;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao51ActionPerformed

    private void botao43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao43ActionPerformed
        int n = 43, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 43;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao43ActionPerformed

    private void botao35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao35ActionPerformed
        int n = 35, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 35;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao35ActionPerformed

    private void botao34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao34ActionPerformed
        int n = 34, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 34;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao34ActionPerformed

    private void botao42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao42ActionPerformed
        int n = 42, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 42;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao42ActionPerformed

    private void botao50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao50ActionPerformed
        int n = 50, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 50;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao50ActionPerformed

    private void botao58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao58ActionPerformed
        int n = 58, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 58;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao58ActionPerformed

    private void botao57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao57ActionPerformed
        int n = 57, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 57;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao57ActionPerformed

    private void botao49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao49ActionPerformed
        int n = 49, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 49;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao49ActionPerformed

    private void botao41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao41ActionPerformed
        int n = 41, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 41;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao41ActionPerformed

    private void botao33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao33ActionPerformed
        int n = 33, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 33;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao33ActionPerformed

    private void botao32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao32ActionPerformed
        int n = 32, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 32;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao32ActionPerformed

    private void botao40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao40ActionPerformed
        int n = 40, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 40;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao40ActionPerformed

    private void botao48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao48ActionPerformed
        int n = 48, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 48;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao48ActionPerformed

    private void botao56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao56ActionPerformed
        int n = 56, linha, coluna = 0;
        linha = n / 8;
        coluna = n % 8;
        botaoPressionado = 56;
        System.out.println("Linha " + linha + " Coluna " + coluna);    }//GEN-LAST:event_botao56ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botao0;
    public javax.swing.JButton botao1;
    public javax.swing.JButton botao10;
    public javax.swing.JButton botao11;
    public javax.swing.JButton botao12;
    public javax.swing.JButton botao13;
    public javax.swing.JButton botao14;
    public javax.swing.JButton botao15;
    public javax.swing.JButton botao16;
    public javax.swing.JButton botao17;
    public javax.swing.JButton botao18;
    public javax.swing.JButton botao19;
    public javax.swing.JButton botao2;
    public javax.swing.JButton botao20;
    public javax.swing.JButton botao21;
    public javax.swing.JButton botao22;
    public javax.swing.JButton botao23;
    public javax.swing.JButton botao24;
    public javax.swing.JButton botao25;
    public javax.swing.JButton botao26;
    public javax.swing.JButton botao27;
    public javax.swing.JButton botao28;
    public javax.swing.JButton botao29;
    public javax.swing.JButton botao3;
    public javax.swing.JButton botao30;
    public javax.swing.JButton botao31;
    public javax.swing.JButton botao32;
    public javax.swing.JButton botao33;
    public javax.swing.JButton botao34;
    public javax.swing.JButton botao35;
    public javax.swing.JButton botao36;
    public javax.swing.JButton botao37;
    public javax.swing.JButton botao38;
    public javax.swing.JButton botao39;
    public javax.swing.JButton botao4;
    public javax.swing.JButton botao40;
    public javax.swing.JButton botao41;
    public javax.swing.JButton botao42;
    public javax.swing.JButton botao43;
    public javax.swing.JButton botao44;
    public javax.swing.JButton botao45;
    public javax.swing.JButton botao46;
    public javax.swing.JButton botao47;
    public javax.swing.JButton botao48;
    public javax.swing.JButton botao49;
    public javax.swing.JButton botao5;
    public javax.swing.JButton botao50;
    public javax.swing.JButton botao51;
    public javax.swing.JButton botao52;
    public javax.swing.JButton botao53;
    public javax.swing.JButton botao54;
    public javax.swing.JButton botao55;
    public javax.swing.JButton botao56;
    public javax.swing.JButton botao57;
    public javax.swing.JButton botao58;
    public javax.swing.JButton botao59;
    public javax.swing.JButton botao6;
    public javax.swing.JButton botao60;
    public javax.swing.JButton botao61;
    public javax.swing.JButton botao62;
    public javax.swing.JButton botao63;
    public javax.swing.JButton botao7;
    public javax.swing.JButton botao8;
    public javax.swing.JButton botao9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
