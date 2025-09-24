
package GUI.Insercao;

import Classes.Pedido;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class InserirEstoque extends javax.swing.JFrame {

private int idCliente;

      public InserirEstoque() {
    initComponents();
    setLocationRelativeTo(null); 
    carregarFornecedores();
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
        Inserir = new javax.swing.JButton();

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

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Inserir)
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
                    .addComponent(Inserir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseClicked

    }//GEN-LAST:event_tabelaFornecedorMouseClicked

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        try {
        String nome = TextNomeItem.getText().trim();
        String unidade = TextUnidade.getText().trim();
        float preco = Float.parseFloat(textPreco.getText().trim());

        int row = tabelaFornecedor.getSelectedRow();
        if (row == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um fornecedor!");
            return;
        }
        int idFornecedor = Integer.parseInt(tabelaFornecedor.getValueAt(row, 0).toString());

        Classes.Estoque e = new Classes.Estoque();
        e.setItem(nome);
        e.setUnidade(unidade);
        e.setPreco(preco);
        e.setID_fornecedor(idFornecedor);

        DAO.estoqueDAO dao = new DAO.estoqueDAO();
        dao.inserir(e);

        javax.swing.JOptionPane.showMessageDialog(this, "Item inserido com sucesso!");
        dispose();

    } catch (Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Erro ao inserir item: " + ex.getMessage());
    }
    }//GEN-LAST:event_InserirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inserir;
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
