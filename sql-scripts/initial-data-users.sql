DROP DATABASE IF EXISTS `spring_security_demo_bcrypt`;
CREATE DATABASE IF NOT EXISTS `spring_security_demo_bcrypt`;
USE `spring_security_demo_bcrypt`;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`
(
    `username` varchar(30) NOT NULL,
    `password` char(70)    NOT NULL,
    `enabled`  tinyint(1)  NOT NULL,
    PRIMARY KEY (`username`)
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1;

INSERT INTO `users`
VALUES
('employee', '{bcrypt}$2a$10$w9WcDCqK/ONUdERaqploxeem64xpA3Nj4jMG1JoY1e3bqogk6mlPW', 1),
('manager', '{bcrypt}$2a$10$vyHPbmMkGcUvlNTd5pe6AO6PudIAaudJb0YlcwEGahuczQ7DhEFsy', 1);

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities`
(
    `username`  varchar(50) NOT NULL,
    `authority` varchar(50) NOT NULL,
    UNIQUE KEY `authorities_idx_1` (`username`, `authority`),
    CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1;

INSERT INTO `authorities`
VALUES
('employee', 'ROLE_EMPLOYEE'),
('manager', 'ROLE_MANAGER');


