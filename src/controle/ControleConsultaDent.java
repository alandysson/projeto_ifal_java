package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Agendamento;
import modelo.Medico;

public class ControleConsultaDent {
    ConexaoBD conexaoBD = new ConexaoBD();
    Agendamento agendamento = new Agendamento();
    ConexaoBD conexPaciente = new ConexaoBD();
    ConexaoBD conexDent = new ConexaoBD();
    
    String Espc;
    int codPac;
    
    public void marcar(Agendamento agendamento){
        buscarDent(agendamento.getNomeMed());
        buscarPaciente(agendamento.getCpfPac());
        conexaoBD.conexao();
        try {
            PreparedStatement pst = conexaoBD.connect.prepareStatement(
                "insert into cons_dentistas(nome, data_consulta, turno_consulta, nome_dent, cpf_pac, tipo_consulta) values(?, ?, ?, ?, ?, ?)");
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
    
    public void buscarDent(String nomeMed){
        System.out.print(agendamento.getNomeMed());
        conexDent.conexao();
        conexDent.executaSql("select * from dentista where nome='"+nomeMed+"'");
        try {
            conexDent.rs.first();
            Espc = conexDent.rs.getString("especialidade");           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dentista não encontrado");
        }
    }
//    
    public void buscarPaciente(int cpfPaciente){
        conexPaciente.conexao();
        conexPaciente.executaSql("select * from paciente where cpf='"+cpfPaciente+"'");
        try {
            conexPaciente.rs.first();
            codPac = conexPaciente.rs.getInt("cpf");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado");
        }
    }
    
    public List<Agendamento> listaConsultas(){
        String sql = "SELECT * FROM cons_dentistas";
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
                    agenda.setNomeMed(rs.getString("nome_dent"));
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
