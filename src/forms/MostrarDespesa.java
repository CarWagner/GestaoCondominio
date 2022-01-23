/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import beans.DespesaUnidade;
import dao.DespesaUnidadeDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joacir
 */
public class MostrarDespesa extends javax.swing.JFrame {
    
    // pega os dados das despesas de lista e joga dentro da tabela
    private void preencherTabela() {
        DespesaUnidadeDAO despesaDAO = new DespesaUnidadeDAO();
        List<DespesaUnidade> listaDespesa = despesaDAO.getDespesas();
        
        DefaultTableModel tabelaDespesa = (DefaultTableModel) tblDespesa.getModel();
        
        // Percori a "listaDespesa" e inseri na tabelaDespesa
        for(DespesaUnidade d : listaDespesa) {
            Object[] obj = new Object[] {
                d.getIddespesaUnidade(),
                d.getTipoDespesa(),
                d.getValor(),
                d.getDescricao(),
                d.getVencimentoFatura(),
                d.getStatusPagamento()
            };
            tabelaDespesa.addRow(obj);
        }
    }
    
    /**
     * Creates new form MostrarDespesa
     */
    public MostrarDespesa() {
        initComponents();
        preencherTabela();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDespesa = new javax.swing.JTable();
        btnEditarExcluir = new javax.swing.JButton();
        btnCancelarUnidade1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mostrar Despesas");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Tabela de Despesa");

        tblDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idDespesa", "tipoDespesa", "valor", "descricao", "vencimentoFatura", "statusPagamento"
            }
        ));
        jScrollPane1.setViewportView(tblDespesa);

        btnEditarExcluir.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarExcluir.setText("Editar/Excluir Despesa");
        btnEditarExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarExcluirActionPerformed(evt);
            }
        });

        btnCancelarUnidade1.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarUnidade1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarUnidade1.setText("Voltar");
        btnCancelarUnidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUnidade1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 184, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(195, 195, 195))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditarExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarUnidade1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarExcluir)
                    .addComponent(btnCancelarUnidade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarExcluirActionPerformed
        // TODO add your handling code here:
        EditarDespesa frd = new EditarDespesa();
        frd.setVisible(true);
    }//GEN-LAST:event_btnEditarExcluirActionPerformed

    private void btnCancelarUnidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUnidade1ActionPerformed
        // TODO add your handling code here:
        MostrarDespesa.this.dispose();
    }//GEN-LAST:event_btnCancelarUnidade1ActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarUnidade1;
    private javax.swing.JButton btnEditarExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDespesa;
    // End of variables declaration//GEN-END:variables
}
