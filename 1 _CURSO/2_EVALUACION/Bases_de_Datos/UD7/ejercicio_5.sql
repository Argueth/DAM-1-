DROP DATABASE IF EXISTS alumnado;
DROP DATABASE IF EXISTS profesorado;
DROP DATABASE IF EXISTS sistema;
CREATE DATABASE alumnado;
CREATE DATABASE profesorado;
CREATE DATABASE sistema;
USE alumnado;
CREATE TABLE estudiantes (id INT PRIMARY KEY, nombre VARCHAR(50));
CREATE TABLE materias (id INT PRIMARY KEY, nombre VARCHAR(50));
CREATE TABLE notas (id INT PRIMARY KEY, nombre VARCHAR(50));
USE profesorado;
CREATE TABLE docentes (id INT PRIMARY KEY, nombre VARCHAR(50));
CREATE TABLE documentos (id INT PRIMARY KEY, nombre VARCHAR(50));
USE sistema;
CREATE TABLE eventos (id INT PRIMARY KEY, nombre VARCHAR(50));
CREATE TABLE matriculas (id INT PRIMARY KEY, nombre VARCHAR(50));
CREATE TABLE estudios (id INT PRIMARY KEY, nombre VARCHAR(50));

create user if not exists 'ursula'@224.8.53.524 identified by '123';
create user if not exists 'ursula'@254.258.25.2 identified by '123';
create user if not exists 'ursula'@localhost identified by '123';

create user if not exists 'jordan'@254.8.5.22 identified by '123';
create user if not exists 'jordan'@254.258.25.2 identified by '123';
create user if not exists 'jordan'@'%' identified by '123';

create user if not exists 'izan'@214.28.5.4 identified by '123';
create user if not exists 'izan'@254.258.25.2 identified by '123';

create user if not exists 'katia'@224.18.5.40 identified by '123';
create user if not exists 'katia'@254.258.25.2 identified by '123';

create user if not exists 'web'@254.258.25.1 identified by '123';
create user if not exists 'aules'@211.11.12.13 identified by '123';
create user if not exists 'app'@254.258.25.3 identified by '123';

grant select on *.* to ursula@224.8.53.524, jordan@254.8.5.22, izan@214.28.5.4, katia@224.18.5.40;
grant select, insert, update, delete on *.* to ursula@254.258.25.2, jordan@254.258.25.2, izan@254.258.25.2, katia@254.258.25.2;
grant all privileges on *.* to ursula@254.258.25.4 with grant option;
grant select on sistema.eventos to jordan@'%';
grant select on sistema.estudios to web@254.258.25.1;
grant select, insert, update, delete on alumnado.* to aules@211.11.12.13;
grant select, insert, update, delete on profesorado.* to app@254.258.25.3;
flush privileges;

revoke delete on alumnado.* from aules@211.11.12.13;
revoke delete on profesorado.* from app@254.258.25.3;
flush privileges;

revoke select on *.* from izan@214.28.5.4;
create user if not exists 'izan'@214.28.5.6 identified by '123';
grant select on *.* to izan@214.28.5.6;
flush privileges;
alter user ursula@localhost identified by '983422nsd78';


