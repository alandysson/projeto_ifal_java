/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controle.ConexaoBD;
import controle.ControleConsultaDent;
import controle.ControleDentista;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Dentista;

public class ListarDentista extends javax.swing.JFrame {

    Dentista dent = new Dentista();
    ConexaoBD conex = new ConexaoBD();
    ControleDentista control = new ControleDentista();
    ControleConsultaDent consDent = new ControleConsultaDent();
    
    public void atualizaTabela(){
        List<Dentista> dentista = control.listarDentistas();
        DefaultTableModel tbl = (DefaultTableModel) TabelaDentistas.getModel();
        tbl.setNumRows(0);
        
        if(dentista != null){
            for(int i = 0; i < dentista.size(); i ++){
                tbl.insertRow(tbl.getRowCount(), new Object[]{
                    dentista.get(i).getNome(),
                    dentista.get(i).getEspecialidade(),
                    dentista.get(i).getCpf(),
                    dentista.get(i).getCro(),
                });
            }
        } else {
            tbl.insertRow(tbl.getRowCount(), new Object[]{
                null, null, null
            });
        }
    }
    public ListarDentista() {
        initComponents();
        atualizaTabela();
        dent.getPesquisa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Agendamento_nome = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDentistas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3-logo2.jpg"))); // NOI18N

        Agendamento_nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Agendamento_nome.setText("Dentistas Disponiveis");

        TabelaDentistas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TabelaDentistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Especialidade", "CRO", "CPF"
            }
        ));
        TabelaDentistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDentistasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaDentistas);

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(310, 310, 310))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Agendamento_nome)
                        .addGap(340, 340, 340))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Agendamento_nome)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(27, 27, 27))
        );

        setSize(new java.awt.Dimension(934, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaDentistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDentistasMouseClicked
        String nome_dent = ""+TabelaDentistas.getValueAt(TabelaDentistas.getSelectedRow(), 0);
        conex.conexao();
        conex.executaSql("select * from dentista where nome='"+nome_dent+"'");
        try {
            conex.rs.first();
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_TabelaDentistasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EditarDentista editDent = new EditarDentista();
        editDent.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PainelInicial panInitial = new PainelInicial();
        panInitial.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


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
            java.util.logging.Logger.getLogger(ListarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ListarDentista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agendamento_nome;
    private javax.swing.JTable TabelaDentistas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
