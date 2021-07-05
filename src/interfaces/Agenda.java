/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controle.ConexaoBD;
import controle.ControleAgendamento;
import controle.ControleConsultaDent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Agendamento;
import modelo.Dentista;
import modelo.Medico;

/**
 *
 * @author smith
 */
public class Agenda extends javax.swing.JFrame {

    Agendamento agenda = new Agendamento();
    Medico medico = new Medico();
    Dentista dent = new Dentista();
    ConexaoBD conexao = new ConexaoBD();
    ControleConsultaDent consDent = new ControleConsultaDent();
    ControleAgendamento consMed = new ControleAgendamento();
    
    public void atualizaTabelaConsMedicos(){
        List<Agendamento> agend = consMed.listaConsultas();
        DefaultTableModel tbl = (DefaultTableModel) ConsultasMedicos.getModel();
        tbl.setNumRows(0);
        
        if(agend != null){
            for(int i = 0; i < agend.size(); i ++){
                tbl.insertRow(tbl.getRowCount(), new Object[]{
                    agend.get(i).getNomePac(),
                    agend.get(i).getNomeMed(),
                    agend.get(i).getEspecialidade(),
                    agend.get(i).getData_consulta(),
                    agend.get(i).getTurno_consulta()
                });
            }
        } else {
            tbl.insertRow(tbl.getRowCount(), new Object[]{
                null, null, null
            });
        }
    }
    
    public void atualizaTabelaConsDents(){;
        List<Agendamento> agend = consDent.listaConsultas();
        DefaultTableModel tbl = (DefaultTableModel) ConsultasDentistas.getModel();
        tbl.setNumRows(0);
        
        if(agend != null){
            for(int i = 0; i < agend.size(); i ++){
                tbl.insertRow(tbl.getRowCount(), new Object[]{
                    agend.get(i).getNomePac(),
                    agend.get(i).getNomeMed(),
                    agend.get(i).getEspecialidade(),
                    agend.get(i).getData_consulta(),
                    agend.get(i).getTurno_consulta()
                });
            }
        } else {
            tbl.insertRow(tbl.getRowCount(), new Object[]{
                null, null, null
            });
        }
    }
   
        
    public Agenda() {
        initComponents();
        atualizaTabelaConsMedicos();
        atualizaTabelaConsDents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Consultas_Marcadas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ConsultasMedicos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ConsultasDentistas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3-logo2.jpg"))); // NOI18N

        Consultas_Marcadas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Consultas_Marcadas.setText("Consultas Marcadas ");

        ConsultasMedicos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ConsultasMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Paciente", "Médico", "Especialidade", "Data", "Horário"
            }
        ));
        jScrollPane2.setViewportView(ConsultasMedicos);

        ConsultasDentistas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ConsultasDentistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Paciente", "Dentista", "Especialidade", "Data", "Horário"
            }
        ));
        jScrollPane3.setViewportView(ConsultasDentistas);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(310, 310, 310))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Consultas_Marcadas)
                        .addGap(361, 361, 361))))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Consultas_Marcadas)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(44, 44, 44))
        );

        setBounds(0, 0, 934, 744);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PainelInicial panInitial = new PainelInicial();
        panInitial.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ConsultasDentistas;
    private javax.swing.JTable ConsultasMedicos;
    private javax.swing.JLabel Consultas_Marcadas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
