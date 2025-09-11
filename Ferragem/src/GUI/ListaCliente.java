/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Clientes;
import DAO.clientesDAO;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel K
 */
public class ListaCliente extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ListaCliente.class.getName());

    /**
     * Creates new form ListaCliente
     */
    public ListaCliente() {
        initComponents();
    }

    int id, pos;
    private static ArrayList<Clientes> cliente = new ArrayList<Clientes>();
    private static DefaultListModel Valores = new DefaultListModel();
    private static int codigo = 0;
    private static int posicao, posicli;

    public void carregaCliente() {
        if (cliente == null || cliente.isEmpty() || posicli < 0 || posicli >= cliente.size()) {
            JOptionPane.showMessageDialog(null, "Cliente inválido ou lista vazia.");
            return;
        }
        try {
            Clientes clienteSelecionado = cliente.get(posicli);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID_Cliente");
            modelo.addColumn("Nome");
            modelo.addColumn("Sexo");
            modelo.addColumn("Data_nasc");
            modelo.addColumn("Endereco");
            modelo.addColumn("Numero");
            modelo.addColumn("Complemento");
            modelo.addColumn("Bairro");
            modelo.addColumn("Cidade");
            modelo.addColumn("Fone1");
            modelo.addColumn("Fone2");

            modelo.addRow(new Object[]{
                clienteSelecionado.getID_Cliente(),
                clienteSelecionado.getNome(),
                clienteSelecionado.getSexo(),
                clienteSelecionado.getData_nasc(),
                clienteSelecionado.getEndereco(),
                clienteSelecionado.getNumero(),
                clienteSelecionado.getComplemento(),
                clienteSelecionado.getBairro(),
                clienteSelecionado.getCidade(),
                clienteSelecionado.getFone1(),
                clienteSelecionado.getFone2(),});
            Lista1.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar livro selecionado: " + e.getMessage());
        }
    }
    
    private void carregarClientesComboBox() {
    try {
        clientesDAO ClienteDAO = new clientesDAO();
        ArrayList<Clientes> Clientes = ClienteDAO.Listar(); 

        ComboClientes.removeAllItems();
        cliente.clear(); 

        for (Clientes l : Clientes) {
            ComboClientes.addItem(l.getNome());
            cliente.add(l); 
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar títulos: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboClientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Sair = new javax.swing.JToggleButton();
        BuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lista2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Lista3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        ComboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboClientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o Cliente:");

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        BuscarCliente.setText("Buscar");
        BuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarClienteMouseClicked(evt);
            }
        });
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });

        Lista1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Lista1);

        jLabel2.setText("Tabela do Cliente:");

        jLabel3.setText("Nota Fiscal:");

        Lista2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Lista2);

        jLabel4.setText("Pedido:");

        Lista3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(Lista3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(233, 233, 233))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ComboClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(391, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(593, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addComponent(Sair)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(281, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(211, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(185, 185, 185)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        dispose();
    }//GEN-LAST:event_SairMouseClicked

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ComboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboClientesActionPerformed

    private void BuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarClienteMouseClicked
        posicli = ComboClientes.getSelectedIndex();
        carregaCliente();
    }//GEN-LAST:event_BuscarClienteMouseClicked

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed

    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        carregarClientesComboBox();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarCliente;
    private javax.swing.JComboBox<String> ComboClientes;
    private javax.swing.JTable Lista1;
    private javax.swing.JTable Lista2;
    private javax.swing.JTable Lista3;
    private javax.swing.JToggleButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
