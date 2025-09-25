
package GUI.Listagem;

import Classes.Fones_forn;
import DAO.fornecedorDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListarFonesFornecedor extends javax.swing.JFrame {

    private int idFornecedor;

    public ListarFonesFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
        initComponents();
        setLocationRelativeTo(null);
        carregarFones();
    }

    private void carregarFones() {
        try {
            DAO.fornecedorDAO dao = new DAO.fornecedorDAO();
            ArrayList<Classes.Fones_forn> lista = dao.listarFones(idFornecedor);

            String[] colunas = {"Nome Fornecedor", "DDD", "Fone", "ID Fornecedor"};
            DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

            for (Classes.Fones_forn f : lista) {
                modelo.addRow(new Object[]{
                    f.getNomeFornecedor(),
                    f.getDdd(),
                    f.getNumero(),
                    f.getIdFornecedor()
                });
            }
            jTable1.setModel(modelo);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Erro ao carregar fones: " + e.getMessage());
        }
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Fornecedor", "DDD", "Fone", "ID Fornecedor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(Voltar)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Voltar)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
