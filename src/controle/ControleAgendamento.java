
package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Agendamento;


public class ControleAgendamento {
    ConexaoBD conexaoBD = new ConexaoBD();
    Agendamento agendamento = new Agendamento();
    ConexaoBD conexPaciente = new ConexaoBD();
    ConexaoBD conexMedico = new ConexaoBD();
    
    int codMed;
    int codPac;
    
    public void marcar(Agendamento agendamento){
        buscarPaciente(agendamento.getCpfPac());
        conexaoBD.conexao();
        try {
            PreparedStatement pst = conexaoBD.connect.prepareStatement(
                "insert into consulta(nome, data_consulta, turno_consulta, nome_med, cpf_pac, tipo_consulta) values(?, ?, ?, ?, ?, ?)");
            pst.setString(1, agendamento.getNomePac());
            pst.setDate(2, new java.sql.Date(agendamento.getData_consulta().getTime()));
            pst.setString(3, agendamento.getTurno_consulta());
            pst.setString(4, agendamento.getNomeMed());
            pst.setInt(5, agendamento.getCpfPac());
            pst.setString(6, agendamento.getEspecialidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento feito com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao agendar consulta \n" + ex);
        }
        conexaoBD.desconecta();
    }
    
    
    public void buscarPaciente(int cpfPaciente){
        conexPaciente.conexao();
        conexPaciente.executaSql("select * from paciente where cpf='"+cpfPaciente+"'");
        try {
            conexPaciente.rs.first();
            codMed = conexPaciente.rs.getInt("cpf");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado");
        }
    }
    
        public List<Agendamento> listaConsultas(){
        String sql = "SELECT * FROM consulta";
        List<Agendamento> dados = new ArrayList<Agendamento>();
        conexaoBD.conexao();
        try{
            Statement st = conexaoBD.connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Agendamento agenda = null;

            if(rs == null){
                System.out.println("A tabela esta vazia");
            } else {
                while(rs.next()){
                    agenda = new Agendamento();
                    agenda.setNomePac(rs.getString("nome"));
                    agenda.setNomeMed(rs.getString("nome_med"));
                    agenda.setEspecialidade(rs.getString("tipo_consulta"));
                    agenda.setData_consulta(rs.getDate("data_consulta"));
                    agenda.setTurno_consulta(rs.getString("turno_consulta"));
                    dados.add(agenda);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return dados;
    }
}
