
package interfaces;

import controle.ConexaoBD;
import controle.ControleMedico;
import modelo.Medico;

public class MedicoScreen extends javax.swing.JFrame {

    ConexaoBD conexao = new ConexaoBD();
    Medico modMedico = new Medico();
    ControleMedico controllMedico = new ControleMedico();
    
    public MedicoScreen() {
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
        enderecoTextField = new javax.swing.JFormattedTextField();
        NomeMedicoTextField = new javax.swing.JTextField();
        rgTextField = new javax.swing.JTextField();
        DataNasc = new javax.swing.JLabel();
        complementoTextField = new javax.swing.JTextField();
        numeroTextField = new javax.swing.JTextField();
        cepTextField = new javax.swing.JTextField();
        telefoneTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        bairroTextField = new javax.swing.JTextField();
        Especialidade = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        crmTextField = new javax.swing.JTextField();
        Voltar_2 = new javax.swing.JButton();
        Salvar_2 = new javax.swing.JButton();
        especialidadeBox = new javax.swing.JComboBox();
        Cidade = new javax.swing.JLabel();
        cidadeTextField = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        CPFField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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
        Telefone.setText("Telefone");

        Email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Email.setText("E-mail:");

        NomeMedicoTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        DataNasc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DataNasc.setText("Data de Nascimento:");

        telefoneTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        emailTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Bairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Bairro.setText("Bairro:");

        bairroTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Especialidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Especialidade.setText("Especialidade:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("CRM:");

        crmTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Voltar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Voltar_2.setText("Voltar");
        Voltar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Salvar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Salvar_2.setText("Cadastrar");
        Salvar_2.setActionCommand("");
        Salvar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salvar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar_2ActionPerformed(evt);
            }
        });

        especialidadeBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        especialidadeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - Selecione - - -", "Ortopedista", "Neurologista", "Cardiologista" }));

        Cidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cidade.setText("Cidade:");

        cidadeTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cadastrar Medico");

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(complementoTextField)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(especialidadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(crmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Voltar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Salvar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cep)
                                        .addGap(18, 18, 18)
                                        .addComponent(cepTextField)))
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                        .addComponent(enderecoTextField)
                                        .addGap(18, 18, 18)
                                        .addComponent(Numero))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CPFField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(Rg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(NomeMedicoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DataNasc)
                                            .addComponent(Cidade))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(475, 475, 475)
                                .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(73, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(405, 405, 405))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nome_pac)
                        .addComponent(NomeMedicoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DataNasc))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf)
                    .addComponent(rgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rg)
                    .addComponent(Cidade)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Complemento)
                    .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cep)
                    .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(crmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salvar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especialidade))
                .addGap(140, 140, 140))
        );

        setSize(new java.awt.Dimension(883, 582));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Salvar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar_2ActionPerformed
        modMedico.setNome(NomeMedicoTextField.getText());
        modMedico.setData_nascimento(jDateChooser1.getDate());
        modMedico.setCpf(Integer.parseInt(CPFField.getText()));
        modMedico.setRg(Integer.parseInt(rgTextField.getText()));
        modMedico.setCidade(cidadeTextField.getText());
        modMedico.setEndereco(enderecoTextField.getText());
        modMedico.setNumero(Integer.parseInt(numeroTextField.getText()));
        modMedico.setComplemento(complementoTextField.getText());
        modMedico.setBairro(bairroTextField.getText());
        modMedico.setCep(Integer.parseInt(cepTextField.getText()));
        modMedico.setTelefone(Integer.parseInt(telefoneTextField.getText()));
        modMedico.setEmail(emailTextField.getText());
        modMedico.setEspecialidade((String) especialidadeBox.getSelectedItem());
        modMedico.setCrm(Integer.parseInt(crmTextField.getText()));
        controllMedico.salvar(modMedico);
    }//GEN-LAST:event_Salvar_2ActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MedicoScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JTextField CPFField;
    private javax.swing.JLabel Cep;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Complemento;
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel DataNasc;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Especialidade;
    private javax.swing.JTextField NomeMedicoTextField;
    private javax.swing.JLabel Nome_pac;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Rg;
    private javax.swing.JButton Salvar_2;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton Voltar_2;
    private javax.swing.JTextField bairroTextField;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JTextField crmTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JFormattedTextField enderecoTextField;
    private javax.swing.JComboBox especialidadeBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField numeroTextField;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField rgTextField;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
