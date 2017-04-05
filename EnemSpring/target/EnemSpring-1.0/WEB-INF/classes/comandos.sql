create table disciplinas (
	id bigint not null primary key auto_increment,
    titulo varchar(45) not null,
    descricao text,
    dthrcadastro timestamp not null default current_timestamp,
    idativo boolean not null default true,
    idusuario bigint not null,
    CONSTRAINT FOREIGN KEY (idusuario) REFERENCES usuario (id)

);