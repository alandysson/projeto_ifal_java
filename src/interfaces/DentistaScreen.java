
package interfaces;

import controle.ConexaoBD;
import controle.ControleDentista;
import modelo.Dentista;

public class DentistaScreen extends javax.swing.JFrame {
    
    ConexaoBD conex = new ConexaoBD();
    Dentista mod = new Dentista();
    ControleDentista control = new ControleDentista();
    
    public DentistaScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        Nome_pac = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        Rg = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        Complemento = new javax.swing.JLabel();
        Cep = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        EnderecoDent = new javax.swing.JFormattedTextField();
        NomeDentista = new javax.swing.JTextField();
        RgDent = new javax.swing.JTextField();
        DataNasc = new javax.swing.JLabel();
        ComplementoDent = new javax.swing.JTextField();
        NumDent = new javax.swing.JTextField();
        CepDent = new javax.swing.JTextField();
        TelDent = new javax.swing.JTextField();
        EmailDent = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        BairroDent = new javax.swing.JTextField();
        CpfDent = new javax.swing.JTextField();
        Especialidade = new javax.swing.JLabel();
        Cro = new javax.swing.JLabel();
        CroDent = new javax.swing.JTextField();
        Voltar_2 = new javax.swing.JButton();
        Salvar_2 = new javax.swing.JButton();
        Especialidade_tipo = new javax.swing.JComboBox();
        Cidade_med = new javax.swing.JLabel();
        CidadeDent = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3-logo2.jpg"))); // NOI18N

        Nome_pac.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Nome_pac.setText("Nome:");

        Cpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cpf.setText("CPF:");

        Rg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Rg.setText("RG:");

        Endereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Endereco.setText("Endereço:");

        Numero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Numero.setText("Número:");

        Complemento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Complemento.setText("Complemento:");

        Cep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cep.setText("CEP:");

        Telefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Telefone.setText("Telefone:");

        Email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Email.setText("E-mail:");

        NomeDentista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NomeDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeDentistaActionPerformed(evt);
            }
        });

        DataNasc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DataNasc.setText("Data de Nascimento:");

        CepDent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CepDentActionPerformed(evt);
            }
        });

        TelDent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        EmailDent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Bairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Bairro.setText("Bairro:");

        BairroDent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        CpfDent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Especialidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Especialidade.setText("Especialidade:");

        Cro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cro.setText("CRO:");

        CroDent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Voltar_2.setBackground(new java.awt.Color(0, 204, 255));
        Voltar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Voltar_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão voltar.jpg"))); // NOI18N
        Voltar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Voltar_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Voltar_2MouseClicked(evt);
            }
        });

        Salvar_2.setBackground(new java.awt.Color(51, 255, 51));
        Salvar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Salvar_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão-próximo.png"))); // NOI18N
        Salvar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salvar_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salvar_2MouseClicked(evt);
            }
        });

        Especialidade_tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Especialidade_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - Selecionar - - -", "Clínico Geral", "Ortodontia", "Cirurgia Buco Maxilo" }));

        Cidade_med.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cidade_med.setText("Cidade:");

        CidadeDent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Telefone)
                            .addComponent(Complemento)
                            .addComponent(Email)
                            .addComponent(Especialidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Especialidade_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Cro)
                                        .addGap(35, 35, 35)
                                        .addComponent(CroDent, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EmailDent, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(357, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Voltar_2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Salvar_2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TelDent)
                                            .addComponent(ComplementoDent))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BairroDent, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Cep)
                                        .addGap(18, 18, 18)
                                        .addComponent(CepDent, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cpf)
                            .addComponent(Endereco)
                            .addComponent(Nome_pac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EnderecoDent)
                                        .addGap(18, 18, 18)
                                        .addComponent(Numero))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(NomeDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DataNasc)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NumDent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CpfDent, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Rg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RgDent, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cidade_med)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CidadeDent, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nome_pac)
                        .addComponent(NomeDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DataNasc))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf)
                    .addComponent(RgDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rg)
                    .addComponent(CpfDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cidade_med)
                    .addComponent(CidadeDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(EnderecoDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(BairroDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Complemento)
                    .addComponent(ComplementoDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cep)
                    .addComponent(CepDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefone)
                            .addComponent(TelDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email)
                            .addComponent(EmailDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Especialidade)
                            .addComponent(Especialidade_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cro)
                            .addComponent(CroDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(Voltar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Salvar_2))
                .addGap(62, 62, 62))
        );

        setSize(new java.awt.Dimension(879, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomeDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeDentistaActionPerformed

    private void CepDentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CepDentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CepDentActionPerformed

    private void Salvar_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salvar_2MouseClicked
        mod.setNome(NomeDentista.getText());
        mod.setData_nascimento(jDateChooser1.getDate());
        mod.setCpf(Integer.parseInt(CpfDent.getText()));
        mod.setRg(Integer.parseInt(RgDent.getText()));
        mod.setCidade(CidadeDent.getText());
        mod.setEndereco(EnderecoDent.getText());
        mod.setBairro(BairroDent.getText());
        mod.setCep(Integer.parseInt(CepDent.getText()));
        mod.setTelefone(Integer.parseInt(TelDent.getText()));
        mod.setEmail(EmailDent.getText());
        mod.setEspecialidade((String) Especialidade_tipo.getSelectedItem());
        mod.setCro(Integer.parseInt(CroDent.getText()));
        control.salvar(mod);
    }//GEN-LAST:event_Salvar_2MouseClicked

    private void Voltar_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voltar_2MouseClicked
        PainelInicial initial = new PainelInicial();
        initial.setVisible(true);
    }//GEN-LAST:event_Voltar_2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DentistaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DentistaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DentistaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DentistaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DentistaScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JTextField BairroDent;
    private javax.swing.JLabel Cep;
    private javax.swing.JTextField CepDent;
    private javax.swing.JTextField CidadeDent;
    private javax.swing.JLabel Cidade_med;
    private javax.swing.JLabel Complemento;
    private javax.swing.JTextField ComplementoDent;
    private javax.swing.JLabel Cpf;
    private javax.swing.JTextField CpfDent;
    private javax.swing.JLabel Cro;
    private javax.swing.JTextField CroDent;
    private javax.swing.JLabel DataNasc;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailDent;
    private javax.swing.JLabel Endereco;
    private javax.swing.JFormattedTextField EnderecoDent;
    private javax.swing.JLabel Especialidade;
    private javax.swing.JComboBox Especialidade_tipo;
    private javax.swing.JTextField NomeDentista;
    private javax.swing.JLabel Nome_pac;
    private javax.swing.JTextField NumDent;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Rg;
    private javax.swing.JTextField RgDent;
    private javax.swing.JButton Salvar_2;
    private javax.swing.JTextField TelDent;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton Voltar_2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
