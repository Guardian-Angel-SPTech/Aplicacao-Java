package sptech.school.guardian.angel.project;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class CadastroMaquina {
    InformacoesLooca il = new InformacoesLooca();
    ConexaoMySql conexao = new ConexaoMySql();
    JdbcTemplate con = conexao.getConexao();

    public void cadastrarInfsMaquina(){
        
        String sitOp = il.looca.getSistema().getSistemaOperacional();
        String fabricante = il.looca.getSistema().getFabricante();
        
        
        
        List<Maquina> infMaquina = con.query
        ("SELECT idMaquina, nomeMaquina, statusMaquina, processo, usoProcesso, si FROM maquina", new BeanPropertyRowMapper(Funcionario.class));
        
    }
    
}
