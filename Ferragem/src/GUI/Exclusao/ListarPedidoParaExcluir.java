
package GUI.Exclusao;

import Classes.Pedido;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListarPedidoParaExcluir extends javax.swing.JFrame {

private int idCliente;

      public ListarPedidoParaExcluir(int idCliente) {
        this.idCliente = idCliente;
        initComponents();
        carregarPedidos();
        setLocationRelativeTo(null); 
    }
      
      
 private void carregarPedidos() {
        try {
            clientesDAO dao = new clientesDAO();
            ArrayList<Pedido> pedidos = dao.listarPedidosDoCliente(idCliente);

            String[] colunas = {"Código Item", "Nota Fiscal", "Quantidade", "Nome"};
DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

for (Pedido p : pedidos) {
    Object[] linha = {
        p.getCodigo_item(),
        p.getNR_NF(),
        p.getQuantidade(),
        p.getNomeItem()
    };
    modelo.addRow(linha);
}

tabelaPedidos.setModel(modelo);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Erro ao carregar pedidos: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
   

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPedidos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        tabelaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPedidos);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Excluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPedidosMouseClicked
        
    }//GEN-LAST:event_tabelaPedidosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        int linhaSelecionada = tabelaPedidos.getSelectedRow();
    if (linhaSelecionada == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um pedido para excluir!");
        return;
    }

    int codigoItem = (int) tabelaPedidos.getValueAt(linhaSelecionada, 0);

    int confirmar = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Tem certeza que deseja excluir o pedido?", "Confirmar exclusão", 
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (confirmar != javax.swing.JOptionPane.YES_OPTION) {
        return;
    }

    try {
        DAO.PedidoDAO dao = new DAO.PedidoDAO();
        dao.excluir(codigoItem);

        javax.swing.JOptionPane.showMessageDialog(this, "Pedido excluído com sucesso!");
        carregarPedidos(); 
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao excluir pedido: " + e.getMessage());
    }
    }//GEN-LAST:event_ExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPedidos;
    // End of variables declaration//GEN-END:variables
}
