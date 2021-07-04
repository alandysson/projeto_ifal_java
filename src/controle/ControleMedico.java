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

public class ControleMedico {
    ConexaoBD conexaoBD = new ConexaoBD();
    Medico mod = new Medico();
    
    public void salvar(Medico mod){
        conexaoBD.conexao();
        try {
            PreparedStatement pst = conexaoBD.connect.prepareStatement(
            "insert into medico(nome, data_nascimento, cpf, rg, cidade, endereco, numero, complemento, bairro, cep, telefone, email, especialidade, crm) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setDate(2, new java.sql.Date(mod.getData_nascimento().getTime()));
            pst.setInt(3, mod.getCpf());
            pst.setInt(4, mod.getRg());
            pst.setString(5, mod.getCidade());
            pst.setString(6, mod.getEndereco());
            pst.setInt(7, mod.getNumero());
            pst.setString(8, mod.getComplemento());
            pst.setString(9, mod.getBairro());
            pst.setInt(10, mod.getCep());
            pst.setInt(11, mod.getTelefone());
            pst.setString(12, mod.getEmail());
            pst.setString(13, mod.getEspecialidade());
            pst.setInt(14, mod.getCrm());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvo!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserior os dados! \n" + ex);

        }
        conexaoBD.desconecta();      
    }
    
    public List<Medico> listarMedicos(){
        String sql = "SELECT * FROM medico";
        List<Medico> dados = new ArrayList<Medico>();
        conexaoBD.conexao();
        try{
            Statement st = conexaoBD.connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Medico medicos = null;

            if(rs == null){
                System.out.println("A tabela esta vazia");
            } else {
                while(rs.next()){
                    medicos = new Medico();
                    medicos.setNome(rs.getString("nome"));
                    medicos.setCpf(rs.getInt("cpf"));
                    medicos.setCrm(rs.getInt("crm"));
                    medicos.setEspecialidade(rs.getString("especialidade"));
                    dados.add(medicos);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return dados;
    }
    
    public void excluirMedico(int codigo){
        String sql = "DELETE FROM medico WHERE codigo=?";
        try {
            PreparedStatement ps = conexaoBD.connect.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados do medico excluido com sucesso!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir os dados!" + e);
        }
    }
}
