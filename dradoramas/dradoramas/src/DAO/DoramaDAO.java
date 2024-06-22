package DAO;


import DTO.DoramaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
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
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
        }
    }
    
        public void autenticaDorama(DoramaDTO objdoramadto){
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where plataforma = ? and nome = ? and genero = ? and temp = ? and eps = ? and observacao = ?";
            
            
            
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
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e);
            }
        }


   
        }}



    
    
    
   
