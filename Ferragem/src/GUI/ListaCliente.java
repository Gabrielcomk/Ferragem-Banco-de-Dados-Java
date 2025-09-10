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
            Lista.setModel(modelo);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        BuscarCliente = new javax.swing.JButton();

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

        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nome", "sexo", "data_nasc", "endereco", "numero", "complemento", "bairro", "cidade", "fone1", "fone2"
            }
        ));
        jScrollPane1.setViewportView(Lista);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sair)
                .addGap(34, 34, 34))
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
    private javax.swing.JTable Lista;
    private javax.swing.JToggleButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
