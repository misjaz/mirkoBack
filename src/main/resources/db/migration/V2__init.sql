
CREATE TABLE IF NOT EXISTS `company` (
  `company_id` INT AUTO_INCREMENT,
  `name` VARCHAR(50),
  `state` VARCHAR(50),
  `city` VARCHAR(50),
  PRIMARY KEY(`company_id`)
);

CREATE TABLE IF NOT EXISTS `user`(
  `user_id` INT AUTO_INCREMENT,
  `name`VARCHAR(255),
  `email` VARCHAR(2000),
  `company_id` INT,
  `state` VARCHAR(50),
  `city` VARCHAR(50),
  PRIMARY KEY (`user_id`),
  FOREIGN KEY (`company_id`) REFERENCES company(`company_id`)
);


INSERT INTO `user` (name, email) VALUES ('Mirko', 'mirko@gmail.com');
INSERT INTO `company` (name, state, city) VALUES ('Wiener', 'Montenegro', 'Podgorica');

