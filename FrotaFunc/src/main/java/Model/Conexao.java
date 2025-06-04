/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Letícia Ferreira
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro";
    private static final String USUARIO = "root";
    private static final String SENHA = "@Lee.2110Ferreira"; // ou a senha que você definiu

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
