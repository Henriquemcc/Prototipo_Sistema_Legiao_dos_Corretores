create table pessoa(
    id bigint not null auto_increment,
    nome varchar(100),
    sobrenome varchar(100),
    rg varchar(14),
    cpf varchar(14),
    telefone varchar(15),
    email varchar(254),
    primary key(id)
);

create table usuario(
    id bigint not null auto_increment,
    pessoa_id bigint not null,
    senha text not null,
    primary key(id),
    foreign key(pessoa_id) references pessoa(id)
);