package visao;

import controle.Controle;

/**
 *
 * @author Vinicius
 */
public class SenhaAtualGUI extends javax.swing.JFrame {

    private Controle controle;

    public SenhaAtualGUI(Controle controle) {
        initComponents();
        this.controle = controle;
        iniciarTela();

    }

    public void iniciarTela() {
        
        if (!controle.getSenhasPassadas().isEmpty()) {
            jLabelsenhaAtual.setText(controle.getSenhasPassadas().get(controle.getSenhasPassadas().size() - 1).getId());
        }
        if (controle.getSenhasPassadas().size() >= 2) {
            jLabelUltima1.setText(controle.getSenhasPassadas().get(controle.getSenhasPassadas().size() - 2).getId());
        }
        if (controle.getSenhasPassadas().size() >= 3) {
            jLabelUltima2.setText(controle.getSenhasPassadas().get(controle.getSenhasPassadas().size() - 3).getId());
        }
        if (controle.getSenhasPassadas().size() >= 4) {
            jLabelUltima3.setText(controle.getSenhasPassadas().get(controle.getSenhasPassadas().size() - 4).getId());
        }
        if (controle.getSenhasPassadas().size() >= 5) {
            jLabelUltima4.setText(controle.getSenhasPassadas().get(controle.getSenhasPassadas().size() - 5).getId());
        }
        if (controle.getSenhasPassadas().size() >= 6) {
            jLabelUltima5.setText(controle.getSenhasPassadas().get(controle.getSenhasPassadas().size() - 6).getId());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelsenhaAtual = new javax.swing.JLabel();
        jButtonChamar = new javax.swing.JButton();
        jButtonRetirar = new javax.swing.JButton();
        jLabelUltima2 = new javax.swing.JLabel();
        jLabelUltima4 = new javax.swing.JLabel();
        jLabelUltima3 = new javax.swing.JLabel();
        jLabelUltima1 = new javax.swing.JLabel();
        jLabelUltima5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabelsenhaAtual.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabelsenhaAtual.setText("00");
        jLabelsenhaAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonChamar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonChamar.setText("Tela de chamada");
        jButtonChamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChamarActionPerformed(evt);
            }
        });

        jButtonRetirar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonRetirar.setText("Tela de retirada");
        jButtonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarActionPerformed(evt);
            }
        });

        jLabelUltima2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelUltima2.setText("00");
        jLabelUltima2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelUltima4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelUltima4.setText("00");
        jLabelUltima4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelUltima3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelUltima3.setText("00");
        jLabelUltima3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelUltima1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelUltima1.setText("00");
        jLabelUltima1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelUltima5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelUltima5.setText("00");
        jLabelUltima5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ÚLTIMAS SENHAS CHAMADAS:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SENHA ATUAL:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("SENHAS CHAMADAS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/download.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("developed by Vinicius / Lucas/ Denes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84)
                        .addComponent(jLabelsenhaAtual))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel3)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabelUltima1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelUltima2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelUltima3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonRetirar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonChamar))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelUltima4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelUltima5))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelsenhaAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUltima1)
                    .addComponent(jLabelUltima2)
                    .addComponent(jLabelUltima3)
                    .addComponent(jLabelUltima4)
                    .addComponent(jLabelUltima5)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChamar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChamarActionPerformed
        // TODO add your handling code here:
        controle.abrirTelaChamarCliente();
        controle.fecharTelaSenhaAtual();
    }//GEN-LAST:event_jButtonChamarActionPerformed

    private void jButtonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarActionPerformed
        // TODO add your handling code here:
        controle.abrirTelaDistribuirSenha();
        controle.fecharTelaSenhaAtual();
    }//GEN-LAST:event_jButtonRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChamar;
    private javax.swing.JButton jButtonRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelUltima1;
    private javax.swing.JLabel jLabelUltima2;
    private javax.swing.JLabel jLabelUltima3;
    private javax.swing.JLabel jLabelUltima4;
    private javax.swing.JLabel jLabelUltima5;
    private javax.swing.JLabel jLabelsenhaAtual;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
