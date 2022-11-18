
package sptech.school.guardian.angel.project;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoMySql {

    private JdbcTemplate conexao;

    public ConexaoMySql() {
        BasicDataSource datasource = new BasicDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://54.234.128.170:3306/GuardianAngel");
        datasource.setUsername("root");
        datasource.setPassword("urubu100");
        conexao = new JdbcTemplate(datasource);
}
    public JdbcTemplate getConexao(){
        return conexao;
    }

}
