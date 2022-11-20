# AplicacaoJava

Se for usar na AWS DOCKER
ir em ConexaoMysql
mudar as configurações de:

        datasource.setUsername("aluno");
        datasource.setPassword("sptech"); 
Para: 

        datasource.setUsername("root");
        datasource.setPassword("urubu100");
        
Se persistir em em erro com driver mude está linha:

        datasource.setUrl("jdbc:mysql://localhost:3306/GuardianAngel?useTimezone=true&serverTimezone=UTC");
Para: 

        datasource.setUrl("jdbc:mysql://localhost:3306/GuardianAngel");
        
E lembrar de cadastrar seu ip na Azure
