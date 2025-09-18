
package GUI;

import Classes.Clientes;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListarClientes extends javax.swing.JFrame {


  public ListarClientes() {
    initComponents();
    carregarClientes(); 
}
    
    public void carregarClientes() {
    try {
        clientesDAO dao = new clientesDAO();
        ArrayList<Clientes> lista = dao.listarTodos();

        
        String[] colunas = {"ID", "Nome", "Sexo", "Data Nasc.", "Endereço", "Número", 
                            "Complemento", "Bairro", "Cidade", "Fone 1", "Fone 2"};

        
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

       
        for (Clientes c : lista) {
            Object[] linha = {
                c.getID_Cliente(),
                c.getNome(),
                c.getSexo(),
                c.getData_nasc(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getFone1(),
                c.getFone2()
            };
            modelo.addRow(linha);
        }

        tabelaClientes.setModel(modelo);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Erro ao carregar clientes: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        ListarPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        ListarPedidos.setText("Listar Pedidos");
        ListarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListarPedidos)
                .addGap(18, 18, 18)
                .addComponent(Voltar)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar)
                    .addComponent(ListarPedidos))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked

    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ListarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarPedidosActionPerformed
         int row = tabelaClientes.getSelectedRow();  // pega a linha selecionada
    if (row != -1) {
        int idCliente = Integer.parseInt(tabelaClientes.getValueAt(row, 0).toString());
        new ListarPedidos(idCliente).setVisible(true);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Selecione um cliente na tabela primeiro.");
    }
    }//GEN-LAST:event_ListarPedidosActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarPedidos;
    private javax.swing.JButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
