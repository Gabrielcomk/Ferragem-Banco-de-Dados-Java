
package GUI;

import Classes.Clientes;
import DAO.ErpDAOException;
import DAO.clientesDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlteraCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AlteraCliente.class.getName());

     private Clientes C = new Clientes();
    int id, posicao;
    private static ArrayList<Clientes> cliente = new ArrayList<Clientes>();
    
    public AlteraCliente() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RBM = new javax.swing.JRadioButton();
        RBF = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Data_nasc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Endereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Complemento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Bairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Fone1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Fone2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Cancela = new javax.swing.JButton();
        Ok = new javax.swing.JButton();
        Numero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        COMBO = new javax.swing.JComboBox<>();
        Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Nome:");

        buttonGroup1.add(RBM);
        RBM.setText("Masculino");
        RBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBF);
        RBF.setText("Feminino");
        RBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBFActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo:");

        jLabel3.setText("Data de Nascimento:");

        jLabel2.setText("Endereço:");

        jLabel5.setText("Complemento");

        Bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroActionPerformed(evt);
            }
        });

        jLabel6.setText("Bairro:");

        Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Cidade:");

        Fone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fone1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Fone1:");

        Fone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fone2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Fone2:");

        Cancela.setText("Cancela");
        Cancela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelaMouseClicked(evt);
            }
        });
        Cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaActionPerformed(evt);
            }
        });

        Ok.setText("Ok");
        Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkMouseClicked(evt);
            }
        });
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("Numero:");

        COMBO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                COMBOItemStateChanged(evt);
            }
        });
        COMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirMouseClicked(evt);
            }
        });
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fone2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fone1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bairro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Complemento))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Endereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBM, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11)
                                .addComponent(Numero))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RBM)
                    .addComponent(RBF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Fone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Fone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ok)
                    .addComponent(Cancela)
                    .addComponent(Excluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMActionPerformed
      
    }//GEN-LAST:event_RBMActionPerformed

    private void BairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroActionPerformed

    private void CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeActionPerformed

    private void Fone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fone1ActionPerformed

    private void Fone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fone2ActionPerformed

    private void CancelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelaMouseClicked
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_CancelaMouseClicked

    private void OkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkMouseClicked

    Clientes C = new Clientes();
    Date dataNasc = null;
    char sexo = ' ';

    DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
    C.setID_Cliente(id);

    if (Nome.getText().equals("")) {
        JOptionPane.showMessageDialog(rootPane, "O Campo nome não pode estar vazio");
        return;
    }

    C.setNome(Nome.getText());

    if (RBF.isSelected()) {
        sexo = 'F';
    }
    if (RBM.isSelected()) {
        sexo = 'M';
    }
    C.setSexo(sexo);

    if (!Data_nasc.getText().equals("")) {
        try {
            dataNasc = dtOutput.parse(Data_nasc.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro na conversão da data!");
        }
    }
    C.setData_nasc(dataNasc);

    // >>> CAMPOS QUE ESTAVAM FALTANDO <<<
    C.setEndereco(Endereco.getText());
    try {
        C.setNumero(Integer.parseInt(Numero.getText()));
    } catch (NumberFormatException e) {
        C.setNumero(0); // se vazio ou inválido
    }
    C.setComplemento(Complemento.getText());
    C.setBairro(Bairro.getText());
    C.setCidade(Cidade.getText());

    try {
        C.setFone1(Integer.parseInt(Fone1.getText()));
    } catch (NumberFormatException e) {
        C.setFone1(0);
    }

    try {
        C.setFone2(Integer.parseInt(Fone2.getText()));
    } catch (NumberFormatException e) {
        C.setFone2(0);
    }

    clientesDAO CDAO = new clientesDAO();
    try {
        CDAO.Atualizar(C);
        JOptionPane.showMessageDialog(rootPane, "Atualização efetuada com sucesso!!");
        dispose();
    } catch (ErpDAOException ex) {
        Logger.getLogger(AlteraCliente.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Erro ao atualizar cliente!");
    }
    }//GEN-LAST:event_OkMouseClicked

    private void CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelaActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        carregaCombo();
        try {
            carrega();
        } catch (ErpDAOException ex) {
            Logger.getLogger(AlteraCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

    private void COMBOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOItemStateChanged
       posicao = (int) COMBO.getSelectedIndex();
        id = cliente.get(posicao).getID_Cliente();
        try {
            carrega();
        } catch (ErpDAOException ex) {
            Logger.getLogger(AlteraCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_COMBOItemStateChanged

    private void COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOActionPerformed
        
    }//GEN-LAST:event_COMBOActionPerformed

    public void carregaCombo() {
    COMBO.removeAllItems();
    clientesDAO CDAO = new clientesDAO();
    cliente = CDAO.Listar();
    for (Clientes c : cliente) {
        COMBO.addItem(c.getNome());
    }
}

    
    public void carrega() throws ErpDAOException {
    clientesDAO CDAO = new clientesDAO();
    C = CDAO.procurar(id);

    // Nome
    Nome.setText(C.getNome());

    // Sexo
    if (Character.toUpperCase(C.getSexo()) == 'F') {
        RBF.setSelected(true);
    } else if (Character.toUpperCase(C.getSexo()) == 'M') {
        RBM.setSelected(true);
    } else {
        RBF.setSelected(false);
        RBM.setSelected(false);
    }

    // Data de nascimento
    if (C.getData_nasc() == null) {
        Data_nasc.setText("");
    } else {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Data_nasc.setText(sdf.format(C.getData_nasc()));
    }

    // >>> CAMPOS QUE ESTAVAM FALTANDO <<<
    Endereco.setText(C.getEndereco());
    Numero.setText(String.valueOf(C.getNumero()));
    Complemento.setText(C.getComplemento());
    Bairro.setText(C.getBairro());
    Cidade.setText(C.getCidade());

    // Telefones (tratando null)
    if (C.getFone1() != 0) {
        Fone1.setText(String.valueOf(C.getFone1()));
    } else {
        Fone1.setText("");
    }

    if (C.getFone2() != 0) {
        Fone2.setText(String.valueOf(C.getFone2()));
    } else {
        Fone2.setText("");
    }
}
    
    private void RBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFActionPerformed
        
    }//GEN-LAST:event_RBFActionPerformed

    private void ExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirMouseClicked

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
          int resposta = JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente excluir o cliente e todas as notas fiscais e pedidos vinculados?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
    );

    if (resposta == JOptionPane.YES_OPTION) {
        try {
            clientesDAO cdao = new clientesDAO();
            cdao.ExcluirComDependencias(C); // usa o cliente carregado

            JOptionPane.showMessageDialog(this, "Cliente e todos os dados vinculados foram excluídos com sucesso!");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao excluir cliente: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private static javax.swing.JComboBox<String> COMBO;
    private javax.swing.JButton Cancela;
    private javax.swing.JTextField Cidade;
    private javax.swing.JTextField Complemento;
    private javax.swing.JTextField Data_nasc;
    private javax.swing.JTextField Endereco;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Fone1;
    private javax.swing.JTextField Fone2;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Numero;
    private javax.swing.JButton Ok;
    private javax.swing.JRadioButton RBF;
    private javax.swing.JRadioButton RBM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
