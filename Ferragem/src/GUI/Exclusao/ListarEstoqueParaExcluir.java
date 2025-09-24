
package GUI.Exclusao;

import Classes.Pedido;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListarEstoqueParaExcluir extends javax.swing.JFrame {

private int idCliente;

      public ListarEstoqueParaExcluir() {
    initComponents();
    setLocationRelativeTo(null); 
    carregarEstoque(); 
}
      
      public void carregarEstoque() {
    try {
        DAO.estoqueDAO dao = new DAO.estoqueDAO();
        ArrayList<Classes.Estoque> lista = dao.listarTodos();

        String[] colunas = {"ID", "Nome", "Unidade", "Preço", "Fornecedor"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Classes.Estoque e : lista) {
            Object[] linha = {
                e.getCodigo(),
                e.getItem(),
                e.getUnidade(),
                e.getPreco(),
                e.getID_fornecedor()
            };
            modelo.addRow(linha);
        }

        tabelaEstoque.setModel(modelo);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao carregar estoque: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
   

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Unidade", "Preco", "ID_fornecedor"
            }
        ));
        tabelaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEstoque);

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
                .addGap(18, 18, 18)
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

    private void tabelaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEstoqueMouseClicked
        
    }//GEN-LAST:event_tabelaEstoqueMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
       int linha = tabelaEstoque.getSelectedRow();
    if (linha >= 0) {
        int id = (int) tabelaEstoque.getValueAt(linha, 0);

        int confirm = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "Tem certeza que deseja excluir este item do estoque?", 
            "Confirmar exclusão", 
            javax.swing.JOptionPane.YES_NO_OPTION
        );
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                DAO.estoqueDAO dao = new DAO.estoqueDAO();
                dao.excluir(id);

                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Item excluído com sucesso!");
                carregarEstoque();

            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Erro ao excluir: " + e.getMessage());
            }
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Selecione um item do estoque para excluir.");
    }
    }//GEN-LAST:event_ExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEstoque;
    // End of variables declaration//GEN-END:variables
}
