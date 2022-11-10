/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.guardian.angel.project;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoMySql {

    private JdbcTemplate conexao;

    public ConexaoMySql() {
        BasicDataSource datasource = new BasicDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost : 3306/GuardianAngel");
        datasource.setUsername("aluno");
        datasource.setPassword("sptech");
        conexao = new JdbcTemplate(datasource);
    }
    public JdbcTemplate getConexao(){
        return conexao;
    }

}
