DROP DATABASE IF EXISTS `fog_carporte`;
CREATE DATABASE IF NOT EXISTS `fog_carporte`;
use fog_carporte;

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
                       UserPassword varchar(20) NOT NULL,
                       RoleId int DEFAULT 20,
                       FullName varchar(100),
                       Phone varchar(20),
                       Address varchar (200),
                       PRIMARY KEY (UserId),
                       FOREIGN KEY (RoleId) REFERENCES Roles (RoleID)
);
ALTER TABLE Users auto_increment=1000;