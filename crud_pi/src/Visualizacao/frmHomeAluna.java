/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

/**
 *
 * @author dsm-2
 */
public class frmHomeAluna extends javax.swing.JFrame {

    /**
     * Creates new form frmAluno
     */
    public frmHomeAluna() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        linkPerfil = new javax.swing.JMenuItem();
        linkMeusCursos = new javax.swing.JMenuItem();
        linkVoltar = new javax.swing.JMenuItem();
        linkSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/do-utilizador.png"))); // NOI18N
        jLabel1.setText("Meu Espaço");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/aluna.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/logoNew60.png"))); // NOI18N
        jLabel3.setText("Liberty Cursos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(102, 102, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/configuracao.png"))); // NOI18N
        jMenu1.setText("Gerenciamento");

        linkPerfil.setBackground(new java.awt.Color(255, 255, 255));
        linkPerfil.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        linkPerfil.setForeground(new java.awt.Color(102, 102, 255));
        linkPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/perfil.png"))); // NOI18N
        linkPerfil.setText("Perfil");
        jMenu1.add(linkPerfil);

        linkMeusCursos.setBackground(new java.awt.Color(255, 255, 255));
        linkMeusCursos.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        linkMeusCursos.setForeground(new java.awt.Color(102, 102, 255));
        linkMeusCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/aprendizagem-online.png"))); // NOI18N
        linkMeusCursos.setText("Meus Cursos");
        linkMeusCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkMeusCursosActionPerformed(evt);
            }
        });
        jMenu1.add(linkMeusCursos);

        linkVoltar.setBackground(new java.awt.Color(255, 255, 255));
        linkVoltar.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        linkVoltar.setForeground(new java.awt.Color(102, 102, 255));
        linkVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/seta-esquerda.png"))); // NOI18N
        linkVoltar.setText("Voltar");
        linkVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkVoltarActionPerformed(evt);
            }
        });
        jMenu1.add(linkVoltar);

        linkSair.setBackground(new java.awt.Color(255, 255, 255));
        linkSair.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        linkSair.setForeground(new java.awt.Color(102, 102, 255));
        linkSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/sair.png"))); // NOI18N
        linkSair.setText("Sair");
        linkSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkSairActionPerformed(evt);
            }
        });
        jMenu1.add(linkSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_linkSairActionPerformed

    private void linkVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkVoltarActionPerformed
        // TODO add your handling code here:
       frmLoginAluna formAlu = new frmLoginAluna();
       formAlu.setVisible(true);
    }//GEN-LAST:event_linkVoltarActionPerformed

    private void linkMeusCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkMeusCursosActionPerformed
        // TODO add your handling code here:
        frmCursosAluna formCurAlu = new frmCursosAluna();
        formCurAlu.setVisible(true);
    }//GEN-LAST:event_linkMeusCursosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHomeAluna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHomeAluna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHomeAluna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHomeAluna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHomeAluna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem linkMeusCursos;
    private javax.swing.JMenuItem linkPerfil;
    private javax.swing.JMenuItem linkSair;
    private javax.swing.JMenuItem linkVoltar;
    // End of variables declaration//GEN-END:variables
}
