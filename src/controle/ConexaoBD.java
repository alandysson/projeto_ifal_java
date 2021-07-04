
package controle;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
//    private String driver = "org.postgresql.Driver";
//    private String url = "jdbc:postgresql://localhost:5432/projetofinal";
//    private String user = "postgres";
//    private String password = "root";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/projeto_final";
    private String user = "root";
    private String password = "root";
    public Connection connect;
    
    public void conexao(){
        System.setProperty("jdbc:Drivers", driver);
        try {
            connect = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao se conectar com o banco de dados!");
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = (Statement) connect.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconecta(){
        try {
            connect.close();
            System.out.println("Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar!");
        }
    }
}
