create table pessoa(
    id bigint not null auto_increment,
    nome varchar(100),
    sobrenome varchar(100),
    rg varchar(14),
    cpf varchar(11),
    telefone varchar(15),
    email varchar(254),
    primary key(id)
);

create table usuario(
    idPessoa bigint not null,
    senha text not null,
    primary key(idPessoa),
    foreign key(idPessoa) references pessoa(id)
);