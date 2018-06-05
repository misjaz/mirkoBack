
DROP TABLE IF EXISTS company;

CREATE TABLE IF NOT EXISTS `company` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50),
  `state` VARCHAR(50),
  `city` VARCHAR(50),
  PRIMARY KEY(`id`)
)ENGINE = InnoDB CHARACTER SET utf8, COLLATE utf8_general_ci;

-- --------------------------------------------------------------------------------------
-- Dodajemo kolonu koja predstavlja primarni ključ kompanije u tabelu sa korisnicima
-- (Svakom korisniku odgovara tačno jedna kompanija)
-- --------------------------------------------------------------------------------------
ALTER TABLE app_user ADD COLUMN company_id INT UNSIGNED;

-- --------------------------------------------------------------------------------------
-- Kreiramo vezu između tabela app_user i app_company
-- --------------------------------------------------------------------------------------
ALTER TABLE app_user ADD FOREIGN KEY (company_id) REFERENCES company(id);


CREATE TABLE IF NOT EXISTS `user`(
  `id` INT AUTO_INCREMENT,
  `name`VARCHAR(255),
  `email` VARCHAR(2000),
  `company_id` INT UNSIGNED,
  `state` VARCHAR(50),
  `city` VARCHAR(50),
  PRIMARY KEY (`id`),
  FOREIGN KEY (`company_id`) REFERENCES company(`id`)
);


# INSERT INTO `user` (name, email) VALUES ('Mirko', 'mirko@gmail.com');
INSERT INTO `company` (name, state, city) VALUES ('Wiener', 'Montenegro', 'Podgorica');
INSERT INTO `app_user`(username, password, email, phone, first_name, last_name) VALUES
  ('masja', '$2a$10$bnC26zz//2cavYoSCrlHdecWF8tkGfPodlHcYwlACBBwJvcEf0p2G', 'wa@wiener.co.me',
   '01101010', 'Admin', 'Admin');
