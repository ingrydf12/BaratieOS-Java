create database baratieapp;
use baratieapp;

CREATE TABLE  tbclientes(
idcliente int key auto_increment,
nome varchar (20) not null,
login varchar (50) not null,
senha varchar (12) not null);

CREATE TABLE  tbadmins(
idadmin int key auto_increment,
nome varchar (20) not null,
login varchar (50) not null,
senha varchar (12) not null);

CREATE TABLE tbpratos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(25) NULL,
    quant INT NOT NULL,
    preco INT NOT NULL,
    tipo VARCHAR (25) NOT NULL;
);

select * from tbclientes;

INSERT INTO tbclientes (nome, login, senha) 
VALUES ('Ingryd', 'mail@gmail.com', 'senha1234');

INSERT INTO tbadmins (nome, login, senha) 
VALUES ('JP', 'adm@gmail.com', 'admin@123');