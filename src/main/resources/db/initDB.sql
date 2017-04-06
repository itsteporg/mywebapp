DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS users;

CREATE TABLE users
(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(15),
  lastname VARCHAR(20),
  city VARCHAR(30),
  email VARCHAR(25) UNIQUE,
  password VARCHAR(20) NOT NULL,
  enabled BOOLEAN
);

CREATE TABLE user_roles
(
  role VARCHAR(15),
  user_id INTEGER,
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

INSERT INTO users VALUES (NULL, 'nick', 'dalas', 'dnipro', 'user@gmail.com', 67890, 1);
INSERT INTO users VALUES (NULL, 'angela', 'hike', 'kyiv', 'ang@yahoo.com', 12345, 1);

INSERT INTO user_roles VALUES ('ROLE_ADMIN', 1);
INSERT INTO user_roles VALUES ('ROLE_USER', 2);
INSERT INTO user_roles VALUES ('ROLE_USER', 1);
