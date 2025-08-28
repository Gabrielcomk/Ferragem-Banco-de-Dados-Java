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
        menuBiblioteca = new javax.swing.JMenu();
        ListarEstoque = new javax.swing.JMenuItem();
        InserirEstoque = new javax.swing.JMenuItem();
        AlterarEstoque = new javax.swing.JMenuItem();
        ExcluirEstoque = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        ListarCliente = new javax.swing.JMenuItem();
        InserirCliente = new javax.swing.JMenuItem();
        AlterarCliente = new javax.swing.JMenuItem();
        ExcluirCliente = new javax.swing.JMenuItem();
        menuClientes1 = new javax.swing.JMenu();
        ListarEmprestimo = new javax.swing.JMenuItem();
        InserirEmprestimo = new javax.swing.JMenuItem();
        AlterarExcluirEmprestimo = new javax.swing.JMenuItem();
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
                .addContainerGap(138, Short.MAX_VALUE))
        );

        menuBiblioteca.setText("Estoque");

        ListarEstoque.setText("Listar");
        ListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(ListarEstoque);

        InserirEstoque.setText("Inserir");
        InserirEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(InserirEstoque);

        AlterarEstoque.setText("Alterar");
        AlterarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(AlterarEstoque);

        ExcluirEstoque.setText("Excluir");
        ExcluirEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirEstoqueActionPerformed(evt);
            }
        });
        menuBiblioteca.add(ExcluirEstoque);

        jMenuBar1.add(menuBiblioteca);

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

        ExcluirCliente.setText("Excluir");
        ExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirClienteActionPerformed(evt);
            }
        });
        menuClientes.add(ExcluirCliente);

        jMenuBar1.add(menuClientes);

        menuClientes1.setText("Entregador");

        ListarEmprestimo.setText("Listar");
        ListarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEmprestimoActionPerformed(evt);
            }
        });
        menuClientes1.add(ListarEmprestimo);

        InserirEmprestimo.setText("Inserir");
        InserirEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirEmprestimoActionPerformed(evt);
            }
        });
        menuClientes1.add(InserirEmprestimo);

        AlterarExcluirEmprestimo.setText("Alterar/Excluir");
        AlterarExcluirEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarExcluirEmprestimoActionPerformed(evt);
            }
        });
        menuClientes1.add(AlterarExcluirEmprestimo);

        jMenuBar1.add(menuClientes1);

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

    private void ListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEstoqueActionPerformed
       
    }//GEN-LAST:event_ListarEstoqueActionPerformed

    private void AbrirConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirConfiguracaoActionPerformed
JFrame Configuracoes = new Configuracoes();
Configuracoes.setLocationRelativeTo(rootPane);
Configuracoes.setVisible(true);
    }//GEN-LAST:event_AbrirConfiguracaoActionPerformed

    private void InserirEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirEstoqueActionPerformed
        
    }//GEN-LAST:event_InserirEstoqueActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        dispose();
        dispose();
    }//GEN-LAST:event_SairMouseClicked

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ExcluirEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirEstoqueActionPerformed
      
    }//GEN-LAST:event_ExcluirEstoqueActionPerformed

    private void AlterarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarEstoqueActionPerformed
       
    }//GEN-LAST:event_AlterarEstoqueActionPerformed

    private void ListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClienteActionPerformed
    JFrame Lista = new ListaCliente();
       Lista.setLocationRelativeTo(rootPane); 
       Lista.setVisible(true);
    }//GEN-LAST:event_ListarClienteActionPerformed

    private void InserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirClienteActionPerformed
         JFrame Insere = new InsereCliente();
Insere.setLocationRelativeTo(rootPane);
Insere.setVisible(true);
    }//GEN-LAST:event_InserirClienteActionPerformed

    private void AlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarClienteActionPerformed
        JFrame Altera = new AlteraCliente();
Altera.setLocationRelativeTo(rootPane);
Altera.setVisible(true);
    }//GEN-LAST:event_AlterarClienteActionPerformed

    private void ExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirClienteActionPerformed
       
    }//GEN-LAST:event_ExcluirClienteActionPerformed

    private void ListarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEmprestimoActionPerformed
       
    }//GEN-LAST:event_ListarEmprestimoActionPerformed

    private void InserirEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirEmprestimoActionPerformed
       
    }//GEN-LAST:event_InserirEmprestimoActionPerformed

    private void AlterarExcluirEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarExcluirEmprestimoActionPerformed
        
    }//GEN-LAST:event_AlterarExcluirEmprestimoActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirConfiguracao;
    private javax.swing.JMenuItem AlterarCliente;
    private javax.swing.JMenuItem AlterarEstoque;
    private javax.swing.JMenuItem AlterarExcluirEmprestimo;
    private javax.swing.JMenuItem ExcluirCliente;
    private javax.swing.JMenuItem ExcluirEstoque;
    private javax.swing.JMenuItem InserirCliente;
    private javax.swing.JMenuItem InserirEmprestimo;
    private javax.swing.JMenuItem InserirEstoque;
    private javax.swing.JMenuItem ListarCliente;
    private javax.swing.JMenuItem ListarEmprestimo;
    private javax.swing.JMenuItem ListarEstoque;
    private javax.swing.JToggleButton Sair;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuBiblioteca;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuClientes1;
    // End of variables declaration//GEN-END:variables
}
