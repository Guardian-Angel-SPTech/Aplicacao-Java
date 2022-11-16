create database GuardianAngel;
use GuardianAngel;

create table empresa (
idEmpresa int primary key auto_increment,
cnpj char(14),
email varchar(45),
nomeEmpresa varchar(45)
);

create table funcionario (
idFuncionario int primary key auto_increment,
nome varchar(45),
cpf char(11),
email varchar(45),
senha varchar(45),
nivelAcesso char(1),
fkEmpresa int,
foreign key (fkEmpresa) references empresa (idEmpresa)
);

create table maquina (
idMaquina int primary key auto_increment,
ID char(17),
statusMaquina varchar(45),
sistOp varchar(45),
fkEmpresa int,
foreign key (fkEmpresa) references empresa (idEmpresa),
fkFuncionario int,
foreign key (fkFuncionario) references funcionario (idFuncionario)
);

create table registro (
idRegistro int auto_increment,
fkMaquina int,
componente varchar(20),
processo varchar(45),
usoProcesso decimal(5,2),
registroComponente decimal,
horaRegistro time,
dataRegistro date,
primary key(idRegistro, fkMaquina)
);

insert into empresa values
(null, '43669182000109', 'empresa1', 'empresa' );

insert into funcionario(nome, email, senha, fkEmpresa) values 
('joao', 'joao@gmail.com', '123', 1);

insert into funcionario(nome, email, senha, fkempresa) values 
('jorge', 'jorge@gmail.com', '123', 1);

insert into maquina(nomeMaquina,fkEmpresa, fkFuncionario) values
('maquina 1', 1, 3);

select * from funcionario;
select * from registro;

select nome, funcionario.email ,senha, funcionario.fkEmpresa from funcionario, empresa, maquina where
idEmpresa = maquina.fkempresa and idFuncionario = maquina.fkFuncionario and idEmpresa = funcionario.fkEmpresa;


