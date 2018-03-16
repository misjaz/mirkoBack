
CREATE TABLE IF NOT EXISTS `user`(
  `id` INT AUTO_INCREMENT,
  `name`VARCHAR(255),
  `email` VARCHAR(2000),
  PRIMARY KEY (`id`)
);

INSERT INTO `user` (name, email) VALUES ('Mirko', 'mirko@gmail.com');