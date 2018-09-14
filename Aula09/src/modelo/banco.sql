CREATE DATABASE IF NOT EXISTS banco2;
use banco2;

CREATE TABLE IF NOT EXISTS cadastro(

	idCli int AUTO_INCREMENT PRIMARY KEY,
	nome varchar(40) not null,
	email varchar(40) not null


);

d