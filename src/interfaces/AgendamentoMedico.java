/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controle.ConexaoBD;
import controle.ControleAgendamento;
import controle.ControlePaciente;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Agendamento;
import modelo.Paciente;

/**
 *
 * @author smith
 */
public class AgendamentoMedico extends javax.swing.JFrame {

    Paciente pac = new Paciente();
    ConexaoBD conexao = new ConexaoBD();
    ControlePaciente controlpac = new ControlePaciente();
    Agendamento agenda = new Agendamento();
    String Especialidade;
       
    public AgendamentoMedico() {
        initComponents();
        preencherMedicos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        Horario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TurnoComboBox = new javax.swing.JComboBox();
        Medico_agendamento = new javax.swing.JLabel();
        PacienteInput = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Horario1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaPaciente = new javax.swing.JTable();
        jComboBoxMedicos = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3-logo2.jpg"))); // NOI18N

        Horario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Horario.setText("Turno:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Data:");

        TurnoComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TurnoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - Selecione - - -", "Matutino", "Vespertino", "Noturno" }));

        Medico_agendamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Medico_agendamento.setText("CPF Paciente:");

        PacienteInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Horario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Horario1.setText("Medicos:");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Contato"
            }
        ));
        TabelaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaPaciente);

        jComboBoxMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Marcar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Medico_agendamento)
                            .addGap(10, 10, 10)
                            .addComponent(PacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addGap(104, 104, 104)
                            .addComponent(Horario)
                            .addGap(10, 10, 10)
                            .addComponent(TurnoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Horario1)
                            .addGap(4, 4, 4)
                            .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(134, 134, 134)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TurnoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medico_agendamento)
                            .addComponent(Horario)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Horario1)))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencherMedicos(){
        conexao.conexao();
        conexao.executaSql("select * from medico order by nome");
        
        try {
            conexao.rs.first();
            jComboBoxMedicos.removeAllItems();
            do {
                jComboBoxMedicos.addItem(conexao.rs.getString("nome"));
                Especialidade = conexao.rs.getString("especialidade");
            } while(conexao.rs.next());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher nome dos medicos" + ex);
            jComboBoxMedicos.removeAllItems();
        }
        
        conexao.desconecta();
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        agenda.setCpfPac(Integer.parseInt(PacienteInput.getText()));
        agenda.setTurno_consulta((String) TurnoComboBox.getSelectedItem());
        agenda.setNomeMed((String) jComboBoxMedicos.getSelectedItem());
        agenda.setData_consulta(jDateChooser1.getDate());
        agenda.setEspecialidade(Especialidade);
        
        ControleAgendamento dao = new ControleAgendamento();
        dao.marcar(agenda);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pac.setPesquisa(Integer.parseInt(PacienteInput.getText()));
        Paciente model = controlpac.buscarPaciente(pac);
        
        DefaultTableModel tbl = (DefaultTableModel) TabelaPaciente.getModel();
        tbl.setNumRows(0);
        tbl.insertRow(tbl.getRowCount(), new Object[]{
                model.getNome(),
                model.getCpf(),
                model.getTelefone()
            });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TabelaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPacienteMouseClicked
        String cpf_pac = ""+TabelaPaciente.getValueAt(TabelaPaciente.getSelectedRow(), 1);
        conexao.conexao();
        conexao.executaSql("select * from paciente where cpf='"+cpf_pac+"'");
        try {
            conexao.rs.first();
            PacienteInput.setText(conexao.rs.getString("cpf"));
            agenda.setNomePac(conexao.rs.getString("nome"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_TabelaPacienteMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PainelInicial panInitial = new PainelInicial();
        panInitial.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AgendamentoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendamentoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendamentoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendamentoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AgendamentoMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Horario;
    private javax.swing.JLabel Horario1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Medico_agendamento;
    private javax.swing.JTextField PacienteInput;
    private javax.swing.JTable TabelaPaciente;
    private javax.swing.JComboBox TurnoComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBoxMedicos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
