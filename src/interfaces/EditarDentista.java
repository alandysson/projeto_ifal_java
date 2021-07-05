package interfaces;

import controle.ConexaoBD;
import controle.ControleDentista;
import controle.ControlePaciente;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Dentista;


public class EditarDentista extends javax.swing.JFrame {
    
    Dentista dent = new Dentista();
    ConexaoBD conexao = new ConexaoBD();
    ControleDentista controle = new ControleDentista();
    
    public void preencherDent(){
        
    }

    public EditarDentista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome_pac = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        Rg = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        Complemento = new javax.swing.JLabel();
        Cep = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        EnderecoDentista = new javax.swing.JFormattedTextField();
        NomeDentista = new javax.swing.JTextField();
        RgDentista = new javax.swing.JTextField();
        DataNasc = new javax.swing.JLabel();
        ComplementoTextField = new javax.swing.JTextField();
        NumeroTextField = new javax.swing.JTextField();
        CepTextField = new javax.swing.JTextField();
        TelefoneDentista = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        BairroTextField = new javax.swing.JTextField();
        CpfDentista = new javax.swing.JTextField();
        Voltar_2 = new javax.swing.JButton();
        Salvar_2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Especialidade = new javax.swing.JLabel();
        Especialidade_tipo = new javax.swing.JComboBox();
        Cro = new javax.swing.JLabel();
        CroDent = new javax.swing.JTextField();
        SearchTextField = new javax.swing.JTextField();
        Nome_pac1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDentista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        Telefone.setText("Telefone :");

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

        CepTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CepTextFieldActionPerformed(evt);
            }
        });

        TelefoneDentista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        EmailTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Bairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Bairro.setText("Bairro:");

        BairroTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        CpfDentista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Voltar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Voltar_2.setText("Voltar");
        Voltar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Voltar_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Voltar_2MouseClicked(evt);
            }
        });
        Voltar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_2ActionPerformed(evt);
            }
        });

        Salvar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Salvar_2.setText("Editar");
        Salvar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salvar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar_2ActionPerformed(evt);
            }
        });

        Especialidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Especialidade.setText("Especialidade:");

        Especialidade_tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Especialidade_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - Selecionar - - -", "Clínico Geral", "Ortodontia", "Cirurgia Buco Maxilo" }));

        Cro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cro.setText("CRO:");

        CroDent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Nome_pac1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Nome_pac1.setText("Cpf do Dentista:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TabelaDentista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cpf"
            }
        ));
        TabelaDentista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDentistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaDentista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Telefone)
                            .addComponent(Email))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome_pac1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Especialidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Complemento, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComplementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(557, 557, 557)
                        .addComponent(Cep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Especialidade_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(Cro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CroDent, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TelefoneDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Rg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RgDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Nome_pac)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NomeDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DataNasc)))
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(Cpf)
                                .addGap(18, 18, 18)
                                .addComponent(CpfDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(475, 475, 475))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Endereco)
                .addGap(18, 18, 18)
                .addComponent(EnderecoDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Numero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Voltar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salvar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_pac1)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NomeDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nome_pac)
                        .addComponent(DataNasc))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf)
                    .addComponent(CpfDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rg)
                    .addComponent(RgDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(EnderecoDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Complemento)
                    .addComponent(ComplementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cep)
                    .addComponent(CepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(TelefoneDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Especialidade_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cro)
                    .addComponent(CroDent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especialidade)
                    .addComponent(Voltar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salvar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 190, 190))
        );

        setSize(new java.awt.Dimension(870, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomeDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeDentistaActionPerformed

    private void CepTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CepTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CepTextFieldActionPerformed

    private void Salvar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar_2ActionPerformed
        dent.setNome(NomeDentista.getText());
        dent.setData_nascimento(jDateChooser1.getDate());
        dent.setCpf(Integer.parseInt(CpfDentista.getText()));
        dent.setRg(Integer.parseInt(RgDentista.getText()));
        dent.setEndereco(EnderecoDentista.getText());
        dent.setNumero(Integer.parseInt(NumeroTextField.getText()));
        dent.setComplemento(ComplementoTextField.getText());
        dent.setBairro(BairroTextField.getText());
        dent.setCep(Integer.parseInt(CepTextField.getText()));
        dent.setTelefone(Integer.parseInt(TelefoneDentista.getText()));
        dent.setEmail(EmailTextField.getText());
        dent.setEspecialidade((String) Especialidade_tipo.getSelectedItem());
        dent.setCro(Integer.parseInt(CroDent.getText()));
        controle.atualizaDentista(dent);
    }//GEN-LAST:event_Salvar_2ActionPerformed

    private void Voltar_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voltar_2MouseClicked
        ListarDentista listDent = new ListarDentista();
        listDent.setVisible(true);
    }//GEN-LAST:event_Voltar_2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dent.setPesquisa(Integer.parseInt(SearchTextField.getText()));
        Dentista model = controle.buscarDentista(dent);
        
        DefaultTableModel tbl = (DefaultTableModel) TabelaDentista.getModel();
        tbl.setNumRows(0);
        tbl.insertRow(tbl.getRowCount(), new Object[]{
                model.getCod(),
                model.getNome(),
                model.getCpf(),
                model.getData_nascimento(),
                model.getRg(),
                model.getEndereco(),
                model.getNumero(),
                model.getComplemento(),
                model.getBairro(),
                model.getCep(),
                model.getTelefone(),
                model.getEmail(),
                model.getEspecialidade(),
                model.getCro()
            });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelaDentistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDentistaMouseClicked
        String cpf_pac = ""+TabelaDentista.getValueAt(TabelaDentista.getSelectedRow(), 2);
        conexao.conexao();
        conexao.executaSql("select * from dentista where cpf='"+cpf_pac+"'");
        try {
            conexao.rs.first();
            NomeDentista.setText(conexao.rs.getString("nome"));
            jDateChooser1.setDate(conexao.rs.getDate("data_nascimento"));
            CpfDentista.setText(conexao.rs.getString("cpf"));
            RgDentista.setText(conexao.rs.getString("rg"));
            EnderecoDentista.setText(conexao.rs.getString("endereco"));
            NumeroTextField.setText(conexao.rs.getString("numero"));
            ComplementoTextField.setText(conexao.rs.getString("complemento"));
            BairroTextField.setText(conexao.rs.getString("bairro"));
            CepTextField.setText(conexao.rs.getString("cep"));
            TelefoneDentista.setText(conexao.rs.getString("telefone"));
            EmailTextField.setText(conexao.rs.getString("email"));
            Especialidade_tipo.setSelectedItem(conexao.rs.getString("especialidade"));
            CroDent.setText(conexao.rs.getString("cro"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_TabelaDentistaMouseClicked

    private void Voltar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_2ActionPerformed
        PainelInicial panInitial = new PainelInicial();
        panInitial.setVisible(true);
        dispose();
    }//GEN-LAST:event_Voltar_2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new EditarDentista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JTextField BairroTextField;
    private javax.swing.JLabel Cep;
    private javax.swing.JTextField CepTextField;
    private javax.swing.JLabel Complemento;
    private javax.swing.JTextField ComplementoTextField;
    private javax.swing.JLabel Cpf;
    private javax.swing.JTextField CpfDentista;
    private javax.swing.JLabel Cro;
    private javax.swing.JTextField CroDent;
    private javax.swing.JLabel DataNasc;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel Endereco;
    private javax.swing.JFormattedTextField EnderecoDentista;
    private javax.swing.JLabel Especialidade;
    private javax.swing.JComboBox Especialidade_tipo;
    private javax.swing.JTextField NomeDentista;
    private javax.swing.JLabel Nome_pac;
    private javax.swing.JLabel Nome_pac1;
    private javax.swing.JLabel Numero;
    private javax.swing.JTextField NumeroTextField;
    private javax.swing.JLabel Rg;
    private javax.swing.JTextField RgDentista;
    private javax.swing.JButton Salvar_2;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JTable TabelaDentista;
    private javax.swing.JLabel Telefone;
    private javax.swing.JTextField TelefoneDentista;
    private javax.swing.JButton Voltar_2;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
