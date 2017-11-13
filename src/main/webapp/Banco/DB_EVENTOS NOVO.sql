create database DB_EVENTOS
go 

use DB_EVENTOS

create table TiposEventos
(
id int primary key identity
,tipoEvento varchar(100) 
,inativo int
)
go

insert into TiposEventos (tipoEvento,inativo) values ('Musical',0)
go
insert into TiposEventos (tipoEvento,inativo) values ('Entreterimento',0)
go
insert into TiposEventos (tipoEvento,inativo) values ('Palestra',0)
go

create table Paises
(
id int primary key identity
,pais varchar(100)
,sigla char(3)
,inativo int
)
go

insert into Paises (pais,sigla,inativo) values ('Brasil','BRA',0)
go

create table Estados
(
id int primary key identity
,estado varchar(100)
,sigla char(2)
,idPaises int not null
,inativo int
CONSTRAINT FK_Estados_Paises FOREIGN KEY(idPaises) REFERENCES Paises(id)
)
go

insert into Estados (estado,sigla,idpaises,inativo) values ('São Paulo','SP',1,0)
go

create table Cidades
(
id int primary key identity
,cidade varchar(100)
,sigla char(2)
,idEstados int null
,idPaises int null
,inativo int 
,CONSTRAINT FK_Cidades_Estados FOREIGN KEY(idEstados) REFERENCES Estados(id)
,CONSTRAINT FK_Cidades_Paises FOREIGN KEY(idPaises) REFERENCES Paises(id)
)
go

insert into Cidades (cidade,sigla,idEstados,idPaises,inativo) values ('São Paulo','SP',1,1,0)
go

create table Enderecos
(
id int primary key identity
,logradouro varchar(200)
,numero varchar(20)
,complemento varchar(100)
,bairro varchar(100)
,idCidades int null
,idEstados int null
,idPaises int not null
,inativo int
,CONSTRAINT FK_Enderecos_Paises FOREIGN KEY(idPaises) REFERENCES Paises(id) 
,CONSTRAINT FK_Enderecos_Estados FOREIGN KEY(idEstados) REFERENCES Estados(id)
,CONSTRAINT FK_Enderecos_Cidades FOREIGN KEY(idCidades) REFERENCES Cidades(id)
)
go

create table Usuarios
(
id int primary key identity
,usuario varchar(50)
,chave varchar(512)
,tipo int 
,inativo int
)
go

insert into Usuarios (usuario,chave,tipo,inativo) values ('cadastec','cadastec',0,0)
go

create table Pessoas
(
id int primary key identity
,nome varchar(100)
,sobrenome varchar(100)
,CPF varchar(50)
,dataDeNascimento datetime
,idUsuarios int
,inativo int
,CONSTRAINT FK_Pessoas_Usuarios				FOREIGN KEY(idUsuarios)				REFERENCES Usuarios(id)
)
go

create table Empresas
(
id int primary key identity
,nomeFantasia varchar(100)
,razaoSocial varchar(100)
,CNPJ varchar(50)
,dataDeCriacao datetime
,idUsuarios int
,inativo int
,CONSTRAINT FK_Empresas_Usuarios			FOREIGN KEY(idUsuarios)		REFERENCES Usuarios(id)
)
go

create table Eventos
(
id int primary key identity
,titulo varchar(100)
,descricao varchar(max)
,dataHoraInicial datetime
,dataHoraFinal datetime
,dataPromover datetime
,idEnderecos int
,idPessoas int 
,idEmpresas int 
,idTiposEventos int 
,inativo int
CONSTRAINT FK_Eventos_Enderecos				FOREIGN KEY(idEnderecos)			REFERENCES Enderecos(id)
,CONSTRAINT FK_Eventos_Pessoas				FOREIGN KEY(idPessoas)				REFERENCES Pessoas(id)
,CONSTRAINT FK_Eventos_Empresas				FOREIGN KEY(idEmpresas)				REFERENCES Empresas(id)
,CONSTRAINT FK_Eventos_TiposEventos			FOREIGN KEY(idTiposEventos)			REFERENCES TiposEventos(id)
)
go

create table Contatos
(
id int primary key identity
,ddd char(33)
,numero char(9)
,email varchar(100)
,site varchar(100)
,idPessoas int
,idEventos int
,inativo int
,CONSTRAINT FK_Contatos_Eventos				FOREIGN KEY(idEventos)				REFERENCES Eventos(id)
,CONSTRAINT FK_Contatos_Pessoas				FOREIGN KEY(idPessoas)				REFERENCES Pessoas(id)
)
go

create table Inscricoes
(
id int primary key identity
,idPessoas int
,idEmpresas int
,idEventos int
,inativo int
,CONSTRAINT FK_Inscricoes_Pessoas				FOREIGN KEY(idPessoas)				REFERENCES Pessoas(id)
,CONSTRAINT FK_Inscricoes_Empresas				FOREIGN KEY(idEmpresas)				REFERENCES Empresas(id)
,CONSTRAINT FK_Inscricoes_Eventos				FOREIGN KEY(idEventos)				REFERENCES Eventos(id)
)
go