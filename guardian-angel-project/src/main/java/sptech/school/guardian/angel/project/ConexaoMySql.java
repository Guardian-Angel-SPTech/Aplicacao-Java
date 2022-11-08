/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.guardian.angel.project;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoMySql {

    public void conexaoBanco() {
        try {
            String url = "jdbc:mysql://localhost/GuardianAngel";

            String usuario = "aluno";

            String senha = "sptech";

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {

            ex.printStackTrace();

        }
    }
}
