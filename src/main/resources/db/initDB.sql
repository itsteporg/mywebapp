DROP TABLE IF EXISTS cf_users;

CREATE TABLE cf_users
(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(15),
  lastname VARCHAR(20),
  city VARCHAR(30),
  email VARCHAR(25) UNIQUE
);

INSERT INTO cf_users VALUES (NULL, 'nick', 'dalas', 'dnipro', 'user@gmail.com');
INSERT INTO cf_users VALUES (NULL, 'angela', 'hike', 'kyiv', 'ang@yahoo.com');
