
package GUI;

import Classes.Clientes;
import DAO.ErpDAOException;
import DAO.clientesDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class InsereCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InsereCliente.class.getName());

    public InsereCliente() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JTextField();
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
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RBM.setText("Masculino");
        RBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMActionPerformed(evt);
            }
        });

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

        jLabel11.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(Cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(11, 11, 11)
                            .addComponent(Numero))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Endereco))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RBM, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(RBF))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RBM)
                    .addComponent(RBF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
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
                    .addComponent(Cancela)
                    .addComponent(Ok))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMActionPerformed
        // TODO add your handling code here:
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
        String nome, endereco, complemento, bairro, cidade = null ;
        Date data_nasc = null;
        char sexo = ' ';
        int numero, fone1, fone2 = 0;
        DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");

        if (Nome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa digitar o nome");
        } else if ((RBF.isSelected() == false) && (RBM.isSelected() == false)) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa selecionar o sexo");
        } else {

            nome = Nome.getText();
            
            if (RBF.isSelected() == true) {
                sexo = 'F';
            }
            if (RBM.isSelected() == true) {
                sexo = 'M';
            }

            if (Data_nasc.getText().equals("")) {
                data_nasc = null;
            } else {

                try {
                    data_nasc = dtOutput.parse(Data_nasc.getText());
                } catch (ParseException ex) {
                    System.out.println("Erro na conversão da data");
                }
            }
            
            endereco = Endereco.getText();
            numero = Integer.parseInt(Numero.getText());
            complemento = Complemento.getText();
            bairro = Bairro.getText();
            cidade = Cidade.getText();
            fone1 = Integer.parseInt(Fone1.getText());
            fone2 = Integer.parseInt(Fone2.getText());
            
            
            
            C.setNome(nome);
            C.setSexo(sexo);
            C.setData_nasc(data_nasc);
            C.setEndereco(endereco);
            C.setNumero(numero);
            C.setComplemento(complemento);
            C.setBairro(bairro);
            C.setCidade(cidade);
            C.setFone1(fone1);
            C.setFone2(fone2);

            try {
                clientesDAO CDAO = new clientesDAO();
                CDAO.Inserir(C);
                JOptionPane.showMessageDialog(rootPane, "Inserção efetuada com sucesso!!");

            } catch (ErpDAOException ex) {
                System.out.println("problema na inserção do contato");
            }
            dispose();
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

    private void RBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBFActionPerformed

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JButton Cancela;
    private javax.swing.JTextField Cidade;
    private javax.swing.JTextField Complemento;
    private javax.swing.JTextField Data_nasc;
    private javax.swing.JTextField Endereco;
    private javax.swing.JTextField Fone1;
    private javax.swing.JTextField Fone2;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Numero;
    private javax.swing.JButton Ok;
    private javax.swing.JRadioButton RBF;
    private javax.swing.JRadioButton RBM;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
