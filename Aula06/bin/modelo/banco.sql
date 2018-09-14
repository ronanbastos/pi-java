CREATE database IF NOT EXISTS aula06;


USE aula06;

CREATE TABLE IF NOT EXISTS usuario(

	idCli int AUTO_INCREMENT PRIMARY KEY,
	nomUsu varchar(40) not null,
	usuario VARCHAR(40) not null,
	senha varchar(40) not null,
	email varchar(40) not null


);

INSERT INTO usuario (nomUsu,usuario,senha,email) values
("Aluno Senac","aluno","1234","aluno@mail.com"),
("Instrutor chato","instritor","1234","instrutor@mail.com");
desc usuario;

desc  usuario;