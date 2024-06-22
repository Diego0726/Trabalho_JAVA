package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DTO.DoramaDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DoramaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<DoramaDTO> lista = new ArrayList<>();

    public void cadastrarDorama(DoramaDTO objdoramadto) {
        String sql = "INSERT INTO doramas (plataforma, nome, genero, temp, eps, observacao, usuario_email) VALUES (?, ?, ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objdoramadto.getPlataforma());
            pstm.setString(2, objdoramadto.getNome());
            pstm.setString(3, objdoramadto.getGenero());
            pstm.setString(4, objdoramadto.getTemp());
            pstm.setString(5, objdoramadto.getEps());
            pstm.setString(6, objdoramadto.getObservacao());
            pstm.setString(7, objdoramadto.getUsuario_email());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DoramaDAO: " + erro);
        }
    }

    public ArrayList<DoramaDTO> pesquisarDorama() {
        String sql = "select plataforma as Plataforma, nome as Nome, genero as Gênero, temp as Temporada, eps as Episódio, observacao as Observação from doramas;";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                DoramaDTO objdoramadto = new DoramaDTO();
                objdoramadto.setPlataforma(rs.getString("plataforma"));
                objdoramadto.setNome(rs.getString("nome"));
                objdoramadto.setGenero(rs.getString("genero"));
                objdoramadto.setTemp(rs.getString("temp"));
                objdoramadto.setEps(rs.getString("eps"));
                objdoramadto.setObservacao(rs.getString("observacao"));
                

                lista.add(objdoramadto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DoramaDAO: pesquisarDorama" + erro);
        }

        return lista;
    }
}
