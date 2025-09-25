
package GUI.Listagem;

import Classes.Nota_fiscal;
import Classes.Pedido;
import DAO.clientesDAO;
import DAO.notaFiscalDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ListarNf extends javax.swing.JFrame {

private int idCliente;

       public ListarNf() {
        initComponents();
        setLocationRelativeTo(null); 
        carregarNotasFiscais(); 
    }

      
    private void carregarNotasFiscais() {
        try {

            notaFiscalDAO dao = new notaFiscalDAO();

            ArrayList<Nota_fiscal> lista = dao.listarTodos();

            String[] colunas = {"NF", "Data", "Entregador", "Cliente", "ID entrega", "ID cliente"};
DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

for (Nota_fiscal nf : lista) {
    Object[] linha = {
        nf.getNF(),
        nf.getData(),
        nf.getNomeEntregador(),
        nf.getNomeCliente(),
        nf.getID_entrega(),
        nf.getID_cliente()
    };
    modelo.addRow(linha);
}

tabelaNf.setModel(modelo);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Erro ao carregar notas fiscais: " + e.getMessage());
        }
    } 
    
    @SuppressWarnings("unchecked")
   

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNf = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        tabelaNf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NF", "Data", "Entregador", "Cliente", "ID entrega", "ID cliente"
            }
        ));
        tabelaNf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaNfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaNf);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaNfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaNfMouseClicked
        
    }//GEN-LAST:event_tabelaNfMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaNf;
    // End of variables declaration//GEN-END:variables
}
