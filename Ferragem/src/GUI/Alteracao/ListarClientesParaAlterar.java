
package GUI.Alteracao;

import Classes.Clientes;
import DAO.clientesDAO;
import GUI.Alteracao.MudarCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListarClientesParaAlterar extends javax.swing.JFrame {


   private ArrayList<Clientes> listaClientes; 

    public ListarClientesParaAlterar() {
        initComponents();
        carregarClientes(); 
    }
    
    public void carregarClientes() {
        try {
            clientesDAO dao = new clientesDAO();
            listaClientes = dao.listarTodos(); 
            preencherTabela(listaClientes);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Erro ao carregar clientes: " + e.getMessage());
        }
    }

    private void preencherTabela(ArrayList<Clientes> lista) {
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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        AlterarCliente = new javax.swing.JButton();
        Procurar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        AlterarCliente.setText("Alterar Cliente");
        AlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarClienteActionPerformed(evt);
            }
        });

        Procurar.setText("Procurar");
        Procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarActionPerformed(evt);
            }
        });

        jLabel1.setText("<- Digite um ID, Nome ou Cidade.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Procurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlterarCliente)
                .addGap(18, 18, 18)
                .addComponent(Voltar)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Procurar)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Voltar)
                        .addComponent(AlterarCliente)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked

    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void AlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarClienteActionPerformed
        int row = tabelaClientes.getSelectedRow();  
    if (row != -1) {
        int idCliente = Integer.parseInt(tabelaClientes.getValueAt(row, 0).toString());
        String nome = tabelaClientes.getValueAt(row, 1).toString();
        char sexo = tabelaClientes.getValueAt(row, 2).toString().toUpperCase().charAt(0);

       
        Object objData = tabelaClientes.getValueAt(row, 3);
        java.util.Date dataNasc = null;
        if (objData instanceof java.util.Date) {
            dataNasc = (java.util.Date) objData;
        } else if (objData != null) {
            try {
                dataNasc = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(objData.toString());
            } catch (Exception e) {
                dataNasc = null;
            }
        }

        String endereco = tabelaClientes.getValueAt(row, 4).toString();
        int numero = Integer.parseInt(tabelaClientes.getValueAt(row, 5).toString());
        String complemento = tabelaClientes.getValueAt(row, 6).toString();
        String bairro = tabelaClientes.getValueAt(row, 7).toString();
        String cidade = tabelaClientes.getValueAt(row, 8).toString();
        int fone1 = Integer.parseInt(tabelaClientes.getValueAt(row, 9).toString());
        int fone2 = Integer.parseInt(tabelaClientes.getValueAt(row, 10).toString());

        Clientes cliente = new Clientes(idCliente, nome, sexo, dataNasc, endereco, numero,
                                        complemento, bairro, cidade, fone1, fone2);

        MudarCliente tela = new MudarCliente(cliente);
tela.addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {
        carregarClientes(); 
        
    }
});
tela.setVisible(true);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Selecione um cliente na tabela primeiro.");
    }
    }//GEN-LAST:event_AlterarClienteActionPerformed

    private void ProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarActionPerformed
        String termo = jTextField1.getText().trim().toLowerCase();

        if (termo.isEmpty()) {
            preencherTabela(listaClientes);
            return;
        }

        ArrayList<Clientes> filtrados = new ArrayList<>();

        for (Clientes c : listaClientes) {
            if (String.valueOf(c.getID_Cliente()).contains(termo) ||
                (c.getNome() != null && c.getNome().toLowerCase().contains(termo)) ||
                (c.getCidade() != null && c.getCidade().toLowerCase().contains(termo)) ||
                (c.getBairro() != null && c.getBairro().toLowerCase().contains(termo)) ||
                (c.getEndereco() != null && c.getEndereco().toLowerCase().contains(termo))) {

                filtrados.add(c);
            }
        }

        if (filtrados.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nenhum cliente encontrado para: " + termo);
        }

        preencherTabela(filtrados);
    }//GEN-LAST:event_ProcurarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarCliente;
    private javax.swing.JButton Procurar;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
