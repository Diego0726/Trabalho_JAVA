package DAO;


<<<<<<< HEAD
=======
import DTO.DoramaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


>>>>>>> db0fd768d474d3891f82c3615b40c2aac562355a
public class DoramaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarDorama(UsuarioDTO objusuariodto) {
        String sql = "insert into usuario (plataforma, nome, genero, temp, eps,observacao) values (?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
          
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getplataforma());
            pstm.setString(2, objusuariodto.getnome());
            pstm.setString(3, objusuariodto.getgenero());
            pstm.setString(4, objusuariodto.gettemp());
            pstm.setString(5, objusuariodto.geteps());
            pstm.setString(6, objusuariodto.getobservacao());
            
            
            pstm.execute();
            pstm.close();
         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
        }
        
        public ResultSet autenticacaoUsuario(DoramaDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where plataforma = ? and nome = ? and genero = ? and temp = ? and eps = ? and observacao ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getplataforma());
            pstm.setString(2, objusuariodto.getnome());
            pstm.setString(3, objusuariodto.getgenero());
            pstm.setString(4, objusuariodto.gettemp());
            pstm.setString(5, objusuariodto.geteps());
            pstm.setString(6, objusuariodto.getobservacao());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "JOptionPaneUsuarioDAO: " + erro);
            return null;
        }
    }
    
    
    
    
    
}
