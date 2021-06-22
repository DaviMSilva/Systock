CREATE database IF NOT EXISTS estoque;

USE estoque;

CREATE table IF NOT exists fornecedores(
	idForne int(2) not null auto_increment,
    nomeForne varchar(13) not null,
    cnpj varchar(18) not null,
    fone varchar(15) not null,
    setor varchar(15) null,
    email varchar(20) null,
    primary key (idForne)
);

CREATE table IF NOT exists produtos(
	idProd int(2) not null auto_increment,
    nomeProd varchar(30) not null,
    descProd varchar(20) null,
    qntProd int not null,
    valUnitProd double not null,
    idForne int not null,
    validade date null,
    valTotalProd double not null,
    primary key (idProd), 
    CONSTRAINT fk_foreign foreign key(idForne) references fornecedores (idForne)
);

CREATE table IF NOT exists usuarios(
	idUser int(2) not null auto_increment,
    userName varchar(13) not null,
    userLogin varchar(13) not null,
    userPassword varchar(13) not null,
    primary key(idUser)
);

create table IF not exists administrador(
	id int(2) not null auto_increment,
    primary key (id),
    idUser int not null,
    constraint fk_foreign1 foreign key(idUser) references usuarios (idUser)

);

insert INTO usuarios(idUser, userName,userLogin,userPassword) VALUES(1,'GERENTE','GERENTE','1234');
insert INTO administrador(id,idUser) VALUES(1,1);


