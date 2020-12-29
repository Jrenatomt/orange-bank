INSERT INTO tb_user (email, password) VALUES ('jose@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);

INSERT INTO tb_account (name, email, cpf, birth_date) VALUES ('Tulio da Silva', 'tulio@gmail.com', '58756008023', TIMESTAMP WITH TIME ZONE '1984-07-21T11:59:19Z');
INSERT INTO tb_account (name, email, cpf, birth_date) VALUES ('Simone Santos', 'simone@gmail.com', '32101627000', TIMESTAMP WITH TIME ZONE '1984-07-21T11:59:19Z');
INSERT INTO tb_account (name, email, cpf, birth_date) VALUES ('Roberto Fernendes', 'roberto@gmail.com', '74014349039', TIMESTAMP WITH TIME ZONE '1984-07-21T11:59:19Z');
INSERT INTO tb_account (name, email, cpf, birth_date) VALUES ('Raquel Marques', 'raquel@gmail.com', '80665016093', TIMESTAMP WITH TIME ZONE '1984-07-21T11:59:19Z');
INSERT INTO tb_account (name, email, cpf, birth_date) VALUES ('Fernando Silveira', 'fernando@gmail.com','62549676009', TIMESTAMP WITH TIME ZONE '1984-07-21T11:59:19Z');