
package GUI.Exclusao;

import Classes.Pedido;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListarFornecedorParaExcluir extends javax.swing.JFrame {

private int idCliente;

      public ListarFornecedorParaExcluir() {
    initComponents();
    setLocationRelativeTo(null); 
    carregarFornecedores();
}
      
      public void carregarFornecedores() {
    try {
        DAO.fornecedorDAO dao = new DAO.fornecedorDAO();
        ArrayList<Classes.Fornecedor> lista = dao.listarTodos();

        String[] colunas = {"ID", "Fornecedor", "Endereço", "Nº", "Complemento", "Bairro", "Cidade"};
DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

for (Classes.Fornecedor f : lista) {
    Object[] linha = {
        f.getID_Forn(),
        f.getFornecedor(),
        f.getEndereco(),
        f.getNr(),
        f.getComplemento(),
        f.getBairro(),
        f.getCidade()
    };
    modelo.addRow(linha);
}

        tabelaFornecedor.setModel(modelo);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Erro ao carregar fornecedores: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
   

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedor);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Excluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseClicked
        
    }//GEN-LAST:event_tabelaFornecedorMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
         int linha = tabelaFornecedor.getSelectedRow();
    if (linha >= 0) {
        int id = (int) tabelaFornecedor.getValueAt(linha, 0);
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
                        "Deseja realmente excluir este fornecedor?", 
                        "Confirmar Exclusão", 
                        javax.swing.JOptionPane.YES_NO_OPTION);
        
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                DAO.fornecedorDAO dao = new DAO.fornecedorDAO();
                dao.excluir(id);
                javax.swing.JOptionPane.showMessageDialog(this, "Fornecedor excluído com sucesso!");
                carregarFornecedores();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
            }
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um fornecedor para excluir.");
    }
    }//GEN-LAST:event_ExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFornecedor;
    // End of variables declaration//GEN-END:variables
}
