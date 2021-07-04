/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author smith
 */
public class EditarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form Paciente
     */
    public EditarPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        EnderecoPac = new javax.swing.JFormattedTextField();
        NomePac = new javax.swing.JTextField();
        RgPac = new javax.swing.JTextField();
        DataNasc = new javax.swing.JLabel();
        ComplementoPac = new javax.swing.JTextField();
        NumeroPac = new javax.swing.JTextField();
        CepPac = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        BairroPac = new javax.swing.JTextField();
        CpfPac = new javax.swing.JTextField();
        Tel_celular = new javax.swing.JTextField();
        Voltar_2 = new javax.swing.JButton();
        Salvar_2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

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

        NomePac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NomePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomePacActionPerformed(evt);
            }
        });

        DataNasc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DataNasc.setText("Data de Nascimento:");

        CepPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CepPacActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Bairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Bairro.setText("Bairro:");

        BairroPac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        CpfPac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Tel_celular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tel_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tel_celularActionPerformed(evt);
            }
        });

        Voltar_2.setBackground(new java.awt.Color(0, 153, 255));
        Voltar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Voltar_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão voltar.jpg"))); // NOI18N
        Voltar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Salvar_2.setBackground(new java.awt.Color(51, 255, 51));
        Salvar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Salvar_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão-próximo.png"))); // NOI18N
        Salvar_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                            .addComponent(Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Voltar_2)
                                        .addGap(28, 28, 28)
                                        .addComponent(Salvar_2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ComplementoPac)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Tel_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BairroPac, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Cep)
                                        .addGap(18, 18, 18)
                                        .addComponent(CepPac, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cpf)
                            .addComponent(Endereco)
                            .addComponent(Nome_pac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CpfPac, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(Rg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RgPac))
                                    .addComponent(EnderecoPac))
                                .addGap(18, 18, 18)
                                .addComponent(Numero))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DataNasc)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumeroPac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(67, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nome_pac)
                            .addComponent(NomePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataNasc)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf)
                    .addComponent(RgPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rg)
                    .addComponent(CpfPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(EnderecoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(BairroPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Complemento)
                    .addComponent(ComplementoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cep)
                    .addComponent(CepPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(Tel_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salvar_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Voltar_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        setSize(new java.awt.Dimension(855, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomePacActionPerformed

    private void CepPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CepPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CepPacActionPerformed

    private void Tel_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tel_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tel_celularActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JTextField BairroPac;
    private javax.swing.JLabel Cep;
    private javax.swing.JTextField CepPac;
    private javax.swing.JLabel Complemento;
    private javax.swing.JTextField ComplementoPac;
    private javax.swing.JLabel Cpf;
    private javax.swing.JTextField CpfPac;
    private javax.swing.JLabel DataNasc;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JFormattedTextField EnderecoPac;
    private javax.swing.JTextField NomePac;
    private javax.swing.JLabel Nome_pac;
    private javax.swing.JLabel Numero;
    private javax.swing.JTextField NumeroPac;
    private javax.swing.JLabel Rg;
    private javax.swing.JTextField RgPac;
    private javax.swing.JButton Salvar_2;
    private javax.swing.JTextField Tel_celular;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton Voltar_2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}