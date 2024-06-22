package DAO;


import java.sql.Connection;
import java.sql.SQLException;
import DTO.DoramaDTO;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


public class DoramaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    

    public void cadastrarDorama(DoramaDTO objdoramadto) {
        String sql = "insert into doramas (plataforma, nome, genero, temp, eps, observacao) values (?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();
          
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objdoramadto.getplataforma());
            pstm.setString(2, objdoramadto.getnome());
            pstm.setString(3, objdoramadto.getgenero());
            pstm.setString(4, objdoramadto.gettemp());
            pstm.setString(5, objdoramadto.geteps());
            pstm.setString(6, objdoramadto.getobservacao());
            
            
            pstm.execute();
            pstm.close();
         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DoramaDAO: " + erro);
        }
    }
} 
        

    
    
    
   
