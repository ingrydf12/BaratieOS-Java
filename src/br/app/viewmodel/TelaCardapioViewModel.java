package br.app.viewmodel;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import br.app.service.ModuloConexao;
import net.proteanit.sql.DbUtils;

public class TelaCardapioViewModel {

    private Connection conexao;

    //Conexão com o banco
    public TelaCardapioViewModel() {
        try {
            this.conexao = ModuloConexao.conector();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Filtra dependendo da categoria aqui na tabela de pratos
    public DefaultTableModel filtrarPorCategoria(String categoria) {
        String sql = "SELECT * FROM tbpratos WHERE categoria = ?";

        try (PreparedStatement pst = conexao.prepareStatement(sql)) {
            pst.setString(1, categoria);
            ResultSet rs = pst.executeQuery();
            return (DefaultTableModel) DbUtils.resultSetToTableModel(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet getAllPlates() {
        String queryAll = "SELECT * FROM tbpratos";
        
        try (PreparedStatement pst = conexao.prepareStatement(queryAll)) {
            ResultSet rs = pst.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
