create table usuario(
    id bigint not null auto_increment,
    usuario varchar(100) not null,
    senha text,
    primary key(id)
);

insert into usuario values(1, 'john.doe', '$2a$12$dOsq70AzXkxJrIdFN5.33OjUAMYvx6Ljt0TT3yOy8V0JUAq9LyP1u')