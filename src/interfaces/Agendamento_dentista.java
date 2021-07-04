
package interfaces;

import controle.ConexaoBD;
import controle.ControlePaciente;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Agendamento;


public class Agendamento_dentista extends javax.swing.JFrame {

    EditarPaciente pac = new EditarPaciente();
    ConexaoBD conexao = new ConexaoBD();
    ControlePaciente controlpac = new ControlePaciente();
    Agendamento agenda = new Agendamento();
    
    public Agendamento_dentista() {
        initComponents();
        preencherMedicos();
    }

        public void preencherMedicos(){
        conexao.conexao();
        conexao.executaSql("select * from dentista order by nome");
        
        try {
            conexao.rs.first();
            jComboBoxDentistas.removeAllItems();
            do {
                jComboBoxDentistas.addItem(conexao.rs.getString("nome"));
            } while(conexao.rs.next());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher nome dos medicos" + ex);
            jComboBoxDentistas.removeAllItems();
        }
        conexao.desconecta();
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
        Horario_tempo = new javax.swing.JComboBox();
        Botao_medico = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Medico_agendamento = new javax.swing.JLabel();
        PacienteInput = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Horario1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaPaciente = new javax.swing.JTable();
        jComboBoxDentistas = new javax.swing.JComboBox<>();

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

        Horario_tempo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Horario_tempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - Selecione - - -", "Matutino", "Vespertino", "Noturno" }));

        Botao_medico.setBackground(new java.awt.Color(51, 255, 51));
        Botao_medico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Botao_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão-próximo.png"))); // NOI18N
        Botao_medico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão voltar.jpg"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Medico_agendamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Medico_agendamento.setText("CPF Paciente:");

        PacienteInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Horario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Horario1.setText("Dentista:  ");

        jButton2.setText("Buscar");

        TabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaPaciente);

        jComboBoxDentistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Medico_agendamento)
                        .addGap(10, 10, 10)
                        .addComponent(PacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(Horario)
                        .addGap(10, 10, 10)
                        .addComponent(Horario_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Horario1)
                        .addGap(4, 4, 4)
                        .addComponent(jComboBoxDentistas, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(15, 15, 15)
                                .addComponent(Botao_medico)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Medico_agendamento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(PacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Horario))
                    .addComponent(Horario_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxDentistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Horario1)))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_medico))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPacienteMouseClicked
        String cpf_paciente = ""+TabelaPaciente.getValueAt(TabelaPaciente.getSelectedRow(), 1);
        conexao.conexao();
        conexao.executaSql("select * from paciente where cpf='"+cpf_paciente+"'");
        try {
            conexao.rs.first();
            PacienteInput.setText(conexao.rs.getString("cpf"));
            agenda.setNomePac(conexao.rs.getString("nome"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_TabelaPacienteMouseClicked

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
            java.util.logging.Logger.getLogger(Agendamento_dentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento_dentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento_dentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento_dentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento_dentista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_medico;
    private javax.swing.JLabel Horario;
    private javax.swing.JLabel Horario1;
    private javax.swing.JComboBox Horario_tempo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Medico_agendamento;
    private javax.swing.JTextField PacienteInput;
    private javax.swing.JTable TabelaPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxDentistas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
