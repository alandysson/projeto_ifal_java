package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Medico;
import modelo.Paciente;

public class ControlePaciente {
    ConexaoBD conexaoBD = new ConexaoBD();
    Paciente modelPaciente = new Paciente();
    
    public void salvar(Paciente modelPaciente){
        conexaoBD.conexao();
        try {
            PreparedStatement pst = conexaoBD.connect.prepareStatement(
            "insert into paciente(nome, data_nascimento, cpf, rg, endereco, numero, complemento, bairro, cep, telefone, email) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, modelPaciente.getNome());
            pst.setDate(2, new java.sql.Date(modelPaciente.getData_nascimento().getTime()));
            pst.setInt(3, modelPaciente.getCpf());
            pst.setInt(4, modelPaciente.getRg());
            pst.setString(5, modelPaciente.getEndereco());
            pst.setInt(6, modelPaciente.getNumero());
            pst.setString(7, modelPaciente.getComplemento());
            pst.setString(8, modelPaciente.getBairro());
            pst.setInt(9, modelPaciente.getCep());
            pst.setInt(10, modelPaciente.getTelefone());
            pst.setString(11, modelPaciente.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvo!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserior os dados! \n" + ex);

        }
        conexaoBD.desconecta();      
    }

    public List<Paciente> listarPacientes(){
        String sql = "SELECT * FROM paciente";
        List<Paciente> dados = new ArrayList<Paciente>();
        conexaoBD.conexao();
    try{
        Statement st = conexaoBD.connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Paciente pacientes = null;

        if(rs == null){
            System.out.println("A tabela esta vazia");
        } else {
            while(rs.next()){
                pacientes = new Paciente();
                pacientes.setId(rs.getInt("id"));
                pacientes.setNome(rs.getString("nome"));
                pacientes.setCpf(rs.getInt("cpf"));
                pacientes.setRg(rs.getInt("rg"));
                dados.add(pacientes);
            }
        }
    } catch (Exception e){
        e.printStackTrace();
    }

        return dados;
    }
    
    public Paciente buscarPaciente(Paciente paciente){
        conexaoBD.conexao();
        conexaoBD.executaSql("SELECT * FROM paciente WHERE cpf like '%"+paciente.getPesquisa()+"%'");

        try {
            conexaoBD.rs.first();
            paciente.setNome(conexaoBD.rs.getString("nome"));
            paciente.setCpf(conexaoBD.rs.getInt("cpf"));
            paciente.setTelefone(conexaoBD.rs.getInt("telefone"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar paciente! \n" + ex);
        }
        conexaoBD.desconecta();
        
        return paciente;
    }
}
