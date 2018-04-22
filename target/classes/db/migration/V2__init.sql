
CREATE TABLE IF NOT EXISTS `user`(
  `user_id` INT AUTO_INCREMENT,
  `name`VARCHAR(255),
  `email` VARCHAR(2000),
  `company_id` INT,
  `state` VARCHAR(50),
  `city` VARCHAR(50),
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `company` (
  `company_id` INT AUTO_INCREMENT,
  `name` VARCHAR(50),
  `state` VARCHAR(50),
  `city` VARCHAR(50),
  PRIMARY KEY(`id`)
);

INSERT INTO `user` (name, email) VALUES ('Mirko', 'mirko@gmail.com');

