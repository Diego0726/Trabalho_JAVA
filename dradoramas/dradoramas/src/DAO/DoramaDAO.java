package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DTO.DoramaDTO;

public class DoramaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarDorama(DoramaDTO objdoramadto) {
        String sql = "INSERT INTO doramas (plataforma, nome, genero, temp, eps, observacao, usuario_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();
          
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objdoramadto.getPlataforma());
            pstm.setString(2, objdoramadto.getNome());
            pstm.setString(3, objdoramadto.getGenero());
            pstm.setString(4, objdoramadto.getTemp());
            pstm.setString(5, objdoramadto.getEps());
            pstm.setString(6, objdoramadto.getObservacao());
            pstm.setInt(7, objdoramadto.getUsuario().getID()); 
            
            pstm.execute();
            pstm.close();
         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DoramaDAO: " + erro);
        }
    }
}
