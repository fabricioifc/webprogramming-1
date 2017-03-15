drop table if exists usuario_roles;
drop table if exists roles;

create table roles (
    descricao varchar(20) not null primary key
);

insert into roles values ('USUARIO');
insert into roles values ('ADMIN');
insert into roles values ('DESENVOLVEDOR');

create table usuario_roles (
    id bigint not null primary key auto_increment,
    usuario_id bigint not null,
    role varchar(20) not null,
    unique(usuario_id, role),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (role) REFERENCES roles(descricao)
    
);

insert into usuario_roles (usuario_id, role) values (1, 'USUARIO');
insert into usuario_roles (usuario_id, role) values (1, 'ADMIN');
insert into usuario_roles (usuario_id, role) values (1, 'DESENVOLVEDOR');

select * from usuario_roles;