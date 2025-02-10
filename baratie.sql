create database baratieapp;
use baratieapp;

create table tbclientes(
idcliente int key auto_increment,
nome varchar (20) not null,
login varchar (14) not null,
senha varchar (12) not null);

create table tbadmins(
idadmin int key auto_increment,
nome varchar (20) not null,
login varchar (25) not null,
senha varchar (12) not null);

select * from tbclientes;

INSERT INTO tbclientes (nome, login, senha) 
VALUES ('Ingryd', 'mail@gmail.com', 'senha1234');

INSERT INTO tbadmins (nome, login, senha) 
VALUES ('JP', 'adm@gmail.com', 'admin@123');