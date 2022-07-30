create database lojaBD;

-- Criar tabela com as colunas, para posteriormente cadastrar
-- os registros.
create table carros(
    id INT PRIMARY KEY auto_increment,
    modelo VARCHAR(100),
    marca VARCHAR(50),
    preco DOUBLE
);

-- Consultar os registros da tabela de carros
Select * FROM carros; -- eu nao vou esquecer o asteristico >:)
Select modelo from carros;

INSERT INTO carros(modelo, marca, preco) VAlues
('Fusca 72', 'VW', 15000);

CREATE TABLE jogos(
	id INT primary key auto_increment,
    nome varchar(150),
    tipo varchar(30)
);

select * FROM jogos;