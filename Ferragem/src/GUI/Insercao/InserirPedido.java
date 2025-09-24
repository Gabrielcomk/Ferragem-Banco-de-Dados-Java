
package GUI.Insercao;

import Classes.Pedido;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class InserirPedido extends javax.swing.JFrame {

private int idCliente;

      public InserirPedido(int idCliente) {
        this.idCliente = idCliente;
        initComponents();
        
        setLocationRelativeTo(null); 
        carregarEstoque();
    }
      
      private void carregarEstoque() {
    try {
        DAO.estoqueDAO dao = new DAO.estoqueDAO();
        ArrayList<Classes.Estoque> lista = dao.listarTodos();

        String[] colunas = {"ID", "Nome", "Unidade", "Preco", "ID_fornecedor"};
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaItensEscolhidos = new javax.swing.JTable();
        InserirPedidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        tabelaItensEscolhidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Unidade", "Preco", "Quantidade", "ID_fornecedor"
            }
        ));
        tabelaItensEscolhidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaItensEscolhidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaItensEscolhidos);

        InserirPedidos.setText("Inserir");
        InserirPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirPedidosActionPerformed(evt);
            }
        });

        jLabel1.setText("Abaixo são os pedidos sendo inseridos ao cliente.");

        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Finalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InserirPedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InserirPedidos)
                        .addComponent(jLabel1)
                        .addComponent(Finalizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEstoqueMouseClicked
 int row = tabelaEstoque.getSelectedRow();
    if (row != -1) {
        int idItem = Integer.parseInt(tabelaEstoque.getValueAt(row, 0).toString());
        String nome = tabelaEstoque.getValueAt(row, 1).toString();
        String unidade = tabelaEstoque.getValueAt(row, 2).toString();
        float preco = Float.parseFloat(tabelaEstoque.getValueAt(row, 3).toString());
        int fornecedor = Integer.parseInt(tabelaEstoque.getValueAt(row, 4).toString());

        String qtdStr = javax.swing.JOptionPane.showInputDialog(this, 
            "Digite a quantidade para " + nome + ":");
        if (qtdStr == null || qtdStr.isEmpty()) return;
        int qtd = Integer.parseInt(qtdStr);

        DefaultTableModel modelo = (DefaultTableModel) tabelaItensEscolhidos.getModel();
        modelo.addRow(new Object[]{idItem, nome, unidade, preco, qtd, fornecedor});
    }        
    }//GEN-LAST:event_tabelaEstoqueMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaItensEscolhidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaItensEscolhidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaItensEscolhidosMouseClicked

    private void InserirPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirPedidosActionPerformed
         int row = tabelaItensEscolhidos.getSelectedRow();
    if (row != -1) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaItensEscolhidos.getModel();
        modelo.removeRow(row);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um item para remover.");
    }
    }//GEN-LAST:event_InserirPedidosActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
                               
    try {
       
        DAO.notaFiscalDAO nfDao = new DAO.notaFiscalDAO();
        int nrNF = nfDao.criarNotaFiscal(idCliente, 1); 
        DAO.PedidoDAO pDao = new DAO.PedidoDAO();
        DefaultTableModel modelo = (DefaultTableModel) tabelaItensEscolhidos.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object codObj = modelo.getValueAt(i, 0);
            Object qtdObj = modelo.getValueAt(i, 4);
            if (codObj == null || qtdObj == null) {
                continue;
            }
            int codigoItem = Integer.parseInt(codObj.toString());
            int qtd = Integer.parseInt(qtdObj.toString());
            String nomeItem = (modelo.getValueAt(i, 1) != null) 
                                ? modelo.getValueAt(i, 1).toString()
                                : "";
            Classes.Pedido p = new Classes.Pedido(codigoItem, nrNF, qtd, nomeItem);
            pDao.inserir(p);
        }
        javax.swing.JOptionPane.showMessageDialog(this, "Pedidos inseridos com sucesso!");
        dispose();
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
    }
    }//GEN-LAST:event_FinalizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton InserirPedidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JTable tabelaItensEscolhidos;
    // End of variables declaration//GEN-END:variables
}
