package DAO;


import java.sql.Connection;
import java.sql.SQLException;
import DTO.DoramaDTO;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


public class DoramaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    

    public void cadastrarDorama(DoramaDTO objDoramadto) {
        String sql = "insert into usuario (plataforma, nome, genero, temp, eps, observacao) values (?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();
          
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objDoramadto.getplataforma());
            pstm.setString(2, objDoramadto.getnome());
            pstm.setString(3, objDoramadto.getgenero());
            pstm.setString(4, objDoramadto.gettemp());
            pstm.setString(5, objDoramadto.geteps());
            pstm.setString(6, objDoramadto.getobservacao());
            
            pstm.execute();
            pstm.close();
         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DoramaDAO: " + erro);
        }
    }
} 
        

    
    
    
   
