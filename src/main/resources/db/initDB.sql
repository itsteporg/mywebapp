DROP TABLE IF EXISTS cf_roles;
DROP TABLE IF EXISTS cf_users;
DROP TABLE IF EXISTS cf_users_cf_roles;

CREATE TABLE cf_users
(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(15),
  lastname VARCHAR(20),
  city VARCHAR(30),
  email VARCHAR(25) UNIQUE,
  password VARCHAR(30) UNIQUE ,
  enabled BOOLEAN DEFAULT TRUE
);

CREATE TABLE cf_roles(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(15)
);

CREATE TABLE cf_users_cf_roles(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  user_id INTEGER REFERENCES cf_users(id),
  role_id INTEGER REFERENCES cf_roles(id)
);

INSERT INTO cf_roles (name) VALUES ('USER_ROLE');
INSERT INTO cf_roles (name) VALUES ('ADMIN_ROLE');

INSERT INTO cf_users VALUES (DEFAULT, 'nick', 'dalas', 'dnipro', 'user@gmail.com','qwerty', DEFAULT);
INSERT INTO cf_users VALUES (DEFAULT, 'angela', 'hike', 'kyiv', 'ang@yahoo.com', '123456', DEFAULT);

INSERT INTO cf_users_cf_roles (user_id, role_id) VALUES (1,1);
INSERT INTO cf_users_cf_roles (user_id, role_id) VALUES (2,2);
INSERT INTO cf_users_cf_roles (user_id, role_id) VALUES (2,1);