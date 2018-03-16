
DROP TABLE IF EXISTS `app_user`;

CREATE TABLE IF NOT EXISTS `app_user`(
  `id` INT AUTO_INCREMENT,
  `name`VARCHAR(255),
  `email` VARCHAR(2000),
  PRIMARY KEY (`id`)
);

INSERT INTO app_user(name, email) VALUES ('Mirko', 'mirko@gmail.com');