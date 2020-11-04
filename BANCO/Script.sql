/*MYSQL*/

create database integrador;
use integrador;

commit;

create table Usuario(
id_usuario int,
nome_usuario varchar(50),
email_usuario varchar(30),
senha_usuario varchar(25),
primary key (id_usuario)
);

create table Clinica(
id_clinica int,
nome_clinica varchar(50),
endereco_clinica varchar(150),
cep_clinica int,
cnpj_clinica int,
telefone_clinica int,
email_clinica varchar(30),
senha_clinica varchar(25),
primary key(id_clinica)
);

create table Avaliacao(
id_usuario int,
id_clinica int,
nota int,
avaliacao_texto varchar(500),
foreign key(id_usuario) references Usuario(id_usuario),
foreign key(id_clinica) references Clinica(id_clinica)
);