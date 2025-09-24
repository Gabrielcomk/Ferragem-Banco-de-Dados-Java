
package GUI.Alteracao;

import GUI.Insercao.*;
import Classes.Pedido;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class MudarEstoque extends javax.swing.JFrame {
private int idEstoqueSelecionado = -1;

public MudarEstoque() {
    initComponents();
    setLocationRelativeTo(null); 
    carregarFornecedores();
}


public void setDados(Classes.Estoque e) {
    this.idEstoqueSelecionado = e.getCodigo();
    TextNomeItem.setText(e.getItem());
    TextUnidade.setText(e.getUnidade());
    textPreco.setText(String.valueOf(e.getPreco()));
}
      
      public void carregarFornecedores() {
    try {
        DAO.fornecedorDAO dao = new DAO.fornecedorDAO();
        ArrayList<Classes.Fornecedor> lista = dao.listarTodos();

        String[] colunas = {"ID", "Fornecedor", "Cidade"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Classes.Fornecedor f : lista) {
            Object[] linha = {
                f.getID_Forn(),
                f.getFornecedor(),
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        TextNomeItem = new javax.swing.JTextField();
        TextUnidade = new javax.swing.JTextField();
        textPreco = new javax.swing.JTextField();
        Alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Item:");

        jLabel2.setText("Unidade (UN, RSM, TB, CX, DZ):");

        jLabel3.setText("Preco:");

        jLabel4.setText("Fornecedor:");

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

        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(3, 3, 3))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextUnidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNomeItem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TextNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Alterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        JFrame ListarEstoqueParaAlterar = new ListarEstoqueParaAlterar(); 
    ListarEstoqueParaAlterar.setLocationRelativeTo(rootPane); 
    ListarEstoqueParaAlterar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseClicked

    }//GEN-LAST:event_tabelaFornecedorMouseClicked

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
         if (idEstoqueSelecionado == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Nenhum item carregado!");
        return;
    }

    try {
        int linha = tabelaFornecedor.getSelectedRow();
        if (linha < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um fornecedor!");
            return;
        }
        int idFornecedor = (int) tabelaFornecedor.getValueAt(linha, 0);
        Classes.Estoque e = new Classes.Estoque(
            idEstoqueSelecionado,
            TextNomeItem.getText(),
            TextUnidade.getText(),
            Float.parseFloat(textPreco.getText()),
            idFornecedor
        );

        DAO.estoqueDAO dao = new DAO.estoqueDAO();
        dao.alterar(e);

        javax.swing.JOptionPane.showMessageDialog(this, "Item alterado com sucesso!");
        dispose();
        JFrame ListarEstoqueParaAlterar = new ListarEstoqueParaAlterar(); 
    ListarEstoqueParaAlterar.setLocationRelativeTo(rootPane); 
    ListarEstoqueParaAlterar.setVisible(true);
    } catch (Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao alterar: " + ex.getMessage());
    }
    }//GEN-LAST:event_AlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JTextField TextNomeItem;
    private javax.swing.JTextField TextUnidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField textPreco;
    // End of variables declaration//GEN-END:variables
}
