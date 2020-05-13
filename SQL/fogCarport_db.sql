DROP DATABASE IF EXISTS `fogcarport_db`;
CREATE DATABASE IF NOT EXISTS `fogcarport_db`;
use fogcarport_db;

CREATE TABLE Roles (
                       Roleid int NOT NULL,
                       UserRole varchar(15) NOT NULL,
                       PRIMARY KEY (Roleid)
);

INSERT INTO Roles (RoleId,UserRole)
VALUES (10,"administrator");
INSERT INTO Roles (RoleId,UserRole)
VALUES (20,"employee");
INSERT INTO Roles (RoleId,UserRole)
VALUES (30,"customer");

CREATE TABLE Users (
                       UserId int auto_increment,
                       Email varchar(50) NOT NULL UNIQUE,
                       UserPassword varchar(30) NOT NULL,
                       RoleId int DEFAULT 30,
                       FullName varchar(100),
                       Phone varchar(30),
                       Address varchar (200),
                       PRIMARY KEY (UserId),
                       FOREIGN KEY (RoleId) REFERENCES Roles (RoleID)
);
INSERT INTO Users (Email, UserPassword, Fullname, Phone, Address)
Values ("Alice@Cooper.com","pass1234", "Alice Cooper", "60607070", "Nørgaardsvej 30, DK-2800 Kgs. Lyngby");

CREATE TABLE `orders` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `length` int NOT NULL,
  `height` int NOT NULL,
  `depth` int NOT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `orders` WRITE;

UNLOCK TABLES;