package GUI;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sair = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        ListarCliente = new javax.swing.JMenuItem();
        InserirCliente = new javax.swing.JMenuItem();
        AlterarCliente = new javax.swing.JMenuItem();
        ListarCliente2 = new javax.swing.JMenuItem();
        menuClientes2 = new javax.swing.JMenu();
        ListarCliente1 = new javax.swing.JMenuItem();
        InserirCliente1 = new javax.swing.JMenuItem();
        AlterarCliente1 = new javax.swing.JMenuItem();
        InserirPedido1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AbrirConfiguracao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(Sair)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        menuClientes.setText("Clientes");

        ListarCliente.setText("Listar");
        ListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(ListarCliente);

        InserirCliente.setText("Inserir");
        InserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirClienteActionPerformed(evt);
            }
        });
        menuClientes.add(InserirCliente);

        AlterarCliente.setText("Alterar");
        AlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(AlterarCliente);

        ListarCliente2.setText("Excluir");
        ListarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarCliente2ActionPerformed(evt);
            }
        });
        menuClientes.add(ListarCliente2);

        jMenuBar1.add(menuClientes);

        menuClientes2.setText("Pedidos");

        ListarCliente1.setText("Listar");
        ListarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarCliente1ActionPerformed(evt);
            }
        });
        menuClientes2.add(ListarCliente1);

        InserirCliente1.setText("Inserir");
        InserirCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirCliente1ActionPerformed(evt);
            }
        });
        menuClientes2.add(InserirCliente1);

        AlterarCliente1.setText("Alterar");
        AlterarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarCliente1ActionPerformed(evt);
            }
        });
        menuClientes2.add(AlterarCliente1);

        InserirPedido1.setText("Excluir");
        InserirPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirPedido1ActionPerformed(evt);
            }
        });
        menuClientes2.add(InserirPedido1);

        jMenuBar1.add(menuClientes2);

        jMenu2.setText("Ferramentas");

        AbrirConfiguracao.setText("Configurações");
        AbrirConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirConfiguracaoActionPerformed(evt);
            }
        });
        jMenu2.add(AbrirConfiguracao);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirConfiguracaoActionPerformed
JFrame Configuracoes = new Configuracoes();
Configuracoes.setLocationRelativeTo(rootPane);
Configuracoes.setVisible(true);
    }//GEN-LAST:event_AbrirConfiguracaoActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        dispose();
        dispose();
    }//GEN-LAST:event_SairMouseClicked

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClienteActionPerformed
    JFrame ListarClientes = new ListarClientes(); 
    ListarClientes.setLocationRelativeTo(rootPane); 
    ListarClientes.setVisible(true);
    }//GEN-LAST:event_ListarClienteActionPerformed

    private void InserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirClienteActionPerformed
        
    }//GEN-LAST:event_InserirClienteActionPerformed

    private void AlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarClienteActionPerformed
       
    }//GEN-LAST:event_AlterarClienteActionPerformed

    private void ListarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListarCliente1ActionPerformed

    private void InserirCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InserirCliente1ActionPerformed

    private void AlterarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarCliente1ActionPerformed

    private void InserirPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirPedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InserirPedido1ActionPerformed

    private void ListarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListarCliente2ActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirConfiguracao;
    private javax.swing.JMenuItem AlterarCliente;
    private javax.swing.JMenuItem AlterarCliente1;
    private javax.swing.JMenuItem InserirCliente;
    private javax.swing.JMenuItem InserirCliente1;
    private javax.swing.JMenuItem InserirPedido1;
    private javax.swing.JMenuItem ListarCliente;
    private javax.swing.JMenuItem ListarCliente1;
    private javax.swing.JMenuItem ListarCliente2;
    private javax.swing.JToggleButton Sair;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuClientes2;
    // End of variables declaration//GEN-END:variables
}
