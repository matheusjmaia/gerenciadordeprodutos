/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tads.gerenciadorprodutos.views;

import javax.swing.JFrame;

/**
 *
 * @author YagoPinheiro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private ConsultaProduto consultaProduto = null;
    private CadastroProduto cadastroProduto = null;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        setTitle("Gerenciador De Produtos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuProduto = new javax.swing.JMenu();
        itemCadastrarProduto = new javax.swing.JMenuItem();
        itemConsultarProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuProduto.setText("Produto");
        menuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutoActionPerformed(evt);
            }
        });

        itemCadastrarProduto.setText("Cadastrar Produto");
        itemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(itemCadastrarProduto);

        itemConsultarProduto.setText("Consultar Produto");
        itemConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(itemConsultarProduto);

        menuBar.add(menuProduto);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutoActionPerformed
        
    }//GEN-LAST:event_menuProdutoActionPerformed

    private void itemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarProdutoActionPerformed
        if (cadastroProduto == null) {
            cadastroProduto = new CadastroProduto();
            cadastroProduto.pack();
            cadastroProduto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadastroProduto.setLocationRelativeTo(null);
            cadastroProduto.setVisible(true);
        }
        cadastroProduto.toFront();
        cadastroProduto = null;
    }//GEN-LAST:event_itemCadastrarProdutoActionPerformed

    private void itemConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarProdutoActionPerformed
        if (consultaProduto == null) {
            consultaProduto = new ConsultaProduto();
            consultaProduto.pack();
            consultaProduto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            consultaProduto.setLocationRelativeTo(null);
            consultaProduto.setVisible(true);
        }
        consultaProduto.toFront();
        cadastroProduto = null;
    }//GEN-LAST:event_itemConsultarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCadastrarProduto;
    private javax.swing.JMenuItem itemConsultarProduto;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuProduto;
    // End of variables declaration//GEN-END:variables
}