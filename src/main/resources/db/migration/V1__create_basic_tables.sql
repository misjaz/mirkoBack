-- -----------------------------------------------------------------------------
-- Tabele neophodne za autentifikaciju i autorizaciju korisnika.
-- Napomena: Baza `wiza` treba da postoji prije pokretanja skripte.
--
-- Author:  marko.andjelic@logate.com, boris.tuponja@logate.com
-- Since:   2017-10-06
-- Version: 1
-- -----------------------------------------------------------------------------

-- -----------------------------------------------------------------------------
-- Kreiramo tabelu sa korisnicima aplikacije (tj. korisnicima API servisa).
-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS app_user;

CREATE TABLE app_user (
    id              INT   UNSIGNED          NOT NULL AUTO_INCREMENT,
    username        VARCHAR(50)             NOT NULL,
    password        VARCHAR(100)            NOT NULL,
    active          BIT(1)                  NOT NULL DEFAULT 1,
    email           VARCHAR(100)            NULL,
    first_name      VARCHAR(50)             NOT NULL,
    last_name       VARCHAR(50)             NOT NULL,
    phone           VARCHAR(50)             NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (username),
    UNIQUE (email)
) ENGINE = InnoDB CHARACTER SET utf8, COLLATE utf8_general_ci;

-- -----------------------------------------------------------------------------
-- Kreiramo tabelu sa rolama u aplikaciji.
-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS app_role;

CREATE TABLE app_role (
    id          INT UNSIGNED                NOT NULL AUTO_INCREMENT,
    name        VARCHAR(50)                 NOT NULL,
    description VARCHAR(250)                NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (name)
) ENGINE = InnoDB CHARACTER SET utf8, COLLATE utf8_general_ci;

-- -----------------------------------------------------------------------------
-- Kreiramo “veznu” tabelu za korisnike i role.
-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS app_user_role;

CREATE TABLE app_user_role (
    user_id     INT     UNSIGNED    NOT NULL,
    role_id     INT     UNSIGNED    NOT NULL,
    PRIMARY KEY(user_id, role_id),
    FOREIGN KEY(user_id) REFERENCES app_user(id),
    FOREIGN KEY(role_id) REFERENCES app_role(id)
) ENGINE = InnoDB CHARACTER SET utf8, COLLATE utf8_general_ci;


-- -----------------------------------------------------------------------------
-- Kreiramo tabelu u kojoj čuvamo istorijat (uspješnih) prijava.
-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS app_login;

CREATE TABLE app_login (
    id              INT UNSIGNED    NOT NULL AUTO_INCREMENT,
    username        VARCHAR(50)     NOT NULL,
    login_date      TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ip_address      VARCHAR(50)     NOT NULL,
    message         VARCHAR(50)     NOT NULL,
    user_agent      VARCHAR(250)    NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB CHARACTER SET utf8, COLLATE utf8_general_ci;
