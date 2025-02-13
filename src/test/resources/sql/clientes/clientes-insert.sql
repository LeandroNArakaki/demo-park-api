insert into USUARIOS(id, username, password , role) values (100, 'ana@email.com','$2a$10$0YyRmTThtJrOW4P2c/a08.NbjoDfkKbTRNdV9fPDnBU40B4MdgjeG', 'ROLE_ADMIN');
insert into USUARIOS(id, username, password , role) values (101, 'bia@email.com','$2a$10$0YyRmTThtJrOW4P2c/a08.NbjoDfkKbTRNdV9fPDnBU40B4MdgjeG', 'ROLE_CLIENTE');
insert into USUARIOS(id, username, password , role) values (102, 'bob@email.com','$2a$10$0YyRmTThtJrOW4P2c/a08.NbjoDfkKbTRNdV9fPDnBU40B4MdgjeG', 'ROLE_CLIENTE');
insert into USUARIOS(id, username, password , role) values (103, 'toby@email.com','$2a$10$0YyRmTThtJrOW4P2c/a08.NbjoDfkKbTRNdV9fPDnBU40B4MdgjeG', 'ROLE_CLIENTE');

insert into CLIENTES(id, nome, cpf, id_usuario) values (10,'Bianca Silva', '56209156037', 101);
insert into CLIENTES(id, nome, cpf, id_usuario) values (20,'Roberto Gomes', '46145876077', 102);
