
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
import modelo.Dentista;

public class ControleDentista {
    ConexaoBD conexao = new ConexaoBD();
    Dentista modDent = new Dentista();
    
    public void salvar(Dentista mod){
            
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.connect.prepareStatement(
            "insert into dentista(nome, data_nascimento, cpf, rg, cidade, endereco, numero, complemento, bairro, cep, telefone, email, especialidade, cro) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            pst.setInt(14, mod.getCro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvo!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserior os dados! \n" + ex);
        }
        conexao.desconecta();      
    }

    public List<Dentista> listarDentistas(){
        String sql = "SELECT * FROM dentista";
        List<Dentista> dados = new ArrayList<Dentista>();
        conexao.conexao();
        try{
            Statement st = conexao.connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Dentista dent = null;

            if(rs == null){
                System.out.println("A tabela esta vazia");
            } else {
                while(rs.next()){
                    dent = new Dentista();
                    dent.setNome(rs.getString("nome"));
                    dent.setCpf(rs.getInt("cpf"));
                    dent.setCro(rs.getInt("cro"));
                    dent.setEspecialidade(rs.getString("especialidade"));
                    dados.add(dent);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return dados;
    }
    
    public Dentista buscarDentista(Dentista dentista){
        conexao.conexao();
        conexao.executaSql("SELECT * FROM dentista WHERE cpf like '%"+dentista.getPesquisa()+"%'");

        try {
            conexao.rs.first();
            dentista.setCod(conexao.rs.getInt("cod"));
            dentista.setNome(conexao.rs.getString("nome"));
            dentista.setData_nascimento(conexao.rs.getDate("data_nascimento"));
            dentista.setCpf(conexao.rs.getInt("cpf"));
            dentista.setRg(conexao.rs.getInt("rg"));
            dentista.setEndereco(conexao.rs.getString("endereco"));
            dentista.setNumero(conexao.rs.getInt("numero"));
            dentista.setComplemento(conexao.rs.getString("complemento"));
            dentista.setBairro(conexao.rs.getString("bairro"));
            dentista.setCep(conexao.rs.getInt("cep"));
            dentista.setTelefone(conexao.rs.getInt("telefone"));
            dentista.setEmail(conexao.rs.getString("email"));
            dentista.setEspecialidade(conexao.rs.getString("especialidade"));
            dentista.setCro(conexao.rs.getInt("cro"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Dentista! \n" + ex);
        }
        conexao.desconecta();
        
        return dentista;
    }
    
    public void atualizaDentista(Dentista mod){
        conexao.conexao();    
        try {
             PreparedStatement pst = conexao.connect.prepareStatement("UPDATE dentista set nome=?, data_nascimento=?, cpf=?, rg=?, cidade=?, endereco=?, numero=?, complemento=?, bairro=?, cep=?, telefone=?, email=?, especialidade=?, cro=? where cod=?");
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
            pst.setInt(14, mod.getCro());
            pst.setInt(15, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados do dentista "+ mod.getNome()+ " alterado! \n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados! \n" + ex);
        }
        
    }
}


