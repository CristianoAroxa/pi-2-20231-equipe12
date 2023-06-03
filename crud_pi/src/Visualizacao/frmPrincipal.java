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
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        barMenu = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        linkAdm = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        linkProfessor = new javax.swing.JMenuItem();
        brSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/logo_lib.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Liberty Cursos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        barraMenu.setBackground(new java.awt.Color(255, 255, 255));

        barMenu.setForeground(new java.awt.Color(102, 102, 255));
        barMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/menu-aberto.png"))); // NOI18N
        barMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barMenuMouseClicked(evt);
            }
        });
        barMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barMenuActionPerformed(evt);
            }
        });
        barMenu.add(jSeparator1);

        linkAdm.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        linkAdm.setForeground(new java.awt.Color(102, 102, 255));
        linkAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/perfilAdm.png"))); // NOI18N
        linkAdm.setText("Administrador");
        linkAdm.setContentAreaFilled(false);
        linkAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkAdmActionPerformed(evt);
            }
        });
        barMenu.add(linkAdm);

        jMenuItem2.setBackground(new java.awt.Color(204, 204, 204));
        jMenuItem2.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/do-utilizador.png"))); // NOI18N
        jMenuItem2.setText("Aluno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        barMenu.add(jMenuItem2);

        linkProfessor.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        linkProfessor.setForeground(new java.awt.Color(102, 102, 255));
        linkProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/professora.png"))); // NOI18N
        linkProfessor.setText("Professor");
        linkProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkProfessorActionPerformed(evt);
            }
        });
        barMenu.add(linkProfessor);

        brSair.setForeground(new java.awt.Color(102, 102, 255));
        brSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visualizacao/icones/poder.png"))); // NOI18N
        brSair.setText("Sair");
        brSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brSairMouseClicked(evt);
            }
        });
        barMenu.add(brSair);

        barraMenu.add(barMenu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barMenuActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_barMenuActionPerformed

    private void barMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_barMenuMouseClicked

    private void brSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_brSairMouseClicked

    private void linkAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkAdmActionPerformed
        // TODO add your handling code here:
       frmLogAdm formlogadm = new frmLogAdm();
       formlogadm.setVisible(true);
    }//GEN-LAST:event_linkAdmActionPerformed

    private void linkProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkProfessorActionPerformed
        // TODO add your handling code here:
        frmLogProfessor formlogprof= new frmLogProfessor();
        formlogprof.setVisible(true);
    }//GEN-LAST:event_linkProfessorActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmLoginAluna formalu = new frmLoginAluna();
        formalu.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu barMenu;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu brSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem linkAdm;
    private javax.swing.JMenuItem linkProfessor;
    // End of variables declaration//GEN-END:variables
}