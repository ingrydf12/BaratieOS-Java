package br.app.conexoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuloConexao {

    public static Connection conector() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/baratieapp"; // Altere com o seu banco
            String user = "root";
            String password = "javaNeverEnd";

            Connection conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}