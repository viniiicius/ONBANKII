package visao;

import controle.Controle;
import javax.swing.JOptionPane;
import modelo.Senha;

/**
 *
 * @author Usuário
 */
public class ChamarClienteGUI extends javax.swing.JFrame {

    private Controle controle;

    public ChamarClienteGUI(Controle controle) {
        initComponents();
        this.controle = controle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSenhaAtual = new javax.swing.JButton();
        jButtonRetirar = new javax.swing.JButton();
        jButtonChamar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonSenhaAtual.setText("Tela Senha Atual");
        jButtonSenhaAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSenhaAtualActionPerformed(evt);
            }
        });

        jButtonRetirar.setText("Tela de retirada");
        jButtonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarActionPerformed(evt);
            }
        });

        jButtonChamar.setText("Chamar");
        jButtonChamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChamarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChamar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRetirar)
                        .addGap(112, 112, 112)
                        .addComponent(jButtonSenhaAtual)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButtonChamar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRetirar)
                    .addComponent(jButtonSenhaAtual))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSenhaAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSenhaAtualActionPerformed
        // TODO add your handling code here:
        controle.abrirTelaSenhaAtual();
        controle.fecharTelaChamarCliente();
    }//GEN-LAST:event_jButtonSenhaAtualActionPerformed

    private void jButtonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarActionPerformed
        // TODO add your handling code here:
        controle.abrirTelaDistribuirSenha();
        controle.fecharTelaChamarCliente();
    }//GEN-LAST:event_jButtonRetirarActionPerformed

    private void jButtonChamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChamarActionPerformed
        // TODO add your handling code here:
        Senha senha;
        int confirmacao;
        try {
            if (controle.isChamarProximo()) {
                senha = controle.chamarSenha();
            } else {
                senha = controle.verSenhaAtual();
            }
            confirmacao = JOptionPane.showConfirmDialog(this, "Senha atual:" + senha.getId()
                    + "\n Número de chamados: " + controle.getNumeroChamadosSenha()
                    + "\n O Cliente compareceu?");
            switch (confirmacao) {
                case JOptionPane.YES_OPTION: {
                    JOptionPane.showMessageDialog(this, "A próxima senha pode ser chamada",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    controle.setChamarProximo(true);
                    break;
                }
                case JOptionPane.NO_OPTION: {
                    controle.incrementarNumeroChamados();
                    if (controle.getNumeroChamadosSenha() > 3) {
                        controle.setChamarProximo(true);
                    } else {
                        controle.setChamarProximo(false);
                    }
                    break;
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Processo completo",
                    "Não há senhas", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonChamarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChamar;
    private javax.swing.JButton jButtonRetirar;
    private javax.swing.JButton jButtonSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
