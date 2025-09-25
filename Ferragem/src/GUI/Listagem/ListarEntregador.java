
package GUI.Listagem;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListarEntregador extends javax.swing.JFrame {

    
    public ListarEntregador() {
         initComponents();
    setLocationRelativeTo(null);
    carregarEntregadores();
    }
private void carregarEntregadores() {
    try {
        DAO.EntregadorDAO dao = new DAO.EntregadorDAO();
        ArrayList<Classes.Entregador> lista = dao.listarTodos();

        String[] colunas = {"ID", "Nome", "Contato"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Classes.Entregador e : lista) {
            Object[] linha = {
                e.getID_entregador(),
                e.getNome(),
                e.getContato()
            };
            modelo.addRow(linha);
        }

        tabelaEntregador.setModel(modelo);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Erro ao carregar entregadores: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntregador = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        botaoProcurar = new javax.swing.JButton();
        textProcurar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaEntregador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaEntregador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEntregadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEntregador);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        botaoProcurar.setText("Procurar");
        botaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarActionPerformed(evt);
            }
        });

        jLabel1.setText("<- Digite um ID, Nome, etc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoProcurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(Voltar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProcurar)
                    .addComponent(textProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Voltar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaEntregadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEntregadorMouseClicked

    }//GEN-LAST:event_tabelaEntregadorMouseClicked

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
dispose();        
    }//GEN-LAST:event_VoltarActionPerformed

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
  String filtro = textProcurar.getText();
    
    if (filtro == null || filtro.trim().isEmpty()) {
        carregarEntregadores();
        return;
    }
    
    filtro = filtro.trim();
    
    try {
        DAO.EntregadorDAO dao = new DAO.EntregadorDAO();
        ArrayList<Classes.Entregador> lista = dao.listarTodos();

        DefaultTableModel modelo = (DefaultTableModel) tabelaEntregador.getModel();
        modelo.setRowCount(0); 

        for (Classes.Entregador e : lista) {
            if (e.getNome().toLowerCase().contains(filtro.toLowerCase()) ||
                String.valueOf(e.getID_entregador()).equals(filtro)) {
                
                modelo.addRow(new Object[]{ e.getID_entregador(), e.getNome(), e.getContato() });
            }
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao procurar: " + e.getMessage());
    }      
    }//GEN-LAST:event_botaoProcurarActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEntregador;
    private javax.swing.JTextField textProcurar;
    // End of variables declaration//GEN-END:variables
}
